package Parcial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception {
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
		if(indicaciones.length()/2 > 125) {
			throw new Exception("No se permiten mas de 125 instrucciones.Cantidad de instruccuiones actuales: "+indicaciones.length()/2);
		}
		for(int i=2; i<=indicaciones.length(); i=i+2) {
			proximaIndicacion = indicaciones.substring(i-2, i);
			if(proximaIndicacion.charAt(0) == 'A') {
				robot.Avanzar(proximaIndicacion.charAt(1)+"");
			}else {
				robot.cambiarSentido(proximaIndicacion.charAt(1)+"");
			}
		}
		
		
		//robot.getPosicion();
		crearArchivo(robot);
	
		
	}
	public static void crearArchivo(Robot robot) {
		try {
			PrintWriter pw = new PrintWriter(new File("Salida.Out"));
			String papope= "";
			for(int i=0; i<robot.getPosicion().length;i++) {
				papope+=robot.getPosicion()[i]+" ";
			}
			papope.trim();
			pw.print(papope);
			System.out.println("Se genero con exito el archivo");
			pw.close();
		} catch (Exception e) {
			System.out.println("No se pudo crear el archivo ");
		}

	}
}	






