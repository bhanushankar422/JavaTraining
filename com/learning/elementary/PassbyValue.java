package com.learning.elementary;

public class PassbyValue {
    public static void main(String[] args) {
        int v = 20;
        PassbyValue passbyValue = new PassbyValue();
        System.out.println("Value of v before method call: " + v);
        passbyValue.passInt(v);
        System.out.println("Value of v after method call: " + v);

        
    }

    public void passInt(int a){
        System.out.println("Initial Input value of a: " + a);
        a = a+10;
        System.out.println("Processed value of a: " + a);
    }
}