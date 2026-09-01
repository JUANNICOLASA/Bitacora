package main.dosw.semana_4.patrones.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class ImageEditor {

    private final Image baseImage;

    private Image image;

    private final List<ApplyFilterCommand> history =
            new ArrayList<>();

    public ImageEditor(Image baseImage) {

        if (baseImage == null) {
            throw new IllegalArgumentException(
                    "La imagen base no puede ser null."
            );
        }

        this.baseImage = baseImage;
        this.image = baseImage;
    }

    public void executeCommand(
            ApplyFilterCommand command
    ) {

        if (!history.contains(command)) {
            history.add(command);
        }

        command.execute();

        rebuildImage();
    }

    public void undoCommand(
            ApplyFilterCommand command
    ) {

        if (!history.contains(command)) {
            System.out.println(
                    "[Editor] El comando no existe en el historial."
            );
            return;
        }

        command.undo();

        rebuildImage();
    }

    public void redoCommand(
            ApplyFilterCommand command
    ) {

        if (!history.contains(command)) {
            System.out.println(
                    "[Editor] El comando no existe en el historial."
            );
            return;
        }

        command.execute();

        rebuildImage();
    }

    private void rebuildImage() {

        Image rebuilt = baseImage;

        for (ApplyFilterCommand command : history) {
            rebuilt = command.apply(rebuilt);
        }

        image = rebuilt;
    }

    public void showImage() {

        System.out.print("Estado actual: ");

        image.render();

        System.out.println();
    }

    public Image getImage() {
        return image;
    }

    public List<ApplyFilterCommand> getHistory() {

        return List.copyOf(history);
    }
}