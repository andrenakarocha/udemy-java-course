package Sections.Section8;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println(r.nextInt()); // qualquer int aleatório
        System.out.println(r.nextInt(100)); // qualquer int entre 0 e 99
        System.out.println(r.nextInt(100) + 1); // qualquer int entre 0 e 100
    }
}
