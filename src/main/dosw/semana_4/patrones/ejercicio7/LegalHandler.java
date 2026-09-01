package main.dosw.semana_4.patrones.ejercicio7;

public class LegalHandler extends DocumentHandler {

    private final boolean approved;

    public LegalHandler() {
        this(true);
    }

    public LegalHandler(boolean approved) {
        this.approved = approved;
    }

    @Override
    public void handle(Document document) {

        System.out.println(
                "-> Jurídico revisando el documento..."
        );

        if (!approved) {

            System.out.println(
                    "   Jurídico: documento rechazado."
            );

            document.reject();
            return;
        }

        System.out.println(
                "   Jurídico: revisión legal aprobada."
        );

        if (next != null) {
            next.handle(document);
        }
    }
}