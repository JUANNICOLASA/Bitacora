package main.dosw.semana_4.patrones.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class UserProfile {

    private final List<PreferenceObserver> observers =
            new ArrayList<>();

    private RecommendationAlgorithm currentAlgorithm;

    public void addObserver(PreferenceObserver observer) {

        if (observer == null) {
            throw new IllegalArgumentException(
                    "El observer no puede ser null."
            );
        }

        observers.add(observer);
    }

    public void removeObserver(PreferenceObserver observer) {
        observers.remove(observer);
    }

    public void cambiarPreferencias(
            RecommendationAlgorithm algorithm
    ) {

        if (algorithm == null) {
            throw new IllegalArgumentException(
                    "El algoritmo no puede ser null."
            );
        }

        this.currentAlgorithm = algorithm;

        System.out.println(
                "\nEl usuario cambió su estrategia de recomendación."
        );

        notifyObservers();
    }

    private void notifyObservers() {

        for (PreferenceObserver observer : observers) {
            observer.onPreferenceChanged(currentAlgorithm);
        }
    }

    public RecommendationAlgorithm getCurrentAlgorithm() {
        return currentAlgorithm;
    }
}