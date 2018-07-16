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

            ArmorContent apple1=new ArmorContent("Adamantie Armor",R.mipmap.beehive,R.mipmap.btn_next_pressed,0);
            armorContentList.add(apple1);
            ArmorContent apple2=new ArmorContent("Adamantie Breastplate",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
            armorContentList.add(apple2);
            ArmorContent apple3=new ArmorContent("Adamantie Leggings",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
            armorContentList.add(apple3);
            ArmorContent apple4=new ArmorContent("Adamantie Headgear",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
            armorContentList.add(apple4);
            ArmorContent apple5=new ArmorContent("Adamantie Helmet",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
            armorContentList.add(apple5);
            ArmorContent apple6=new ArmorContent("Adamantie Mask",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
            armorContentList.add(apple6);

        ArmorContent apple11=new ArmorContent("Chlorophyte Armor",R.mipmap.beehive,R.mipmap.btn_next_pressed,0);
        armorContentList.add(apple11);
        ArmorContent apple21=new ArmorContent("AChlorophyte Plate Mail",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple21);
        ArmorContent apple31=new ArmorContent("AChlorophyte Greaves",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple31);
        ArmorContent apple41=new ArmorContent("Chlorophyte Headgear",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple41);
        ArmorContent apple51=new ArmorContent("Chlorophyte Helmet",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple51);
        ArmorContent apple61=new ArmorContent("Chlorophyte Mask",R.mipmap.beehive,R.mipmap.btn_next_pressed,1);
        armorContentList.add(apple61);

    }
}