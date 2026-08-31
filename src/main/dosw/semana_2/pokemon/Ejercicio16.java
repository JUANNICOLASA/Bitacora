package main.dosw.semana_2.pokemon;
import java.util.List;
public class Ejercicio16 {
    public static List<Entrenador> obtenerExperimentados(List<Entrenador> entrenadores) {
        return entrenadores.stream().filter(e -> e.getMedallas() > 5).toList();
    }
    public static void main(String[] args) {
        System.out.println("Experimentados: " + obtenerExperimentados(MockData.getEntrenadores()).stream().map(Entrenador::getNombre).toList());
    }
}