package Sections.Section13.NewClasses.TypesOfClasses;

public class MasterProduct extends ProductAbstract {

    // MasterProduct seria o tipo de um produto, como por exemplo uma bota.
    // VariantProduct, seria as variações da bota, como tamanhos diferentes.
    private boolean isAvailableForLease;

    @Override
    public boolean isAvailableInStock() {
        return getRemainingAmountInStock() > 0;
    }
}