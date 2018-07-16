package com.example.lilingyun.zuoye_ui;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ViewPager vp;
    private List<View> views;
    private FrameLayout fr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.items);
        button.setOnClickListener(this);
        Button button1=(Button)findViewById(R.id.armor_set);
        button1.setOnClickListener(this);
        Button button2=(Button)findViewById(R.id.enemies);
        button2.setOnClickListener(this);
        Button button3=(Button)findViewById(R.id.npcs);
        button3.setOnClickListener(this);
        replaceFragment(new ShouYeFragment());
       /* vp = findViewById(R.id.vp);
        views = new ArrayList<View>();
        //初始化view
        //initViewPager();
        //设置ViewPager的适配器
        ViewpagerAdapter adapter = new ViewpagerAdapter(views, this);
        vp.setAdapter(adapter);*/
    }
    /*public void initViewPager() {
        //创建view布局
        View view1=View.inflate(this, R.layout.shouye_fragment, null);
        View view2=View.inflate(this, R.layout.fragment_npcs, null);
        View view3=View.inflate(this, R.layout.armorset_fragment, null);
        View view4=View.inflate(this, R.layout.fragment_enemies, null);
        //把view布局添加到集合
        views.add(view1);
        views.add(view2);
        views.add(view3);
        views.add(view4);
        //监听ViewPager滑动效果
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int arg0) {
            }
            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }
            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }*/
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.items:
                replaceFragment(new ShouYeFragment());   //替换为ShouYe
                break;
            case R.id.armor_set:                    //替换为ArmorSet
                replaceFragment(new ArmorSetFragment());
                break;
            case R.id.enemies:
                replaceFragment(new EnemiesFragment());
                break;
            case R.id.npcs:
                    replaceFragment(new NpcsFragment());
                break;
            default:
                break;
        }
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout,fragment);
        transaction.commit();
    }
}
