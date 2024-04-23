package examen;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import examen.controladores.ControladorUsuarios;
import examen.entidades.Usuario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionContratos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfId;
	private JTextField jtfDescripcion;
	private JTextField jtfSaldo;
	private JTextField jtfLimite;
	private JTextField jtfFecha;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private JComboBox<Usuario> jcbUsuarios; 
	private JRadioButton rbtnCuentaBancaria;
	private JRadioButton rbtnTarjetaCredito;
	private JRadioButton rbtnTarjetaDebito;
	private JRadioButton rbtnPrestamo;
	/**
	 * Create the panel.
	 */
	public GestionContratos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Gestion de contratos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfId = new JTextField();
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 3;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 2;
		gbc_jtfId.gridy = 1;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		rbtnCuentaBancaria = new JRadioButton("Cuenta Bancaria");
		GridBagConstraints gbc_rbtnCuentaBancaria = new GridBagConstraints();
		gbc_rbtnCuentaBancaria.insets = new Insets(0, 0, 5, 5);
		gbc_rbtnCuentaBancaria.gridx = 2;
		gbc_rbtnCuentaBancaria.gridy = 2;
		add(rbtnCuentaBancaria, gbc_rbtnCuentaBancaria);
		
		rbtnTarjetaCredito = new JRadioButton("Tarjeta de crédito");
		GridBagConstraints gbc_rbtnTarjetaCredito = new GridBagConstraints();
		gbc_rbtnTarjetaCredito.insets = new Insets(0, 0, 5, 5);
		gbc_rbtnTarjetaCredito.gridx = 3;
		gbc_rbtnTarjetaCredito.gridy = 2;
		add(rbtnTarjetaCredito, gbc_rbtnTarjetaCredito);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo contrato:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 3;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		rbtnTarjetaDebito = new JRadioButton("Tarjeta de débito");
		GridBagConstraints gbc_rbtnTarjetaDebito = new GridBagConstraints();
		gbc_rbtnTarjetaDebito.insets = new Insets(0, 0, 5, 5);
		gbc_rbtnTarjetaDebito.gridx = 2;
		gbc_rbtnTarjetaDebito.gridy = 3;
		add(rbtnTarjetaDebito, gbc_rbtnTarjetaDebito);
		
		rbtnPrestamo = new JRadioButton("Préstamo");
		GridBagConstraints gbc_rbtnPrestamo = new GridBagConstraints();
		gbc_rbtnPrestamo.insets = new Insets(0, 0, 5, 5);
		gbc_rbtnPrestamo.gridx = 3;
		gbc_rbtnPrestamo.gridy = 3;
		add(rbtnPrestamo, gbc_rbtnPrestamo);
		
		JLabel lblNewLabel_5 = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 5;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfDescripcion = new JTextField();
		GridBagConstraints gbc_jtfDescripcion = new GridBagConstraints();
		gbc_jtfDescripcion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDescripcion.gridwidth = 3;
		gbc_jtfDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDescripcion.gridx = 2;
		gbc_jtfDescripcion.gridy = 5;
		add(jtfDescripcion, gbc_jtfDescripcion);
		jtfDescripcion.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Usuario");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 6;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jcbUsuarios = new JComboBox<Usuario>();
		GridBagConstraints gbc_jcbUsuarios = new GridBagConstraints();
		gbc_jcbUsuarios.gridwidth = 2;
		gbc_jcbUsuarios.insets = new Insets(0, 0, 5, 5);
		gbc_jcbUsuarios.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbUsuarios.gridx = 2;
		gbc_jcbUsuarios.gridy = 6;
		add(jcbUsuarios, gbc_jcbUsuarios);
		
		JButton btnNewButton = new JButton("Gestionar usuario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel GestionUsuarios=new GestionUsuarios();
				swing_Utils.JDialoPanel.jDialogPanel(GestionUsuarios,"Gestor de usuario");
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 6;
		add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Saldo(€):");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 7;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		jtfSaldo = new JTextField();
		GridBagConstraints gbc_jtfSaldo = new GridBagConstraints();
		gbc_jtfSaldo.gridwidth = 3;
		gbc_jtfSaldo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfSaldo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfSaldo.gridx = 2;
		gbc_jtfSaldo.gridy = 7;
		add(jtfSaldo, gbc_jtfSaldo);
		jtfSaldo.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Límite(€):");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 8;
		add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		jtfLimite = new JTextField();
		GridBagConstraints gbc_jtfLimite = new GridBagConstraints();
		gbc_jtfLimite.gridwidth = 3;
		gbc_jtfLimite.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLimite.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLimite.gridx = 2;
		gbc_jtfLimite.gridy = 8;
		add(jtfLimite, gbc_jtfLimite);
		jtfLimite.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Fecha firma:");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 9;
		add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		jtfFecha = new JTextField();
		GridBagConstraints gbc_jtfFecha = new GridBagConstraints();
		gbc_jtfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFecha.gridwidth = 3;
		gbc_jtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFecha.gridx = 2;
		gbc_jtfFecha.gridy = 9;
		add(jtfFecha, gbc_jtfFecha);
		jtfFecha.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridwidth = 2;
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 2;
		gbc_btnGuardar.gridy = 10;
		add(btnGuardar, gbc_btnGuardar);

		cargarUsuarios();
	}

	private void cargarUsuarios() {
		List<Usuario>l=ControladorUsuarios.getInstance().getAll();
		for (Usuario usuario : l) {
			jcbUsuarios.addItem(usuario);
		}
	}
	
	
}
