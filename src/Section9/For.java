package Section9;

public class For {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            System.out.println("Contador = " + i);
        }

        // Outra forma de escrever o for (Não muito recomendado, melhor substituir para um while)
        int j = 0;
        for(; j < 5;){
            System.out.println("Contador = " + j);
            j++;
        }

        // Usando mais de um contador:
        for (int a = 0, b = 10; a < b; a++, b--){
            System.out.println("Contador i = " + a + "\nContador j = " + b);
        }

        // Loop infinito:
//      for(;;){
//
//      }

    }
}
