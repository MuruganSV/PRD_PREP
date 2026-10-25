package org.example;

import org.example.learning.custom.CustomArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        System.out.println("Starting the App!");

        SpringApplication.run(Main.class, args);

        List<String> customListString = new CustomArrayList<>();

        new ArrayList<>();

//        CustomArrayList<String> myList = new CustomArrayList<>();
//        myList.add("Murugan");
//
//        System.out.println("Checking the value Murugan exists with ignoreCase: "+myList.containsIgnoreCase("murugan"));

        customListString.add("Murugan");
        customListString.add("Mathina");
        customListString.add("All Persons");
        customListString.add("NLvalue2");
        customListString.add("UnRemovable");

        List<String> newList = List.of("NLvalue1", "NLvalue2");

        customListString.addAll(1, newList);

        System.out.println("the size is: "+customListString.size());

        customListString.forEach(value -> {
            System.out.println("The value is: "+value);
        });

        System.out.println("the index of NLvalue2: "+customListString.lastIndexOf("NLvalue2"));

        customListString.subList(1,5).forEach(v -> {
            System.out.println("The subList item is: "+v);
        });

        System.out.println("Retained values are: "+ customListString.retainAll(List.of("Murugan", "Mathina", "UnRemovable")));

        System.out.println("the size is: "+customListString.size());

        System.out.println("====AFTER Retain ======");
        customListString.forEach(value -> {
            System.out.println("The value is: "+value);
        });

        System.out.println("====AFTER RemoveAll ======");
        customListString.removeAll(List.of("UnRemovable", "Murugan"));

        customListString.forEach(value -> {
            System.out.println("The value is: "+value);
        });

        System.out.println("the size is: "+customListString.size());

        System.out.println("contains all value: "+customListString.containsAll(List.of("Mathina", "Murugan")));

        System.out.println("====================================");

        List<String> list = new ArrayList<>();

        list.add("Murugan");
        list.add("Mathina");
        list.add("Liyana");
        list.add("PugazhKumaran");
        list.add("Srinivasan");
        list.add("Vijayarani");
        list.add("Vithiya");

        ListIterator<String> newListIterator = list.listIterator();

//        while (newListIterator.hasNext()) {
//            System.out.println("the value is: "+newListIterator.next());
//            newListIterator.set("MURUGANMATHINA");
//            System.out.println("=================");
//        }
//
//        System.out.println("the element at 0: "+list.get(0)+ ", at 1: "+list.get(1));



        ListIterator<String> iterator = customListString.listIterator();

        System.out.println("====================================");

       while(iterator.hasNext()) {
           System.out.println("next value: "+iterator.next());
           iterator.set("MuruganMathina");
           iterator.remove();
           System.out.println("====================================");
       }

       System.out.println("the size is: "+customListString.size()+", is empty: "+customListString.isEmpty());

//        System.out.println("the first element is: "+customListString.get(0)+", second element: "+customListString.get(1));





//        System.out.println("It contains Murugan: "+ customListString.contains("Murugan"));
//
//        String previousString = customListString.set(1, "MuruganMathina");
//
//        customListString.add(1, "Liyana");
//
//
////        customListString.remove(2);
//
//        System.out.println("The Custom List Size is: "+ customListString.size() + " and the Second element value is: "+customListString.get(1)+ " and previous String is: "+previousString);
//
//        customListString.forEach(str -> {
//            System.out.print(str+", ");
//        });
//
//        customListString.clear();
//
//        System.out.println("The List was cleared, lets check is Empty: "+customListString.isEmpty()+" and Size: "+customListString.size());
    }
}