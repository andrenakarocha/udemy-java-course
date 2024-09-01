package Sections.Section6;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        // Da mesma forma que acontece com os inteiros, as strings também possuem uma pool. Assim que você cria uma nova string, essa string é adicionada na pool
        // Por isso essa comparação dá true
        System.out.println(s1 == s2); // true

        // Agora caso eu crie um objeto, as referências não serão as mesmas
        String s3 = new String("hello");
        System.out.println(s1 == s3); // false

        // Porém ao usar o equals(), funciona normalmente
        System.out.println(s1.equals(s3)); // true

        // Agora, a função intern() adiciona o objeto a String pool e retorna a referência do objeto na pool:
        System.out.println(s1 == s3.intern()); // true

        String firstName = "André";
        String firstName2 = "ANdrÉ";

        // Se eu comparar essas strings, vai retornar falso, por não serem iguais:
        System.out.println(firstName.equals(firstName2)); // false
        // Porém, existe uma função que compara independente se as letras foram maiúsculas ou minúsculas:
        System.out.println(firstName.equalsIgnoreCase(firstName2)); // true
    }
}
