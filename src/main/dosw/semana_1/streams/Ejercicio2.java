package main.dosw.semana_1.streams;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static long contarPalabras(List<String> palabras) {
        return palabras.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .count();
    }
    public static void main(String[] args) {
        List<String> entrada = Arrays.asList("java", "stream", "api", "functional", "code", "git");
        System.out.println("Cantidad: " + contarPalabras(entrada));
    }
}