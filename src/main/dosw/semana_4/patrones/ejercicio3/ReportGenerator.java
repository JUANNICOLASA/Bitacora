package main.dosw.semana_4.patrones.ejercicio3;

public abstract class ReportGenerator {

    public final void generate() {

        fetchData();
        processData();
        applyFormat();
        exportFile();
    }

    private void fetchData() {
        System.out.println("1. Obteniendo datos...");
    }

    private void processData() {
        System.out.println("2. Procesando información...");
    }

    protected abstract void applyFormat();

    protected abstract void exportFile();
}