package examen.controladores;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import examen.entidades.Contrato;

public class ControladorContrato extends SuperControlador{

	public ControladorContrato() {
		super("contrato", Contrato.class);
		// TODO Auto-generated constructor stub
	}
	private static ControladorContrato instance = null;

	public static ControladorContrato getInstance() {
		if (instance == null) {
			instance = new ControladorContrato();
		}
		return instance;
	}
	public List<Contrato> getAll() {

		EntityManager em = getEntityManager();
		Query q = em.createNativeQuery("SELECT * FROM contrato;", Contrato.class);

		return (List<Contrato>) q.getResultList();
	}
	public Contrato getContrato(int idContrato) {
		return(Contrato)getEntityManager().createNativeQuery("select*from contrato where"
				+ " id="+idContrato,Contrato.class);
	}
	public void mostrarContrato(Contrato c) {
		
	}
}
