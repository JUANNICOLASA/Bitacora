package main.dosw.semana_4.patrones.ejercicio3;

public class ReportFactory {

    public static ReportGenerator create(String type) {

        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException(
                    "El tipo de reporte no puede estar vacío."
            );
        }

        return switch (type.toUpperCase()) {

            case "PDF" -> new PdfReport();

            case "EXCEL", "XLSX" -> new ExcelReport();

            case "CSV" -> new CsvReport();

            default -> throw new IllegalArgumentException(
                    "Formato de reporte no soportado: " + type
            );
        };
    }
}