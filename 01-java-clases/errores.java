/*
    Error por desbordamiento (fuera de los límites):
    Los errores por desbordamiento se producen cuando intentamos hacer referencia a una posición dentro de nuestro
    array que no existe.
 */

int edades[] = new int[2];

edades[0] = 15;
edades[1] = 26;
edades[2] = 37;
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2.
