package com.learning.middleschool.stat;

public class TestStatic {
    public static void main(String[] args) {
        Biryani chickenBiryani = new Biryani();
        Biryani muttonBiryani = new Biryani();
        Biryani vegBiryani = new Biryani();

        chickenBiryani.type = "CHICKEN";
        chickenBiryani.name = "Chicken Dum Biryani";

        muttonBiryani.type = "MUTTON";
        muttonBiryani.name = "Mutton Dum Biryani";

        vegBiryani.type = "VEGETABLE";
        vegBiryani.name = "Vegetable Dum Biryani";

        chickenBiryani.make();
        muttonBiryani.make();
        vegBiryani.make();
    }
}