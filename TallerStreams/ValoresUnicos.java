//Eliminar valores repetidos
//Juan Nicolás Álvarez

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValoresUnicos {
    public static void main(String[] args) {
        List<String> codigos = Arrays.asList("P01","P02","P01","P03","P02","P04");
        
        List<String> codigosUnicos = codigos.stream()
                .distinct()
                .collect(Collectors.toList());
                
        System.out.println("Códigos únicos: " + codigosUnicos);
    }
}