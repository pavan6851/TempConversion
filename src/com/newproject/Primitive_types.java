package com.newproject;

public class Primitive_types
{
    public static void main(String[] args)
    {
        int a = 10;
        float b = 100.65f;
        char c = 'd';
        //String z = "halo"; String in java is not primitive data type
        boolean d = true;
        byte g = 42;
        short s = 10000;
        double e = 123123123.32123345;
        long f = 831928098213L;

        double result = (b*g) + (a/c) + (e - s);
        System.out.println((f * b) + " " + (a / c) + " " + (e - s));
//
//        int z = 234_000_000;
//        System.out.println(z);
    }
}
