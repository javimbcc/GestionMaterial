package DTOs;

import java.util.ArrayList;

import alumnos.material.dao.Alumnos;

public class AlumnoToDTO {

	public static AlumnosDTO alumnoToDto(Alumnos al) {
		AlumnosDTO alumDto = new AlumnosDTO(al.getNumeroAlumno(), al.getNombreAlumno(), al.getTelefonoAlumno());
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
