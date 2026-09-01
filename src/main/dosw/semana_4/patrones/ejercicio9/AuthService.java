package main.dosw.semana_4.patrones.ejercicio9;

public class AuthService {

    private AuthStrategy strategy;
    private SecurityValidator validatorChain;

    public AuthService(AuthStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AuthStrategy strategy) {
        this.strategy = strategy;
    }

    public void setValidatorChain(
            SecurityValidator validatorChain
    ) {
        this.validatorChain = validatorChain;
    }

    public void login() {

        if (strategy == null) {
            throw new IllegalStateException(
                    "No se ha configurado una estrategia de autenticación."
            );
        }

        if (validatorChain == null) {
            throw new IllegalStateException(
                    "No se ha configurado la cadena de seguridad."
            );
        }

        System.out.println("INICIO DEL PROCESO DE AUTENTICACIÓN");

        AuthResult result = strategy.authenticate();

        System.out.println(result.getMessage());

        if (!result.isSuccessful()) {
            System.out.println(
                    "Acceso denegado: falló la autenticación."
            );
            return;
        }

        System.out.println(
                "\nIniciando cadena de validaciones..."
        );

        boolean accessGranted = validatorChain.handle();

        if (!accessGranted) {
            System.out.println(
                    "\nAcceso denegado por la cadena de seguridad."
            );
        }
    }
}