package main.dosw.semana_4.patrones.ejercicio6;

public class PopularityStrategy implements RecommendationAlgorithm {

    @Override
    public void recommend(String user) {
        System.out.println(
                "Recomendando contenido popular para: " + user
        );
    }
}