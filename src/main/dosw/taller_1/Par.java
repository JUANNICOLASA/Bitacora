//Verificar si existe al menos un par
//Juan Nicolás Álvarez
package main.dosw.taller_1;

import java.util.Arrays;
import java.util.List;

public class Par{
    public static void main(String[] args) {
        List<Integer> numerosPar = Arrays.asList(7, 11, 13, 20, 25);
        
        boolean hayPar = numerosPar.stream()
                .anyMatch(n -> n % 2 == 0);
                
        System.out.println("¿Hay algún número par? " + hayPar);
    }
}