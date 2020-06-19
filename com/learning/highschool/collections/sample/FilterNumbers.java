package com.learning.highschool.collections.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static void main(String[] args) {
        FilterNumbers fn = new FilterNumbers();
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        fn.filterNumber(numbers, 3);
    }

    public void filterNumber(List<Integer> numbers, int divisibleBy){
        List<Integer> divNumbers = numbers.stream().filter(num -> (num % divisibleBy) == 0).collect(Collectors.toList());
        System.out.println(divNumbers);
    }
}