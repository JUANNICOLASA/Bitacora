package main.dosw.semana_2.pokemon;
import java.util.List;
public class Ejercicio2 {
    public static List<String> obtenerPokedexGritona(List<Pokemon> pokemons) {
        return pokemons.stream().map(p -> p.getNombre().toUpperCase()).toList();
    }
    public static void main(String[] args) {
        System.out.println(obtenerPokedexGritona(MockData.getPokemons()));
    }
}