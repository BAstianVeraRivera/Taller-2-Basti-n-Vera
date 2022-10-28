public class Automovil {
	private String marca;
	private String modelo;
	private int añoFabricacion;
	private int precio;
	public Motor unnamed_Motor_;
	public Chasis unnamed_Chasis_;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoFabricacion() {
		return this.añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Automovil (String marca, String modelo, int añoFabricacion, int precio){
		this.marca=marca;
		this.modelo=modelo;
		this.añoFabricacion=añoFabricacion;
		this.precio=precio;
	}
}