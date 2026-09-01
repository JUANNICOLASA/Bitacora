package main.dosw.semana_4.patrones.ejercicio9;

public class AuthResult {

    private final boolean successful;
    private final String message;

    public AuthResult(boolean successful, String message) {
        this.successful = successful;
        this.message = message;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getMessage() {
        return message;
    }
}