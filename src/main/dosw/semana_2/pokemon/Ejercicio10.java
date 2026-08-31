package main.dosw.semana_2.pokemon;
import java.util.List;
import java.util.stream.Collectors;
public class Ejercicio10 {
    public static List<String> obtenerPokedexCompacta(List<Pokemon> pokemons) {
        return pokemons.stream().map(Pokemon::getNombre).distinct().collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("Compacta: " + obtenerPokedexCompacta(MockData.getPokemons()));
    }
}