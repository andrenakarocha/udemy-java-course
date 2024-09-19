package Sections.Section13.NewClasses.TypesOfClasses;

// Aqui importo as nested classes
import Sections.Section13.NewClasses.*;
import Sections.Section13.NewClasses.Cart.Tax;
import Sections.Section13.NewClasses.Cart.Discount;

public class Demo {

    public static void main(String[] args) {
        User user = new User();

//		// === init static nested class
        Tax tax = new Tax("someTaxType", 0);
//
//		// === init inner class
        // Aqui eu inicio ambos os objetos, pois não se pode criar um Discount sem o Cart.
        // E como eu não tinha criado um Cart anteriormente, iniciamos assim
        Discount discount = new Cart().new Discount("firstClientDiscount", 0);

        // === Abstract class demo
//		ProductAbstract product = new ProductAbstract(); // Não se instancia uma classe abstrata
        MasterProduct masterProduct = new MasterProduct();
        VariantProduct variantProduct = new VariantProduct();

        // Podemos usar os setters e getters da própria classe abstrata, pois ela extende da classe ProductAbstract
        masterProduct.setName("Mercedes S-klass");
        variantProduct.setDeliveryAvailable(true);

        // === Anonymous class demo
        // Classes abstratas não podem ser instanciadas, porém podemos instanciar classes anômimas extendendo as abstratas.
        // Aqui eu instancio a classe abstrata e crio direto o override da função.
        ProductAbstract product = new ProductAbstract() {
            @Override
            public boolean isAvailableInStock() {
                return false;
            }
        };

    }
}