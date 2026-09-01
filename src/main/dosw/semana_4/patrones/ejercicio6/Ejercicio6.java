package main.dosw.semana_4.patrones.ejercicio6;

public class Ejercicio6 {

    public static void main(String[] args) {

        System.out.println(" EJERCICIO 6 - STRATEGY + OBSERVER");

        UserProfile profile = new UserProfile();

        profile.addObserver(new HomePageComponent());
        profile.addObserver(new NotificationService());
        profile.addObserver(new SuggestedListComponent());

        System.out.println("\n>>> ESTRATEGIA: GÉNERO");

        profile.cambiarPreferencias(
                new GenreStrategy()
        );

        System.out.println("\n>>> ESTRATEGIA: HISTORIAL");

        profile.cambiarPreferencias(
                new HistoryStrategy()
        );

        System.out.println("\n>>> ESTRATEGIA: POPULARIDAD");

        profile.cambiarPreferencias(
                new PopularityStrategy()
        );

        System.out.println("\n>>> ESTRATEGIA: SIMILITUD");

        profile.cambiarPreferencias(
                new SimilarityStrategy()
        );
    }
}