package Sections.Section9;

public class ForEach {
    public static void main(String[] args) {
        // Exemplo: Quero somar todos os número em uma array:
        int[] numbers = {1, 2, 3};
        int sum = 0;
        for (int number : numbers){
            sum += number;
            System.out.println("Número = " + number);
        }
        System.out.println("Sum = " + sum);
    }
}
