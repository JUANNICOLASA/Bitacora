package main.dosw.semana_4.patrones.ejercicio10;

import java.util.function.Function;

public class ApplyFilterCommand implements ImageCommand {

    private final Function<Image, Image> filter;
    private final String filterName;

    private boolean active;

    public ApplyFilterCommand(
            Function<Image, Image> filter,
            String filterName
    ) {
        this.filter = filter;
        this.filterName = filterName;
        this.active = false;
    }

    @Override
    public void execute() {

        active = true;

        System.out.println(
                "[Command] Filtro activado: " + filterName
        );
    }

    @Override
    public void undo() {

        active = false;

        System.out.println(
                "[Command] Filtro desactivado: " + filterName
        );
    }

    public Image apply(Image image) {

        if (!active) {
            return image;
        }

        return filter.apply(image);
    }

    public boolean isActive() {
        return active;
    }

    public String getFilterName() {
        return filterName;
    }
}