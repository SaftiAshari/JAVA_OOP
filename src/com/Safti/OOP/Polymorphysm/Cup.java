package com.Safti.OOP.Polymorphysm;
import java.util.*;
public class Cup {
    ArrayList<Liquid>liquids=new ArrayList<>();
    public void addLiquid(Liquid liquid)
    {
        liquids.add(liquid);
    }
    public  void mix()
    {
        for(Liquid liquid:liquids)
        {   boolean clockwise=true;
            liquid.swirl(clockwise);
        }
    }

}
