package Sections.Section13.Encapsulation.Package2;

import Sections.Section13.Encapsulation.Package1.ClassA;

public class ClassB extends ClassA {

    // Aqui, como não passei nenhuma keyword para acesso, ele leva como um "default access" e se torna protected
	void doSomethingClassB() {
        // Aqui, eu também consigo acessar a função protected, pois a função vem da classe pai, e a classe filha a herda
		doSomething2();				// protected modifier demo

        // Essa função só é acessível dentro do próprio escopo desta classe, por isso aqui funciona
		doSomethingClassBPrivate(); // private modifier demo
	}

	private void doSomethingClassBPrivate() {
		
	}

}
