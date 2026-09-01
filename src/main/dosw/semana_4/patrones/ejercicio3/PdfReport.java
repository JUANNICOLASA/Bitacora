package main.dosw.semana_4.patrones.ejercicio3;

public class PdfReport extends ReportGenerator {

    @Override
    protected void applyFormat() {
        System.out.println("3. Aplicando formato y estilos PDF.");
    }

    @Override
    protected void exportFile() {
        System.out.println("4. Exportando reporte como archivo .pdf.");
    }
}