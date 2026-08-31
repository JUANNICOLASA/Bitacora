# SEMANA No 1 - DOSW Manejo de Streams

## Datos personales:
- Nombre y Apellido: Juan Nicolás Álvarez Muñoz
- Código de Estudiante: 1000102233
- Curso: Desarrollo de Software (DOSW)

---

### Ejercicio 01 - Números Pares mayores a diez

<img width="601" height="168" alt="image" src="https://github.com/user-attachments/assets/c7ddbcee-6a62-4dd7-a031-92247c4402e2" />

**Código implementado:** 
```java
// public static List<Integer> obtenerParesMayoresADiez(List<Integer> numeros) {
    return numeros.stream() // 1. Abre el flujo de datos de la lista de números
            .filter(n -> n > 10 && n % 2 == 0) // 2. Deja pasar solo aquellos que sean mayores a 10 Y cuyo residuo al dividir entre 2 sea cero (par)
            .toList(); // 3. Recolecta los números que pasaron la condición en una nueva Lista
}

```

