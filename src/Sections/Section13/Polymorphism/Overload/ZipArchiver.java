package Sections.Section13.Polymorphism.Overload;

import java.io.File;

public class ZipArchiver implements Archiver {

    // Existem 2 tipos, Override e Overload. O Override é o exemplo abaixo, quando uso os mesmos parâmetros da função pai
	@Override
	public void archiveFiles(File... files) {
		System.out.println("Method of Zip Archiver is called");
	}

    // Overload é quando uso parâmetros diferentes do que a função na classe pai, porém, não passo nenhum @ nesse caso.
	public void archiveFiles(int maxArchiveSize, File... files) {
		// stub method for the demo purposes
	}

}