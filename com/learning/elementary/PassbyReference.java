package com.learning.elementary;

public class PassbyReference {
    private int a;
    public static void main(String[] args) {
        PassbyReference passbyReference = new PassbyReference();
        passbyReference.a = 20;

        System.out.println("Value of a before method call: " + passbyReference.a);
        passbyReference.passReference(passbyReference);
        System.out.println("Value of a after method call: " + passbyReference.a);

        String tmp = new String("Bhanu");
        System.out.println("Value of tmp before method call: " + tmp);
        passbyReference.passImmutableObj(tmp);
        System.out.println("Value of tmp after method call: " + tmp);
    }

    public void passReference(PassbyReference ref){
        System.out.println("Starting Value of ref: " + ref);
        System.out.println("Starting Hashcode of ref: " + ref.hashCode());
        System.out.println("Starting Value of a: " + ref.a);
        ref.a = ref.a + 10;
        System.out.println("End Value of ref: " + ref);
        System.out.println("Ending Hashcode of ref: " + ref.hashCode());
        System.out.println("End Value of a: " + ref.a);
    }

    public void passImmutableObj(String a){
        System.out.println("Starting Value of a: " + a);
        System.out.println("Starting Hashcode of a: " + a.hashCode());
        a = "Hello! " + a;
        System.out.println("End Value of a: " + a);
        System.out.println("Ending Hashcode of a: " + a.hashCode());
    }
}