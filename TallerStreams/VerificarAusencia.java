//Verificar ausencia de un elemento
//Juan Nicolás Álvarez

import java.util.Arrays;
import java.util.List;

public class VerificarAusencia {
    public static void main(String[] args) {
        List<String> usuarios = Arrays.asList("juan", "maria", "admin", "pedro", "soporte");
        
        boolean ningunoRoot = usuarios.stream()
                .noneMatch(u -> u.equals("root"));
                
        System.out.println("¿Ningún usuario es 'root'? " + ningunoRoot);
    }
}