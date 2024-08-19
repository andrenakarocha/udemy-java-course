package Homeworks.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer numbers separated by space: ");

        String line = sc.nextLine();
        String[] lineArr = line.split(" ");
        int[] numbers = new int[lineArr.length];

        for(int i = 0; i < lineArr.length; i++){
            numbers[i] = Integer.parseInt(lineArr[i]);
        }

        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(numbers));
        System.out.println("*** Max number in array ***");
        System.out.println(findMaxIntInArray(numbers));
    }


    public static int findMaxIntInArray(int[] intArray) {
        int max = 0;
        for (int current_num : intArray) {
            if (current_num > max) {
                max = current_num;
            }
        }
        return max;
    }
}
