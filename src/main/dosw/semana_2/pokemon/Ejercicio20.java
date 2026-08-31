package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Ejercicio20 {
    public static void generarPokedexAnalitica(List<Pokemon> pokemons) {
        Map<String, Long> tipo = pokemons.stream().distinct().collect(Collectors.groupingBy(Pokemon::getTipo, Collectors.counting()));
        Map<String, Long> region = pokemons.stream().distinct().collect(Collectors.groupingBy(Pokemon::getRegion, Collectors.counting()));
        long legendarios = pokemons.stream().distinct().filter(Pokemon::isLegendario).count();
        double promNivel = pokemons.stream().distinct().mapToDouble(Pokemon::getNivel).average().orElse(0.0);
        Pokemon fuerte = pokemons.stream().distinct().max(Comparator.comparingDouble(Pokemon::getPoderCombate)).orElse(null);

        System.out.println("Tipos: " + tipo + "\nRegiones: " + region + "\nLegendarios: " + legendarios + "\nProm Nivel: " + promNivel + "\nMás fuerte: " + (fuerte!=null ? fuerte.getNombre() : "N/A"));
    }
    public static void main(String[] args) {
        generarPokedexAnalitica(MockData.getPokemons());
    }
}