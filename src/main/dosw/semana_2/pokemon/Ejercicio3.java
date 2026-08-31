package main.dosw.semana_2.pokemon;
import java.util.List;
public class Ejercicio3 {
    public static int calcularPoderTotal(List<Pokemon> pokemons) {
        return pokemons.stream().mapToInt(Pokemon::getNivel).sum();
    }
    public static void main(String[] args) {
        System.out.println("Suma total: " + calcularPoderTotal(MockData.getPokemons()));
    }
}