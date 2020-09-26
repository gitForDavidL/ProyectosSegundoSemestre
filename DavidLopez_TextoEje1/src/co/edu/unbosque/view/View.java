package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {


	public String pedirDato() {
		return (JOptionPane.showInputDialog(null, "Ingrese un dato", "Titulo del InputDialog",
				JOptionPane.INFORMATION_MESSAGE));
	}

	public void escribirDato(String dato) {
		JOptionPane.showMessageDialog(null, dato, "Base de datos", JOptionPane.INFORMATION_MESSAGE);
	}

}
