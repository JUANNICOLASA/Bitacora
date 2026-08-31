//Transformar a mayúsculas
//Juan Nicolás Álvarez

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mayusculas {
    public static void main(String[] args) {
        List<String> ciudades = Arrays.asList("Bogotá", "Medellín", "Cali", "Barranquilla");
        
        List<String> ciudadesMayus = ciudades.stream()
                .map(c -> c.toUpperCase())
                .collect(Collectors.toList());
                
        System.out.println("Ciudades en mayúsculas: " + ciudadesMayus);
    }
}