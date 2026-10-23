package org.example.learning.forloops;

import java.util.Scanner;

public class QuestionSetAnswers {
    private static Scanner scanner = new Scanner(System.in);

    private static void guessTheNumber() {
        int number = 6;
//        do {
//            System.out.print("Enter the Number to Guess: ");
//        } while(scanner.nextInt() != number);
//        System.out.println("Correct!");

        for (;;) {
            System.out.print("Enter the Number to Guess: ");
            if(scanner.nextInt() == number){
                System.out.println("Correct!");
                break;
            }
        }
    }

    private static void printUntilMultipleOf5And3() {
        for(int i=1;;i++) {
            System.out.print(i);
            if(i%5==0 && i%3==0) {
                break;
            }
            System.out.print(", ");
        }
    }

    private static void exitWhenUserWants() {
        for(;;) {
            System.out.print("Enter a random Number: ");
            if(scanner.nextInt() == -1) {
                System.out.println("You chose to exit");
                break;
            }
        }
    }

    public static void skipNumber5() {
        for(int i=1;i<=10;i++) {
            if(i==5) {
                continue;
            }
            System.out.print(i+ ", ");
        }
    }

    public static void printOddFrom1To20() {
        for (int i=1; i<=20; i++) {
            if(i%2==0)
                continue;
            System.out.print(i + ", ");
        }
    }

    public static void printOnlyPositiveAmongFiveNumbers() {
        System.out.println("Enter Five Numbers when prompted One By One");
        for(int i=1;i<=5;i++) {
            System.out.print("Enter number "+i+": ");
            int number = scanner.nextInt();

            if(number < 0)
                continue;
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        /* Break Statement */
        // 1. Write a program where the user has to guess a number between 1 and 10. If the guess is
        //correct, print "Correct!" and break the loop. Allow unlimited tries until they get it right.
//        guessTheNumber();

        // 2. Print numbers starting from 1 and break when you find a number that is a multiple of both 5
        //and 3 (i.e., 15, 30, etc.).
//        printUntilMultipleOf5And3();

        // 3. Keep asking the user to enter a number. If the user enters -1, break the loop and print
        // "You chose to exit".
//        exitWhenUserWants();

        /* Continue Statement */
        // 1. Print numbers from 1 to 10, but skip the number 5 using continue.
//        skipNumber5();

        // 2. Write a program to print all odd numbers from 1 to 20. Use continue to skip even
        //numbers.
//        printOddFrom1To20();

        // 3. Ask the user to enter 5 numbers. If a number is negative, skip it using continue, and only
        //print positive ones.
        printOnlyPositiveAmongFiveNumbers();

        scanner.close();
    }
}
