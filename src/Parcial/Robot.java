package Parcial;

public class Robot {
	
	private int[] posicion = new int[2];
	private char sentido;
	private int[] tablero = new int[2];
	
	public Robot(String x, String y, char c ,String n, String m) {
		this.posicion[0] = Integer.parseInt(x);
		this.posicion[1] = Integer.parseInt(y);
		this.tablero[0] = Integer.parseInt(n);
		this.tablero[1] = Integer.parseInt(m);
		this.sentido = c;
	}
	
	public void getPosicion(){
		System.out.print(posicion[0]+" ");
		System.out.println(posicion[1]);
		
	}
	
	public void setPosicion(int a, int b) {
		this.posicion[0] = a;
		this.posicion[1] = b;
	}
	
	public char getSentido() {
		return this.sentido;
	}
	
	public void setSentido(char c) {
		this.sentido = c;
	}
	
	public int[] Avanzar(String q) {
		int n = Integer.parseInt(q);
		char s;
		s = this.sentido;
	
		if(this.sentido == 'N') {
			this.posicion[0] +=n;
		}
		if(s == 'E') {
			this.posicion[1] +=n;
		}
		if(s == 'O') {
			this.posicion[0] -=n;
		}
		if(s == 'S') {
			this.posicion[1] -=n;
		}
		return posicion; 
	}
	
	public void Rotar(char s) {
		s = this.sentido;
		
		if(s == 'N') {
			setSentido('N');
		}
		if(s == 'E') {
			setSentido('E');
		}
		if(s == 'S') {
			setSentido('S');
		}
		if(s == 'O') {
			setSentido('O');
		}
		
	}
	
	
	
}

	
