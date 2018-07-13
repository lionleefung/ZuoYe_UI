package com.example.lilingyun.zuoye_ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ArmorAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ArmorContent> mArmorContentList;
    public static final int ITEM_TYPE_Title=0;
    public static final int ITEM_TYPE_CONTENT=1;

    public ArmorAdapter(List<ArmorContent> mArmorContentLis){
      this.mArmorContentList=mArmorContentLis;
    }
    @Override
    public int getItemViewType(int position){
        if( mArmorContentList.get(position).getType()==0){
            //TitleView
            return ITEM_TYPE_Title;
        } else if(mArmorContentList.get(position).getType()==1){
            //ContentView
            return ITEM_TYPE_CONTENT;
        }
        else return 2;
    }
    //内容 ViewHolder
    public static class TitleViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public TitleViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.title);
        }
    }
    public static class ContentViewHolder extends RecyclerView.ViewHolder{
        private ImageView leftImage;
        private TextView name;
        private ImageView rightImage;
        public ContentViewHolder(View itemView){
            super(itemView);
            leftImage = itemView.findViewById(R.id.content_lcon);
            name = itemView.findViewById(R.id.content_name);
            rightImage = itemView.findViewById(R.id.content_rcon);

        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (viewType == ITEM_TYPE_Title) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_title, parent, false);
            return new TitleViewHolder(view);
        } else if (viewType == ITEM_TYPE_CONTENT) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_content, parent, false);
            return new ContentViewHolder(view);
        }
        else return null;
    }
    @Override
    //将数据与界面绑定
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof TitleViewHolder) {
            ((TitleViewHolder) holder).textView.setText(mArmorContentList.get(position).getName());
        } else if (holder instanceof ContentViewHolder) {
            ((ContentViewHolder) holder).leftImage.setImageResource(mArmorContentList.get(position).getLeftid());
            ((ContentViewHolder) holder).name.setText(mArmorContentList.get(position).getName());
            ((ContentViewHolder) holder).rightImage.setImageResource(mArmorContentList.get(position).getRightid());
        } else {
        }

    }

    @Override
    public int getItemCount(){
        return mArmorContentList.size();
    }

}


