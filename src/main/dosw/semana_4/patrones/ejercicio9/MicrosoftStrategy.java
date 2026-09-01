package main.dosw.semana_4.patrones.ejercicio9;

public class MicrosoftStrategy implements AuthStrategy {

    @Override
    public AuthResult authenticate() {

        System.out.println(
                "[Strategy] Autenticando mediante Microsoft..."
        );

        return new AuthResult(
                true,
                "Autenticación exitosa vía Microsoft."
        );
    }
}