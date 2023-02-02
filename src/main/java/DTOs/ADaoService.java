package DTOs;

import alumnos.material.dao.Alumnos;
import alumnos.material.dao.Ordenador;

/*
 * Interfaz que contiene los metodos para pasar de DTO
 * a DAO
 * @author Jmenabc
 */

public interface ADaoService {

	public Alumnos alumnoDToToDAo(AlumnosDTO al);
	
	public Ordenador ordenadorDToToDAo (OrdenadorDTO pcDTo);
	
}
