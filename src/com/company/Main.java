package com.company;

import java.util.Scanner;

/*
Math Two
Due No Due Date  Points 1  Submitting a website url
Write an application that assigns 2 to a variable named mynumber and 1.7938 to a variable namedmyothernumber, and then prints out the values to the console.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double mynumber = 0;
        double myothernumber = 0;
        System.out.println("What is your first number?");
        mynumber = scanner.nextDouble();
        System.out.println("What is your other number?");
        myothernumber = scanner.nextDouble();
        System.out.println("My Number: " + mynumber + " My Other Number: " + myothernumber+ " \n the sum of these numbers are " + (mynumber + myothernumber));

    }
}
