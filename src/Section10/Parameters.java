package Section10;

import java.util.Arrays;

public class Parameters {
    public static void main(String[] args) {
        int i = 10;

        // Quando mudo o valor de uma variável desta forma, não estou mudando o valor da minha variável i padrão, mas sim da cópia da variável i criada como parâmetro para a função
        changeIntValue(i);
        // Por isso que nesse print mostra 10 e não 110
        System.out.println(i);

        // Agora se eu quiser realmente somar na minha variável i local, preciso fazer desta forma: (usando o return)
        i = changeInt(i);

        int[] array = {1, 2, 3};
        // Neste caso, por que ele muda o valor? Porque estou passando a referência do array, e a função cria uma cópia da referência, que aponta para o mesmo objeto
        // array na pool, fazendo assim com que mude o valor.
        changeArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void changeIntValue(int i) {
        i += 100;
    }

    private static int changeInt(int num) {
        // Usando o return, consigo fazer com que o valor da variável mude
        return num += 100;
    }

    private static void changeArray(int[] array) {
        array[1] = 200;
    }
}
