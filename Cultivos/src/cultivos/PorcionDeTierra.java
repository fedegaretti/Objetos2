package cultivos;

import java.util.ArrayList;

public class PorcionDeTierra {

	private ArrayList<IPlantable> regiones;

	public PorcionDeTierra(ArrayList<IPlantable> regiones) {
		this.regiones = regiones;
	}
	
	public void agregarRegion(IPlantable plantable) {
		if (regiones.size() < 4) {
			regiones.add(plantable);
		}
	}
	
	public void sacarRegion(IPlantable plantable) {
		regiones.remove(plantable);
	}
	
	public int gananciasTotales() {
		int ganancia= 0;
		for(int i=0; i < regiones.size(); i++) {
			ganancia += regiones.get(i).getGanancia();
		}
		return ganancia;
	}
}
