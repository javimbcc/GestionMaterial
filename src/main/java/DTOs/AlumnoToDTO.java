package DTOs;

import java.util.ArrayList;

import alumnos.material.dao.Alumnos;

/*
 * Clase que usaremos para recoger los datos de alumno y
 * de la lista que contiene todos los alumnos con los datos que queremos
 * @author Jmenabc
 */
public class AlumnoToDTO {

	public static AlumnosDTO alumnoToDto(Alumnos al) {
		AlumnosDTO alumDto = new AlumnosDTO(al.getNumeroAlumno(), al.getNombreAlumno(), al.getTelefonoAlumno(),al.getPc());
		return alumDto;
	}

	public static ArrayList<AlumnosDTO> alumnoListToDTO(ArrayList<Alumnos> al) {
		ArrayList<AlumnosDTO> listaDef = new ArrayList<AlumnosDTO>();
		for (Alumnos alssd : al) {
			listaDef.add(alumnoToDto(alssd));
		}
		return listaDef;
	}

}
