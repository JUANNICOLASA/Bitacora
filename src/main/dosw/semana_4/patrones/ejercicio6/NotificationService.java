package main.dosw.semana_4.patrones.ejercicio6;

public class NotificationService implements PreferenceObserver {

    @Override
    public void onPreferenceChanged(
            RecommendationAlgorithm algorithm
    ) {

        System.out.println(
                "[Notifications] Actualizando notificaciones."
        );

        algorithm.recommend("Usuario");
    }
}