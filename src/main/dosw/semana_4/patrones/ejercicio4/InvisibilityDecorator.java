package main.dosw.semana_4.patrones.ejercicio4;

public class InvisibilityDecorator implements Character {

    private final Character wrapped;

    public InvisibilityDecorator(Character wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void attack() {

        System.out.println(
                "[Poder temporal] Invisibilidad activada."
        );

        wrapped.attack();
    }
}