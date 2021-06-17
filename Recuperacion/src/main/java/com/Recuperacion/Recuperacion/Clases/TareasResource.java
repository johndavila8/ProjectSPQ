package com.Recuperacion.Recuperacion.Clases;

import java.util.List;

import javax.jdo.*;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@Path("tareas")

public class TareasResource {
	
	@POST  
	@Path("daralta")
	@Consumes(MediaType.APPLICATION_JSON)
	public void darDeAltaNuevaTarea(Tarea tarea) {

		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();

			pm.makePersistent(tarea);

			tx.commit();

		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}
	
	@GET
	@Path("fechaorden")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tarea> ordenPorFecha() {
		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		tx.begin();

		Query<Tarea> query = pm.newQuery("javax.jdo.query.SQL", "select * from tarea order by fecha desc");
		query.setClass(Tarea.class);
		List<Tarea> results = query.executeList();

		tx.commit();
		pm.close();
		return results;

	}

	
}
