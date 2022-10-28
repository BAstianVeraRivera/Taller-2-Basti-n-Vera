public class Correo_Electronico {
	private String direccion;
	private String proveedor;

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public Correo_Electronico (String direccion, String proveedor){
		this.direccion=direccion;
		this.proveedor=proveedor;
	}
}