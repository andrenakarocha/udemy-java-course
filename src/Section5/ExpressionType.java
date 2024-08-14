package Section5;

public class ExpressionType {
    public static void main(String[] args) {
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;

        float f = 1.0f;
        double d = 1.0;

        char c = 1;

        // Tipos de expressões:

        // Todos os tipos de operações com inteiros resultarão em inteiros, mesmo somando variáveis que em teoria não são inteiros:
        int intExpressionType = b + b;
        int intExpressionType1 = s + s;
        int intExpressionType2 = b + i + c;

        // Porém, caso eu use variáveis long nas expressões com inteiros, o resultado será long:
        long longExpressionType = i + l;

        // O mesmo acontece com float e double:
        float floatExpressionType = l + f;

        double doubleExpressionType = f + d;

        // O mesmo se aplica ao printar operações:
        System.out.println(10 / 3);   // 3
        System.out.println(10.0 / 3); // 3.33333333333335

        // Caso um dos operadores seja uma string, o resultado sempre será uma string.
        System.out.println("Hello" + 1);    // Hello 1
        System.out.println("Hello" + null); // Hello null
    }
}
