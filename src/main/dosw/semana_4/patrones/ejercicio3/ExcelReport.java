package main.dosw.semana_4.patrones.ejercicio3;

public class ExcelReport extends ReportGenerator {

    @Override
    protected void applyFormat() {
        System.out.println("3. Aplicando formato y estilos de Excel.");
    }

    @Override
    protected void exportFile() {
        System.out.println("4. Exportando reporte como archivo .xlsx.");
    }
}