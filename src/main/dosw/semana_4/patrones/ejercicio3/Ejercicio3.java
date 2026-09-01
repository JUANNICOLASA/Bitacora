package main.dosw.semana_4.patrones.ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println(" EJERCICIO 3 - TEMPLATE METHOD + FACTORY");

        System.out.println(">>> Generando reporte PDF");

        ReportGenerator pdfReport =
                ReportFactory.create("PDF");

        pdfReport.generate();

        System.out.println();

        System.out.println(">>> Generando reporte Excel");

        ReportGenerator excelReport =
                ReportFactory.create("EXCEL");

        excelReport.generate();

        System.out.println();

        System.out.println(">>> Generando reporte CSV");

        ReportGenerator csvReport =
                ReportFactory.create("CSV");

        csvReport.generate();
    }
}