package alumnos.material.dao;

import java.util.ArrayList;

/*
 * Interfaz que contiene la signatura de los metodos a usar 
 * @author Jmenabc
 */
public interface MaterialService {
	
	public void insertarMatriculaAlumno(Alumnos al);
	
	public void insertarAltaOrdenador(Ordenador pc);
	
	public void eliminarMatriculaAumno(long id);
	
	public Ordenador buscaPcPorAlumno(long idAlumno);
	
	public Alumnos buscaAlumnoPorPc(long idPc);
	
	public ArrayList<Alumnos> alumnos();
	
}
