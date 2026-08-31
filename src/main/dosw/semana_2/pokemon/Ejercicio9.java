package main.dosw.semana_2.pokemon;
import java.util.List;
public class Ejercicio9 {
    public static List<Pokemon> obtenerEquipoElite(List<Pokemon> pokemons) {
        return pokemons.stream().filter(p -> p.getPoderCombate() > 500).distinct().toList();
    }
    public static void main(String[] args) {
        System.out.println(obtenerEquipoElite(MockData.getPokemons()).stream().map(Pokemon::getNombre).toList());
    }
}