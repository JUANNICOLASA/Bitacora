package main.dosw.semana_4.patrones.ejercicio6;

public class HistoryStrategy implements RecommendationAlgorithm {

    @Override
    public void recommend(String user) {
        System.out.println(
                "Recomendando contenido según el historial de: " + user
        );
    }
}