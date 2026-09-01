package main.dosw.semana_4.patrones.ejercicio7;

public class Document {

    private final String title;

    private DocumentState state;

    public Document(String title) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException(
                    "El título del documento no puede estar vacío."
            );
        }

        this.title = title;
        this.state = new DraftState();
    }

    public String getTitle() {
        return title;
    }

    public DocumentState getState() {
        return state;
    }

    public void setState(DocumentState state) {

        if (state == null) {
            throw new IllegalArgumentException(
                    "El estado no puede ser null."
            );
        }

        this.state = state;
    }

    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }

    public String getStateName() {
        return state.getClass().getSimpleName();
    }
}