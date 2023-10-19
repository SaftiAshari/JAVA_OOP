package com.Safti.OOP;

public class Product {
    private  static final int SHIPPING_RATE=5;
    private  static final double DIMENSION_CHARGE=1.5;
    private final  String name;
    private final int weight;
    private final Dimension dimension;
    private   int price;
    private int discount;

    public Product(String name, int weight, Dimension dimension, int price, int discount) {
        this.name = name;
        this.weight = weight;
        this.dimension = dimension;
        this.price = price;
        this.discount = discount;
    }

    public  int getPrice() {
        double price = this.price * ((100 - discount) / 100.0);
        price+=weight*SHIPPING_RATE;
        if(dimension.getVolume()>10)
        {
            price+=DIMENSION_CHARGE*dimension.getVolume();
        }
        return (int) price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
