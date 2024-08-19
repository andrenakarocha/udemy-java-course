package Homeworks.Methods;

import java.util.Scanner;

public class EmptyRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

        drawRectangle(height, width);
    }

    public static void drawRectangle(int height, int width) {
        System.out.println("*".repeat(width));
        for (int i = 0; i < (height - 2); i++) {
            System.out.println("*" + " ".repeat(width - 2) + "*");
        }
        System.out.println("*".repeat(width));
    }

}
