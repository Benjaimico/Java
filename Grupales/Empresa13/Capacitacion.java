// Version 1.0

package prevencion;

// Clase Capacitacion y se definen los parametros(idCapacitacion, rutCliente, dia, hora, lugar, duracion y cantAsistentes).
public class Capacitacion {

	private int idCapacitacion;
	private int rutCliente;
	private int dia;
	private int hora;
	private String lugar;
	private int duracion;
	private int cantAsistentes;

// Constructor sin parametros
	public Capacitacion() {

	}

// Constructor con todos los parametros.
	public Capacitacion(int idCapacitacion, int rutCliente, int dia, int hora, String lugar, int duracion,
			int cantAsistentes) {

		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
	}

// Establece el valor de idCapacitacion.
	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

// Solicita y retorna el valor de idCapacitacion.
	public int getIdCapacitacion() {
		return idCapacitacion;
	}

// Solicita y retona el valor de rutCliente
	public int getRutCliente() {
		return rutCliente;
	}

// Establece el valor de rutCliente.
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

// Solicita y retorna el valor de dia.
	public int getDia() {
		return dia;
	}

// Establece el valor de dia.
	public void setDia(int dia) {
		this.dia = dia;
	}

// Solicita y retorna el valor de hora.
	public int getHora() {
		return hora;
	}

// Establece el valor de hora.
	public void setHora(int hora) {
		this.hora = hora;
	}

// Solicita y retorna el valor de lugar.
	public String getLugar() {
		return lugar;
	}

// Establece el valor de lugar.
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

// Solicita y retorna el valor de duracion.
	public int getDuracion() {
		return duracion;
	}

// Establece el valor de duracion.
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

// Solicita y retorna el valor de cantAsistentes.
	public int getCantAsistentes() {
		return cantAsistentes;
	}

// Establece el valor de cantAsistentes.
	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}

// Metodo toString()
	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsistentes="
				+ cantAsistentes + "]";
	}

}
