package Sections.Section10;

public class RecursiveMethods {
    public static void main(String[] args) {
        // Métodos recursivos são forma mais rápidas ou práticas de criar loops em certos momentos.
        int result1 = calculateFactorial(4);
        int result2 = calculateFactorial(5);
        System.out.println(result1 + " " + result2);
    }

    // São métodos que chamam e eles mesmos para alguma função, por exemplo, achar o fatorial de um número:
    // Normalmente, precisaríamos usar um loop nesta situação, mas podemos criar uma função recursiva para isso:
    private static int calculateFactorial(int i){
        if (i != 0){
            return i * calculateFactorial(i - 1);
        } else {
            return 1;
        }
    }
}
