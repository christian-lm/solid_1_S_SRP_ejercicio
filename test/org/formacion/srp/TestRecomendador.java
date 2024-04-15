package org.formacion.srp;

import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class TestRecomendador {

	@Test
	public void test() {
		List<Pelicula> recomenaciones = Recomendador.recomendaciones(BBDD.JUAN);
		
		Assert.assertFalse(recomenaciones.contains(BBDD.ET));
	}
	
	@Test 
	public void test_formato() {
		Visualizacion v = new Visualizacion();
		
		String csv = v.recomendacionesCSV(Recomendador.recomendaciones(BBDD.JUAN));
		
		String esperado = "Salvar al soldado Ryan,Spielberg,belico";
		
		Assert.assertEquals(esperado, csv);

	}

}
