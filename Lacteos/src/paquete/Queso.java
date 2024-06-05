package paquete;

public class Queso {
	/* Indica el tipo de leche con el que se ha fabricado el queso*/
	private String tipo_leche;
	/* Indica la cantidad en milimetros utilizada para la fabricacion del queso*/
	private int cantidad_leche;
	/* Indica el peso en gramos del queso*/
	private double peso;
	
	public Queso() {
		
	}
	
	public Queso(String tipo_leche, int cantidad_leche, double peso) {
		this.setTipo_leche(tipo_leche);
		this.setCantidad_leche(cantidad_leche);
		this.setPeso(peso);
	}

	/**
	 * @return the tipo_leche
	 */
	public String getTipo_leche() {
		return tipo_leche;
	}

	/**
	 * @param tipo_leche the tipo_leche to set
	 */
	public void setTipo_leche(String tipo_leche) {
		this.tipo_leche = tipo_leche;
	}

	/**
	 * @return the cantidad_leche
	 */
	int getCantidad_leche() {
		return cantidad_leche;
	}

	/**
	 * @param cantidad_leche the cantidad_leche to set
	 */
	void setCantidad_leche(int cantidad_leche) {
		this.cantidad_leche = cantidad_leche;
	}

	/**
	 * @return the peso
	 */
	double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	void setPeso(double peso) {
		this.peso = peso;
	}
	
}
