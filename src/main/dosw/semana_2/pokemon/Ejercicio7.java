package main.dosw.semana_2.pokemon;
import java.util.List;
public class Ejercicio7 {
    public static List<String> organizarPokedex(List<Pokemon> pokemons) {
        return pokemons.stream().map(Pokemon::getNombre).distinct().sorted().toList();
    }
    public static void main(String[] args) {
        System.out.println("Orden alfabético: " + organizarPokedex(MockData.getPokemons()));
    }
}