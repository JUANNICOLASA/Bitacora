package main.dosw.semana_2.pokemon;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Ejercicio14 {
    public static Map<String, List<Pokemon>> agruparPorRegion(List<Pokemon> pokemons) {
        return pokemons.stream().distinct().collect(Collectors.groupingBy(Pokemon::getRegion));
    }
    public static void main(String[] args) {
        agruparPorRegion(MockData.getPokemons()).forEach((r, l) -> System.out.println(r + ": " + l.stream().map(Pokemon::getNombre).toList()));
    }
}