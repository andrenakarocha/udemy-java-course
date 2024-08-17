package Homeworks.Loops;

import java.util.Scanner;

public class NewLineForDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter any integer: ");
        String numbers = input.next();

        int i = 0;

        while (i < numbers.length()){
            System.out.println(numbers.charAt(i));
            i ++;
        }
    }

}