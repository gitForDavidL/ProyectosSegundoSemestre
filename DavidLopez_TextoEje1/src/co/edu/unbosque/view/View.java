package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	private String nombre = new String();


	public String pedirDato() {
		return (JOptionPane.showInputDialog(null, "Ingrese un dato", "Titulo del InputDialog",
				JOptionPane.INFORMATION_MESSAGE));
	}

	public void escribirDato(String dato) {
		JOptionPane.showMessageDialog(null, dato, nombre, JOptionPane.INFORMATION_MESSAGE);
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

}
