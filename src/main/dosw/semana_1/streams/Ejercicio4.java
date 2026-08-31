package main.dosw.semana_1.streams;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    public static List<String> obtenerMayoresDeEdad(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .toList();
    }
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User(1L, "Alice", 25, true), new User(2L, "Bob", 17, false));
        System.out.println("Mayores: " + obtenerMayoresDeEdad(users));
    }
}