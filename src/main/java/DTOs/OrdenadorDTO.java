package DTOs;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import alumnos.material.dao.Alumnos;

/*
 * Clase que usaremos para recoger los valores que nos interesan 
 * para mostrarlos por pantalla
 * @author Jmenabc
 */
public class OrdenadorDTO {
	// Atributos
	private long identificador;
	private String marca;
	private String modelo;
	Alumnos al;

	// Constructor

	public OrdenadorDTO(long identificador, String marca, String modelo, Alumnos al) {
		super();
		this.identificador = identificador;
		this.marca = marca;
		this.modelo = modelo;
		this.al = al;
	}
	
	public OrdenadorDTO(long identificador, String marca, String modelo) {
		super();
		this.identificador = identificador;
		this.marca = marca;
		this.modelo = modelo;
	}

	// Getters y Setters

	public long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Alumnos getAl() {
		return al;
	}

	public void setAl(Alumnos al) {
		this.al = al;
	}

	// toString

	@Override
	public String toString() {
		return "OrdenadorDTO [identificador=" + identificador + ", marca=" + marca + ", modelo=" + modelo + ", al=" + al
				+ "]";
	}

}
