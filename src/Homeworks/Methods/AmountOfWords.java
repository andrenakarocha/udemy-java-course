package Homeworks.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class AmountOfWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
	
        String str = input.nextLine();

        System.out.println("Amount of words in your text: " + getWordsAmount(str));
    }

    public static int getWordsAmount(String text) {
        int counter = 0;
        for (int i = 0; i < text.split(" ").length; i++) {
            counter += 1;
        }
        return counter;
    }
}