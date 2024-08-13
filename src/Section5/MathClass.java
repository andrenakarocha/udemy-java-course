package Section5;

public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI);        // 3.141592653589793
        System.out.println(Math.max(3, 5)); // 5
        System.out.println(Math.min(3, 5)); // 3
        System.out.println(Math.sqrt(4));   // 2.0
        System.out.println(Math.abs(-5));   // 5 (Valor absoluto)

        // Pode retornar NaN (Not a Number)
        System.out.println(Math.sqrt(-1)); // NaN
        System.out.println(0/ 0.0);        // NaN
        System.out.println((0 / 0.0) + 5); // NaN

        // Pode retornar Infinity ou -Infinity
        System.out.println(5 / 0.0);  // Infinity
        System.out.println(-5 / 0.0); // -Infinity

        // Posso arredondar números
        System.out.println(Math.round(20.0 / 3.0)); // 7
        // Caso eu queira manipular as casas, posso fazer desta forma
        // Por exemplo, quero deixar 2 casas. Multiplico por 100 e depois divido por 100:
        System.out.println((20.0 * 100.0 / 3.0) / 100.0); // 6.67

        // Também tem a função random
        System.out.println(Math.random());                    // número entre 0.0 e 1.0
        System.out.println((int)(Math.random() * 100));       // número entre 0 e 100
        System.out.println((int)(Math.random() * 100) + 100); // número entre 100 e 200
    }
}
