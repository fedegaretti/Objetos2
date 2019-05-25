package cientopolis;

import java.util.List;

public class PreguntaMultiple extends Pregunta {
	
	private List<Opcion> opciones;

	public void agregarOpcion(Opcion opcion) {
		opciones.add(opcion);
	}
}
