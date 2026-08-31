//Saltar los primeros elementos
//Juan Nicolás Álvarez
package main.dosw.taller_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SaltarElementos {
    public static void main(String[] args) {
        List<String> peliculas = Arrays.asList("Avatar", "Titanic", "Interestelar", "Matrix", "Gladiador");
        
        List<String> peliculasRestantes = peliculas.stream()
                .skip(2)
                .collect(Collectors.toList());
                
        System.out.println("Películas después de saltar 2: " + peliculasRestantes);
    }
}