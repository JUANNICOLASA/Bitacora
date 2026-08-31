package main.dosw.semana_2.pokemon;
import java.util.List;
public class Ejercicio5 {
    public static long contarLegendarios(List<Pokemon> pokemons) {
        return pokemons.stream().filter(p -> p.getNivel() > 80).count();
    }
    public static void main(String[] args) {
        System.out.println("Con nivel > 80: " + contarLegendarios(MockData.getPokemons()));
    }
}