package Section13.Interfaces;

public interface PaymentProcessor {

    // Em interfaces posso criar constantes:
    // Como padrão, todas as constantes nas interfaces são definidas como public static final
    // public - para serem acessadas de qualquer lugar / static - para existir uma cópia em cada objeto / final - para que ninguém consiga mudá-la
    int RETRY_ATTEMPTS = 5;

    // Declaramos as funções sem nenhum corpo nas interfaces, para serem implementadas nas classes que herdarem a interface
    void processPayment ();

    // Interfaces também podem ter métodos com corpo, chamados de defaults.
    default void someDefaultMethod() {
        System.out.println("Default method");
    }

    // Interfaces também podem usar métodos statics. Ou seja, métodos que não precisam de um objeto criado para serem chamados, apenas digite o nome da classe/interface e chame o método
    static void someStaticMethod() {
        System.out.println("Static method");
    }
}
