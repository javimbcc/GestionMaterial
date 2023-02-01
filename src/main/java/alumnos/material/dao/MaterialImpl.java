package alumnos.material.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

/*
 * Implementacion de los metodos a usar para hacer las consultas
 * hql
 * @author Jmenabc
 */

@Component
public class MaterialImpl implements MaterialService {

	@PersistenceContext
	private EntityManager em;

	// Metodo patra crear la matricula de un alumno

	public void insertarMatriculaAlumno(Alumnos al) {
		try {
			em.persist(al);
		} catch (Exception e) {
			System.out.println("[MaterialImpl-insertarMatriculaAlumno]: " + e);
		}

	}

	// Metodo para eliminar la matricula de un alumno

	public void eliminarMatriculaAumno(long id) {
		try {
			String jpql = "DELETE FROM Alumnos alumno WHERE alumno.numeroAlumno = :idAl";
			Query query = em.createQuery(jpql);
			query.setParameter("idAl", id);
			int execute = query.executeUpdate();
			System.out.println(execute);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	// Metodo para dar de alta un pc

	public void insertarAltaOrdenador(Ordenador pc) {
		try {
			em.persist(pc);
		} catch (Exception e) {
			System.out.println("[MaterialImpl-insertarAltaOrdenador]: " + e);
		}

	}

	// Buscar ordenador conociendo el id del alumno

	public Ordenador buscaPcPorAlumno(long idAlumno) {
		try {
			String jpql = "SELECT al FROM Alumnos al WHERE al.numeroAlumno = :idAl";
			Query query = em.createQuery(jpql);
			query.setParameter("idAl", idAlumno);
			ArrayList<Alumnos> al = (ArrayList<Alumnos>) query.getResultList();
			Ordenador ordenador = al.get(0).pc;
			return ordenador;
		} catch(Exception e) {
			System.out.println("[MaterialImpl-buscaPcPorAlumno]: " + e);
		}
		return null;
	}

	// Buscar Alumno conociendo el identificador del pc

	public Alumnos buscaAlumnoPorPc(long idPc) {
		try {
			String jpql = "SELECT pc FROM Ordenador pc WHERE pc.identificador = :idPc";
			Query query = em.createQuery(jpql);
			query.setParameter("idPc", idPc);
			ArrayList<Ordenador> ordenadores = (ArrayList<Ordenador>) query.getResultList();
			Alumnos alum = ordenadores.get(0).al;
			return alum;
		} catch (Exception e) {
			System.out.println("[MaterialImpl-buscaAlumnoPorPc]: " + e);
		}
		return null;
	}

	// Listar todos los alumnos

	public ArrayList<Alumnos> alumnos() {
		try {
			String jpql = "SELECT al FROM Alumnos al";
			Query query = em.createQuery(jpql);
			ArrayList<Alumnos> listaAlumnos = (ArrayList<Alumnos>) query.getResultList();
			return listaAlumnos;
		} catch (Exception e) {
			System.out.println("[MaterialImpl-alumnos]: " + e);
		}
		return null;
	}

}
