package com.weikun.K;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Goods implements Serializable {
    public Goods(){};
    public Goods(String no, String name, float price, int quantity) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    private String no;
    private String name;
    private float price;
    private int quantity;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
