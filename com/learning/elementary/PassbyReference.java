package com.learning.elementary;

public class PassbyReference {
    private int a;
    public static void main(String[] args) {
        PassbyReference passbyReference = new PassbyReference();
        passbyReference.a = 20;

        System.out.println("Value of a before method call: " + passbyReference.a);
        passbyReference.passReference(passbyReference);
        System.out.println("Value of a after method call: " + passbyReference.a);
    }

    public void passReference(PassbyReference ref){
        System.out.println("Starting Value of ref: " + ref);
        System.out.println("Starting Value of a: " + ref.a);
        ref.a = ref.a + 10;
        System.out.println("End Value of ref: " + ref);
        System.out.println("End Value of a: " + ref.a);
    }
}