package alumnos.material.impl;

import java.util.ArrayList;

/*
 * Clase que contiene las transacciones a nuestra base de datos
 * @author Jmenabc
 */
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import alumnos.material.dao.Alumnos;
import alumnos.material.dao.MaterialImpl;
import alumnos.material.dao.Ordenador;

@Component
public class ConsultasPostgre {

	@Autowired
	private MaterialImpl impl;

	// Insertar Alumno
	@Transactional
	public void insertarMatriculaAlumno(Alumnos eva) {
		impl.insertarMatriculaAlumno(eva);
	}

	// Baja de Alumno

	@Transactional
	public void deleteAlumno(long id) {
		impl.eliminarMatriculaAumno(id);
	}

	// Insertar pc

	@Transactional
	public void insertarAltaOrdenador(Ordenador eva) {
		impl.insertarAltaOrdenador(eva);
	}
	
	//Buscar ordenador por id de alumno
	
	@Transactional
	public Ordenador buscarPcPorIdDeAlumno(long idAlumno) {
		return impl.buscaPcPorAlumno(idAlumno);
	}

	//Buscar alumno por id de portatil
	
	@Transactional
	public Alumnos buscarAlumnoPorIdDePortatil(long pc) {
		return impl.buscaAlumnoPorPc(pc);
	}
	
	//Listar todos los alumnos
	
	@Transactional
	public ArrayList<Alumnos> listarTodosLosAlumnos() {
		return impl.alumnos();
	}
}
