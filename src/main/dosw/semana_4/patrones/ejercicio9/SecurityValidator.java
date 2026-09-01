package main.dosw.semana_4.patrones.ejercicio9;

public abstract class SecurityValidator {

    protected SecurityValidator next;

    public SecurityValidator setNext(SecurityValidator next) {
        this.next = next;
        return next;
    }

    public boolean handle() {

        if (!validate()) {
            return false;
        }

        if (next != null) {
            return next.handle();
        }

        System.out.println(
                "¡Acceso concedido por la cadena de seguridad!"
        );

        return true;
    }

    protected abstract boolean validate();
}