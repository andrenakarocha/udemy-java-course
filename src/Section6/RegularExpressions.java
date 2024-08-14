package Section6;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        // Regular Expressions não são nada menos que padrões para variáveis:
        String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";

        // Após a declaração do padrão usamos o objeto Pattern para compilar o nosso padrão:
        Pattern p = Pattern.compile(gmailPattern);
        String text = "Um texto com um email nele: andrenakarocha@gmail.com";

        // E usamos o matcher para encontrar o padrão num texto aleatório:
        Matcher m = p.matcher(text);

        m.find();
        String gmailAdress = m.group();
        System.out.println(gmailAdress);

        // Outro exemplo, precisamos separar as frases deste texto:
        String text2 = "Tem 3 frases nessa string. Tem certeza? Sim, tenho certeza!";

        // Splitamos as frases que tenham ".!?" no final (final de uma frase) e colocamos em uma array
        String[] frases = text2.split("[.?!]");
        System.out.println(Arrays.toString(frases));

        // Aprender expressões regulares aqui:
        // https://regexone.com/
    }
}
