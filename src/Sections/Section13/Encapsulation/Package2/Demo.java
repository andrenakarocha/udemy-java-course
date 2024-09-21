package Sections.Section13.Encapsulation.Package2;

public class Demo {
	
	public static void main(String[] args) {
		ClassB classB = new ClassB();
        // Aqui, ao chamar a função só com void no mesmo pacote, ela funciona normalmente
		classB.doSomethingClassB(); 		// package private demo

        // Não consigo acessar a função com o private, pois ela só é acessível dentro do próprio escopo da classe.
//		classB.doSomethingClassBPrivate();	// private modifier demo
	}

}