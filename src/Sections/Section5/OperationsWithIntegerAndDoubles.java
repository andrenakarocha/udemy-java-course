package Sections.Section5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithIntegerAndDoubles {
    public static void main(String[] args) {
        int i = 20;
        // Quando se divide inteiros, você apenas recebe o valor arredondado.
        System.out.println(i / 3); // 6
        // Supondo a situação onde 3 amigos vão dividir a conta de um Uber, eles não conseguirão pagar este preço:
        System.out.println((double) i / 3); // 6.666666666666667

        // Portanto, usamos o objeto BigDecimal
        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
        // Agora, sim, chegamos a um número que eles podem usar para pagar o Uber igualmente!
        System.out.println(chargePerPerson); // 6.67

        // O mesmo acontece quando eu quero fazer operações com doubles:
        double d = 3.1;
        double d2 = 1.21;

        // O número que você sempre receberá pelo double, é o número mais próximo representado com 14 casas após o "."
        System.out.println(d - d2); // 1.8900000000000001

        // Usamos novamente o BigDecimal:
        BigDecimal bigDecimal = BigDecimal.valueOf(3.1).setScale(2);
        BigDecimal bigDecimal1 = BigDecimal.valueOf(1.21).setScale(2);
        System.out.println(bigDecimal.subtract(bigDecimal1)); // 1.89
    }
}
