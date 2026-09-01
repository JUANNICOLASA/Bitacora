package main.dosw.semana_4.patrones.ejercicio9;

public class CredentialValidator extends SecurityValidator {

    @Override
    protected boolean validate() {

        System.out.println(
                "[Chain] Validando credenciales..."
        );

        boolean valid = true;

        if (valid) {
            System.out.println(
                    "   Credenciales válidas."
            );
        } else {
            System.out.println(
                    "   Credenciales inválidas."
            );
        }

        return valid;
    }
}