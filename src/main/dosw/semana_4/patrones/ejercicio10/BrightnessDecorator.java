package main.dosw.semana_4.patrones.ejercicio10;

public class BrightnessDecorator implements Image {

    private final Image wrapped;

    public BrightnessDecorator(Image wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void render() {
        wrapped.render();
        System.out.print(" + [Brillo]");
    }
}