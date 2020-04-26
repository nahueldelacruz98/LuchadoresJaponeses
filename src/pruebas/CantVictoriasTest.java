package pruebas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import programa.Luchador;

public class CantVictoriasTest {
	Luchador luchador;
	
	@Before public void inicializarLuchador() {
		luchador = new Luchador(320,1500);
	}

	@Test
	public void identicoLuchador() {
		Assert.assertEquals(false,luchador.compareTo(luchador) > 0);
	}

	@Test
	public void gana() {
		Assert.assertEquals(true,luchador.compareTo(new Luchador(100,1000)) > 0);
	}

	@Test
	public void pierde() {
		Assert.assertEquals(false,luchador.compareTo(new Luchador(400,2000)) > 0);
	}

	@Test
	public void empatePesoPeroGana() {
		Assert.assertEquals(true,luchador.compareTo(new Luchador(luchador.getPeso(),1000)) > 0);
	}

	@Test
	public void empateAlturaPeroGana() {
		Assert.assertEquals(true,luchador.compareTo(new Luchador(300,luchador.getAltura())) > 0);
	}
	
	@Test
	public void empatePesoPeroPierde() {
		Assert.assertEquals(false,luchador.compareTo(new Luchador(luchador.getPeso(),2000)) > 0);
	}

	@Test
	public void empateAlturaPeroPierde() {
		Assert.assertEquals(false,luchador.compareTo(new Luchador(400,luchador.getAltura())) > 0);
	}
	
	@Test
	public void indefinidoPorAltura() {
		Assert.assertEquals(false,luchador.compareTo(new Luchador(200,2000)) > 0);
	}

	@Test
	public void indefinidoPorPeso() {
		Assert.assertEquals(false,luchador.compareTo(new Luchador(400,1000)) > 0);
	}
	
}
