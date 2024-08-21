package Homeworks.Methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
            "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
            "james;Derek James;james@gmail.com" + System.lineSeparator() +
            "jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
            "gregory;Mike Gregory;gregory@yahoo.com";

    public static void main(String[] args) {
        System.out.println("===== Convert 1 demo =====");
        System.out.println(convert1(INPUT_DATA));

        System.out.println("===== Convert 2 demo =====");
        System.out.println(convert2(INPUT_DATA));
    }

    // Método para formatar "login ==> email" usando Regex
    public static String convert1(String input) {
        StringBuilder result = new StringBuilder();
        // Ignorar a primeira linha que é o cabeçalho
        String[] lines = input.split(System.lineSeparator());

        // Regex para capturar login e email
        Pattern pattern = Pattern.compile("([^;]+);[^;]+;([^;]+)");

        // Itera sobre as linhas de dados
        for (int i = 1; i < lines.length; i++) {
            Matcher matcher = pattern.matcher(lines[i]);
            if (matcher.find()) {
                String login = matcher.group(1);
                String email = matcher.group(2);
                result.append(login).append(" ==> ").append(email).append(System.lineSeparator());
            }
        }

        return result.toString().trim();
    }

    // Método para formatar "Name (email: email)" usando Regex
    public static String convert2(String input) {
        StringBuilder result = new StringBuilder();
        // Ignorar a primeira linha que é o cabeçalho
        String[] lines = input.split(System.lineSeparator());

        // Regex para capturar nome e email
        Pattern pattern = Pattern.compile("[^;]+;([^;]+);([^;]+)");

        // Itera sobre as linhas de dados
        for (int i = 1; i < lines.length; i++) {
            Matcher matcher = pattern.matcher(lines[i]);
            if (matcher.find()) {
                String name = matcher.group(1);
                String email = matcher.group(2);
                result.append(name).append(" (email: ").append(email).append(")").append(System.lineSeparator());
            }
        }

        return result.toString().trim();
    }
}
