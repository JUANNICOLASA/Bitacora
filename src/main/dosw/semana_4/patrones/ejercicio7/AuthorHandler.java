package main.dosw.semana_4.patrones.ejercicio7;

public class AuthorHandler extends DocumentHandler {

    private final boolean approved;

    public AuthorHandler() {
        this(true);
    }

    public AuthorHandler(boolean approved) {
        this.approved = approved;
    }

    @Override
    public void handle(Document document) {

        System.out.println(
                "-> Autor revisando el documento..."
        );

        if (!approved) {

            System.out.println(
                    "   Autor: documento rechazado."
            );

            document.reject();
            return;
        }

        System.out.println(
                "   Autor: revisión aprobada."
        );

        document.approve();

        if (next != null) {
            next.handle(document);
        }
    }
}