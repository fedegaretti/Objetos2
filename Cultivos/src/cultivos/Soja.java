package cultivos;

public class Soja implements IPlantable {

	public Soja() {
		this.ganancia = 500;
	}

	private int ganancia;
	
	public int getGanancia() {
		return this.ganancia;
	}
}
