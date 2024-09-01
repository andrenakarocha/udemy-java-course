package Sections.Section10;

public class Methods {
    public static void main(String[] args) {
        int sum = sum(1, 2);
        printToConsole(sum);
        printToConsole(sum(2.1, 3.4));
        printToConsole("Some text");
    }

    // Existe algo chamado Overloading, onde eu escrevo métodos com o mesmo nome porém que precisam de parâmetros diferentes. Ele roda a função dependendo do parâmetro passado
    private static int sum(int i1, int i2){
        return i1 + i2;
    }

    private static double sum(double d1, double d2){
        return d1 + d2;
    }

    private static void printToConsole(String text){
        System.out.println(text);
    }

    private static void printToConsole(int number){
        System.out.println(number);
    }

    private static void printToConsole(double number){
        System.out.println(number);
    }
}
