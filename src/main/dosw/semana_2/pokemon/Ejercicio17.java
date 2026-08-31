package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;
public class Ejercicio17 {
    public static Entrenador obtenerMasPoderoso(List<Entrenador> entrenadores) {
        return entrenadores.stream().max(Comparator.comparingDouble(e -> e.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum())).orElse(null);
    }
    public static void main(String[] args) {
        Entrenador p = obtenerMasPoderoso(MockData.getEntrenadores());
        System.out.println("Más poderoso: " + (p != null ? p.getNombre() : "N/A"));
    }
}