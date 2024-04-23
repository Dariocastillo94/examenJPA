package examen.controladores;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import examen.entidades.Usuario;

public class ControladorUsuarios extends SuperControlador{

	public ControladorUsuarios() {
		super("usuario", Usuario.class);
		// TODO Auto-generated constructor stub
	}
	private static ControladorUsuarios instance = null;

	public static ControladorUsuarios getInstance() {
		if (instance == null) {
			instance = new ControladorUsuarios();
		}
		return instance;
	}
	public List<Usuario> getAll() {

		EntityManager em = getEntityManager();
		Query q = em.createNativeQuery("SELECT * FROM usuario;", Usuario.class);

		return (List<Usuario>) q.getResultList();
	}
}
