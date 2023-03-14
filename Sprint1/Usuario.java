package sprint;

import java.text.SimpleDateFormat;

public class Usuario implements Asesoria {
	String nombre;
	String fechaNacimiento;
	static int run;
	
	public Usuario(String nombre, String fechaNacimiento, int run) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		Usuario.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() > 10 && nombre.length() <= 50) {
		this.nombre = nombre;
		} else {
			System.out.println("Ingrese un nombre de mas de 10 caracteres y menos de 50 caracteres");
		}
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

    public void setRut(int run) {
        if (run < 99999999) {
            Usuario.run = run;
        } else {
            System.out.println("Rut invalido. Por favor ingrese rut sin digito verificador.");
        }
    }
    
    public String mostrarEdad(){
        return "El Usuario " + nombre + " tiene:  " + Cliente.getEdad() + " años";
    }

    public String fechaNacimiento() {
    	return (new SimpleDateFormat("dd/MMyyyy").format(fechaNacimiento));
    }
    
	@Override
	public String analizarUsuario() {
		return "\nNombre Usuario: " + nombre + "\nFecha de nacimiento: " + fechaNacimiento()
				+ "\nRut: " + run;
		
	}
	
}
