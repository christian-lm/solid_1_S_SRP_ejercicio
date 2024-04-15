package org.formacion.srp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.formacion.srp.Recomendador.recomendaciones;

public class Visualizacion {

    public String recomendacionesCSV (Cliente cliente) {
        return recomendaciones(cliente).stream()
                .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
                .collect(Collectors.joining("\n"));
    }
}
