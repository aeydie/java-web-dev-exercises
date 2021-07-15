package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the circle radius: ");
        String userInput = input.nextLine();

        double radius = Double.parseDouble(userInput);

        System.out.println(new StringBuilder().append("The area of a circle with radius ").append(radius).append(" is:  ").append(calculateCircleArea(radius)).toString());
    }

    public static double calculateCircleArea(double userRadius) {
        return Math.PI * userRadius * userRadius;
    }
}

