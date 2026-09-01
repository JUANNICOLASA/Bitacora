package main.dosw.semana_4.patrones.ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {

        System.out.println(" EJERCICIO 9 - STRATEGY + CHAIN");


        SecurityValidator credential1 =
                new CredentialValidator();

        SecurityValidator permission1 =
                new PermissionValidator(true);

        SecurityValidator location1 =
                new LocationValidator();

        SecurityValidator time1 =
                new TimeValidator();

        credential1
                .setNext(permission1)
                .setNext(location1)
                .setNext(time1);

        AuthService successfulLogin =
                new AuthService(
                        new GoogleStrategy()
                );

        successfulLogin.setValidatorChain(
                credential1
        );

        System.out.println("\n>>> CASO 1: GOOGLE - ACCESO CORRECTO");

        successfulLogin.login();

        SecurityValidator credential2 =
                new CredentialValidator();

        SecurityValidator permission2 =
                new PermissionValidator(false);

        SecurityValidator location2 =
                new LocationValidator();

        SecurityValidator time2 =
                new TimeValidator();

        credential2
                .setNext(permission2)
                .setNext(location2)
                .setNext(time2);

        AuthService deniedLogin =
                new AuthService(
                        new BiometricStrategy()
                );

        deniedLogin.setValidatorChain(
                credential2
        );

        System.out.println(
                "\n>>> CASO 2: BIOMETRÍA - ACCESO DENEGADO"
        );

        deniedLogin.login();
    }
}