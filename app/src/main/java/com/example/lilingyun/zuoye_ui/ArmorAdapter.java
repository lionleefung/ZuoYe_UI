package com.example.lilingyun.zuoye_ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ArmorAdapter extends RecyclerView.Adapter<ArmorAdapter.ViewHolder> {

    private List<ArmorItem> mArmorList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View armorView;
        TextView armorName;
        Button bt1;
        Button bt2;
        Button bt3;
        Button bt4;
        Button bt5;
        public ViewHolder(View view){
            super(view);
            armorView=view;
            armorName = (TextView)view.findViewById(R.id.armorname);
            bt1=(Button)view.findViewById(R.id.btn1);
            bt2=(Button)view.findViewById(R.id.btn2);
            bt3=(Button)view.findViewById(R.id.btn3);
            bt4=(Button)view.findViewById(R.id.btn4);
            bt5=(Button)view.findViewById(R.id.btn5);
        }
    }

    public ArmorAdapter(List<ArmorItem> armorList){
        mArmorList = armorList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.armorset_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        /*
        holder.armorName.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                ArmorItem armor=mArmorList.get(position);
                Toast.makeText(v.getContext(),"点击了导航栏"+armor.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        */
        holder.bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                ArmorItem armor=mArmorList.get(position);
                Toast.makeText(v.getContext(), "点击了按钮"+armor.getImageID1()[0], Toast.LENGTH_SHORT).show();
            }
        });
        holder.bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                ArmorItem armor=mArmorList.get(position);
                Toast.makeText(v.getContext(), "点击了按钮"+armor.getImageID1()[1], Toast.LENGTH_SHORT).show();
            }
        });
        holder.bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                ArmorItem armor=mArmorList.get(position);
                Toast.makeText(v.getContext(), "点击了按钮"+armor.getImageID1()[2], Toast.LENGTH_SHORT).show();
            }
        });
        holder.bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                ArmorItem armor=mArmorList.get(position);
                Toast.makeText(v.getContext(), "点击了按钮"+armor.getImageID1()[3], Toast.LENGTH_SHORT).show();
            }
        });
        holder.bt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                ArmorItem armor=mArmorList.get(position);
                Toast.makeText(v.getContext(), "点击了按钮"+armor.getImageID1()[4], Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        ArmorItem armor=mArmorList.get(position);
        holder.armorName.setText(armor.getName());
        //Drawable drawable = getResources().getDrawable(armor.getImageID1()[0]);// 找到资源图片
        //drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());// 设置图片宽高
        //holder.bt1.setCompoundDrawables(drawable, null, null, null);// 设置到控件中

    }
    @Override
    public int getItemCount(){
        return mArmorList.size();
    }

    //@Override
    //public int getItemViewType(int position) {

   // }

}


