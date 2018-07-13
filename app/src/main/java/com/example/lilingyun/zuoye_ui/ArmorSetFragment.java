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
    private List<ArmorItem> armorList=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.armorset_fragment,container,false);
        initArmors();
        RecyclerView newArmorRecyclerView=(RecyclerView)view.findViewById(R.id.armor_recycler);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        newArmorRecyclerView.setLayoutManager(layoutManager);
        ArmorAdapter adapter=new ArmorAdapter(armorList);
        //newArmorRecyclerView.addItemDecoration(new SpacesItemDecoration(-5));
        newArmorRecyclerView.setAdapter(adapter);
        return view;
    }
    private void initArmors(){
        for(int i = 0;i < 2;i++){
            ArmorItem apple1=new ArmorItem("Adamantie Armor",R.mipmap.beehive,R.mipmap.desert,R.mipmap.beehive,R.mipmap.beehive,R.mipmap.beehive);
            armorList.add(apple1);
            ArmorItem apple2=new ArmorItem("Chlorophyte Armor",R.mipmap.beehive,R.mipmap.beehive,R.mipmap.beehive,R.mipmap.beehive,R.mipmap.beehive);
            armorList.add(apple2);

        }
    }
}