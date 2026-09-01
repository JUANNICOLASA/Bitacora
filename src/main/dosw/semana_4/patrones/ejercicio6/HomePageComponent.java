package main.dosw.semana_4.patrones.ejercicio6;

public class HomePageComponent implements PreferenceObserver {

    @Override
    public void onPreferenceChanged(
            RecommendationAlgorithm algorithm
    ) {

        System.out.println(
                "[HomePage] Preferencias actualizadas."
        );

        algorithm.recommend("Usuario");
    }
}