package main.dosw.semana_2.pokemon;
import java.util.List;
public class Ejercicio8 {
    public static List<Pokemon> obtenerListosEvolucionar(List<Pokemon> pokemons) {
        return pokemons.stream().filter(Pokemon::isPuedeEvolucionar).distinct().toList();
    }
    public static void main(String[] args) {
        System.out.println(obtenerListosEvolucionar(MockData.getPokemons()).stream().map(Pokemon::getNombre).toList());
    }
}