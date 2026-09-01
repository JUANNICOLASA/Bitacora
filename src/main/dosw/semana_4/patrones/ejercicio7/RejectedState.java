package main.dosw.semana_4.patrones.ejercicio7;

public class RejectedState implements DocumentState {

    @Override
    public void approve(Document document) {

        System.out.println(
                "[State] Un documento rechazado debe volver a revisión."
        );

        document.setState(new InReviewState());
    }

    @Override
    public void reject(Document document) {

        System.out.println(
                "[State] El documento ya está rechazado."
        );
    }
}