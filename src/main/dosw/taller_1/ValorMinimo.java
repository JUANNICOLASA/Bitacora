//Encontrar el valor mínimo
//Juan Nicolás Álvarez
package main.dosw.taller_1;

import java.util.Arrays;
import java.util.List;

public class ValorMinimo {
    public static void main(String[] args) {
        List<Integer> precios = Arrays.asList(12000, 5000, 18000, 7500, 3000);
        
        int minimo = precios.stream()
                .min(Integer::compare)
                .get();
                
        System.out.println("Precio mínimo: " + minimo);
    }
}