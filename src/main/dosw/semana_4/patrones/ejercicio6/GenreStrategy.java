package main.dosw.semana_4.patrones.ejercicio6;

public class GenreStrategy implements RecommendationAlgorithm {

    @Override
    public void recommend(String user) {
        System.out.println(
                "Recomendando contenido por género favorito para: " + user
        );
    }
}