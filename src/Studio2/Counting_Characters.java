package Studio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Characters {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a phrase:");
        String inputStr = input.nextLine();
        char[] charInString = inputStr.toCharArray();

        String allowableChar = "a-z";

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char letter: charInString) {
            if (charCounts.containsKey(letter)) {
                charCounts.put(letter, charCounts.get(letter) + 1);
            } else {
                charCounts.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> printChar : charCounts.entrySet()) {
            System.out.println(printChar.getKey() + ":" + printChar.getValue());
        }
    }
}
