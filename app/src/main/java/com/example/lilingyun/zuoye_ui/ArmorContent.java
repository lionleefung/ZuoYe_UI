package com.example.lilingyun.zuoye_ui;

public class ArmorContent {
    private String armorname;
    private int leftid;
    private int rightid;
    private int type;
    public ArmorContent(String name,int imageID1,int imageID2,int type){
        this.leftid=imageID1;
        this.armorname=name;
        this.rightid=imageID2;
        this.type=type;
    }

    public String getName() {
        return armorname;
    }
    public int getLeftid(){return leftid;}
    public int getRightid(){return rightid;}
    public int getType(){return type;}
}

