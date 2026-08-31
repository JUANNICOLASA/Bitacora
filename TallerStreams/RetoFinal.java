//Reto final
//Juan Nicolás Álvarez

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Estudiante {
    private String nombre;
    private double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }

    @Override
    public String toString() {
        return nombre + "(" + promedio + ")";
    }
}

public class RetoFinal {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Ana", 4.5),
                new Estudiante("Carlos", 3.2),
                new Estudiante("Pedro", 2.8),
                new Estudiante("Laura", 4.8),
                new Estudiante("Andrés", 3.9),
                new Estudiante("María", 2.5)
        );

        List<Estudiante> aprobados = estudiantes.stream()
                .filter(e -> e.getPromedio() >= 3.0)
                .map(e -> new Estudiante(e.getNombre().toUpperCase(), e.getPromedio()))
                .sorted(Comparator.comparing(Estudiante::getPromedio).reversed())
                .peek(e -> System.out.println("Procesado: " + e.getNombre() + "  " + e.getPromedio()))
                .collect(Collectors.toList());

        System.out.println("Lista final:\n" + aprobados);
    }
}