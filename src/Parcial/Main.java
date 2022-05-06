package Parcial;

public class Main {

	public static void main(String[] args) {
		Tablero t = new Tablero(4,4);
		Robot p = new Robot(1,1,'N');
		
		Archivos a = new Archivos("Entrada.in","Salida.out");
		
	
		a.crearArchivo();
		
		
		
	}	
}

class Tablero{
	
	private int tablero[][];
	
	public Tablero(int a, int b) {
		tablero = new int[a][b];
		this.tablero = tablero;
		for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
            	this.tablero[i][j] = j+1; 
            }
		}
	}


	public void setTablero(int a, int b) {
		for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
            	this.tablero[i][j] = j; 
            }
		}
	}
	
	public void getTablero() {
		for (int i = 0; i < tablero.length; i++) { 
            for (int j = 0; j < tablero[i].length; j++) {
            	if(j == 0) {
            		System.out.println();
            	}
                System.out.print(tablero[i][j]);
            }
		}
	}
}


