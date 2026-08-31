package main.dosw.semana_2.pokemon;
import java.util.List;
public class Ejercicio6 {
    public static List<Pokemon> eliminarDuplicados(List<Pokemon> pokemons) {
        return pokemons.stream().distinct().toList();
    }
    public static void main(String[] args) {
        System.out.println(eliminarDuplicados(MockData.getPokemons()).stream().map(Pokemon::getNombre).toList());
    }
}