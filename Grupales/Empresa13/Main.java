// Version 1.0 
//@ Autores: Jose, Fernanda y Benjamin

package prevencion;

public class Main {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();// Se llama a la clase cliente. 
		Usuario usuario = new Usuario();// Se llama a la clase usuario.
		Capacitacion capacitacion = new Capacitacion();// Se llama a la clase capacitacion.
		usuario.toString();// Imprime usuario con el metodo toString.
		cliente.toString();// Imprime cliente con el metodo toString.
		capacitacion.toString();// Imprime capacitacion con el metodo toString.

		// Se le asignan valores a los parametros de cliente.
		cliente.setRut(19098394);
		cliente.setNombre("Robert");
		cliente.setApellidos("Manfl");
		cliente.setTelefono(90909090);
		cliente.setAfp("ProVida");
		cliente.setSistemaSalud(1);
		cliente.setDireccion("Las lilas 3030");
		cliente.setComuna("Valparaiso");
		cliente.setEdad(33);

		// Se le asignan valores a los parametros de usuario.
		usuario.setNombre("Benja");
		usuario.setFechaNacimiento(01/01/97);
		usuario.setRut(19525324);

		// Se le asignan valores a los parametros de capacitacion.
		capacitacion.setIdCapacitacion(1);
		capacitacion.setRutCliente(19283949);
		capacitacion.setDia(13 - 02 - 23);
		capacitacion.setHora(1630);
		capacitacion.setLugar("Providencia");
		capacitacion.setDuracion(90);
		capacitacion.setCantAsistentes(150);

		// Solicita los valores de cliente.
		cliente.getRut();
		cliente.getNombre();
		cliente.getApellidos();
		cliente.getTelefono();
		cliente.getAfp();
		cliente.getSistemaSalud();
		cliente.getDireccion();
		cliente.getComuna();
		cliente.getEdad();

		// Solicita los valores de usuario.
		usuario.getNombre();
		usuario.getRut();
		usuario.getFechaNacimiento();

		// Solicita los valores de capacitacion.
		capacitacion.getIdCapacitacion();
		capacitacion.getRutCliente();
		capacitacion.getDia();
		capacitacion.getHora();
		capacitacion.getLugar();
		capacitacion.getDuracion();
		capacitacion.getCantAsistentes();
		
		// Imprime los valores de cliente, usuario y capacitacion.
		System.out.println(cliente);
		System.out.println(usuario);
		System.out.println(capacitacion);
	}

}
