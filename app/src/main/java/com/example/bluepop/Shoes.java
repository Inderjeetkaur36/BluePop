package com.example.bluepop;

import java.io.Serializable;

public class Shoes implements Serializable {

    public int image;
    public String name;
    public String price;

    public Shoes(){

    }

    public Shoes(int image, String name, String price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }
}

