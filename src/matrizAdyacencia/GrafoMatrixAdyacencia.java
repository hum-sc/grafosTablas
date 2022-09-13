package adyacencia;

public class GrafoMatrixAdyacencia {
private final int MAXIMO_VERTICES;
private final int MAXIMO_ARISTAS;
private int aristas;
private int matrix[][];

public GrafoMatrixAdyacencia(int nroVertices, int nroAristas) {
MAXIMO_VERTICES = nroVertices;
MAXIMO_ARISTAS = nroAristas;

this.aristas = 0;

matrix = new int[MAXIMO_VERTICES][MAXIMO_VERTICES];

for (int i = 0; i < getMAX_VERTICES(); i++) {
for (int j = 0; j < getMAX_VERTICES(); j++) {
matrix[i][j] = 0;
}
}
}

public GrafoMatrixAdyacencia(int nroVertices) {
this(nroVertices, nroVertices);
}

public int getMAX_VERTICES() {
return MAXIMO_VERTICES;
}

public int getMAX_ARISTAS() {
return MAXIMO_ARISTAS;
}

public void insertaArista(int v1, int v2, int dist)
throws ArrayIndexOutOfBoundsException, UnsupportedOperationException {
if (v1 >= MAXIMO_VERTICES || v2 >= MAXIMO_VERTICES) {
throw new ArrayIndexOutOfBoundsException(
"Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
} else if (aristas == MAXIMO_ARISTAS) {
throw new UnsupportedOperationException("No se puede añadir más aristas");
} else {
matrix[v1][v2] = dist;
}
}

public boolean existeArista(int v1, int v2) {
if (v1 >= MAXIMO_VERTICES || v2 >= MAXIMO_VERTICES) {
throw new ArrayIndexOutOfBoundsException(
"Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
} else if (matrix[v1][v2] != 0) {
return true;
}
return false;
}

public void eliminaArista(int v1, int v2) {
if (v1 >= MAXIMO_VERTICES || v2 >= MAXIMO_VERTICES) {
throw new ArrayIndexOutOfBoundsException(
"Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
} else if (matrix[v1][v2] == 0) {
System.err.println("La arista NO existe");
} else {
matrix[v1][v2] = 0;
}
}

public void borrarGrafo() {
for (int i = 0; i < matrix.length; i++) {
for (int j = 0; j < matrix[i].length; j++) {
matrix[i][j] = 0;
}
}
}

public void impMatrix() {
System.out.print(" ");
for (int i = 0; i < MAXIMO_VERTICES; i++) {
System.out.printf("  %3d", i);
}
System.out.println();
for (int i = 0; i < MAXIMO_VERTICES; i++) {
System.out.printf(" %3d", i);
for (int j = 0; j < MAXIMO_VERTICES; j++) {
System.out.printf(" %3d", matrix[i][j]);
}
System.out.println();
}
 }
    
}
