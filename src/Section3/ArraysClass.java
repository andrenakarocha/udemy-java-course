package Section3;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        // Formas de declarar
        // tipo [] nome
        int[] arr;

        // Inicializando
        arr = new int[10];
        // Valor padrão para arrays de Integers = 0
        System.out.println(arr[0]);

        double[] arr2 = new double[10];
        // Valor padrão para arrays de Doubles = 0.0
        System.out.println(arr2[0]);

        boolean[] arr3 = new boolean[10];
        // Valor padrão para arrays de Booleanos = false
        System.out.println(arr3[0]);

        // Declarando com as variáveis
        int[] arr4 = {1, 2, 3};

        // Criando matrizes (Arrays de arrays)
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };
        // Para achar o valor 2 por exemplo (Primeiro array, Segundo elemento}
        System.out.println(matriz[0][2]);

        // Printar um array em formato de string:
        int[] arr5 = {2, 5, 7, 8};
        System.out.println(Arrays.toString(arr5));
        // Organizar os elementos no array:
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));
    }
}
