package sprint;

public class VisitaTerreno {
	
	static int idTerreno;
	int rutCliente;
	String fecha;
	String hora;
	String lugar;
	String comentarios;
	
	public VisitaTerreno(int idTerreno, int run, String fecha, String hora,
			String lugar, String comentarios) {
		VisitaTerreno.idTerreno = idTerreno;
		Cliente.run = run;
		this.fecha = fecha;
		this.hora = hora; 
		this.lugar = lugar;
		this.comentarios = comentarios;
		
	}

	public int getIdTerreno() {
		return idTerreno;
	}

	public void setIdTerreno(int idTerreno) {
		VisitaTerreno.idTerreno = idTerreno;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

}
