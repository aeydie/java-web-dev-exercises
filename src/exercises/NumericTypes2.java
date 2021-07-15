package exercises;

import java.util.Scanner;

public class NumericTypes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?:");
        Integer miles = input.nextInt();
        System.out.println("How many gallons of gas were consumed while driving those miles?:");
        Integer gas = input.nextInt();

        Integer milesPerGallon = miles/gas;

        System.out.println("If you drove " + miles + " miles and used " + gas +  " gallons of " +
                "gas, this is your miles per gallon =" + milesPerGallon);
    }
}

