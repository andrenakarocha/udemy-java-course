package Sections.Section13.Encapsulation;

// Importamos a Classe da package
import Sections.Section13.Encapsulation.Package1.ClassA;

public class Demo {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
        // Chamamos uma função public, funciona normalmente
		classA.doSomething(); // public modifier demo

        // Porém, ao tentar chamar a função protected, não conseguimos acessá-la, pois só é possível acessá-la dentro do próprio pacote da classe.
//		classA.doSomething2(); // protected modifier demo
		
	}
	
}