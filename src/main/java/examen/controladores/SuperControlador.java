package examen.controladores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import examen.entidades.Entidad;

public class SuperControlador {

	private static EntityManager em = null;
	private String nombreTabla = "";
	private Class tipoEntidad;

	public SuperControlador(String nombreTabla, Class tipoEntidad) {
		this.nombreTabla = nombreTabla;
		this.tipoEntidad = tipoEntidad;
	}

	protected EntityManager getEntityManager() {
		if (em == null) {
			em = Persistence.createEntityManagerFactory("bankonter").createEntityManager();
		}
		return em;
	}

	public List<? extends Entidad> findAll() {

		Query q = getEntityManager().createNativeQuery("SELECT * FROM " + this.nombreTabla, this.tipoEntidad);

		return (List<Entidad>) q.getResultList();

	}
}
