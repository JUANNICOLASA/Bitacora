package main.dosw.semana_4.patrones.ejercicio7;

public abstract class DocumentHandler {

    protected DocumentHandler next;

    public DocumentHandler setNext(DocumentHandler next) {
        this.next = next;
        return next;
    }

    public abstract void handle(Document document);
}