package Parcial;

import java.util.ArrayList;

public class Robot {

	private int[] posicion = new int[2];
	private char sentido;
	private int limiteX;
	private int limiteY;

	public Robot(String x, String y, char c, String n, String m) {
		this.posicion[0] = Integer.parseInt(x);
		this.posicion[1] = Integer.parseInt(y);
		this.limiteX = Integer.parseInt(n);
		this.limiteY = Integer.parseInt(m);
		this.sentido = c;
	}

	public void getPosicion() {
		System.out.print(posicion[0] + " ");
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
		System.out.println("Va a try avanzar:" + q);

		if (this.sentido == 'N') {
			if (this.posicion[1] + n > this.limiteY) {
				this.posicion[1] = this.limiteY;
			} else {
				this.posicion[1] += n;
			}
		} else if (this.sentido == 'E') {
			if (this.posicion[0] + n > this.limiteX) {
				this.posicion[0] = this.limiteX;
			} else {
				this.posicion[0] += n;
			}

		} else if (this.sentido == 'O') {
			if (this.posicion[1] - n < 1) {
				this.posicion[1] = 1;
			} else {
				this.posicion[1] -= n;
			}
		} else if (this.sentido == 'S') {
			if (this.posicion[0] - n < 1) {
				this.posicion[0] = 1;
			} else {
				this.posicion[0] -= n;
			}

		}
		return posicion;
	}

	public void cambiarSentido(String q) {
		ArrayList<Character> sentidos = new ArrayList<Character>();
		sentidos.add('N');
		sentidos.add('E');
		sentidos.add('S');
		sentidos.add('O');

		int cantidadRotaciones = Integer.parseInt(q) % 4;
		int indiceActual = sentidos.indexOf(Character.toUpperCase(this.getSentido()));
		int indiceFinal = (indiceActual + cantidadRotaciones) % 4;
		this.setSentido(sentidos.get(indiceFinal));
		System.out.println("Orientacion actual:" + this.getSentido());
	}

}
