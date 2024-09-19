package Homeworks.Methods;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainLoop:
        while (true) {
            System.out.print("Please, select mode. If you want to convert Roman "
                    + "numbers to decimal - type 'R2D' and press enter."
                    + System.lineSeparator()
                    + "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

            String mode = sc.next();
            if (mode.equalsIgnoreCase("R2D")) {
                while (true) {
                    System.out.print("Please, enter Roman number you want to convert: ");
                    String romanNumber = sc.next();
                    if (isRomanNumberValid(romanNumber)) {
                        System.out.println(roman2Decimal(romanNumber));
                        break mainLoop;
                    } else {
                        System.out.println("You entered invalid Roman number. "
                                + "Please, try one more time.");
                        continue;
                    }
                }
            } else if (mode.equalsIgnoreCase("D2R")) {
                while (true) {
                    System.out.print("Please, enter decimal number "
                            + "you want to convert: ");
                    int decimalNumber = sc.nextInt();
                    if (isDecimalNumberValid(decimalNumber)) {
                        System.out.println(decimal2Roman(decimalNumber));
                        break mainLoop;
                    } else {
                        System.out.println("Please, enter positive integer from 1 to 100.");
                        continue; } } } System.out.println("Please, enter 'R2D' or 'D2R.");
        }
    }


    public static String decimal2Roman(int number) {
        int[] decimalvalues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanValues = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder convertedNumber = new StringBuilder();

        for (int i = 0; i < decimalvalues.length; i++) {
            while (number >= decimalvalues[i]) {
                convertedNumber.append(romanValues[i]);
                number -= decimalvalues[i];
            }
        }

        return convertedNumber.toString();
    }

    public static int roman2Decimal(String romanNumber) {
        int convertedNumber = 0;
        int i = 0;

        while (i < romanNumber.length()) {
            // Verify if there is double symbols ("IV")
            if (i + 1 < romanNumber.length() && valueOf(romanNumber.charAt(i)) < valueOf(romanNumber.charAt(i + 1))) {
                convertedNumber += valueOf(romanNumber.charAt(i + 1)) - valueOf(romanNumber.charAt(i));
                i += 2; // Jump two chars
            } else {
                convertedNumber += valueOf(romanNumber.charAt(i));
                i++;
            }
        }

        return convertedNumber;
    }

    public static boolean isRomanNumberValid (String romanNumber){
        for (int i = 0; i < romanNumber.length(); i++) {
            char currentChar = romanNumber.charAt(i);

            // Verify if the current char is roman
            if(!isRomanChar(currentChar)){
                return false; // If it is not, return false
            }
        }

        return true; // If it is, return true
    }

    public static boolean isDecimalNumberValid (int decimalNumber){
        return decimalNumber > 0 && decimalNumber <= 3999;
    }

    public static boolean isRomanChar(char c){
        char[] validRomans = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        // Verify is the current character is in the validRomans list
        for (char romanChar : validRomans){
            if (c == romanChar){
                return true;
            }
        }

        return false; // Return false if it wasn't found
    }

    private static int valueOf(char roman) {
        switch (roman) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;  // Em caso de caractere inválido
        }
    }
}
