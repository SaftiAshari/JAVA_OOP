package com.Safti.OOP;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product keyboard = new Product("Keyboard", 2, new Dimension(2, 2, 2), 100, 10);
        Product mouse = new Product("Mouse", 1, new Dimension(1, 1, 1), 50, 5);
        Product ecoDot = new Product("EcoDot", 1, new Dimension(1, 1, 1), 50, 5);
        shoppingCart.addProduct(keyboard);
        shoppingCart.addProduct(mouse);
        shoppingCart.addProduct(ecoDot);
        System.out.println("Total price: " + shoppingCart.getTotalPrice());

    }
}
