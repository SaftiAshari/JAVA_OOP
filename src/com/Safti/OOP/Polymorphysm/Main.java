package com.Safti.OOP.Polymorphysm;

public class Main {
    public static void main(String[] args) {
        Liquid genralLiquid=new Liquid();
        Liquid milk=new Milk();
        Liquid coffee=new Coffee();
        Cup cup=new Cup();
        cup.addLiquid(genralLiquid);
        cup.addLiquid(milk);
        cup.addLiquid(coffee);
        cup.mix();
    }
}
