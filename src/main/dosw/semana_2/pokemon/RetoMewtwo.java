package main.dosw.semana_2.pokemon;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
public class RetoMewtwo {
    public static Map<String, Optional<Pokemon>> obtenerCampeonesPorTipo(List<Entrenador> entrenadores) {
        return entrenadores.stream()
                .filter(e -> e.getMedallas() > 3)
                .flatMap(e -> e.getEquipo().stream())
                .filter(p -> !p.isLegendario() && p.getNivel() > 30)
                .collect(Collectors.groupingBy(
                        Pokemon::getTipo,
                        Collectors.reducing((p1, p2) -> p1.getPoderCombate() > p2.getPoderCombate() ? p1 : p2)
                ));
    }
    public static void main(String[] args) {
        obtenerCampeonesPorTipo(MockData.getEntrenadores()).entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue().get().getNombre()));
    }
}