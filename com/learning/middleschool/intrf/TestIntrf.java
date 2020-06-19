package com.learning.middleschool.intrf;

public class TestIntrf {
    public static void main(String[] args) {
        ChickenBiryani cb = new ChickenBiryani();
        VegetableBiryani vb = new VegetableBiryani();

        TestIntrf ti = new TestIntrf();
        ti.prepareBiryani(cb);
        ti.prepareBiryani(vb);
    }

    public void prepareBiryani(Biryani b){
        b.make();
    }
}