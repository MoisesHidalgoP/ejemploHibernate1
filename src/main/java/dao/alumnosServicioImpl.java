package dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class alumnosServicioImpl implements alumnosServicio {

	@PersistenceContext
	private EntityManager em;


	public void insertarAlumno(alumnos Alumnos) {
		em.persist(Alumnos);
		
	}


	public List<alumnos> buscarTodos() {
		return em.createQuery("SELECT alumno FROM alumnos alumno").getResultList();
	}

}
