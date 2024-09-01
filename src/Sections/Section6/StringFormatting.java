package Sections.Section6;

public class StringFormatting {
    public static void main(String[] args) {
        // Para formatar uma string, primeiro eu escrevo ela com as partes que desejo formatar:
        String bemVindoTemplate = "Olá, %s! Boa %s";
        // Depois crio as minhas opções de strings:
        String manha = "manhã";
        String tarde = "tarde";
        String noite = "noite";
        String nome = "André";

        // E formato ela:
        String stringFormatada = String.format(bemVindoTemplate, nome, tarde);
        System.out.println(stringFormatada);

        // Caso eu use o prinf, posso passar %d onde eu posso colocar qualquer digito que eu desejar
        System.out.printf("Você tem %d computadores disponíveis na loja!", 10);

        // Tem muitas outras formatações:
        // https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
    }
}
