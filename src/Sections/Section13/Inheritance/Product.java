package Sections.Section13.Inheritance;

public class Product {

    private int id;
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public int calculateRemainingAmount() {
        return 100; // só para o exemplo
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] listVariants() {
        // código que faria fetch de produtos da database
        return new Product[3]; // apenas um fake return para o exemplo
    }
}