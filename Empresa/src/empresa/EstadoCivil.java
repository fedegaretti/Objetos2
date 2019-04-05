package empresa;

public class EstadoCivil {
	
	private Boolean soltero;

	public Boolean esSoltero() {
		return soltero;
	}

	public void setSoltero(Boolean soltero) {
		this.soltero = soltero;
	}
	
	public EstadoCivil(Boolean soltero) {
		this.soltero = soltero;
	}
}
