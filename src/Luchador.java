
public class Luchador {
	private int id; //según aparición del luchador desde el archivo
	private int peso;
	private int altura;
	
	public Luchador(int id, int peso, int altura) {
		super();
		this.id = id;
		this.peso = peso;
		this.altura = altura;
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
	
}
