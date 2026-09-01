package main.dosw.semana_4.patrones.ejercicio9;

public class TimeValidator extends SecurityValidator {

    @Override
    protected boolean validate() {

        System.out.println(
                "[Chain] Validando horario laboral..."
        );

        boolean valid = true;

        if (valid) {
            System.out.println(
                    "   Horario autorizado."
            );
        } else {
            System.out.println(
                    "   Acceso fuera del horario permitido."
            );
        }

        return valid;
    }
}