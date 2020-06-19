package com.learning.middleschool.inheritance;

public class Parent {
    public void extendablePublicMethod(String name){
        System.out.println("\nHello! "+ name + ". This is public Parent method");
    }

    protected void extendableProtectedMethod(String name){
        System.out.println("\nHello! "+ name + ". This is protected Parent method");
    }

    //This method can be invoke within this class
    private void privateMethod(String name){
        System.out.println("\nHello! "+ name + ". This is private Parent method");
    }
    
}