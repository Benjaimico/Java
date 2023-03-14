package sprint;

public class Revision {
	int idRevision;
	int idTerreno;
	String nombreRev;
	char estado;

	public Revision(int idRevision, int idTerreno, String nombreRev, char estado) {
		this.idRevision = idRevision;
		VisitaTerreno.idTerreno = idTerreno;
		this.nombreRev = nombreRev;
		this.estado = estado;
	}

	public int getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	public int getIdTerreno() {
		return idTerreno;
	}

	public void setIdTerreno(int idTerreno) {
		this.idTerreno = idTerreno;
	}

	public String getNombreRev() {
		return nombreRev;
	}

	public void setNombreRev(String nombreRev) {
		this.nombreRev = nombreRev;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

}
