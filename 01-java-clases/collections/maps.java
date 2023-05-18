Mapas o Diccionarios:
- En las colecciones tipo map, cada elemento representa como un par de:
    {key, value}

// Declaración e inicialización:
Map<Integer, String> mapa = new HashMap<>();

// Carga y eliminación:
mapa.put(1, "Uno");
mapa.put(2, "Dos");

String valor = mapa.get(2); // Traemos el valora sociado a la key 2 en este caso "Dos"

mapa.remove(2); // Eliminamos el elemento con la key 2.

// Recorrido:
for (Map.Entry<Integer, String> entrada : mapa.entrySet()){
    Integer clave = entrada.getKey();
    String valor = entrada.getValue();
    System.out.println("La clave es: " + clave + " y el valor es: " + valor);
}