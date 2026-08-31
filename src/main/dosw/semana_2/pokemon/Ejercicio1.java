package main.dosw.semana_2.pokemon;
import java.util.List;
public class Ejercicio1 {
    public static List<Pokemon> obtenerTipoFuego(List<Pokemon> pokemons) {
        return pokemons.stream().filter(p -> p.getTipo().equalsIgnoreCase("Fuego")).toList();
    }
    public static void main(String[] args) {
        System.out.println(obtenerTipoFuego(MockData.getPokemons()).stream().map(Pokemon::getNombre).toList());
    }
}