package main.dosw.semana_4.patrones.ejercicio9;

public class GoogleStrategy implements AuthStrategy {

    @Override
    public AuthResult authenticate() {

        System.out.println(
                "[Strategy] Autenticando mediante Google..."
        );

        return new AuthResult(
                true,
                "Autenticación exitosa vía Google."
        );
    }
}