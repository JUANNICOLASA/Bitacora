package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;
public class Ejercicio19 {
    public static List<Entrenador> obtenerTop3(List<Entrenador> entrenadores) {
        return entrenadores.stream()
                .sorted(Comparator.comparingInt(Entrenador::getMedallas).reversed()
                        .thenComparingDouble(e -> e.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum()).reversed()
                        .thenComparing(Entrenador::getNombre))
                .limit(3).toList();
    }
    public static void main(String[] args) {
        System.out.println("Top 3 Entrenadores: " + obtenerTop3(MockData.getEntrenadores()).stream().map(Entrenador::getNombre).toList());
    }
}