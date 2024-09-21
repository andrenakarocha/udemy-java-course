package Sections.Section13.StaticKeyword;
import static java.util.Arrays.*;

import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		User user1 = new User();
		System.out.println("user1.getId() = " + user1.getId());
		System.out.println("user1.getCounter() = " + user1.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		User user2 = new User();
		System.out.println("user2.getId() = " + user2.getId());
		System.out.println("user2.getCounter() = " + user2.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		System.out.println("user1.getCounter() = " + user1.getCounter());
		
		System.out.println();
		System.out.println("================================");
		System.out.println();

        // Neste caso, ele printará a função do User no console. Por que?
        // Por que como é uma função static, esse método pertence a classe, não ao objeto
        // E estamos inicializando um objeto user, chamando assim a função do user.
        // Basicamente, não podemos dar Override em uma função static
		User user3 = new Employee();
		user3.doAnyStaticAction();

        // Agora, quando chamamos diretamente do objeto, agora, sim, ele printará o correto no console
		User.doAnyStaticAction();
		Employee.doAnyStaticAction();
		
		System.out.println();
		System.out.println("================================");
		System.out.println();

        // Aqui temos uma demonstração de um static import.
        // Lá encima, importamos todas as funções statics do objeto Arrays.
        // Assim, não preciso usar o Arrays.sort(arr), uso simplesmente o sort(arr)
		int[] arr = {1, 2, 3};
		Arrays.sort(arr);
		sort(arr);
	}

}