package Homeworks.Methods;

import java.util.Scanner;
import java.util.logging.Logger;

public class SumDigitsInNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer: ");
        int number = sc.nextInt();

        int sumOfDigits = sumDigitsInNumber(number);
        System.out.println(sumOfDigits);
    }

    public static int sumDigitsInNumber(int number) {
        String numberStr = String.valueOf(Math.abs(number));
        int[] digitsArr = new int[numberStr.length()];

        for (int i = 0; i < digitsArr.length; i++) {
            digitsArr[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        int sum = 0;

        for (int currentElem : digitsArr) {
            sum += currentElem;
        }
        return sum;
    }

}