package DTOs;

import alumnos.material.dao.Alumnos;
import alumnos.material.dao.Ordenador;

/*
 * Clase que implementa los metodos de nuestra 
 * interfaz aDao para pasar de DTO a DAO
 * @author Jmenabc
 */
public class ADaoImpl implements ADaoService{
	//metodo para pasar nuestro alumnoDTO a alumnoDAO
	public Alumnos alumnoDToToDAo(AlumnosDTO al) {
		Alumnos alumno = new Alumnos();
		if (al != null) {
			alumno.setNombreAlumno(al.getNombreAlumno());
			alumno.setNumeroAlumno(al.getNumeroAlumno());
			alumno.setTelefonoAlumno(al.getTelefonoAlumno());
			alumno.setPc(al.getPc());
		}
		return alumno;
	}
	
	//metodo para pasar nuestro OrdenadorDTO a OrdenadorDAO

	public Ordenador ordenadorDToToDAo(OrdenadorDTO pcDTo) {
		Ordenador pc = new Ordenador();
		if (pcDTo != null) {
			pc.setIdentificador(pcDTo.getIdentificador());
			pc.setMarca(pcDTo.getMarca());
			pc.setModelo(pcDTo.getModelo());
			pc.setAl(pcDTo.getAl());
		}
		return pc;
	}

}
