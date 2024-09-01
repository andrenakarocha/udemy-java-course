package Sections.Section6;

public class EscapeSequences {
    public static void main(String[] args) {
        /*
		 	\t - tab.
			\b - backspace (a step backward in the text or deletion of a single character).
			\n - new line.
			\r - carriage return. ()
			\f - form feed.
			\' single quote.
			\" double quote.
			\\ backslash.
		 */

        System.out.println("Meu filme favorito é \"Interstellar\" de Christopher Nolan"); // Nome do filme entre aspas
        System.out.println("Caminho: D:\\Java\\sources"); // Usar o backslash sem criar uma escape sequence
        System.out.println("Uma linha de texto \nOutra linha de texto"); // Quebrar linha
        System.out.println("Unicode caractér: \u00A9 Andrenakarocha.com"); // Usar símbolos do Unicode
    }
}
