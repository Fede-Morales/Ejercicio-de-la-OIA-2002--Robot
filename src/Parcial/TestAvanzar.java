package Parcial;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Scanner;

public class TestAvanzar {

	@org.junit.Test
	public void test() throws Exception {
		String segundaLinea = "A9R1A2";
		String[] dIR = "1 1 N 10 5".split(" ");
		
		Robot robot = new Robot(dIR[0], dIR[1], dIR[2].charAt(0), dIR[3], dIR[4]);
		
		String proximaIndicacion = "";
		String indicaciones = segundaLinea;
		for(int i=2; i<=indicaciones.length(); i=i+2) {
			proximaIndicacion = indicaciones.substring(i-2, i);
			if(proximaIndicacion.charAt(0) == 'A') {
				robot.Avanzar(proximaIndicacion.charAt(1)+"");
			}else {
				robot.cambiarSentido(proximaIndicacion.charAt(1)+"");
			}
		}
		
	
		int[] n= {3,5};
		assertArrayEquals(n,robot.getPosicion());
		
	}

}
