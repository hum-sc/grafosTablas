

import TT4.Window;
public class Controller {
    private Window window;
    public Controller(Window window){
        this.window = window;
    }
    public void start(){
        window.setVisible(true);
        int[] setting = window.getInt(2, new String[]{"Numero de nodos:", "Numero de lados:"}, "Ingrese la cantidad de nodos y lados", "Ingresar");
        int nodos = setting[0];
        int lados = setting[1];
        int [][] matrizAdyacencia = new int[nodos][nodos+1];
        int [][] matrizIncidencia = new int[nodos][lados+1];
        int [][] matrizValencias = new int[1][nodos+1];

        for(int i = 1; i <= lados; i++){
            int[] input = window.getInt(2, new String[]{"Nodo 1:", "Nodo 2:"}, "Ingrese los nodos del lado " + (i), "Ingresar");
            int nodo1 = input[0]-1;
            int nodo2 = input[1]-1;
            matrizAdyacencia[nodo1][nodo2+1] = 1;
            matrizAdyacencia[nodo2][nodo1+1] = 1;

            matrizValencias[0][nodo1]++;
            if(nodo1 != nodo2){
                matrizValencias[0][nodo2]++;
            }

            matrizIncidencia[nodo1][i] = 1;
            matrizIncidencia[nodo2][i] = 1;
        }
        String pLabels[][] = new String[3][];
        int values[][][] = new int[3][nodos][];
        pLabels[0] = new String[nodos+1];
        pLabels[2] = new String[nodos];
        pLabels[0][0] = "Nodos";

        for (int i = 1; i <= nodos; i++ ){
            pLabels[0][i] = Integer.toString(i);
        }

        for (int i = 0; i<nodos; i++){
            matrizAdyacencia[i][0] = i+1;
            matrizIncidencia[i][0] = i+1;
            pLabels[2][i] = Integer.toString(i+1);
        }

        pLabels[1] = new String[lados+1];
        pLabels[1][0] = "Nodos";
        for(int i = 1; i<= lados; i++){
            pLabels[1][i] = "Camino "+i;
        }

        values[0] = matrizAdyacencia;
        values[1] = matrizIncidencia;
        values[2] = matrizValencias;

        values[0] = matrizAdyacencia;
        values[1] = matrizIncidencia;

        window.showTables(3, pLabels, values, new String[]{"Matriz de adyacencia", "Matriz de incidencia", "Valencias"});
      
        
    }
}
