package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;
public class Ejercicio15 {
    public static Entrenador obtenerMaestro(List<Entrenador> entrenadores) {
        return entrenadores.stream().max(Comparator.comparingInt(Entrenador::getMedallas)).orElse(null);
    }
    public static void main(String[] args) {
        Entrenador m = obtenerMaestro(MockData.getEntrenadores());
        System.out.println("Maestro: " + (m != null ? m.getNombre() : "N/A"));
    }
}