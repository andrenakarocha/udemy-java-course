package Sections.Section9;

public class DoWhile {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println("Contador = " + i);
            i++;
        } while (i < 5);

        // O Do-While, GARANTE que o loop aconteça pelo menos uma vez, já que a condição do while é só acessada após o primeiro bloco de código é executado.
        do {
            // Então ele executa esse bloco de código pelo menos uma vez até ler a condição
            System.out.println("O contador já é 5 = " + i);
        } while (i < 5);
    }
}
