package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Sonido;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private View gui;
	private Sonido sonido;

	public Controller() {

		gui = new View(this);

		gui.setVisible(true);
		sonido = new Sonido();
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.contentEquals(gui.getPanelReproducir().PLAY)) {
			try {
				int cont = 0;
				sonido.abrirFichero();
				sonido.Play();
	
				
				
			} catch (Exception e1) {

				e1.printStackTrace();
			}

		} else if (command.contentEquals(gui.getPanelReproducir().STOP)) {
			try {
				sonido.Pausa();
			} catch (Exception e1) {

				e1.printStackTrace();
			}
		}

	}

}
