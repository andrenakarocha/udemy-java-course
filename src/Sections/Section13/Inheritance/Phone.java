package Sections.Section13.Inheritance;

// A herança permite que o Phone tenha todas as características e métodos que o Product tem
// Não existem duas heranças, o Java só permite que uma classe tenha 1 pai
public class Phone extends Product {

    // Default constructor
    public Phone() {
        // Neste caso, uso o "super" para "chamar" o construtor da classe pai.
        // É necessário usar o super no construtor, para criar o construtor corretamente na classe filho.
        super("Nokia");
        System.out.println("Some code");
    }

    public void ring() {
        System.out.println("Ring!");
    }

    // A classe phone usa o override para mostrar um erro caso alguém queira usar a função listVariants, que não é para ser usado por um objeto Phone, mas pode sim ser usado pelo seu pai.
    @Override
    public Product[] listVariants() {
        throw new UnsupportedOperationException();
    }

    public int calculateAmountOfVariants() {
        // Neste caso, ele funciona pois está retornando o método listVariants da classe pai. Como? Ao usar o super, quer dizer que estou usando o método da classe pai.
        return super.listVariants().length;
    }

}