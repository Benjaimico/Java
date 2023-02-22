// Version 1.0

package prevencion;

// Clase cliente y se definen los atributos(rut, nombre, apellidos, telefono, afp, sistemaSalud, direccion, comuna y edad).
public class Cliente {

	private int rut;
	private String nombre;
	private String apellidos;
	private int telefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	// Constructor sin parametros.
	public Cliente() {

	}

	// Constructor con todos los parametros de la clase.
	public Cliente(int rut, String nombre, String apellidos, int telefono, String afp, int sistemaSalud,
			String direccion, String comuna, int edad) {

	}

	// Solicita y retorna el rut.
	public int getRut() {
		return rut;
	}

	// Establece el requerimiento para asignar un valor al rut(sin digito
	// verificador) y en caso de no cumplirse retorna un mensaje de error.
	public void setRut(int rut) {
		if (rut < 99999999) {
			this.rut = rut;
		} else {
			System.out.println("Rut invalido. Por favor ingrese rut sin digito verificador.");
		}
	}

	// Solicita y retorna el nombre.
	public String getNombre() {
		return nombre;
	}

	// Establece el valor de nombre.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Solicita y retorna el apellido.
	public String getApellidos() {
		return apellidos;
	}

	// Establece el valor de apellido.
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// Solicita y retorna el telefono.
	public int getTelefono() {
		return telefono;
	}

	// Establece el valor de telefono.
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	// Solicita y retorna la afp.
	public String getAfp() {
		return afp;
	}

	// Establece el valor de afp.
	public void setAfp(String afp) {
		this.afp = afp;
	}

	// Solicita y retorna el sistema de salud.
	public int getSistemaSalud() {
		return sistemaSalud;
	}

	// Establece el requerimiento para asignar un valor a sistemaSalud(el valor
	// ingresado debe ser 1 o 2) y si no se cumple, retorna un mensaje de error.
	public void setSistemaSalud(int sistemaSalud) {
		if (sistemaSalud == 1 || sistemaSalud == 2) {
			this.sistemaSalud = sistemaSalud;
		} else {
			System.out.println("Valor incorrecto. Por favor ingrese 1 o 2.");
		}
	}

	// Solicita y retorna el valor de direccion.
	public String getDireccion() {
		return direccion;
	}

	// Establece el valor de direccion.
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// Solicita y retorna el valor de comuna.
	public String getComuna() {
		return comuna;
	}

	// Establece el valor de comuna.
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	// Solicita y retorna el valor de edad.
	public int getEdad() {
		return edad;
	}

	// Establece el valor de edad.
	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Metodo toString.
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", edad=" + edad + "]";
	}

}
