package Sections.Section13.Inheritance;

public class Demo {
	
	public static void main(String[] args) {
        // Aqui estou inicializando o objeto Phone usando a classe produto
		Product product = new Phone();
		product.setName("Nokia 1100");
		System.out.println("Product name: " + product.getName());
		System.out.println("Remaining amount in stock: " + product.calculateRemainingAmount());

        // Porém, ao tentar usar a função do phone, o java não permite que eu use
//		product.ring();

        // Agora inicilizando normal, ele funciona
		Phone phone2 = new Phone();
		phone2.ring();


        // Mas e se caso eu queira inicializar com o type Product? Eu posso usar o operador instanceof para mudar o tipo do product para Phone e assim conseguir usar o método
		if (product instanceof Phone) {
			Phone phone3 = (Phone) product;
			phone3.ring();
		}
	
		System.out.println(phone2.calculateAmountOfVariants());
	}

}
