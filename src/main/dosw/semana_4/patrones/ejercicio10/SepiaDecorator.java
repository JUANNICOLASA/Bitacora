package main.dosw.semana_4.patrones.ejercicio10;

public class SepiaDecorator implements Image {

    private final Image wrapped;

    public SepiaDecorator(Image wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void render() {
        wrapped.render();
        System.out.print(" + [Sepia]");
    }
}