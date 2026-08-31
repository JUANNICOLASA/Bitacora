//Verificar condición en todos los elementos
//Juan Nicolás Álvarez
package main.dosw.taller_1;

import java.util.Arrays;
import java.util.List;

public class Condicion {
    public static void main(String[] args) {
        List<Double> notas = Arrays.asList(4.0, 3.5, 4.2, 5.0, 3.8);
        
        boolean todasAprobadas = notas.stream()
                .allMatch(n -> n >= 3.0);
                
        System.out.println("¿Todas las notas son >= 3.0? " + todasAprobadas);
    }
}