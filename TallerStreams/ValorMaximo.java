//Encontrar el valor máximo
//Juan Nicolás Álvarez

import java.util.Arrays;
import java.util.List;

public class ValorMaximo {
    public static void main(String[] args) {
        List<Integer> salarios = Arrays.asList(1800000, 2500000, 3200000, 2100000, 4000000);
        
        int maximo = salarios.stream()
                .max(Integer::compare)
                .get();
                
        System.out.println("Salario máximo: " + maximo);
    }
}