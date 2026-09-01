package main.dosw.semana_4.patrones.ejercicio7;

public class DraftState implements DocumentState {

    @Override
    public void approve(Document document) {

        System.out.println(
                "[State] Borrador aprobado para iniciar revisión."
        );

        document.setState(new InReviewState());
    }

    @Override
    public void reject(Document document) {

        System.out.println(
                "[State] El documento fue rechazado estando en borrador."
        );

        document.setState(new RejectedState());
    }
}