package main.dosw.semana_4.patrones.ejercicio7;

public class InReviewState implements DocumentState {

    @Override
    public void approve(Document document) {

        System.out.println(
                "[State] La revisión fue aprobada. "
                        + "El documento continúa su flujo."
        );
    }

    @Override
    public void reject(Document document) {

        System.out.println(
                "[State] El documento fue rechazado durante la revisión."
        );

        document.setState(new RejectedState());
    }
}