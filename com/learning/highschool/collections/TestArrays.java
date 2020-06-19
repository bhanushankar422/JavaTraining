package com.learning.highschool.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrays {
    public static void main(String[] args) {
        List<String> alphabets = new ArrayList<>();
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.add("C");
        alphabets.add("D");

        //Directly printing array
        System.out.println(alphabets);

        //Regular for loop to iterate through the array list
        System.out.println("****** Regular for loop **********");
        for (int i = 0; i < alphabets.size(); i++) {
            System.out.print(alphabets.get(i));
            System.out.print(", ");
        }
        System.out.println("\n************************** ");

        // Enhanced for loop
        System.out.println("****** Enhanced for loop **********");
        for (String alphabet : alphabets) {
            System.out.print(alphabet);
            System.out.print(", ");
        }
        System.out.println("\n************************** ");

        // Iterator
        System.out.println("****** Iterator **********");
        Iterator<String> itr = alphabets.iterator();
        while(itr.hasNext()){
            String alphabet = itr.next();
            System.out.print(alphabet);
            System.out.print(", ");
        }
        System.out.println("\n************************** ");
    }
}