package main.dosw.semana_1.streams;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static List<Integer> obtenerParesMayoresADiez(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n > 10 && n % 2 == 0)
                .toList();
    }
    public static void main(String[] args) {
        List<Integer> entrada = Arrays.asList(3, 8, 10, 12, 15, 18, 20);
        System.out.println("Salida: " + obtenerParesMayoresADiez(entrada));
    }
}