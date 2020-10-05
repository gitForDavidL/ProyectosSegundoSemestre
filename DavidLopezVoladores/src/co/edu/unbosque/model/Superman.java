package co.edu.unbosque.model;

public class Superman extends Kriptoniano implements Volador {
	
	public Superman() {

		super.nombre = "Superman";
	}

	public String despegar() {

		return "Soy " + super.nombre + " y voy a despegar";
	}

	public String aterrizar() {

		return "acabo de salvar al mundo, voy a aterrizar";
	}

	public String volar() {

		return "vuelo para salvar a el mundo";
	}

	public String detenerBalas() {

		return "Detengo balas con mi pecho por que soy  " + super.nombre;
	}

	public String saltarEdificios() {

		return "Salto el empire State";
	}

	public String comer() {

		return "Soy kriptoniano pero tambien me alimento";
	}

	public String heroeMasFuerte() {
		return "Soy el heroe mas fuerte de la liga de la justicia";
	}
	

}
