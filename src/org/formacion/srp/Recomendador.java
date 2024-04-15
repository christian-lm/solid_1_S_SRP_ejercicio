package org.formacion.srp;

import java.util.ArrayList;
import java.util.List;

public class Recomendador {

	public static List<Pelicula> recomendaciones (Cliente cliente) {

		List<Pelicula> recomendadas = new ArrayList<>();

		for (Pelicula favorita: cliente.getFavoritas()) {

			// Recorre las pelis por director y te quita las que ya ha visto
			BBDD.PELIS_POR_DIRECTOR
					.get(favorita.getDirector())
					.stream()
					.filter(peliculasDirector -> !cliente.getFavoritas().contains(peliculasDirector))
					.forEach(recomendadas::add);

		}

		return recomendadas;
	}
}