package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/* Self try Interview Questions */
public class Try {

    public static void main(String[] args) {
        /* Get the count of each value in array */
        int[] arrayList = {1,2,2,2,3,3,4,5,5,5,5,5,6,7,8,9,10,10,10,10,10,30,30,30};

        Map<Integer, Integer> distinctValueMap = new HashMap<>();

        for (int i : arrayList) {
            if(distinctValueMap.get(i) != null) {
                int value = distinctValueMap.get(i);
                distinctValueMap.put(i, ++value);
            } else {
                distinctValueMap.put(i, 1);
            }
        }

        distinctValueMap.forEach((key, value) -> {
            System.out.println(key + " has total occurance of "+value+" times");
        });

         Arrays
                 .stream(arrayList)
                 .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key, value) -> {
                    System.out.println("The Number: "+key+" has "+value+" occurances.");
                 });
    }
}
