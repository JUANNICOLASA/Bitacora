//Ordenar una colección
//Juan Nicolás Álvarez
package main.dosw.taller_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarColeccion {
    public static void main(String[] args) {
        List<Integer> edades = Arrays.asList(25, 18, 32, 21, 19, 28);
        
        List<Integer> asc = edades.stream()
                .sorted()
                .collect(Collectors.toList());
                
        List<Integer> desc = edades.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
                
        System.out.println("Ascendente: " + asc);
        System.out.println("Descendente: " + desc);
    }
}