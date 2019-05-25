package cultivos;

import java.util.ArrayList;

public class Mixta implements IPlantable {

	private ArrayList <IPlantable> plantables;
	
	public Mixta(ArrayList<IPlantable> plantables) {
		this.plantables = plantables;
	}
	
	public int getGanancia() {
		int ganancia = 0;
		for (int i = 0; i < plantables.size(); i++) {
			ganancia += plantables.get(i).getGanancia()/4;
		}
		return ganancia;
	}
	public void agregarPlantable(IPlantable plantable) {
		if (plantables.size()< 4) {
			plantables.add(plantable);
		}
	}
	public void sacarPlantable(IPlantable plantable) {
		plantables.remove(plantable);
	}
}
