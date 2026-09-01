package main.dosw.semana_4.patrones.ejercicio10;

public class NoiseReductionDecorator implements Image {

    private final Image wrapped;

    public NoiseReductionDecorator(Image wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void render() {
        wrapped.render();
        System.out.print(" + [Reducción de ruido]");
    }
}