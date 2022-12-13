package controlador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import consultas.consultas;
import dao.alumnos;


@Controller
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
		consultas consulta = (consultas) context.getBean(consultas.class);
		consulta.insertarUnAlumno(new alumnos("Moises","Hidalgo",23));
		System.out.println("Lista alumnos: " + consulta.buscarTodosAlumnos());
	    

	}

}
