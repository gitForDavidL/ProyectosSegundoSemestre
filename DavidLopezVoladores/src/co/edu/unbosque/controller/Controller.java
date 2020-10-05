package co.edu.unbosque.controller;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.View;

public class Controller {
	private Mundo voladores;
	private View view;

	public Controller() {

		voladores = new Mundo();
		view = new View();

		funcionar();

	}

	public void funcionar() {
		view.escribirDato(voladores.mostrarDatosSuperman(), "Superman");
		view.escribirDato(voladores.mostrarDatosPajaro(), "Pajaro");
		view.escribirDato(voladores.mostrarDatosHidroAvion(), "HidroAvion");
		view.escribirDato(voladores.mostrarDatosHelicoptero(), "Helicoptero");
	}
}
