package main.dosw.semana_2.pokemon;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Ejercicio13 {
    public static Map<String, List<Pokemon>> agruparPorTipo(List<Pokemon> pokemons) {
        return pokemons.stream().distinct().collect(Collectors.groupingBy(Pokemon::getTipo)); // *Reto Legendario
    }
    public static void main(String[] args) {
        agruparPorTipo(MockData.getPokemons()).forEach((t, l) -> System.out.println(t + ": " + l.stream().map(Pokemon::getNombre).toList()));
    }
}