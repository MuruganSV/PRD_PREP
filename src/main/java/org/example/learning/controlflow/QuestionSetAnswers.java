package org.example.learning.controlflow;

import java.util.Scanner;

public class QuestionSetAnswers {

//    public static void main(String[] args) {
//        // Create ONE scanner for the entire program
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("\n--- User Profile ---");
//        System.out.println("Name: " + name);
//
//        // Do NOT close the scanner here anymore!
//
//        System.out.print("Enter something else: ");
//        System.out.println("Instant Input is " + scanner.nextLine()); // Uses the same scanner
//
//        // Close it exactly once at the very end
//        scanner.close();
//    }

//    public static void main(String args[]) {
//        System.out.println("runningFrom first main");
//
//        /* How to get the user input for different DataTypes */
//
//        // 2. Create a Scanner object hooked up to the standard input stream (keyboard)
//        Scanner scanner = new Scanner(System.in);
//
////        System.out.println("Instant Input is "+ scanner.nextLine()); // working here properly
//
//        // 3. Get String input
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine(); // Reads the entire line of text, scanner.next() will read only next text not entire line
//
//
//        // 4. Get Integer input
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt(); // Reads an integer, If user enters an different dataType that will throw java.util.InputMismatchException
//
//        // 5. Get Double (decimal) input
//        System.out.print("Enter your GPA: ");
//        double gpa = scanner.nextDouble(); // Reads a double precision number
//
//        scanner.nextLine();
//
//        System.out.println("Give your Instant Input: ");
//        System.out.println("Instant Input is "+ scanner.nextLine());
//
//        // Output the results
//        System.out.println("--- User Profile ---");
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("GPA: " + gpa);
//
//
//        // 6. Close the scanner to prevent resource leaks
//        scanner.close(); // once scanner is closed, it closes permanently(system.in), we try to use scanner will throw java.lang.IllegalStateException: Scanner closed
//        // Even though if we create new scanner object it won't work.
//
////        Scanner scanner1 = new Scanner(System.in);
////
////        System.out.println("Instant Input is "+ scanner1.nextLine()); // java.util.NoSuchElementException: No line found, because previously the scanner were closed
////
////        scanner1.close();
//
//        /*If statements */
//
//
//    }

    public static void checkPositiveNumber(Scanner scanner) {
        System.out.print("Enter a number to check positive: ");
        if(scanner.nextInt() > 0) {
            System.out.println("The number is positive");
        }
    }

    public static void isEligibleToVote(Scanner scanner){
        System.out.print("Enter your age & Are you a citizen of India(true/false): ");

        if (scanner.nextInt() > 17 && scanner.nextBoolean()) {
            System.out.println("Eligible to vote");
            return;
        }
        System.out.println("Not eligible to vote");
    }

    public static void isEligibleToVoteOrNot(Scanner scanner){
        System.out.print("Enter your age for voting eligibility: ");

        if (scanner.nextInt() > 17) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }
    }

    public static void isWeekEndDay(Scanner scanner){
        System.out.print("Enter the day to check it's WeekEnd: ");
        String day = scanner.next();
        if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
            System.out.print("Weekend");
        }
    }

    public static void checkIsOddOrEvenNumber(Scanner scanner) {
        System.out.print("Enter a number to check Odd or Even: ");
        if(scanner.nextInt() % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void compareTwoNumbers(Scanner scanner) {
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println("First is greater");
        } else if (num2 > num1) {
            System.out.println("Second is greater");
        } else {
            System.out.println("Both are equal");
        }
    }

    public static void compareThreeNumbers(Scanner scanner) {
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("First is largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second is largest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Third is largest");
        } else {
            System.out.println("All are Equal");
        }

    }

    public static void assignGradesBasedOnMarks(Scanner scanner) {
        System.out.print("Enter your Marks to know the Grade: ");
        int marks = scanner.nextInt();

        if (marks > 100) {
            System.out.println("Invalid Mark"); return;
        }

        // 90–100 → "Grade A", 80–89 → "Grade B", 70–79 → "Grade C", 60–69 → "Grade D", Below 60 → "Grade F"
        if (marks > 89) {
            System.out.println("Grade A");
        } else if (marks < 90 && marks > 79) {
            System.out.println("Grade B");
        } else if (marks < 80 && marks > 69) {
            System.out.println("Grade C");
        } else if (marks < 70 && marks > 59) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }

    public static void loginAuth(Scanner scanner) {
        //If the username is "admin" and the password is "1234", print "Login successful";
        // otherwise, print "Invalid credentials"
        System.out.print("Enter username: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }
    }

    public static void checkIsLeapYear(Scanner scanner) {
        // A year is a leap year if it is divisible by 4 and not divisible by 100, or divisible by 400.
        //Input: Year as an integer
        //Output: "Leap Year" or "Not a Leap Year"

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }

    public static void isValidTriangle(Scanner scanner) {
        System.out.print("Side A: ");
        int a = scanner.nextInt();

        System.out.print("Side B: ");
        int b = scanner.nextInt();

        System.out.print("Side C: ");
        int c = scanner.nextInt();

        if (a+b > c && b+c > a && a+c > b) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }
    }

    public static void calculateMovieTicketPrice(Scanner scanner) {
        // Input:
        // Age of the customer
        // Day of the week
        // Discount Rules:
        // If age < 12 or age > 60 → apply 50% discount
        // If day is "Wednesday" → apply 30% discount
        // Discounts don’t combine — choose the best one
        // Output: Final ticket price after applying the appropriate discount

        double ticketPrice = 250.0, priceAfterDiscount = 0.0;

        System.out.print("Please enter your Age: ");
        int age = scanner.nextInt();

        System.out.print("Day of the week: ");
        String weekDay = scanner.next();

        int maximumDiscountPercent = 0;

        if (age < 12 || age > 60) {
            maximumDiscountPercent = 50;
        }

        if (weekDay.equalsIgnoreCase("wednesday") && maximumDiscountPercent == 0) {
         maximumDiscountPercent = 30;
        }

        priceAfterDiscount = ticketPrice - ((ticketPrice/100) * maximumDiscountPercent);

        System.out.println("Actual price: "+ticketPrice+ ", Discount Percent: "+maximumDiscountPercent+ ", Price After Discount: "+priceAfterDiscount);

    }

    public static void controlTraffic(Scanner scanner) {
        // Signal color ("red", "yellow", "green")
        // Vehicle type ("ambulance" or "normal")
        // Rules:
        // If signal is "red" and vehicle is "normal" → Stop
        // If signal is "yellow" → Slow down
        // If vehicle is "ambulance" → Go regardless of signal
        // Else → Go
        // Output: Appropriate action: "Stop", "Go", or "Slow down"

        System.out.print("Enter Signal on the way: ");
        String signal = scanner.next();

        System.out.print("Enter the vehicle Type: ");
        String vehcile = scanner.next();

        if(vehcile.equalsIgnoreCase("ambulance")) {
            System.out.println("Go");
        } else if (signal.equalsIgnoreCase("yellow")) {
            System.out.println("Slow down");
        } else if (signal.equalsIgnoreCase("red")){
            System.out.println("Stop");
        } else {
            System.out.println("Go");
        }
    }

    public static int minimumOfThree(Scanner scanner) {
        System.out.print("Enter number1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter number3: ");
        int num3 = scanner.nextInt();

        return (num1 < num2 && num1 < num3) ? num1 : (num2 < num1 && num2 < num3) ? num2 : num3;
    }

    public static String dayOftheWeek(Scanner scanner) {
        System.out.print("Enter the number of the day: ");
        int numberOfTheDay = scanner.nextInt();

        switch(numberOfTheDay) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
        }
        return "Invalid day Number";

        // switch Expression
//        return switch (numberOfTheDay) {
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            case 7 -> "Sunday";
//            default -> "Invalid day Number";
//        };
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        /* If Statement */

        // 1. Write a program that checks if a number is positive. If it is, print "The number is positive".
//        checkPositiveNumber(scanner);


        // 2. Write a program to check if a person is eligible to vote.
        // The person must be 18 or older and a citizen of the country.
        // Use age and isCitizen boolean flag as input. Print "Eligible to vote" or "Not eligible to vote"
//        isEligibleToVote(scanner);

        // 3. Write a program that checks if a day is a weekend.
        // Input: day (string). If the day is "Saturday" or "Sunday", print "Weekend".
//        isWeekEndDay(scanner);

        /* If else Statement */

        // 1. Write a program to check if a number is even or odd. Use if-else to print "Even" or "Odd"
//        checkIsOddOrEvenNumber(scanner);

        // 2. Write a program to determine if a person is eligible to vote.
        // Input: Age of the person
        // Output: "Eligible to vote" if age is 18 or above, otherwise "Not eligible".
//        isEligibleToVoteOrNot(scanner);

        // 3. Write a program to compare two numbers and print which one is greater, or if they are equal.
        //Input: Two integers
        //Output: "First is greater", "Second is greater", or "Both are equal"
//        compareTwoNumbers(scanner);

        // 4. Write a program to find the largest among three given numbers using if-else.
        //Input: Three integers
        //Output: "First is largest", "Second is largest", or "Third is largest".
//        compareThreeNumbers(scanner);

        // 5. Write a program to assign grades based on marks using the following rules:
        // 90–100 → "Grade A", 80–89 → "Grade B", 70–79 → "Grade C", 60–69 → "Grade D", Below 60 → "Grade F"
        // Input: Marks as an integer
        //Output: Grade as per the range
//        assignGradesBasedOnMarks(scanner);


        // 6. Write a program to simulate a login system.
        //Input: A username and a password
        //Output: If the username is "admin" and the password is "1234", print "Login successful";
        // otherwise, print "Invalid credentials"
//        loginAuth(scanner);

        // 7. Write a program to check if a given year is a leap year or not. Conditions:
        // A year is a leap year if it is divisible by 4 and not divisible by 100, or divisible by 400.
        //Input: Year as an integer
        //Output: "Leap Year" or "Not a Leap Year"
//        checkIsLeapYear(scanner);

        // 8. Write a program to check whether three given sides can form a valid triangle.
        //Condition: The sum of any two sides must be greater than the third.
        //Input: Three integers representing sides
        //Output: "Valid triangle" or "Invalid triangle"
//        isValidTriangle(scanner);

        // 9. Write a program to calculate movie ticket price after applying discounts.
        // Input:
        // Age of the customer
        // Day of the week
        // Discount Rules:
        // If age < 12 or age > 60 → apply 50% discount
        // If day is "Wednesday" → apply 30% discount
        // Discounts don’t combine — choose the best one
        // Output: Final ticket price after applying the appropriate discount
//        calculateMovieTicketPrice(scanner);


        // 10. Write a program to decide whether a vehicle should go or stop based on signal color and vehicle type.
        // Input:
        // Signal color ("red", "yellow", "green")
        // Vehicle type ("ambulance" or "normal")
        // Rules:
        // If signal is "red" and vehicle is "normal" → Stop
        // If signal is "yellow" → Slow down
        // If vehicle is "ambulance" → Go regardless of signal
        // Else → Go
        // Output: Appropriate action: "Stop", "Go", or "Slow down"
//        controlTraffic(scanner);

        /* Ternary Operator */
        // 1. Write a program to find the minimum of three numbers using nested ternary.
        // Input: Three integers
        // Output: Minimum value
//        System.out.println("Minimum of Three numbers: "+minimumOfThree(scanner));

        /* Switch Cases */
        // Write a program that takes a number (1–7) and prints the corresponding day of the week.
        // Input: Integer from 1 to 7
        // Output: "Monday", "Tuesday", ..., "Sunday"
        System.out.println("Day of the Week: "+ dayOftheWeek(scanner));

        scanner.close();
    }

    public static void main(char args) {
        System.out.println("runningFrom second main");
    }
}
