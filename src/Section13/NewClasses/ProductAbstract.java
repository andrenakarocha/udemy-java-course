package Section13.NewClasses;

public abstract class ProductAbstract {

    // Neste caso, a class produto é abstrata, pois não vou instanciar um objeto produto diretamente, mas sim, o MasterProduct e o VariantProduct, que herdam a classe produto abstrata
    private int id;
    private String name;
    private int minOrderQuantity;
    private boolean isDeliveryAvailable;

    // Essa função não tem nada dentro dela, pois a implementação em cada classe que extende, será diferente
    // Chamamos de abstract method
    public abstract boolean isAvailableInStock();

    public int getRemainingAmountInStock() {
        return 100; // just a stub for the sake of example;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMinOrderQuantity() {
        return minOrderQuantity;
    }
    public void setMinOrderQuantity(int minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }
    public boolean isDeliveryAvailable() {
        return isDeliveryAvailable;
    }
    public void setDeliveryAvailable(boolean isDeliveryAvailable) {
        this.isDeliveryAvailable = isDeliveryAvailable;
    }

}