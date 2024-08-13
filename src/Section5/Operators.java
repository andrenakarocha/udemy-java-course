package Section5;

public class Operators {
    public static void main(String[] args) {
        // Unary Arithmetic Operators

        int i = +10;
        int i2 = -10;
        // Nesse caso, a variável i será primeiro incrementada para 11 e depois associada a variável i3
        int i3 = ++i;
        // Já neste caso, a variável i4 será primeiro inicializada com o valor 11 e só depois disso a variável i será incrementada para 12. Deixando o valor da variável i4 para 11
        int i4 = i++;
        // Ambos abaixo são o mesmo caso, porém decrementando
        int i5 = --i;
        int i6 = i--;

        // Binary Arithmetic Operators

        int i7 = 10 + 1;
        int i8 = i7 - 1;
        int i9 = i8 / 2;
        int i10 = i9 % 2;
        int i11 = i10 * 3;

        // Assingment Operators

        int i12 = 10;
        i12 += 2;
        i12 -= 2;
        i12 *= 2;
        i12 /= 2;
        i12 %= 2;

        // Relational Operators (Valor Booleano)

        int i13 = 10;
        int i14 = 20;

        System.out.println(i13 == i14);
        System.out.println(i13 != i14);
        System.out.println(i13 > i14);
        System.out.println(i13 < i14);
        System.out.println(i13 >= i14);
        System.out.println(i13 <= i14);

        // Logical Operators

        // & Retorna true só quando ambos são true
        // Neste caso, eu já sei que o resultado da expressão será false, pois o primeiro já é false. Por isso usamos o &&, que ignora completamente a segunda expressão, já que já
        // já sabemos que a primeira é false
//      System.out.println(false & (5/0 == 0)); // Runtime Exception
        System.out.println(false && (5/0 == 0)); // false

        // | (or) retorna true apenas quando um é true
        // E este caso se aplica a mesma teoria do caso acima.
//      System.out.println(true | (5/0 == 0)); // Runtime Exception
        System.out.println(true || (5/0 == 0)); // true

        // ! funciona como um reversor: true se torna false e false se torna true
        // Um exemplo de uso é caso você queira verificar se uma string não está vazia: (if !true{})
        System.out.println("!true = " + !true);

        // ^ funciona como o | com uma excessão, ele retorna false se ambos forem true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);

        // Bitwise operators

        System.out.println("4 & 5 = " + (4 & 5)); // 4
        /*
         * 				1 0 0 = 4 em binário
         * 				& & &
         * 				1 0 1 = 5 em binário
         * 				-----
         * 				1 0 0 = 4
         */

        System.out.println("4 | 5 = " + (4 | 5)); // 5
        /*
         * 				1 0 0
         * 				| | |
         * 				1 0 1
         * 				-----
         * 				1 0 1 = 5
         */

        System.out.println("4 ^ 5 = " + (4 ^ 5)); // 1
        /*
         * 				1 0 0
         * 				^ ^ ^
         * 				1 0 1
         * 				-----
         * 				0 0 1 = 1
         */

        // Bitwise shift
        System.out.println("~1 = " + ~1);
        System.out.println(Integer.toBinaryString(1));		// 00000001
        System.out.println(Integer.toBinaryString(-2));		// 11111110

        // Troca o bit para a direita
        System.out.println("5 = " + 0b101); // 5 em binário
        System.out.println("5 >> 1 = " + (0b101 >> 1)); // trocando o bit pra direita
        System.out.println("5 in binary format = " + Integer.toBinaryString(5));
        System.out.println("2 in binary format = " + Integer.toBinaryString(2));	// 10


        System.out.println("5 = " + 0b101);					// 000000101
        System.out.println("5 >>> 1 = " + (0b101 >>> 1));	// 000000010

        // Left shift
        System.out.println("5 = " + 0b101);
        System.out.println("5 << 1 = " + (0b101 << 1));
        System.out.println("5 in binary format = " + Integer.toBinaryString(5));
        System.out.println("10 in binary format = " + Integer.toBinaryString(10));

        System.out.println("10 * 2 = 10 << 1 = " + (10 << 1));	// x << y = x * (2 ^ y)
        System.out.println("10 / 2 = 10 >> 1 = " + (10 >> 1));	// x >> y = x / (2 ^ y)

        // Ternary Operators
        // Escrever um if else em uma linha
        // Formato: (condição) ? expressão true : expressão false

        System.out.println(2 > 1? "2 é maior que 1" : "2 é menor que 1");
        System.out.println(2 < 1? "2 é menor que 1" : "2 é maior que 1");
    }
}
