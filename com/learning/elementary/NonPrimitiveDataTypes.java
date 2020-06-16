package com.learning.elementary;

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        /*
        * Immutable data types
        */
        String a1 = "Sample string 1";
        String a2 = new String("Sample string 2");

        Integer b1 = 12;
        Integer b2 = 22;

        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);

        /*
        * Reference types
        */
        String [] c = new String[3];
        c[0] = "Apple";
        c[1] = "Boy";
        c[2] = "Cat";

        System.out.println(c);
        System.out.println(c[0] + ", " + c[1] + ", " + c[2]);
    }
    

}