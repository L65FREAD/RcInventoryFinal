package com.devnom.model;

public abstract class InventoryItem {
    private int id;
    private static int uniqueNum = 1000;
    public  String sku;

    public InventoryItem(){
        this.sku = "" + uniqueNum;
        uniqueNum++;
    }
}
