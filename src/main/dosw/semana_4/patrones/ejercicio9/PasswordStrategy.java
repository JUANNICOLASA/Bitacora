package main.dosw.semana_4.patrones.ejercicio9;

public class PasswordStrategy implements AuthStrategy {

    @Override
    public AuthResult authenticate() {

        System.out.println(
                "[Strategy] Autenticando mediante usuario y contraseña..."
        );

        return new AuthResult(
                true,
                "Autenticación exitosa vía contraseña."
        );
    }
}