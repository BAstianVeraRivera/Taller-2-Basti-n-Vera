import java.util.ArrayList;

public class Persona {
	private int rut;
	private String nombre;
	private String apellido;
	public ArrayList<Correo_Electronico> correos = new ArrayList<Correo_Electronico>();
	public ArrayList<Automovil> autos = new ArrayList<Automovil>();

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}