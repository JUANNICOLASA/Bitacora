package main.dosw.semana_4.patrones.ejercicio9;

public class PermissionValidator extends SecurityValidator {

    private final boolean permissionGranted;

    public PermissionValidator() {
        this(true);
    }

    public PermissionValidator(boolean permissionGranted) {
        this.permissionGranted = permissionGranted;
    }

    @Override
    protected boolean validate() {

        System.out.println(
                "[Chain] Validando permisos..."
        );

        if (permissionGranted) {

            System.out.println(
                    "   Permisos suficientes."
            );

            return true;
        }

        System.out.println(
                "   Permisos insuficientes."
        );

        return false;
    }
}