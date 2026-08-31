//Limitar cantidad de resultados
//Juan Nicolás Álvarez
package main.dosw.taller_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limitar {
    public static void main(String[] args) {
        List<Integer> puntajes = Arrays.asList(100, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50, 42, 30, 25, 20, 15, 10, 5, 3, 2);
        
        List<Integer> top5 = puntajes.stream()
                .limit(5)
                .collect(Collectors.toList());
                
        System.out.println("Top 5 puntajes: " + top5);
    }
}