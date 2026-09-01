package main.dosw.semana_4.patrones.ejercicio10;

public class GrayscaleDecorator implements Image {

    private final Image wrapped;

    public GrayscaleDecorator(Image wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void render() {
        wrapped.render();
        System.out.print(" + [Blanco y Negro]");
    }
}