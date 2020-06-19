package com.learning.highschool.collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
    public static void main(String[] args) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(3);
        uniqueNumbers.add(2);
        uniqueNumbers.add(3);

        //Directly printing Set
        System.out.println(uniqueNumbers);

        // Enhanced for loop
        System.out.println("****** Enhanced for loop **********");
        for (Integer num : uniqueNumbers) {
            System.out.print(num);
            System.out.print(", ");
        }
        System.out.println("\n************************** ");

        // Iterator
        System.out.println("****** Iterator **********");
        Iterator<Integer> itr = uniqueNumbers.iterator();
        while(itr.hasNext()){
            Integer num = itr.next();
            System.out.print(num);
            System.out.print(", ");
        }
        System.out.println("\n************************** ");
    }
}