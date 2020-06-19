package com.learning.highschool.collections;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, String> favColors = new HashMap<>();
        favColors.put("a", "RED");
        favColors.put("b", "BLUE");
        favColors.put("c", "GREEN");

        for (String key : favColors.keySet()) {
            System.out.println(key + " -> " + favColors.get(key));
        }
    }
}