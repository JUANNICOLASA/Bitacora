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

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/a4a95fbf-304c-4426-af12-fdcd9292e7ed" />

**Explicación:**
Se genera un Stream a partir de la lista y se aplica un filtro evaluando que el número sea mayor a 10 y que su módulo de 2 sea cero.

---

### Ejercicio 02 - Cantidad de Palabras con más de 4 caracteres

<img width="733" height="505" alt="image" src="https://github.com/user-attachments/assets/8e59718a-2e97-4a5d-8687-245b8c04392f" />

**Código implementado:** 
```java
// public static long contarPalabras(List<String> palabras) {
    return palabras.stream() // 1. Abre el flujo de palabras
            .filter(p -> p.length() > 4) // 2. Filtra dejando solo las palabras con longitud estrictamente mayor a 4
            .map(String::toUpperCase) // 3. Transforma cada palabra a mayúsculas usando Method Reference (String.toUpperCase)
            .sorted() // 4. Ordena las palabras alfabéticamente
            .count(); // 5. Operación terminal: cuenta cuántas palabras quedaron en el flujo y retorna ese valor (long)
}

```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/95cf4e26-d4d0-4a5c-99a7-e9a304ddc79e" />

**Explicación:**
Se utilizan operaciones intermedias (filter, map, sorted) para transformar los datos y una operación terminal (count) para obtener el resultado.

---

### Ejercicio 03 - Obtener nombres de los Usuarios 

<img width="606" height="266" alt="image" src="https://github.com/user-attachments/assets/2b6b9418-2c07-4de1-94cb-a6a0e7d54117" />

**Código implementado:** 
```java
// public static List<String> obtenerNombresActivos(List<User> users) {
    return users.stream() // 1. Abre el flujo de objetos User
            .filter(User::isActive) // 2. Filtra dejando solo los usuarios cuyo método isActive() retorne true
            .map(u -> u.getName().toUpperCase()) // 3. Extrae el nombre del usuario y lo transforma a mayúsculas inmediatamente
            .sorted() // 4. Ordena la lista de nombres resultante de la A a la Z
            .toList(); // 5. Recolecta todo en una Lista de Strings
}

```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/dc3d2379-6c48-4006-83f4-402a733572ed" />

**Explicación:**
Se filtra por el estado activo, se mapea para extraer y transformar el nombre, y se finaliza generando una lista.

---

### Ejercicio 04 - Personas mayores de edad 

<img width="629" height="111" alt="image" src="https://github.com/user-attachments/assets/371f0603-cd96-4dea-aff9-b6b34ae2cd18" />

**Código implementado:** 
```java
// public static List<String> obtenerMayoresDeEdad(List<User> users) {
    return users.stream() // 1. Abre el flujo de usuarios
            .filter(u -> u.getAge() >= 18) // 2. Deja pasar a los usuarios con 18 años o más
            .map(User::getName) // 3. Mapea el objeto User para extraer únicamente su atributo nombre (como String)
            .toList(); // 4. Empaqueta los nombres en una Lista
}

```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/c4a40227-4b80-4c87-b85c-c746a49d1f13" />

**Explicación:**
Se aplica una condición booleana en el filtro (edad >= 18) y se extraen los nombres.

---

### Ejercicio 05 - Transacciones Bancarias 

<img width="658" height="445" alt="image" src="https://github.com/user-attachments/assets/9eb7fd7a-9e9b-4e66-9f7b-9848c675a39f" />

**Código implementado:** 
```java
// public static boolean procesarTransacciones(List<Transaction> transactions) {
    return !transactions.stream() // 1. Abre el flujo. El "!" niega el resultado final booleano
            .peek(t -> System.out.println("Procesando: " + t.getId())) // 2. peek() permite ejecutar una acción (imprimir) por cada elemento sin modificar el flujo ni detenerlo
            .anyMatch(t -> !t.isApproved()); // 3. anyMatch() revisa si *alguna* transacción NO está aprobada. Si encuentra al menos una, retorna true (que luego se niega con el ! inicial)
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/79813b6f-8b09-4d34-9ba2-a9a171ccb715" />

**Explicación:**
Se inspecciona el flujo con peek y se utiliza anyMatch para encontrar coincidencias sin recorrer necesariamente toda la colección.

---

# SEMANA No 2 — Bitácora Pokémon 
 
## Datos de Entrenador: 
- Nombre y Apellido: Nicolás Álvarez
- Código de Estudiante: 1000102233
- Curso: DOSW

---

### Ejercicio 01 - Pokémon Tipo Fuego  

<img width="586" height="202" alt="image" src="https://github.com/user-attachments/assets/5444c8f8-c935-4e70-b150-bfbc92abc5ea" />

**Código implementado:** 
```java
// public static List<Pokemon> obtenerTipoFuego(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Toma la lista original y abre un flujo de datos (Stream)
            .filter(p -> p.getTipo().equalsIgnoreCase("Fuego")) // 2. Filtra dejando solo los que su tipo coincida con "Fuego" (ignorando mayúsculas)
            .toList(); // 3. Recolecta los elementos filtrados y los devuelve como una nueva Lista
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/2ba52b95-d4ca-4615-a37a-aa962da6af88" />

**Explicación:**
Uso del método filter evaluando la igualdad de cadenas ignorando mayúsculas.

---

### Ejercicio 02 - Pokédex Gritona 

<img width="608" height="190" alt="image" src="https://github.com/user-attachments/assets/ff010754-5d0a-4f85-b707-9692f5f4f1ed" />

**Código implementado:** 
```java
// public static List<String> obtenerPokedexGritona(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo de datos
            .map(p -> p.getNombre().toUpperCase()) // 2. Transforma cada objeto Pokemon en un String (su nombre en mayúsculas)
            .toList(); // 3. Empaqueta esos Strings resultantes en una nueva Lista
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/9e78f33c-36ee-4d24-ad49-4223721a809b" />

**Explicación:**
Se emplea map para proyectar cada objeto Pokémon a una cadena de texto en mayúsculas.

---

### Ejercicio 03 - Poder Total del Equipo 

<img width="640" height="436" alt="image" src="https://github.com/user-attachments/assets/1d1fb6b4-a7cd-43c7-a8cd-42822d776aa8" />

**Código implementado:** 
```java
// public static int calcularPoderTotal(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo de datos
            .mapToInt(Pokemon::getNivel) // 2. Transforma (mapea) cada Pokemon a un tipo primitivo 'int' equivalente a su nivel (Reto Legendario aplicado)
            .sum(); // 3. Suma todos los valores enteros extraídos y retorna el total
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/5c389c8d-56ed-4ab2-8fab-ca9e85655b55" />

**Explicación:**
Se transforma el flujo a un Stream numérico primitivo con mapToInt(Pokemon::getNivel) (aplicando Method Reference) y se calcula la suma acumulada del equipo con sum().
---

### Ejercicio 04 - Pokémon Alfa 

<img width="640" height="209" alt="image" src="https://github.com/user-attachments/assets/6fe66d60-4fc9-49ac-a234-ab5f8cf04924" />

**Código implementado:** 
```java
// public static Pokemon obtenerPokemonAlfa(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo de datos
            .max(Comparator.comparingInt(Pokemon::getNivel)) // 2. Busca el elemento máximo usando un comparador basado en el atributo 'nivel'
            .orElse(null); // 3. Si la lista está vacía, devuelve 'null' en lugar de lanzar una excepción
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/1980e273-1a1d-42f1-8f2f-0988152a1c19" />

**Explicación:**
Se aplica la función terminal max utilizando un comparador por nivel (Comparator.comparingInt). Devuelve un Optional con el Pokémon de mayor nivel en la lista.
---

### Ejercicio 05 - Pokémon Legendarios  

<img width="635" height="210" alt="image" src="https://github.com/user-attachments/assets/a767aa56-8b55-42e8-9466-f93bc0f35510" />

**Código implementado:** 
```java
// public static long contarLegendarios(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo de datos
            .filter(p -> p.getNivel() > 80) // 2. Filtra dejando pasar únicamente los Pokémon cuyo nivel sea estrictamente mayor a 80
            .count(); // 3. Cuenta cuántos elementos lograron pasar el filtro y retorna ese número (long)
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/9d96ed06-b06c-4eb6-92f6-2a6494c76204" />

**Explicación:**
Se filtra el flujo seleccionando únicamente los Pokémon cuyo atributo nivel sea estrictamente mayor a 80 y se contabilizan los elementos restantes con la función terminal count().
---

### Ejercicio 06 - Pokédex Sin Duplicados 

<img width="706" height="473" alt="image" src="https://github.com/user-attachments/assets/0a5f6eae-fad9-4bc7-875a-40870e997363" />

**Código implementado:** 
```java
// public static List<Pokemon> eliminarDuplicados(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo de datos
            .distinct() // 2. Elimina los duplicados (funciona porque sobrescribimos el método equals en la clase Pokemon)
            .toList(); // 3. Recolecta los elementos únicos en una nueva Lista
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/2200a6dd-b6ac-45df-ab4b-2ff3f0e2f34d" />

**Explicación:**
Se utiliza la operación intermedia distinct(), la cual compara los objetos del flujo mediante la sobrescritura previa de los métodos equals y hashCode para descartar repeticiones.
---

### Ejercicio 07 - Orden del Profesor Oak 

<img width="627" height="201" alt="image" src="https://github.com/user-attachments/assets/3a0163a7-ce20-4316-add7-c4170278c88a" />

**Código implementado:** 
```java
// public static List<String> organizarPokedex(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo de datos
            .map(Pokemon::getNombre) // 2. Transforma cada Pokemon en un String (su nombre)
            .distinct() // 3. Asegura que no haya nombres repetidos antes de ordenar
            .sorted() // 4. Ordena los nombres alfabéticamente (comportamiento por defecto para Strings)
            .toList(); // 5. Recolecta el resultado en una Lista
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/9e00cace-8dfb-4c47-8f5f-830f5f6dd235" />

**Explicación:**
Se extraen los nombres de los Pokémon mediante map(Pokemon::getNombre), se eliminan duplicados y se aplica la operación sorted() para ordenarlos en orden alfabético natural.
---

### Ejercicio 08 - Evoluciones Preparadas 

<img width="617" height="228" alt="image" src="https://github.com/user-attachments/assets/873b6236-07c0-4718-b711-4bc85f01dd26" />

**Código implementado:** 
```java
// public static List<Pokemon> obtenerListosEvolucionar(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo de Pokémon
            .filter(Pokemon::isPuedeEvolucionar) // 2. Filtra usando Method Reference llamando al método que devuelve true si puede evolucionar
            .distinct() // 3. Se asegura de no devolver objetos repetidos en la lista
            .toList(); // 4. Retorna la Lista resultante
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/de442064-f58d-45c6-bc77-96672f7c6095" />

**Explicación:**
Se filtra la lista evaluando el atributo booleano puedeEvolucionar mediante la referencia a método Pokemon::isPuedeEvolucionar.
---

### Ejercicio 09 - Equipo Élite 

<img width="646" height="195" alt="image" src="https://github.com/user-attachments/assets/54f08ac8-aeb6-41e6-bf98-6917eacad9c0" />

**Código implementado:** 
```java
// public static List<Pokemon> obtenerEquipoElite(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo
            .filter(p -> p.getPoderCombate() > 500) // 2. Filtra aquellos cuyo PC (Poder de Combate) sea mayor a 500
            .distinct() // 3. Elimina duplicados
            .toList(); // 4. Recolecta y finaliza
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/483ede18-12c0-4e2e-8ead-4c819fb9c7a5" />

**Explicación:**
Se filtra el flujo conservando únicamente los objetos Pokémon cuyo atributo poderCombate sea superior a 500 unidades de PC.
---

### Ejercicio 10 - Pokédex Compacta 

<img width="599" height="196" alt="image" src="https://github.com/user-attachments/assets/cfd9afef-0ae7-47a7-bf9d-fa8c3d4e3079" />

**Código implementado:** 
```java
// public static List<String> obtenerPokedexCompacta(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo
            .map(Pokemon::getNombre) // 2. Mapea el objeto complejo Pokémon y se queda solo con el nombre (String)
            .distinct() // 3. Elimina nombres repetidos
            .collect(Collectors.toList()); // 4. Otra forma válida de recolectar en Lista usando Collectors en lugar del .toList() directo
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/50a18d81-57f4-4968-be6c-2bfa5ec0923e" />

**Explicación:**
Se proyectan los objetos a sus nombres con map y se recolecta el resultado final usando collect(Collectors.toList()) para construir la lista compacta.
---

### Ejercicio 11 - Poder Promedio 

<img width="649" height="434" alt="image" src="https://github.com/user-attachments/assets/de9f1bda-4cae-4593-ac47-7a436b6f4d08" />

**Código implementado:** 
```java
// public static double calcularPoderPromedio(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo
            .distinct() // 2. Limpia los repetidos para no afectar el promedio
            .mapToDouble(Pokemon::getPoderCombate) // 3. Convierte el Stream de Objetos a un DoubleStream primitivo extrayendo el PC de cada uno
            .average() // 4. Calcula el promedio matemático de todos los dobles en el flujo. Retorna un OptionalDouble
            .orElse(0.0); // 5. Si la lista estaba vacía y no se pudo calcular promedio, retorna 0.0 por defecto
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/419ce410-38e9-4ca8-ab6a-b4b15d210cee" />

**Explicación:**
Se transforma la lista a un DoubleStream primitivo con mapToDouble(Pokemon::getPoderCombate) y se calcula el promedio aritmético usando average(), retornando 0.0 si la colección estuviera vacía.
---

### Ejercicio 12 - Campeón Regional 

<img width="616" height="189" alt="image" src="https://github.com/user-attachments/assets/6c7fdee0-671c-4654-a5e1-326aaf827a9c" />

**Código implementado:** 
```java
// public static Pokemon obtenerCampeonRegional(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo
            .max(Comparator.comparingDouble(Pokemon::getPoderCombate)) // 2. Encuentra el elemento máximo comparando el atributo PoderCombate (que es double)
            .orElse(null); // 3. Retorna null si la lista original estaba vacía
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/53e3cecc-52a3-425e-9328-082782068bb1" />

**Explicación:**
Se evalúa la colección mediante la operación max pasando un comparador por el valor de poderCombate (Comparator.comparingDouble) para extraer el Pokémon con los mayores puntos de combate.
---

### Ejercicio 13 - Organizar por Tipo 

<img width="623" height="204" alt="image" src="https://github.com/user-attachments/assets/bd569146-adb5-44a4-8e02-19d2294d9586" />

**Código implementado:** 
```java
// public static Map<String, List<Pokemon>> agruparPorTipo(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo de datos
            .distinct() // 2. Limpia los duplicados
            .collect(Collectors.groupingBy(Pokemon::getTipo)); // 3. Agrupa en un Mapa donde la Llave es el Tipo, y el Valor es la lista de Pokémon de ese tipo
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/b07303a4-e339-467f-997a-6a274ea08ea2" />

**Explicación:**
Se agrupan los Pokémon en un mapa (Map<String, List<Pokemon>>) utilizando la función de recolección Collectors.groupingBy(Pokemon::getTipo).
---

### Ejercicio 14 - Organizar por Región 

<img width="614" height="220" alt="image" src="https://github.com/user-attachments/assets/4f672d7f-cd9d-4b1e-a6fe-734481cff0d6" />

**Código implementado:** 
```java
// public static Map<String, List<Pokemon>> agruparPorRegion(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo
            .distinct() // 2. Elimina repetidos
            .collect(Collectors.groupingBy(Pokemon::getRegion)); // 3. Agrupa en un Map. La llave es la Región (String) y el valor es la Lista de Pokémon de esa región
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/dab89156-d0e9-4e59-a3eb-b90439067919" />

**Explicación:**
Se agrupan las entidades por su ubicación de origen utilizando Collectors.groupingBy(Pokemon::getRegion).
---

### Ejercicio 15 - Maestro de Gimnasios  

<img width="589" height="178" alt="image" src="https://github.com/user-attachments/assets/7477b41d-dfc7-46c9-ab0c-52ac288dfd45" />

**Código implementado:** 
```java
// public static Entrenador obtenerMaestro(List<Entrenador> entrenadores) {
    return entrenadores.stream() // 1. Abre el flujo de Entrenadores
            .max(Comparator.comparingInt(Entrenador::getMedallas)) // 2. Busca al que tenga el número máximo de medallas
            .orElse(null); // 3. Retorna nulo si no hay datos
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/a2b88c85-27e8-4d92-9323-42d9f37cac1f" />

**Explicación:**
Se procesa el Stream de objetos Entrenador evaluando el mayor número de medallas con max(Comparator.comparingInt(Entrenador::getMedallas)).
---

### Ejercicio 16 - Entrenadores Experimentados  

<img width="668" height="196" alt="image" src="https://github.com/user-attachments/assets/11cb02dc-5a3a-4bd2-a881-4ee82302b487" />

**Código implementado:** 
```java
// public static List<Entrenador> obtenerExperimentados(List<Entrenador> entrenadores) {
    return entrenadores.stream() // 1. Abre el flujo
            .filter(e -> e.getMedallas() > 5) // 2. Filtra a los entrenadores que posean estrictamente más de 5 medallas
            .toList(); // 3. Recolecta y retorna
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/8430e873-b34a-45de-b27a-45d8106760d9" />

**Explicación:**
Se aplica filter sobre la lista de entrenadores seleccionando aquellos cuyo valor en el atributo medallas sea estrictamente mayor a 5.
---

### Ejercicio 17 - Equipo Más Poderoso 

<img width="616" height="202" alt="image" src="https://github.com/user-attachments/assets/c4773d51-ff5e-4821-a0cc-713b82cfd1fe" />

**Código implementado:** 
```java
// public static Entrenador obtenerMasPoderoso(List<Entrenador> entrenadores) {
    return entrenadores.stream() // 1. Abre el flujo de datos de entrenadores
            .max(Comparator.comparingDouble(e -> // 2. Busca el máximo evaluando una condición doble
                e.getEquipo().stream() // 2.1 Abre un sub-stream con el equipo (lista de Pokémon) del entrenador actual
                    .mapToDouble(Pokemon::getPoderCombate) // 2.2 Extrae el poder de combate de cada Pokémon de ese equipo
                    .sum() // 2.3 Suma todo el poder de combate del equipo
            )) // Cierra el comparador
            .orElse(null); // 3. Retorna nulo si no hay entrenadores
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/3b22fd25-ec46-47b8-8ace-ca8f39d7f4b4" />

**Explicación:**
Se obtiene el entrenador con mayor fuerza combinada mediante max, calculando dinámicamente en el comparador la suma del poderCombate de la lista de Pokémon anidada en cada entrenador.
---

### Ejercicio 18 - Top 5 Pokémon Más Fuertes 

<img width="593" height="223" alt="image" src="https://github.com/user-attachments/assets/dc7b7954-e928-4ae7-84c1-95f65effface" />

**Código implementado:** 
```java
// public static List<Pokemon> obtenerTop5(List<Pokemon> pokemons) {
    return pokemons.stream() // 1. Abre el flujo
            .distinct() // 2. Elimina repetidos
            .sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed()) // 3. Ordena comparando el PC, pero usa ".reversed()" para que el orden sea descendente (el más fuerte primero)
            .limit(5) // 4. Corta el flujo, permitiendo pasar únicamente a los primeros 5 elementos
            .toList(); // 5. Recolecta esos 5 elementos en la Lista final
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/7033a159-0f4e-4d7a-8194-2fad3a20a3d4" />

**Explicación:**
Se ordena la colección por poderCombate en forma descendente usando .reversed() y se restringe la salida a únicamente los 5 primeros elementos con limit(5).
---

### Ejercicio 19 - Top 3 Entrenadores  

<img width="690" height="490" alt="image" src="https://github.com/user-attachments/assets/de47b2d6-b304-4ba3-9ef6-4a0059a0b305" />

**Código implementado:** 
```java
// public static List<Entrenador> obtenerTop3(List<Entrenador> entrenadores) {
    return entrenadores.stream() // 1. Abre el flujo de datos
            .sorted(Comparator.comparingInt(Entrenador::getMedallas).reversed() // 2. Primer criterio: Ordena por medallas de mayor a menor (reversed)
                    .thenComparingDouble(e -> e.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum()).reversed() // 3. Segundo criterio (desempate): Suma total de PC, también de mayor a menor
                    .thenComparing(Entrenador::getNombre)) // 4. Tercer criterio: Orden alfabético del nombre
            .limit(3) // 5. Trunca el flujo para dejar pasar únicamente a los primeros 3 elementos
            .toList(); // 6. Recolecta a los ganadores en una lista
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/f70fa9e5-9eca-4e7f-8bfe-e4748963d753" />

**Explicación:**
Se aplica un ordenamiento compuesto multicriterio mediante thenComparing: primero por medallas (descendente), luego por PC acumulado (descendente) y finalmente por nombre (alfabético), limitando la colección a los 3 mejores.
---

### Ejercicio 20 - Pokédex Analítica  

<img width="606" height="245" alt="image" src="https://github.com/user-attachments/assets/0110b04e-0589-46ab-88c4-406314614bc2" />

**Código implementado:** 
```java
// public static void generarPokedexAnalitica(List<Pokemon> pokemons) {
    // Estas líneas usan la misma lógica vista antes, aplicadas a diferentes variables
    Map<String, Long> tipo = pokemons.stream().distinct().collect(Collectors.groupingBy(Pokemon::getTipo, Collectors.counting())); // Agrupa por tipo y cuenta cuántos hay en cada grupo
    Map<String, Long> region = pokemons.stream().distinct().collect(Collectors.groupingBy(Pokemon::getRegion, Collectors.counting())); // Agrupa por región y cuenta
    long legendarios = pokemons.stream().distinct().filter(Pokemon::isLegendario).count(); // Filtra y cuenta legendarios
    double promNivel = pokemons.stream().distinct().mapToDouble(Pokemon::getNivel).average().orElse(0.0); // Promedia los niveles
    Pokemon fuerte = pokemons.stream().distinct().max(Comparator.comparingDouble(Pokemon::getPoderCombate)).orElse(null); // Busca el máximo PC
    
    // Imprime todos los resultados
    System.out.println("Tipos: " + tipo + "\nRegiones: " + region + "\nLegendarios: " + legendarios + "\nProm Nivel: " + promNivel + "\nMás fuerte: " + (fuerte!=null ? fuerte.getNombre() : "N/A"));
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/4af0adbe-bc61-482b-b9eb-d85183ae265c" />

**Explicación:**
Se realiza un análisis integral del flujo ejecutando reducciones concurrentes sobre el Stream para agrupar y contar por tipo y región (groupingBy + counting), promediar nivel (average) y extraer el máximo PC (max).
---

### Reto Mewtwo  

<img width="576" height="84" alt="image" src="https://github.com/user-attachments/assets/995f7c7f-6bec-470d-9c72-a227760d4135" />

**Código implementado:** 
```java
// public static Map<String, Optional<Pokemon>> obtenerCampeonesPorTipo(List<Entrenador> entrenadores) {
    return entrenadores.stream() // 1. Flujo inicial de entrenadores
            .filter(e -> e.getMedallas() > 3) // 2. Filtra entrenadores que tengan más de 3 medallas
            .flatMap(e -> e.getEquipo().stream()) // 3. Aplana las listas de equipos: toma los Pokémon de todos los entrenadores y los une en un solo gran flujo de Pokémon
            .filter(p -> !p.isLegendario() && p.getNivel() > 30) // 4. Filtra dejando solo los NO legendarios con nivel mayor a 30
            .collect(Collectors.groupingBy( // 5. Inicia el proceso de recolección y agrupación
                    Pokemon::getTipo, // 5.1 La llave de la agrupación será el tipo (Fuego, Agua, etc.)
                    Collectors.reducing((p1, p2) -> p1.getPoderCombate() > p2.getPoderCombate() ? p1 : p2) // 5.2 Reduce la lista de cada grupo comparando el PC y quedándose siempre con el mayor
            ));
}
```

**Ejecución:**

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/bbe8986d-b757-4362-a813-37bf9385f727" />

**Explicación:**
Se filtran entrenadores por sus medallas, se aplanan los equipos anidados a un solo flujo continuo con flatMap, se aplican filtros por nivel y condición de legendario, y se agrupa por tipo usando Collectors.reducing para extraer el de mayor PC, finalizando con un ordenamiento alfabético (sorted) sobre el mapa resultante.
