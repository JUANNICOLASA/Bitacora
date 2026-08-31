//Registrar transformaciones intermedias
//Juan Nicolás Álvarez

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RegistrarTransformaciones {
    public static void main(String[] args) {
        List<String> empleados = Arrays.asList("Laura", "Pedro", "Carlos", "Ana");
        
        List<String> empleadosMayus = empleados.stream()
                .map(e -> e.toUpperCase())
                .peek(e -> System.out.println("Transformado: " + e))
                .collect(Collectors.toList());
                
        System.out.println("Lista final: " + empleadosMayus);
    }
}