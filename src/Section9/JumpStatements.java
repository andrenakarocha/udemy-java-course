package Section9;

public class JumpStatements {
    public static void main(String[] args) {
        // Jump Statements = continue (voltar ao começo do loop) e break (quebrar o loop)
        System.out.println("Continue:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                // Neste caso, se o número for par, ele não printará e voltará ao começo do código:
                continue;
            }
            System.out.println("Contador = " + i);
        }

        System.out.println("Break:");
        for (int i = 0; i < 5; i++) {
            if (i == 3){
                // Se o número for 3, ele para o código
                break;
            }
            System.out.println("Contador = " + i);
        }
    }
}
