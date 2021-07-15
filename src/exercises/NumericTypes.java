package exercises;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the length of your rectangle:");
        Integer length = input.nextInt();
        System.out.println("Please provide the width of your rectangle:");
        Integer width = input.nextInt();

        Integer area = length * width;

        System.out.println("This is the area of your rectangle = " + area);
    }
}
