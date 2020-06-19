package com.learning.middleschool.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();

        System.out.println("****************************");
        
        child1.child1Method("Bhanu");
        child1.extendableProtectedMethod("Bhanu");
        child1.extendablePublicMethod("Bhanu");
        System.out.println("****************************");
        
        child2.child2Method("BHANU");
        child2.extendableProtectedMethod("BHANU");
        child2.extendablePublicMethod("BHANU");
        System.out.println("****************************");

        child3.child3Method("bHaNu");
        child3.extendableProtectedMethod("bHaNu");
        child3.extendablePublicMethod("bHaNu");
        System.out.println("****************************");
    }
}