package programa;

import java.util.ArrayList;

public class Luchador {
	private int id; // según aparición del luchador desde el archivo
	private int peso;
	private int altura;
	private int cantVictorias;

	public Luchador(int id, int peso, int altura) {
		super();
		this.id = id;
		this.peso = peso;
		this.altura = altura;
		this.cantVictorias = 0;
	}

	public Luchador(int peso, int altura) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.cantVictorias = 0;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getCantVictorias() {
		return cantVictorias;
	}

	public void setCantVictorias(int cantVictorias) {
		this.cantVictorias = cantVictorias;
	}

	/**
	 * @return el numero que define el orden
	 */
	public int getId() {
		return id;
	}

	public void actualizarCantVictorias(ArrayList<Luchador> luchadores) {
		for (Luchador luchador : luchadores) {
			if (this.compareTo(luchador) > 0) {
				this.cantVictorias++;
			}
		}
	}

	// this > otroLuchador
	public int compareTo(Luchador otroLuchador) {
		if (this.peso >= otroLuchador.peso && this.altura != otroLuchador.altura) {
			return this.altura - otroLuchador.altura;
		} else
			return this.peso - otroLuchador.peso;
	}

	@Override
	public String toString() {
		return "Luchador [id=" + id + ", peso=" + peso + ", altura=" + altura + ", cantVictorias=" + cantVictorias
				+ "]";
	}
	
	/*	public int compareTo(Luchador otroLuchador) {
			if (this.peso == otroLuchador.peso) {
				return this.altura - otroLuchador.altura;
			} else {
				if (this.altura == otroLuchador.altura)
					return this.peso - otroLuchador.peso;
				else {
					if (this.peso > otroLuchador.peso)
						return this.altura - otroLuchador.altura;
				}
				return -1; //o this.peso - otroLuchador.peso; 
			}
		}*/
}
