package Parcial;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivos{
		
	private String inputPath;
	private String ouputPath;
	
	public Archivos(String inputPath, String outputPath) {
 		this.inputPath = inputPath;
 		this.ouputPath = outputPath;
 	}
	
	public void leerArchivo() {
		try {
			Scanner sc = new Scanner(new File(this.inputPath));
			Robot p = new Robot(sc.nextInt(), sc.nextInt(), sc.next().charAt(0));
			Tablero n = new Tablero(sc.nextInt(), sc.nextInt());
			
			if(sc.next().charAt(0) == 'A') {
				p.Avanzar(sc.nextInt());
			}
			if(sc.next().charAt(0) == 'R') {
				if(sc.nextInt() == 0) {
					p.setSentido('N');
				}
			}
			else if(sc.next().charAt(0) == 'R') {
				if(sc.nextInt() == 1) {
					p.setSentido('E');
				}
			}
			else if(sc.next().charAt(0) == 'R') {
				if(sc.nextInt() == 2) {
					p.setSentido('S');
				}
			}
			else if(sc.next().charAt(0) == 'R') {
				if(sc.nextInt() == 3) {
					p.setSentido('O');
				}
			}
				
				
			} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo " + this.inputPath);
		}
	}
	public void crearArchivo() {
		try {
			PrintWriter pw = new PrintWriter(new File(this.ouputPath));
				Robot p = new Robot(1,1,'N');
				pw.print(p.getPosicion());
			
			System.out.println("Se genero con exito el archivo "+this.ouputPath+"!");
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo crear el archivo " + this.ouputPath);
		}

	}
	
}

