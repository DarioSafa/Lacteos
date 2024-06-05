package paquete;

public class Queso {
	/* Indica el tipo de leche con el que se ha fabricado el queso*/
	private String tipo;
	/* Indica la cantidad en milimetros utilizada para la fabricacion del queso*/
	private int cantidad_leche;
	/* Indica el peso en gramos del queso*/
	private double peso;
	
	public Queso() {
		
	}
	
	public Queso(String tipo_leche, int cantidad_leche, double peso) {
		this.setTipo(tipo_leche);
		this.setCantidad_leche(cantidad_leche);
		this.setPeso(peso);
	}

	public void imprimir_cabecera() {
		System.out.println("QUESOS ENTREPINARES");
		System.out.println("Registro Sanitario No 52/38751");
		System.out.println("Para consultar el lote del producto revise la etiqueta");
		imprimir_detalle();
	}

	public void imprimir_detalle() {
		System.out.println("Peso: " + this.peso);
		System.out.println("Tipo de leche: " + this.tipo);
		System.out.println("Cantidad de leche: " + this.cantidad_leche);
	}
	
	/**
	 * @return the tipo_leche
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo_leche the tipo_leche to set
	 */
	public void setTipo(String tipo_leche) {
		this.tipo = tipo_leche;
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
