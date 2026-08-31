package main.dosw.semana_2.pokemon;
import java.util.List;
public class Ejercicio11 {
    public static double calcularPoderPromedio(List<Pokemon> pokemons) {
        return pokemons.stream().distinct().mapToDouble(Pokemon::getPoderCombate).average().orElse(0.0); // *Reto Legendario
    }
    public static void main(String[] args) {
        System.out.println("Promedio: " + calcularPoderPromedio(MockData.getPokemons()));
    }
}