// Son VECTORES unidimensionale spor tener solo filas o columnas.

int numeros[] = new int[6]; // Declaro incializo un array de 6.
posiciones

// Carga manual
numeros[0] = 2;
numeros[1] = 32;
numeros[2] = 45;
numeros[3] = 10;
numeros[4] = 21;
numeros[5] = 123;


for (int i = 0; i< numeros.length; i++){
    System.out.println("Estoy en el indice " + i);
    System.out.println("Tengo guardado un " + numeros [i]);
}

Scanner tecla = new Scanner (System.in); //Vamos a ingresar datos por consola.

for (int i=0; i<numeros.length; i++){
    System.out.println("Ingrese el valor para la posición" + i);
    numeros[i] = tecla.nextInt();
}