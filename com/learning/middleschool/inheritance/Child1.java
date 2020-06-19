package com.learning.middleschool.inheritance;

public class Child1 extends Parent{
    public void child1Method(String name){
        System.out.println("\nHello! "+ name + ". This is exclusive Child1 method");
    }

    public void extendablePublicMethod(String name){
        System.out.println("\nHello! "+ name + ". This is overriding extendablePublicMethod in  Child1 method");
    }

    protected void extendableProtectedMethod(String name){
        System.out.println("\nHello! "+ name + ". This is overriding extendableProtectedMethod in  Child1 method");
    }
}