package main.dosw.semana_4.patrones.ejercicio9;

public class BiometricStrategy implements AuthStrategy {

    @Override
    public AuthResult authenticate() {

        System.out.println(
                "[Strategy] Autenticando mediante biometría..."
        );

        return new AuthResult(
                true,
                "Autenticación biométrica exitosa."
        );
    }
}