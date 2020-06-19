package com.learning.middleschool.inheritance;

public class Child3 extends Parent{
    public void child3Method(String name){
        System.out.println("\nHello! "+ name + ". This is exclusive Child3 method");
    }
    public void extendablePublicMethod(String name){
        super.extendablePublicMethod(name);
        System.out.println("\nHello! "+ name + ". This is extendablePublicMethod Child3 method");

    }
}