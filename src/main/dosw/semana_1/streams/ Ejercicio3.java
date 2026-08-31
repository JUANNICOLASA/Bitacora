package main.dosw.semana_1.streams;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static List<String> obtenerNombresActivos(List<User> users) {
        return users.stream()
                .filter(User::isActive)
                .map(u -> u.getName().toUpperCase())
                .sorted()
                .toList();
    }
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User(1L, "Alice", 25, true), new User(2L, "Bob", 17, false));
        System.out.println("Nombres: " + obtenerNombresActivos(users));
    }
}