package main.dosw.semana_4.patrones.ejercicio6;

public class SuggestedListComponent implements PreferenceObserver {

    @Override
    public void onPreferenceChanged(
            RecommendationAlgorithm algorithm
    ) {

        System.out.println(
                "[SuggestedList] Actualizando lista de sugeridos."
        );

        algorithm.recommend("Usuario");
    }
}