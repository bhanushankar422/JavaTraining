package com.learning.middleschool.obj;

import com.learning.middleschool.obj.Biryani.Type;

public class TestClass {
    public static void main(String[] args) {
        Biryani chickenBiryani = new Biryani();
        Biryani muttonBiryani = new Biryani();
        Biryani vegBiryani = new Biryani();

        chickenBiryani.setName("Chicken Dum Biryani");
        chickenBiryani.setType(Type.CHICKEN);

        muttonBiryani.setName("Mutton Ghosh Biryani");
        muttonBiryani.setType(Type.MUTTON);

        vegBiryani.setName("Veg Biryani");
        vegBiryani.setType(Type.VEGETABLE);

        chickenBiryani.make();
        muttonBiryani.make();
        vegBiryani.make();

    }
}