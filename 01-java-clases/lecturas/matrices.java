// Arreglos bidimensionales para manejar FILAS y COLUMNAS.

int matriz [][] = new int[3][3]; // Declaro e inicializo una matriz de 3 filas y 3 columnas.

FILA    COLUMNA     COLUMNA
FILA    COLUMNA     COLUMNA
FILA    COLUMNA     COLUMNA

numeros[fila][columna];
// Carga manual
numeros[0][0] = 52;
numeros[0][1] = 10;
numeros[0][2] = 12;
...
numeros[3][3] = 62;

// Recorrer matrices:
for (int f=0; f<=2; f++){
    for (int c=0; c<=2; c++){
        System.out.println("Fila: " + f + "Columna:" + c);
        System.out.println("Tengo guardado un " + matriz[f][c]);
    }
}

// Carga por teclado [O-M-I-T-I-R]
Scanner tecla = new Scanner(System.in);

for (int f =0; f<= 2; f++){
    for (int c=0; c<=2; c++){
        System.out.println("Ingrese el valor para la posición: " + [f][c]);
        matriz[f][c] = tecla.nextInt();
    }
}