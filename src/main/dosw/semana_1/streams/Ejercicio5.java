package main.dosw.semana_1.streams;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static boolean procesarTransacciones(List<Transaction> transactions) {
        return !transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t.getId()))
                .anyMatch(t -> !t.isApproved());
    }
    public static void main(String[] args) {
        List<Transaction> tx = Arrays.asList(new Transaction("T1", 100.0, true));
        System.out.println("¿Válido?: " + procesarTransacciones(tx));
    }
}