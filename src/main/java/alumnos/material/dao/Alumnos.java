package alumnos.material.dao;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * Clase de nuestra tabla de alumnos
 * Esta tabla contendra el numero de telefono del alumno, su numero y su nombre
 * @author Jmenabc
 */

@Entity
@Table(name = "eva_tch_alumnos", schema = "bd_gestor_material_alumnos")
public class Alumnos {

	// Atributos
	@Id
	@Column(name = "numero_alumno", unique = true, nullable = false)
	private long numeroAlumno;
	@Column(name = "nombre_alumno", nullable = false)
	private String nombreAlumno;
	@Column(name = "telefono_alumno", nullable = false)
	private String telefonoAlumno;
	@OneToOne
	Ordenador pc;

	public Alumnos(long numeroAlumno, String nombreAlumno, String telefonoAlumno,Ordenador pc) {
		super();
		this.numeroAlumno = numeroAlumno;
		this.nombreAlumno = nombreAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.pc = pc;
	}

	public Alumnos() {
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
		return "Alumnos [numeroAlumno=" + numeroAlumno + ", nombreAlumno=" + nombreAlumno + ", telefonoAlumno="
				+ telefonoAlumno + ", pc=" + pc.getIdentificador() + "]";
	}

}
