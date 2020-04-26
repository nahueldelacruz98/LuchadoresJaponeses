import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sumo {
	
	public static final String NOMBRE_ARCHIVO_IN = "Sumo.in";
	public static final String NOMBRE_ARCHIVO_OUT = "Sumo.out";

	public static void main(String[] args) {
		leerArchivo(NOMBRE_ARCHIVO_IN);
	}
	
	public static ArrayList<Luchador> leerArchivo(String filePath) {
		ArrayList<Luchador> luchadores = new ArrayList<Luchador>();
		try {
			Scanner lector = new Scanner(new File(filePath));
			int cantidadDeLuchadores = lector.nextInt();
			for(int i = 1; i <= cantidadDeLuchadores; i++) {
				//String line = lector.nextLine();
				int peso = lector.nextInt(); //Integer.parseInt(line.substring(0,line.indexOf(' ')));
				int altura = lector.nextInt();//Integer.parseInt(line.substring(line.indexOf(' '),line.length()));
				luchadores.add(new Luchador(i,peso,altura));
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return luchadores;
	}
	
}
