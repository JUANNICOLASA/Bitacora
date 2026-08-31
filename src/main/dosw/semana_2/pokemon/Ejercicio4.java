package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;
public class Ejercicio4 {
    public static Pokemon obtenerPokemonAlfa(List<Pokemon> pokemons) {
        return pokemons.stream().max(Comparator.comparingInt(Pokemon::getNivel)).orElse(null);
    }
    public static void main(String[] args) {
        Pokemon alfa = obtenerPokemonAlfa(MockData.getPokemons());
        System.out.println("Alfa: " + (alfa != null ? alfa.getNombre() : "Ninguno"));
    }
}