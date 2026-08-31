package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;
public class Ejercicio18 {
    public static List<Pokemon> obtenerTop5(List<Pokemon> pokemons) {
        return pokemons.stream().distinct().sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed()).limit(5).toList();
    }
    public static void main(String[] args) {
        System.out.println("Top 5: " + obtenerTop5(MockData.getPokemons()).stream().map(Pokemon::getNombre).toList());
    }
}