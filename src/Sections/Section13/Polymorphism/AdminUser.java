package Sections.Section13.Polymorphism;

public class AdminUser extends User {

	// Final é usado de diferentes formas.
	// Caso eu coloque final no nome de uma classe, eu proíbo ela de ser estendida por outra classe
	// Caso eu coloque em uma variável, essa variável se torna imutável
	// Caso eu coloque final em uma função, o Override não é mais possível de ser usado para mudar a função em outra classe
	private final String userGroup = "admin";

    // Usa o Override para mudar a função do método da classe abstrata
	@Override
	public void validateAccessRights() {
		System.out.println("I'm an admin user. I can do whatever I want in the system.");
	}

}