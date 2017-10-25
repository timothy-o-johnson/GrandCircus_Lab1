package com.robinsondetroit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = 0.0;
        double width = 0.0;
        double height = 0.0;

        boolean calculateAgain = true;
        String yesNo = "y";

        while (calculateAgain) {
            System.out.print("\n\nWelcome to the Grand Circus' Room Detail Generator!\n");

            System.out.print("Enter Length: ");
            length = sc.nextDouble();

            System.out.print("Enter Width: ");
            width = sc.nextDouble();

            System.out.println("Area: " + length * width);
            System.out.println("Perimeter: " + 2 * (length + width));

            System.out.print("Continue? (y/n) ");
            yesNo = sc.next();

            if( yesNo.equals("y")) {
                calculateAgain = true;
            } else if (yesNo.equals("n")){
                calculateAgain = false;

            }

            System.out.println(calculateAgain);
        }

        System.out.print("\nWould you like to calculate the volume? (y/n): ");
        yesNo = sc.next();

        if( yesNo.equals("y")) {
            System.out.print("What is the room's height? ");
            height = sc.nextDouble();
            System.out.print("Volume = " + length * width * height);
        }

    }
}