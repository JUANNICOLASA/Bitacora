package main.dosw.semana_4.patrones.ejercicio4;

public class ShieldDecorator implements Character {

    private final Character wrapped;

    public ShieldDecorator(Character wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void attack() {

        System.out.println(
                "[Poder temporal] Escudo de hielo activado."
        );

        wrapped.attack();
    }
}