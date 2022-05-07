package Parcial;

import java.io.File;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String primeraLinea = "";
		String segundaLinea = "";
		
		
		try {
			Scanner sc = new Scanner(new File("Entrada.in"));
			primeraLinea = sc.nextLine();
			segundaLinea = sc.nextLine();
			sc.close();
		}catch(Exception e) {
			System.out.println("Ocurrio un error: "+e);
		}
		String[] dIR = primeraLinea.split(" ");
		
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
		
		robot.getPosicion();
		
	
		
	}
}	




