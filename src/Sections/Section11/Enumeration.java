package Sections.Section11;

public class Enumeration {
    public static void main(String[] args) {

        // Crio um objeto Priority, que precisa ser um dos valores passados no enum:
        Priority priority = Priority.HIGH;

        switch(priority){
            case HIGH -> System.out.println("High priority");
            case MEDIUM -> System.out.println("Medium priority");
            case LOW -> System.out.println("Low priority");
        }

        // Caso eu precise que um usuário diga o valor do Priority por exemplo, eu chamaria uma função para isso:
        Priority priority1 = Priority.valueOf("HIGH"); // E passo aqui a função que retornaria do valor

        // Enums tem ordinais:
        System.out.println(Priority.HIGH.ordinal());
        System.out.println(Priority.MEDIUM.ordinal());
        // Podemos perceber que o ordinal é diferente, ou seja, posso comparar os enums usando == ou equals()

        // Caso eu queira iterar sobre os valores:
        Priority[] values = Priority.values();
        for (Priority priority2 : values){
            System.out.println(priority2);
        }

        // E por fim, o que vamos realmente usar
        // Cada valor enum pode ter sua própria função, como os meses:

        System.out.println(Month.JANUARY.getDaysAmount());


    }
}
