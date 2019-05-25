package cultivos;

public class Trigo implements IPlantable {
	
	public Trigo() {
		this.ganancia = 300;
	}

	private int ganancia;
	
	public int getGanancia() {
		return this.ganancia;
	}
}
