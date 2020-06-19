package com.learning.highschool.collections.sample;

import java.util.HashMap;

public class IdentifyWordCount {
    public static void main(String[] args) {
        IdentifyWordCount wc = new IdentifyWordCount();
        String sentence = "I have a bike and that bike has a I symbol";
        wc.printCountOfUniqueWords(sentence);
    }

    public void printCountOfUniqueWords(String sentence){
        // splitting the sentence into words by using space as split character
        String[] words = sentence.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if(wordCount.get(word.toLowerCase()) == null){
                wordCount.put(word.toLowerCase(), 1);
            }else{
                int count = wordCount.get(word.toLowerCase()) + 1;
                wordCount.put(word.toLowerCase(), count);
            }
        }

        for (String uniqueWord : wordCount.keySet()) {
            System.out.println(uniqueWord + " -> " + wordCount.get(uniqueWord));
        }
    }
}