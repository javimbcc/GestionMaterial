package alumnos.material.controladores;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import DTOs.AlumnoToDTO;
import DTOs.AlumnosDTO;
import DTOs.OrdenadorDTO;
import DTOs.OrdenadorToDTO;
import alumnos.material.dao.Alumnos;
import alumnos.material.dao.Ordenador;
import alumnos.material.impl.ConsultasPostgre;

@Controller
public class App {

	public static void main(String[] args) {

		// Cogemos el contexto de nuestro bean.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		// Creamos una instancia de ConsultasPostgre para poder ejecutar las consultas
		ConsultasPostgre pg = (ConsultasPostgre) context.getBean(ConsultasPostgre.class);
		// Declaramos una instancia para hacer una prueba
		Ordenador pcEjemplo = new Ordenador(2, "HP Pavilion", "b332321");
		Alumnos al = new Alumnos(2, "Javier Mena-Bernal Carranza", "601496752", pcEjemplo);
		// Declaramos el escaner para leer valores por consola
		Scanner escaner = new Scanner(System.in);
		// Declaramos las variables que usaremos para dar valores en el menu

		System.out.println("==========================");
		System.out.println("Menu");
		System.out.println("==========================");
		System.out.println("1.-Matricular alumno");
		System.out.println("2.-Dar de baja a Alumno");
		System.out.println("3.-Alta de portatil");
		System.out.println("4.-Consulta portátil asignado a un alumno");
		System.out.println("5.-Consulta alumno asignado a un portátil");
		System.out.println("6.-Ver todos los alumnos con su asignación de portátil.");

		// Opciones del menu
		int opcion1 = escaner.nextInt();

		switch (opcion1) {
		case 1:
			System.out.println("Dando de alta a alumno");
			// DAR DE ALTA A ALUMNOS
			pg.insertarMatriculaAlumno(al);
			break;
		case 2:
			System.out.println("Dando de baja a alumno seleccionado");
			// DAR DE BAJA A ALUMNOS
			pg.deleteAlumno(1);
			break;
		case 3:
			System.out.println("Dando de alta portatil");
			// AÑADIR ORDENADORES
			pg.insertarAltaOrdenador(pcEjemplo);
			break;
		case 4:
			System.out.println("Consultando el portatil con el id del alumno");
			OrdenadorDTO pcDTO = OrdenadorToDTO.ordenadorToDto(pg.buscarPcPorIdDeAlumno(3));
			System.out.println(pcDTO.getIdentificador() + pcDTO.getMarca() + pcDTO.getModelo());
			break;
		case 5:
			System.out.println("Consulta alumno asignado a un portátil");
			// BUSCAR NOMBRE DE ALUMNO TENIENDO EL IDENTIFICADOR DEL PC
			AlumnosDTO alum = AlumnoToDTO.alumnoToDto(pg.buscarAlumnoPorIdDePortatil(2));
			System.out.println(alum.getNombreAlumno());
			break;
		case 6:
			System.out.println("Consultando todos los alumnos con su identificador de portatil");
			// Lista de alumnos
			ArrayList<AlumnosDTO> alumnosLista = AlumnoToDTO.alumnoListToDTO(pg.listarTodosLosAlumnos());
			for (AlumnosDTO alim : alumnosLista) {
				System.out.println(alim.getPc());
			}
			break;
		case 7:

			break;

		}

	}

}
