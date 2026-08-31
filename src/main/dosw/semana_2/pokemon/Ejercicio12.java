package main.dosw.semana_2.pokemon;
import java.util.Comparator;
import java.util.List;
public class Ejercicio12 {
    public static Pokemon obtenerCampeonRegional(List<Pokemon> pokemons) {
        return pokemons.stream().max(Comparator.comparingDouble(Pokemon::getPoderCombate)).orElse(null);
    }
    public static void main(String[] args) {
        Pokemon c = obtenerCampeonRegional(MockData.getPokemons());
        System.out.println("Campeón: " + (c != null ? c.getNombre() : "Ninguno"));
    }
}