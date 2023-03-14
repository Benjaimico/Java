package sprint;

public class Cliente extends Usuario {

	String nombres;
	String apellidos;
	Integer telefono;
	String afp;
	char sistSalud;
	String direccion;
	String comuna;
	static int edad;

	public Cliente(String nombre, String fechaNacimiento, int run, String nombres, String apellidos, Integer telefono,
			String afp, char sistSalud, String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, run);
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistSalud = sistSalud;
		this.direccion = direccion;
		Cliente.edad = edad;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		if (nombres.length() > 5 && nombres.length() <= 30) {
			this.nombres = nombres;
		}else {
			System.out.println("Ingrese sus nombres");
		}
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if (apellidos.length() > 5 && apellidos.length() <= 30) {
			this.apellidos = apellidos;
		}else {
			System.out.println("Ingrese sus apellidos.");
		}
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		if (telefono == null) {
			System.out.println("Ingrese un numero de telefono");
		} else {
			this.telefono = telefono;
		}
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		if (afp.length() > 4 && afp.length() <= 30)
			this.afp = afp;
	}

	public char getSistSalud() {
		return sistSalud;
	}

	public void setSistSalud(char sistSalud) {
		this.sistSalud = sistSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		if(direccion.length() <= 50) {
		this.direccion = direccion;
		}
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public static int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad >= 0 && edad <=150) {
		Cliente.edad = edad;
		}else {
			System.out.println("Ingrese una edad valida");
		}
	}

	public String obtenerNombre() {
		return nombres + " " + apellidos;
	}

	public void obtenerSistemaSalud() {
		if (sistSalud == 1) {
			System.out.println("Fonasa");
		} else if (sistSalud == 2) {
			System.out.println("Isapre");
		} else {
			System.out.println("Ingrese un valor valido");
		}
	}

	@Override

	public String analizarUsuario() {
		return "\nNombre Usuario: " + nombre + "\nFecha de nacimiento: " + fechaNacimiento + "\nRut: " + run
				+ "\nDireccion: " + direccion + "\nComuna: " + comuna;
	}

}
