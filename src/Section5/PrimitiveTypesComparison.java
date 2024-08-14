package Section5;

import java.util.Arrays;

public class PrimitiveTypesComparison {
    public static void main(String[] args) {
        int int1 = 128;
        int int2 = 128;

        // Pelo int ser um tipo primitivo, aqui eu estou a comparar os valores
        System.out.println(int1 == int2); // true
        System.out.println(1 == 2);       // false
        System.out.println(65 == 'A');    // true (A na tabela é 65)

        Integer i = 128;
        Integer i2 = 128;

        // Neste caso, como o Integer é um tipo não primitivo, estou a comparar as referências, não os valores
        System.out.println(i == i2); // false

        Integer i3 = 127;
        Integer i4 = 127;

        // Por que agora o resultado é true?
        // Quando os valores de Integers estão dentro da pool (-128 até 127), é criado apenas 1 objeto que as referências apontam, para economizar espaço
        System.out.println(i3 == i4); // true

        // Agora, quando eu crio o Integer especificando que quero criar objetos para cada referência, mesmo usando os valores dentro da pool, eles são diferentes.
        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);

        System.out.println(i5 == i6); // false

        // Como o jeito acima foi depreciado, pois não é o jeito ideal de inicializar um objeto Integer (por causa do uso não ideal do espaço)
        // Eles sugerem uma nova forma de inicializar esse objeto:
        Integer i7 = Integer.valueOf(127);
        Integer i8 = Integer.valueOf(127);

        // Desta forma ambas as referências apontam ao mesmo objeto
        System.out.println(i7 == i8); // true

        // Mas caso queira comparar apenas os valores e não as referências, usamos o "equals()"
        System.out.println(i.equals(i2)); // true

        // As mesmas coisas acontecem com arrays:
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println(arr1 == arr2);              // false (compara as referências)
        System.out.println(arr1.equals(arr2));         // false (não usa a propriedade dos arrays)
        System.out.println(Arrays.equals(arr1, arr2)); // true (forma correta de comparar valores de arrays)

        // Agora se eu fazer as variáveis apontarem ao mesmo objeto:
        arr1 = arr2;
        System.out.println(arr1 == arr2); // true
    }
}
