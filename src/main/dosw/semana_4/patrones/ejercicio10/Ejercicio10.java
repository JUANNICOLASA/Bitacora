package main.dosw.semana_4.patrones.ejercicio10;

public class Ejercicio10 {

    public static void main(String[] args) {

        System.out.println(" EJERCICIO 10 - DECORATOR + COMMAND");

        ImageEditor editor =
                new ImageEditor(new BaseImage());


        System.out.println("\n1. IMAGEN INICIAL");

        editor.showImage();


        ApplyFilterCommand sepiaCommand =
                new ApplyFilterCommand(
                        SepiaDecorator::new,
                        "Sepia"
                );

        ApplyFilterCommand brightnessCommand =
                new ApplyFilterCommand(
                        BrightnessDecorator::new,
                        "Brillo"
                );

        ApplyFilterCommand contrastCommand =
                new ApplyFilterCommand(
                        ContrastDecorator::new,
                        "Contraste"
                );


        System.out.println("\n2. APLICANDO SEPIA");

        editor.executeCommand(sepiaCommand);

        editor.showImage();


        System.out.println("\n3. APLICANDO BRILLO");

        editor.executeCommand(brightnessCommand);

        editor.showImage();

        System.out.println("\n4. APLICANDO CONTRASTE");

        editor.executeCommand(contrastCommand);

        editor.showImage();


        System.out.println(
                "\n5. UNDO INDIVIDUAL DE SEPIA"
        );

        editor.undoCommand(sepiaCommand);

        editor.showImage();


        System.out.println(
                "\n6. COMPROBACIÓN DE LOS OTROS FILTROS"
        );

        editor.showImage();


        System.out.println(
                "\n7. REDO INDIVIDUAL DE SEPIA"
        );

        editor.redoCommand(sepiaCommand);

        editor.showImage();


        System.out.println(
                "\n8. REMOVE COMMAND: ELIMINAR SOLO BRILLO"
        );

        RemoveFilterCommand removeBrightness =
                new RemoveFilterCommand(
                        editor,
                        brightnessCommand
                );

        removeBrightness.execute();

        editor.showImage();


        System.out.println(
                "\n9. UNDO DEL REMOVE COMMAND"
        );

        removeBrightness.undo();

        editor.showImage();
    }
}