package sprint;

public class Administrativo extends Usuario {

	String area;
	String expPrevia;

	public Administrativo(String nombre, String fechaNacimiento, int run, String area, String expPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.expPrevia = expPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		if (area.length() > 5 && area.length() <= 20) {
			this.area = area;
		} else {
			System.out.println("Ingrese un area valida");
		}
	}

	public String getExpPrevia() {
		return expPrevia;
	}

	public void setExpPrevia(String expPrevia) {
		if (expPrevia.length() <= 100) {
			this.expPrevia = expPrevia;
		}
	}

	@Override

	public String analizarUsuario() {
		return "\nNombre Usuario: " + nombre + "\nFecha de nacimiento: " + fechaNacimiento + "\nRut: " + run
				+ "\nArea: " + area + "\nExperiencia previa: " + expPrevia;

	}
}
