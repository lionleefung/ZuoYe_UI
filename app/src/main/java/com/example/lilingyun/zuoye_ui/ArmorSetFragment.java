package com.example.lilingyun.zuoye_ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ArmorSetFragment extends android.support.v4.app.Fragment {
    private List<ArmorContent> armorContentList=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.armorset_fragment,container,false);
        initArmors();
        RecyclerView newArmorRecyclerView=(RecyclerView)view.findViewById(R.id.armor_recycler);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        newArmorRecyclerView.setLayoutManager(layoutManager);
        ArmorAdapter adapter=new ArmorAdapter(armorContentList);
        newArmorRecyclerView.setAdapter(adapter);
        return view;
    }
    private void initArmors(){
        for(int i = 0;i < 1;i++){
            ArmorContent apple2=new ArmorContent("人海呀",R.mipmap.beehive,R.mipmap.btn_next_pressed,0);
            armorContentList.add(apple2);
        }
        for(int i = 0;i < 2;i++){
            ArmorContent apple2=new ArmorContent("茫茫啊",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
            armorContentList.add(apple2);
        }
        for(int i = 0;i < 1;i++){
            ArmorContent apple2=new ArmorContent("浮浮沉沉",R.mipmap.beehive,R.mipmap.btn_next_pressed,0);
            armorContentList.add(apple2);
        }
        for(int i = 0;i < 5;i++){
            ArmorContent apple2=new ArmorContent("总是心门",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
            armorContentList.add(apple2);
        }
        for(int i = 0;i < 1;i++){
            ArmorContent apple2=new ArmorContent("浮浮沉沉",R.mipmap.beehive,R.mipmap.btn_next_pressed,0);
            armorContentList.add(apple2);
        }
        for(int i = 0;i < 8;i++){
            ArmorContent apple2=new ArmorContent("总是心门",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
            armorContentList.add(apple2);
        }
    }
}