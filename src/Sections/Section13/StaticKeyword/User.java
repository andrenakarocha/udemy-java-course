package Sections.Section13.StaticKeyword;

public class User {

    // Quando eu declaro uma variável static, essa variável passa a ser de TODA a classe User.
	private static int counter;
	
	private int id;
	private String name;
	
	{
        // Toda vez que eu criar uma instância da classe User, ele vai incrementar no counter
        // Porém, como o counter é uma variável static, ele vai incrementando em TODA a classe. Virando como se fosse um counter de quantos users existem.
		++counter;
	}

	public static void doAnyStaticAction() {
		System.out.println("Static method in User class is called.");
	}
	
	public int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		User.counter = counter;
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
}