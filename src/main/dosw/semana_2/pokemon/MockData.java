package main.dosw.semana_2.pokemon;

import java.util.Arrays;
import java.util.List;

public class MockData {

    public static List<Pokemon> getPokemons() {
        return Arrays.asList(
                new Pokemon(1L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false, true),
                new Pokemon(2L, "Charmander", "Fuego", 62, 300, "Kanto", false, true),
                new Pokemon(3L, "Squirtle", "Agua", 38, 210, "Kanto", false, true),
                new Pokemon(4L, "Snorlax", "Normal", 90, 600, "Kanto", false, false),
                new Pokemon(5L, "Mewtwo", "Psíquico", 88, 680, "Kanto", true, false),
                new Pokemon(6L, "Dragonite", "Dragón", 82, 530, "Kanto", false, false),
                new Pokemon(7L, "Charizard", "Fuego", 70, 610, "Kanto", false, false),
                new Pokemon(8L, "Vulpix", "Fuego", 25, 150, "Kanto", false, true),
                new Pokemon(9L, "Pikachu", "Eléctrico", 45, 320, "Kanto", false, true)
        );
    }

    public static List<Entrenador> getEntrenadores() {
        return Arrays.asList(
                new Entrenador(1L, "Ash", 8, Arrays.asList(getPokemons().get(0), getPokemons().get(1))),
                new Entrenador(2L, "Gary", 10, Arrays.asList(getPokemons().get(4), getPokemons().get(6))),
                new Entrenador(3L, "Misty", 5, Arrays.asList(getPokemons().get(2))),
                new Entrenador(4L, "Brock", 6, Arrays.asList(getPokemons().get(3)))
        );
    }
}