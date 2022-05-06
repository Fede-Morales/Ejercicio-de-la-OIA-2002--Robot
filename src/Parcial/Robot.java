package Parcial;

public class Robot {
	
	private int[] posicion = new int[2];
	private char sentido;
	
	public Robot(int a, int b, char c) {
		this.posicion[0] = a;
		this.posicion[1] = b;
		this.sentido = c;
	}
	
	public int[] getPosicion(){
		System.out.println(posicion[0]);
		System.out.println(posicion[1]);
		
		return posicion;
	}
	
	public void setPosicion(int a, int b) {
		this.posicion[0] = a;
		this.posicion[1] = b;
	}
	
	public void getSentido() {
		if(sentido == 'n' || sentido == 'N') {
			System.out.println("Norte");
		}
		if(sentido == 's' || sentido == 'S') {
			System.out.println("Sur");
		}
		if(sentido == 'e' || sentido == 'E') {
			System.out.println("Este");
		}
		if(sentido == 'o' || sentido == 'O') {
			System.out.println("Oeste");
		}
	}
	
	public char setSentido(char c) {
		if(c == 'n' || c == 'N') {
			this.sentido = c;
		}
		if(c == 's' || c == 'S') {
			this.sentido = c;
		}
		if(c == 'e' || c == 'E') {
			this.sentido = c;
		}
		if(c == 'o' || c == 'O') {
			this.sentido = c;
		}
		return c;
	}
	
	public int[] Avanzar(int n) {
		int x,y;
		char s;
		
		x = this.posicion[0];
		y = this.posicion[1];
		s = this.sentido;
	
		if(s == 'N') {
			this.posicion[0] +=n;
		}
		if(s == 'E') {
			x-=n;
			this.posicion[1] +=n;
		}
		if(s == 'O') {
			x+=n;
			this.posicion[1] -=n;
		}
		if(s == 'S') {
			y-=n;
			this.posicion[0] -=n;
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

	
