package programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sumo {
	
	public static final String NOMBRE_ARCHIVO_IN = "Sumo.in";
	public static final String NOMBRE_ARCHIVO_OUT = "Sumo.out";

	public static void main(String[] args) {
		calcularVictoriasEstimadas(leerArchivo(NOMBRE_ARCHIVO_IN));
	}
	
	public static ArrayList<Luchador> leerArchivo(String filePath) {
		ArrayList<Luchador> luchadores = new ArrayList<Luchador>();
		try {
			Scanner lector = new Scanner(new File(filePath));
			int cantidadDeLuchadores = lector.nextInt();
			for(int i = 1; i <= cantidadDeLuchadores; i++) {
				int peso = lector.nextInt(); 
				int altura = lector.nextInt();
				luchadores.add(new Luchador(i,peso,altura));
			}
			
		lector.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return luchadores;
	}
	
	public static ArrayList<Luchador> calcularVictoriasEstimadas(ArrayList<Luchador> luchadores){
		ArrayList<Luchador> estimados = new ArrayList<Luchador>();
		for(Luchador luchador : luchadores) {
			luchador.actualizarCantVictorias(luchadores);
			estimados.add(luchador);
		}
		return estimados;
	}
}
