package org.example;

import org.example.learning.custom.CustomArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        System.out.println("Starting the App!");

        SpringApplication.run(Main.class, args);

        List<String> customListString = new CustomArrayList<>();

        CustomArrayList<String> myList = new CustomArrayList<>();
        myList.add("Murugan");

        System.out.println("Checking the value Murugan exists with ignoreCase: "+myList.containsIgnoreCase("murugan"));

        customListString.add("Murugan");
        customListString.add("Mathina");
        customListString.add("All Persons");
        customListString.add("UnRemovable");

        System.out.println("It contains Murugan: "+ customListString.contains("Murugan"));

        String previousString = customListString.set(1, "MuruganMathina");

        customListString.add(1, "Liyana");


//        customListString.remove(2);

        System.out.println("The Custom List Size is: "+ customListString.size() + " and the Second element value is: "+customListString.get(1)+ " and previous String is: "+previousString);

        customListString.forEach(str -> {
            System.out.print(str+", ");
        });

        customListString.clear();

        System.out.println("The List was cleared, lets check is Empty: "+customListString.isEmpty()+" and Size: "+customListString.size());
    }
}