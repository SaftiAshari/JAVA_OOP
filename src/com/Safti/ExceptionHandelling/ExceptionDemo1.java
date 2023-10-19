package com.Safti.ExceptionHandelling;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        int result=0;
        try {
            result=Divide(a,b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("You can not divide "+a+" by "+b);
        }
        System.out.println("Result "+result);
    }
    private static int  Divide(int a,int b)
    {
        return a/b;
    }
}
