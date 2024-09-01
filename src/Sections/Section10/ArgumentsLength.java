package Sections.Section10;

public class ArgumentsLength {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    // Passando um número de argumentos não definidos:
    private static int sum( int... ints){
        int sum = 0;
        for (int i : ints){
            sum += i;
        }
        return sum;
    }

    // Caso eu queira passar mais de um argumento e apenas um é indefinido, só podemos passar o argumento indefinido no final:

    // Errado
//  private static void passandoArgumento(int ... i, String s){
//
//  }

    // Certo
    private static void passandoArgumento(String a, int ... i){

    }
}
