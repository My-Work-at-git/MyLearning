package org.example.Oops2.Composition;

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer){
        this.manufacturer = manufacturer;
        this.model = model;
    }
}

