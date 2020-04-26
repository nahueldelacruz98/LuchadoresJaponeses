package programa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sumo {

	public static final String NOMBRE_ARCHIVO_IN = "sumo.in";
	public static final String NOMBRE_ARCHIVO_OUT = "sumo.out";

	public static void main(String[] args) {
		ArrayList<Luchador> luchadores = calcularVictoriasEstimadas(leerArchivo(NOMBRE_ARCHIVO_IN));
		grabarArchivo(NOMBRE_ARCHIVO_OUT, luchadores);
	}

	public static ArrayList<Luchador> leerArchivo(String filePath) {
		ArrayList<Luchador> luchadores = new ArrayList<Luchador>();
		try {
			Scanner lector = new Scanner(new File(filePath));
			int cantidadDeLuchadores = lector.nextInt();

			for (int i = 1; i <= cantidadDeLuchadores; i++) {
				int peso = lector.nextInt();
				int altura = lector.nextInt();
				luchadores.add(new Luchador(i, peso, altura));
			}

			lector.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return luchadores;
	}

	public static ArrayList<Luchador> calcularVictoriasEstimadas(ArrayList<Luchador> luchadores) {
		ArrayList<Luchador> estimados = new ArrayList<Luchador>();
		for (Luchador luchador : luchadores) {
			luchador.actualizarCantVictorias(luchadores);
			estimados.add(luchador);
		}
		return estimados;
	}

	public static void grabarArchivo(String filePath, ArrayList<Luchador> luchadores) {
		try {
			File file = new File(filePath);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for (Luchador luchador : luchadores) {
				System.out.println(luchador);
				bw.write(luchador.getCantVictorias() + "\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
