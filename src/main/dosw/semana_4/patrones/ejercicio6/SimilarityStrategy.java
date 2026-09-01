package main.dosw.semana_4.patrones.ejercicio6;

public class SimilarityStrategy implements RecommendationAlgorithm {

    @Override
    public void recommend(String user) {

        System.out.println(
                "Recomendando contenido similar a los gustos de: " + user
        );
    }
}