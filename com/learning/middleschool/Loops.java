package com.learning.middleschool;

public class Loops{
    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.sampleWhileLoop();
        loops.sampleForLoop();
        loops.sampleEnhanceForLoop();
    }

    private void sampleWhileLoop(){
        int x = 1;
        System.out.println("\n ####### START WHILE LOOP ########");
        while(x <= 5){
            System.out.println("Value of x: " + x);
            x++; // this is same as x = x+1;
        }

        System.out.println("####### END WHILE LOOP ########");
    }

    private void sampleForLoop(){
        System.out.println("\n ####### START FOR LOOP ########");
        for(int x=1; x <= 5; x++){
            System.out.println("Value of x: " + x);
        }

        System.out.println("####### END FOR LOOP ########");
    }

    private void sampleEnhanceForLoop(){
        // Enhanced for is mainly used in conjution with collections or arrays
        String[] colors = {"red","blue","green"};

        // Regular for loop to iterate through string array
        System.out.println("\n ####### FOR LOOP OVER ARRAY ########");
        for(int i=0; i<colors.length; i++){
            System.out.printf("Element value at index [%d] is %s \n", i, colors[i]);
        }

        // Enhanced for loop to iterate through string array
        System.out.println("\n ####### ENHANCED FOR LOOP OVER ARRAY ########");
        for(String color: colors){
            System.out.printf("Element value  is %s \n",color);
        }
    }
}