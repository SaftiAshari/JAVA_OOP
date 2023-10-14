package com.Safti.chap7;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product keyboard = new Product("Mechanical gaming Keyboard", 48);
        Product mouse = new Product("Gaming Mouse", 24);
        Product ecoDot = new Product("Eco Dot(4th generation)", 29);
        shoppingCart.addProduct(keyboard);
        shoppingCart.addProduct(mouse);
        shoppingCart.addProduct(ecoDot);
        System.out.println("Total price: " + shoppingCart.getTotalPrice());

    }
}
