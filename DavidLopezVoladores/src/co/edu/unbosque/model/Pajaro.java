package co.edu.unbosque.model;

public class Pajaro extends Animal implements Volador {

	public Pajaro() {

		super.nombre = "Guacamaya";

	}

	public String despegar() {

		return "Soy una " + super.nombre + " y voy a buscar mi alimento ";
	}

	public String aterrizar() {

		return "Encontre mi alimento, voy a aterrizar";
	}

	public String volar() {

		return "Estoy volando buscando mi alimento";
	}

	public String comer() {

		return "Voy a comer mi alimento";
	}

	public String ponerHuevos() {
		return "Estoy poniendo huevos, voy a tener mini guacamayos";
	}

	public String hacerNido() {
		return "Le voy a hacer un nido a mis hijos";
	}

}
