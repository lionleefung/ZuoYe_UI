package com.example.lilingyun.zuoye_ui;

public class ArmorItem {
    private String armorname;
    private int btnID1;
    private int btnID2;
    private int btnID3;
    private int btnID4;
    private int btnID5;
    public ArmorItem(String name,int imageID1,int imageID2,int imageID3,int imageID4,int imageID5){
        this.armorname=name;
        this.btnID1=imageID1;
        this.btnID2=imageID2;
        this.btnID3=imageID3;
        this.btnID4=imageID4;
        this.btnID5=imageID5;
    }

    public String getName() {
        return armorname;
    }

    public int[] getImageID1() {
        int[] ID=new int[5];
        ID[0]=btnID1;
        ID[1]=btnID2;
        ID[2]=btnID3;
        ID[3]=btnID4;
        ID[4]=btnID5;
        return ID;
    }
}
