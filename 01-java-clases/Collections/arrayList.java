ArrayList:
- Arrays representados den forma de Lista.
- Permiten elementos DUPLICADOS.
- FIFO (First in, First out) para la inserción y lectura.
- Permiten el acceso de un elemento en particular mediante el índice, just like the lists.

// Declaración e inicialización:
List<String> listaPersonas = new ArrayList<String>();

// Carga de datos:
listaPersonas.add("Cristiano Ronaldo");
listaPersonas.add("Lionel Messi");

// Recorrido forma 1:
for (String person: listaPersonas){
    System.out.println("Hola soy " + person);
}

for (int i = 0; i< listaPersonas.size(); i++){
    System.out.println("Hola soy " + listaPersonas.get(i));
}
