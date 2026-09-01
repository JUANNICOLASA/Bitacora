package main.dosw.semana_4.patrones.ejercicio7;

public class FinancialHandler extends DocumentHandler {

    private final boolean approved;

    public FinancialHandler() {
        this(true);
    }

    public FinancialHandler(boolean approved) {
        this.approved = approved;
    }

    @Override
    public void handle(Document document) {

        System.out.println(
                "-> Financiero revisando el documento..."
        );

        if (!approved) {

            System.out.println(
                    "   Financiero: documento rechazado."
            );

            document.reject();
            return;
        }

        System.out.println(
                "   Financiero: revisión financiera aprobada."
        );

        if (next != null) {
            next.handle(document);
        }
    }
}