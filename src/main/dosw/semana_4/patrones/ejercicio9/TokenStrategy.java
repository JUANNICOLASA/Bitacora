package main.dosw.semana_4.patrones.ejercicio9;

public class TokenStrategy implements AuthStrategy {

    @Override
    public AuthResult authenticate() {

        System.out.println(
                "[Strategy] Autenticando mediante token empresarial..."
        );

        return new AuthResult(
                true,
                "Autenticación exitosa vía token empresarial."
        );
    }
}