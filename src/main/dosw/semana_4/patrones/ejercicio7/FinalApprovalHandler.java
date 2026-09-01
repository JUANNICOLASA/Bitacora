package main.dosw.semana_4.patrones.ejercicio7;

public class FinalApprovalHandler extends DocumentHandler {

    private final boolean approved;

    public FinalApprovalHandler() {
        this(true);
    }

    public FinalApprovalHandler(boolean approved) {
        this.approved = approved;
    }

    @Override
    public void handle(Document document) {

        System.out.println(
                "-> Comité final revisando el documento..."
        );

        if (!approved) {

            System.out.println(
                    "   Comité final: documento rechazado."
            );

            document.reject();
            return;
        }

        System.out.println(
                "   Comité final: documento aprobado."
        );

        document.approve();
    }
}