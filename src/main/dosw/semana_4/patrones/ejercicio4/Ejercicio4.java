package main.dosw.semana_4.patrones.ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println(" EJERCICIO 4 - BUILDER + DECORATOR");

        Character warrior = new WarriorBuilder()
                .setArmor("Acero")
                .setWeapon("Espada")
                .setSkill("Furia")
                .build();

        System.out.println("PERSONAJE BASE:");
        warrior.attack();


        Character fastWarrior =
                new SpeedDecorator(warrior);

        System.out.println("PERSONAJE CON VELOCIDAD:");
        fastWarrior.attack();


        Character poweredWarrior =
                new ShieldDecorator(
                        new SpeedDecorator(warrior)
                );

        System.out.println("PERSONAJE CON ESCUDO + VELOCIDAD:");
        poweredWarrior.attack();


        Character fullyPoweredWarrior =
                new InvisibilityDecorator(
                        new ShieldDecorator(
                                new SpeedDecorator(warrior)
                        )
                );

        System.out.println(
                "PERSONAJE CON INVISIBILIDAD + ESCUDO + VELOCIDAD:"
        );

        fullyPoweredWarrior.attack();


        System.out.println(
                "LOS PODERES TERMINAN Y SE DESCARTA EL WRAPPER:"
        );

        warrior.attack();
    }
}