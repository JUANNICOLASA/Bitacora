//Suma total de una lista
//Juan Nicolás Álvarez

import java.util.Arrays;
import java.util.List;

public class SumaTotal {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(12, 8, 5, 10, 15);
        
        int suma = numeros.stream()
                .reduce(0, (acum, n) -> acum + n);
                
        System.out.println("Suma total: " + suma);
    }
}