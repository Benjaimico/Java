package sprint;

public class Profesional extends Usuario {
	String titulo;
	String fechaIngreso;

	public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo.length() > 10 && titulo.length() <= 50) {
		this.titulo = titulo;
		}else {
			System.out.println("Ingrese un titulo valido");
		}
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override

	public String analizarUsuario() {
		return "\nNombre Usuario: " + nombre + "\nFecha de nacimiento: " + fechaNacimiento + "\nRut: " + run
				+ "\nTitulo: " + titulo + "\nFecha de ingreso: " + fechaIngreso;
	
	}
}
