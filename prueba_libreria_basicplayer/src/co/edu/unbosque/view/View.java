package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private PanelReproducir panelReproducir;

	private static final long serialVersionUID = 1L;

	public View(Controller control) {

		setSize(300, 300);
		setResizable(false);
		setTitle("Título de la Ventana Principal MVC");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		inicializarComponentes();

		panelReproducir.getRepro().addActionListener(control);
		panelReproducir.getDetener().addActionListener(control);

	}

	private void inicializarComponentes() {
		panelReproducir = new PanelReproducir();
		add(panelReproducir, BorderLayout.CENTER);

	}

	public PanelReproducir getPanelReproducir() {
		return panelReproducir;
	}

	public void setPanelReproducir(PanelReproducir panelReproducir) {
		this.panelReproducir = panelReproducir;
	}

}
