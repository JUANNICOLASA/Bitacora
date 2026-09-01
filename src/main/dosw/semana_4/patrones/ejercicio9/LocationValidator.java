package main.dosw.semana_4.patrones.ejercicio9;

public class LocationValidator extends SecurityValidator {

    @Override
    protected boolean validate() {

        System.out.println(
                "[Chain] Validando ubicación..."
        );

        boolean valid = true;

        if (valid) {
            System.out.println(
                    "   Ubicación autorizada."
            );
        } else {
            System.out.println(
                    "   Ubicación no autorizada."
            );
        }

        return valid;
    }
}