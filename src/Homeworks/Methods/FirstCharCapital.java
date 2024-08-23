package Homeworks.Methods;

import java.util.Scanner;

public class FirstCharCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();


        System.out.println(firstCharToTitleCase(userInput));
    }

    public static String firstCharToTitleCase(String string) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;  // This flag determines whether to capitalize the next character

        for (char c : string.toCharArray()) {
            if (Character.isWhitespace(c)) {
                result.append(c);  // Add the whitespace character (space, tab, newline) as it is
                capitalizeNext = true;  // Next character should be capitalized if it's a letter
            } else {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));  // Capitalize the character
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));  // Lowercase the character
                }
            }
        }

        return result.toString();
    }
}