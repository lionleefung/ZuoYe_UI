package com.example.lilingyun.zuoye_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class WeaponActivity extends AppCompatActivity {
    private static final String TAG = "WeaponActivity";
    private LetterView letterView;
    private List<ArmorContent> armorContentList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon);
        Button byn1 = (Button) findViewById(R.id.back_weapon);
        byn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                setResult(RESULT_CANCELED, intent);
                finish();
            }
        });


        initArmors();
        final RecyclerView weaponRecyclerView = (RecyclerView) findViewById(R.id.weapon_recycler);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        weaponRecyclerView.setLayoutManager(layoutManager);
        final ArmorAdapter adapter = new ArmorAdapter(armorContentList);
        weaponRecyclerView.setAdapter(adapter);
        letterView = (LetterView) findViewById(R.id.MainActivity_LetterView);
        letterView.setListener(new LetterView.LetterOnClickListener() {
            @Override
            public void onItemClickListener(int position, char letter) {
                String po=String.valueOf(letter);
                int posi=getPosByTag(po);
                layoutManager.scrollToPositionWithOffset(posi,0);
            }
        });
    }
    private int getPosByTag(String tag){
        for(int i=0;i<armorContentList.size();i++){
            if(tag.equals(armorContentList.get(i).getName()) && armorContentList.get(i).getType()==0){
                return i;
            }
            else{
            }
        }
        return -1;
    }
    private void initArmors(){

        ArmorContent apple1=new ArmorContent("A",R.mipmap.beehive,R.mipmap.btn_next_pressed,0);
        armorContentList.add(apple1);
        ArmorContent apple2=new ArmorContent("Astplate",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple2);
        ArmorContent apple3=new ArmorContent("Adgings",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple3);
        ArmorContent apple4=new ArmorContent("Atie Headgear",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple4);
        ArmorContent apple5=new ArmorContent("Aelmet",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple5);
        ArmorContent apple6=new ArmorContent("AdMask",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple6);

        ArmorContent apple11=new ArmorContent("B",R.mipmap.beehive,R.mipmap.btn_next_pressed,0);
        armorContentList.add(apple11);
        ArmorContent apple21=new ArmorContent("Blate Mail",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple21);
        ArmorContent apple31=new ArmorContent("Breaves",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple31);
        ArmorContent apple41=new ArmorContent("Bophyte Headgear",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple41);
        ArmorContent apple51=new ArmorContent("Bhyte Helmet",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple51);
        ArmorContent apple61=new ArmorContent("Brophyte Mask",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple61);

        ArmorContent apple12=new ArmorContent("C",R.mipmap.beehive,R.mipmap.btn_next_pressed,0);
        armorContentList.add(apple12);
        ArmorContent apple22=new ArmorContent("Cstplate",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple22);
        ArmorContent apple32=new ArmorContent("Cgings",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple32);
        ArmorContent apple42=new ArmorContent("Ceadgear",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple42);
        ArmorContent apple52=new ArmorContent("Celmet",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple52);
        ArmorContent apple62=new ArmorContent("Cask",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple62);

        ArmorContent apple13=new ArmorContent("D",R.mipmap.beehive,R.mipmap.btn_next_pressed,0);
        armorContentList.add(apple13);
        ArmorContent apple23=new ArmorContent("Dsda Astplate",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple23);
        ArmorContent apple33=new ArmorContent("Dasdsa Adgings",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple33);
        ArmorContent apple43=new ArmorContent("Deadgear",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple43);
        ArmorContent apple53=new ArmorContent("Delmet",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple53);
        ArmorContent apple63=new ArmorContent("DdMask",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple63);

        ArmorContent apple14=new ArmorContent("Z",R.mipmap.beehive,R.mipmap.btn_next_pressed,0);
        armorContentList.add(apple14);
        ArmorContent apple24=new ArmorContent("Zlate",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple24);
        ArmorContent apple34=new ArmorContent("ZgDAS s",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple34);
        ArmorContent apple44=new ArmorContent("Ze Headgear",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple44);
        ArmorContent apple54=new ArmorContent("Zmet",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple54);
        ArmorContent apple64=new ArmorContent("ZMask",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple64);

    }
}
