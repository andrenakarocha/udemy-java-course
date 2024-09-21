package Sections.Section13.Encapsulation.Package1;

import Sections.Section13.Encapsulation.Package2.ClassB;

public class Demo {
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		// Neste caso, consigo chamar a função protected, pois estou dentro do mesmo pacote da Classe
		classA.doSomething2();	// protected modifier demo
		
		ClassB classB = new ClassB();
		// Aqui, estou chamando a função apenas void da ClassB, e não consigo chamar ela
		// Só é possível chamá-la dentro do mesmo pacote
//		classB.doSomethingClassB(); // package private demo
	}

}
