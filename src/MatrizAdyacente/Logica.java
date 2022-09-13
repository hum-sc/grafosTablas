package MatrizAdyacente;

public class Logica {
private String matriz [][];
	
	public void createMatriz(int nodo1, int nodo2) {
		matriz = new String [nodo1][nodo2];
		
	}
	public String[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(int nodo1, int nodo2) {
		matriz [nodo1][nodo2]="1";
	}
	 public void llenarVoid(String [][]matriz) {
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { 
                if (matriz[i][j] == null) {
                	matriz[i][j]="0";
                }
            }           
        }
	}
	public void mostrar(int [][]matriz) {
		for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) { 
                System.out.println(matriz[i][j]);
            }           
        }
	}
	public void nodos(String[] columnName) {
		for (int i = 0; i < matriz[0].length; i++) {
        	columnName[i]=("a"+i);      
        }

	}
}
