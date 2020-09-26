package co.edu.unbosque.controller;

import co.edu.unbosque.model.Archivo;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Archivo archivo;

	public Controller() {
		archivo = new Archivo();
		view = new View();

		funcionar();
	}

	private void funcionar() {
		view.escribirDato(archivo.gestionarArchivo());
		archivo.procesarNomina();
		
	}

}
