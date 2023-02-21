// Version 1.0

package prevencion;

// Clase usuario y se definen los parametros(nombre, fechaNacimiento y rut).
public class Usuario {

	private String nombre;
	private int fechaNacimiento;
	private int rut;

	// Constructor sin parametros
	public Usuario() {

	}

	// Constructor con todos los parametros.
	public Usuario(String nombre, int fechaNacimiento, int rut) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;

	}

	// Solicita y retorna el valor de nombre.
	public String getNombre() {
		return nombre;
	}

	// Establece el valor de nombre.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Solicita y retorna el valor de fechaNacimiento.
	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	// Establece el valor de fechaNacimiento.
	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	// Solicita y retorna el valor de rut.
	public int getRut() {
		return rut;
	}

	// Establece el valor de rut.
	public void setRut(int rut) {
		this.rut = rut;
	}

	// Metodo toString().
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", rut=" + rut;
	}

}
