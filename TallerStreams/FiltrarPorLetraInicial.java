//Filtrar por letra inicial
//Juan Nicolás Álvarez

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarPorLetraInicial{
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Carlos", "Andres", "Pedro", "Alejandra", "Juan", "Amanda");
        
        List<String> nombresConA = nombres.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
                
        System.out.println("Nombres con A: " + nombresConA);
    }
}