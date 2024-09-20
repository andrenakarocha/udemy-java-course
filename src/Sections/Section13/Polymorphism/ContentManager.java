package Sections.Section13.Polymorphism;

public class ContentManager extends User {

    // Usa o Override para mudar a função do método da classe abstrata
	// Existem 2 tipos, Override e Overload. O Override é o exemplo abaixo, quando uso os mesmos parâmetros da função pai
	// Overload é quando uso parâmetros diferentes do que a função na classe pai, porém, não passo nenhum @ nesse caso.
	@Override
	public void validateAccessRights() {
		System.out.println("I'm a content manager. I have no enough rights to withdraw money.");
	}

}