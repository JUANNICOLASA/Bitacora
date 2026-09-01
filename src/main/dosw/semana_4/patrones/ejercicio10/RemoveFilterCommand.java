package main.dosw.semana_4.patrones.ejercicio10;

public class RemoveFilterCommand implements ImageCommand {

    private final ImageEditor editor;
    private final ApplyFilterCommand targetCommand;

    public RemoveFilterCommand(
            ImageEditor editor,
            ApplyFilterCommand targetCommand
    ) {
        this.editor = editor;
        this.targetCommand = targetCommand;
    }

    @Override
    public void execute() {

        editor.undoCommand(targetCommand);

        System.out.println(
                "[Command] Se eliminó el filtro: "
                        + targetCommand.getFilterName()
        );
    }

    @Override
    public void undo() {

        editor.redoCommand(targetCommand);

        System.out.println(
                "[Command] Se restauró el filtro: "
                        + targetCommand.getFilterName()
        );
    }
}