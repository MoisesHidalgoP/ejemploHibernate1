package consultas;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.alumnos;
import dao.alumnosServicioImpl;


@Component
public class consultas {
	
	@Autowired
	private alumnosServicioImpl aimpl;
	
	@Transactional
	public void insertarUnAlumno(alumnos Alumnos) {
		aimpl.insertarAlumno(Alumnos);
	}
	
	@Transactional
	public void insertarListaAlumnos(Collection<alumnos> colAlumnos) {
		for (alumnos Alumnos : colAlumnos) {
			aimpl.insertarAlumno(Alumnos);
		}
	}
	
	@Transactional
	public List<alumnos>buscarTodosAlumnos(){
		return aimpl.buscarTodos();
	}

}
