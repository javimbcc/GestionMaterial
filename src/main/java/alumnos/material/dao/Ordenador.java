package alumnos.material.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordenadores", schema = "bd_gestor_material_alumnos")
public class Ordenador {
	// Atributos
	@Id
	@Column(name = "identificador_pc", unique = true, nullable = false)
	private long identificador;
	@Column(name = "marca_pc", nullable = false)
	private String marca;
	@Column(name = "modelo_pc", nullable = false)
	private String modelo;
	@OneToOne(mappedBy = "pc")
	Alumnos al;

	public Ordenador(long identificador, String marca, String modelo) {
		super();
		this.identificador = identificador;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Ordenador() {
		super();
	}

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

	@Override
	public String toString() {
		return "Ordenador [identificador=" + identificador + ", marca=" + marca + ", modelo=" + modelo + ", al=" + al
				+ "]";
	}

}
