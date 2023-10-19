package com.Safti.OOP;
import java.util.*;
public class ShoppingCart {
    private ArrayList<Product>products=new ArrayList<>();
    public void addProduct(Product product)
    {
        products.add(product);
    }
    public int getTotalPrice()
    {
        int sum=0;
        for(Product product:products)
        {
            sum+= product.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
