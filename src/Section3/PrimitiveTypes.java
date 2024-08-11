package Section3;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // Integers
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;

        // Caractéres são declarados com aspas simples: ''
        char c = 'a';

        // Booleano é True or False
        boolean bool = true;

        // Quando se passa um número float, o padrão é ser um double, para mostrar que é um float, você precisa usar a letra "f" ou "F" no final
        float f1 = 1.2f;
        float f2 = 1.3F;
        // O double já é o padrão, então funciona normalmente
        double d = 1.3;

        // Existe um tipo padrão para toda variável, neste caso, o tipo padrão é o int. Então quando chegamos a um número que passe o limite de espaço do int
        // precisamos mostrar que a variável é um long, da mesma forma que fazemos com o float.
        // Eu posso usar o "_" para separar dígitos para melhorar a legibilidade
        long l2 = 2_000_000_000_000L;

        // Podemos também declarar variáveis usando o var, porém, após a primeira inicialização do var, podemos apenas
        // alterar a variável com o tipo usado inicialmente
        var v = 1;
        // v = true; = impossível
        // v = 1.3; = impossível

        // Isso é um autobox, onde um int (1), foi "autoboxed" para um Integer
        Integer i2 = 1;
        // E isso é um unbox, onde um Integer (i2) foi "unboxed" para um int
        int i3 = i2;
    }
}
