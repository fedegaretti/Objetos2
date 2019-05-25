package cientopolis;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	private List<Encuesta> encuestas;
	private String descripcion;
	private String proposito;

	public void crearEncuesta() {
		Encuesta encuesta = new Encuesta();
		this.encuestas.add(encuesta);
	}

	public void crearEncuesta(List<Pregunta> preguntas) {
		Encuesta encuesta = new Encuesta(preguntas);
		this.encuestas.add(encuesta);
	}

	public Proyecto(String descripcion, String proposito) {
		this.descripcion = descripcion;
		this.proposito = proposito;
		encuestas = new ArrayList<Encuesta>();
	}

}
