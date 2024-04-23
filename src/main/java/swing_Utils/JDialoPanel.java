package swing_Utils;

import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class JDialoPanel {

	
	public static void jDialogPanel(JPanel p, String tituloVentana) {
		JDialog jd = new JDialog();
		
		jd.setTitle(tituloVentana);
		jd.setContentPane(p);
		jd.pack();
		//No se puede hacer click en la ventana principal hasta que se cierre
		jd.setModal(true);
		// el dialogo aparecera en el centro de la pantalla
		jd.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - jd.getWidth()/2,
		(Toolkit.getDefaultToolkit().getScreenSize().height)/2 -jd.getHeight()/2);
		jd.setVisible(true);
	}
}
