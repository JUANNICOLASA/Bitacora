package main.dosw.semana_4.patrones.ejercicio7;

public class LeaderHandler extends DocumentHandler {

    private final boolean approved;

    public LeaderHandler() {
        this(true);
    }

    public LeaderHandler(boolean approved) {
        this.approved = approved;
    }

    @Override
    public void handle(Document document) {

        System.out.println(
                "-> Líder técnico evaluando el documento..."
        );

        if (!approved) {

            System.out.println(
                    "   Líder: documento rechazado."
            );

            document.reject();
            return;
        }

        System.out.println(
                "   Líder: revisión técnica aprobada."
        );

        if (next != null) {
            next.handle(document);
        }
    }
}