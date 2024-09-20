package Sections.Section13.Polymorphism;

import java.io.File;

public class Demo {
	
	public static void main(String[] args) {
		User contentManager = new ContentManager();
		User admin = new AdminUser();

		// Ele identifica qual função deve ser chamada. Chamamos isso de Dynamic Binding
		contentManager.validateAccessRights();
		admin.validateAccessRights();
	}

}