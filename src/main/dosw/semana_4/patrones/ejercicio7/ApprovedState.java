package main.dosw.semana_4.patrones.ejercicio7;

public class ApprovedState implements DocumentState {

    @Override
    public void approve(Document document) {

        System.out.println(
                "[State] El documento ya está aprobado."
        );
    }

    @Override
    public void reject(Document document) {

        System.out.println(
                "[State] Un documento aprobado no puede rechazarse."
        );
    }
}