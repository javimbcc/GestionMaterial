package DTOs;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import alumnos.material.dao.Ordenador;

public class AlumnosDTO {
	// Atributos
	private long numeroAlumno;
	private String nombreAlumno;
	private String telefonoAlumno;
	Ordenador pc;

	public AlumnosDTO(long numeroAlumno, String nombreAlumno, String telefonoAlumno, Ordenador pc) {
		super();
		this.numeroAlumno = numeroAlumno;
		this.nombreAlumno = nombreAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.pc = pc;
	}
	
	public AlumnosDTO(long numeroAlumno, String nombreAlumno, String telefonoAlumno) {
		super();
		this.numeroAlumno = numeroAlumno;
		this.nombreAlumno = nombreAlumno;
		this.telefonoAlumno = telefonoAlumno;
	}

	public AlumnosDTO() {
		super();
	}

	public long getNumeroAlumno() {
		return numeroAlumno;
	}

	public void setNumeroAlumno(long numeroAlumno) {
		this.numeroAlumno = numeroAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getTelefonoAlumno() {
		return telefonoAlumno;
	}

	public void setTelefonoAlumno(String telefonoAlumno) {
		this.telefonoAlumno = telefonoAlumno;
	}

	public Ordenador getPc() {
		return pc;
	}

	public void setPc(Ordenador pc) {
		this.pc = pc;
	}

	@Override
	public String toString() {
		return "AlumnosDTO [numeroAlumno=" + numeroAlumno + ", nombreAlumno=" + nombreAlumno + ", telefonoAlumno="
				+ telefonoAlumno + ", pc=" + pc + "]";
	}

}
