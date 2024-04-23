package examen;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import examen.DatosTabla;
import examen.controladores.ControladorContrato;
import examen.entidades.Contrato;


public class Tabla extends JPanel {


	private static final long serialVersionUID = 1L;
	protected Object datosTabla[][] = DatosTabla.getDatosDeTabla();
	/**
	 * Create the panel.
	 */
	public Tabla() {

		//Creo un objeto JTable con el constructor m�s sencillo del que dispone
				JTable table = new JTable(DatosTabla.getDatosDeTabla(), 
						DatosTabla.getTitulosColumnas());
				//Creamos un JscrollPane y le agregamos la JTable
				JScrollPane scrollPane = new JScrollPane(table);
				
				// Accedo a los clics realizados sobre la tabla
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						super.mouseClicked(e);
						int indiceFilaSel = table.getSelectedRow();
						Object value= DatosTabla.getDatosDeTabla()[indiceFilaSel][0];
						Contrato contratoSelec = ControladorContrato.getInstance().getContrato((Integer)value);
						ControladorContrato.getInstance().mostrarContrato(contratoSelec);
						
					}
				});
				
				//Agregamos el JScrollPane al contenedor
				this.setLayout(new BorderLayout());
				this.add(new JTextArea("JTable construida sin TableModel. Muy fácil de crear pero con limitaciones. Siempre editable.\n"
						+ "No podemos realizar cambios como incorporar, eliminar o modificar líneas.\n"
						+ "Prácticamente no podemos configurar casi nada, ni crear renderizadores específicos para celdas concretas"), BorderLayout.NORTH);
				this.add(scrollPane, BorderLayout.CENTER);
	}

}
