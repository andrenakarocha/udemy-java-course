package Section5;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, insira qualquer palavra: ");
        String word = input.next();
        System.out.println("Você colocou esta palavra: " + word);

        System.out.println("Por favor, insira um número inteiro: ");
        int number = input.nextInt();
        System.out.println("Você colocou este número: " + number);
    }
}
