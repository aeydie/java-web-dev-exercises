package controlFLowExercises;


import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        String suess = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = suess.split(" ");
        String[] sentences = suess.split("\\.");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentences));

        int[] numberArray = {1, 1, 2, 3, 5, 8};
        for (int i : numberArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
