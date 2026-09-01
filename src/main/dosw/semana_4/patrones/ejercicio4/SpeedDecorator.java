package main.dosw.semana_4.patrones.ejercicio4;

public class SpeedDecorator implements Character {

    private final Character wrapped;

    public SpeedDecorator(Character wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void attack() {

        System.out.println(
                "[Poder temporal] Velocidad extra activada."
        );

        wrapped.attack();
    }
}