LinkedList:
- Se caracterizan por tener punteros para poder enlazar doblemente cada uno de sus elementos.
- Permiten DUPLICADOS.
- Permite insertar elementos al principio o al final.
- Puede ser tratado como LISTA, PILA o COLA.

// Declaración e inicialización:
List<String> listaPersonas = new LinkedList<String>();

// Carga de datos:
// Agrega elemento al final:
listaPersonas.add("Cristiano Ronaldo");

// Agrega elemento al principio:
listaPersonas.add(0, "Lionel Messi");

// Recorrido:
for (String person: listaPersonas){
    System.out.println("Hola, soy " + person);
}

ArrayList: 0-1-2-3-4-5
LinkedList: null-[HEAD]-[]-[]-[]-[TAIL]-null
