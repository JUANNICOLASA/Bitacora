//Imprimir elementos de una colección
//Juan Nicolás Álvarez
package main.dosw.taller_1;

import java.util.Arrays;
import java.util.List;

public class Imprimir {
    public static void main(String[] args) {
        List<String> productos = Arrays.asList("Laptop", "Mouse", "Teclado", "Monitor", "Impresora");
        
        productos.stream()
                .forEach(p -> System.out.println("Producto disponible: " + p));
    }
}