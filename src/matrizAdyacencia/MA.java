
package matrizAdyacencia;

public class MA {

    public static void main(String[] args) {
        GrafoMatrixAdyacencia g1 = new GrafoMatrixAdyacencia(3,3);
        
        g1.insertaArista(0, 2, 1);
        g1.insertaArista(0, 1, 0);
        g1.insertaArista(1, 2, 1);
        g1.insertaArista(1, 1, 0);
        g1.insertaArista(1, 0, 1);
        g1.insertaArista(2, 1, 1);
        g1.insertaArista(2, 0, 1);
        g1.insertaArista(2, 2, 0);
        g1.impMatrix();
    }
    
}
