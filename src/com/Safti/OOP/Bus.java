package com.Safti.OOP;

public class Bus extends Vehicles{
    int noOfWheels=6;
    public void PrintWheels()
    {
        System.out.println("Number Of Wheels"+noOfWheels);
        System.out.println("Number of Wheels"+super.noOfWheels );
    }

}
