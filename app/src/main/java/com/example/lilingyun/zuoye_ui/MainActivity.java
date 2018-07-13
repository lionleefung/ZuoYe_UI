package com.example.lilingyun.zuoye_ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.items);
        button.setOnClickListener(this);
        Button button1=(Button)findViewById(R.id.armor_set);
        button1.setOnClickListener(this);
        replaceFragment(new ShouYeFragment());
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.items:
                replaceFragment(new ShouYeFragment());   //替换为ShouYe
                Toast.makeText(MainActivity.this,"111",Toast.LENGTH_SHORT).show();
                break;
            case R.id.armor_set:                    //替换为ArmorSet
                replaceFragment(new ArmorSetFragment());
                Toast.makeText(MainActivity.this,"222",Toast.LENGTH_SHORT).show();
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
