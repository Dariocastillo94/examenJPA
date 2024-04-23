package examen;

import java.text.SimpleDateFormat;
import java.util.List;

import examen.controladores.ControladorContrato;
import examen.entidades.Contrato;



public class DatosTabla {
	/** 
	 * 
	 * @return
	 */
	public static String[] getTitulosColumnas() {
		return new String[] {"Id", "Descripcion", "Saldo", "limite", "idTipoContrato", "idUsuario", "fechaFirma"};
	}

	/**
	 * 
	 * @return
	 */
	public static Object[][] getDatosDeTabla() {
		// Obtengo todas las personas
		List<Contrato> personas = ControladorContrato.getInstance().getAll();
		// Preparo una estructura para pasar al constructor de la JTable
		Object[][] datos = new Object[personas.size()][8];
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Cargo los datos de la lista de personas en la matriz de los datos
		for (int i = 0; i < personas.size(); i++) {
			 Contrato contrato = personas.get(i);
			datos[i][0] = contrato.getId();
			datos[i][1] = contrato.getDescripcion();
			datos[i][2] = contrato.getSaldo();
			datos[i][3] = contrato.getLimite();
			datos[i][4] = contrato.getIdTipocContrato();
			datos[i][5] = contrato.getIdUsuario();
			datos[i][6] = contrato.getFechaFirma();		
		
			
		}
		
		return datos;
	}
}
