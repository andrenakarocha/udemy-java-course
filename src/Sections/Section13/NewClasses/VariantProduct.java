package Sections.Section13.NewClasses;

public class VariantProduct extends ProductAbstract {

    // Ele cria uma array do tipo MasterProduct para colocar as variantes deste produto.
    private MasterProduct[] variants;

    // Verifica se o produto está disponível no estoque
    @Override
    public boolean isAvailableInStock() {
        for (MasterProduct masterProduct : variants) {
            if (masterProduct.isAvailableInStock()) {
                return true;
            }
        }
        return false;
    }

}