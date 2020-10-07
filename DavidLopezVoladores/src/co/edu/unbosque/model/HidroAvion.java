package co.edu.unbosque.model;

public class HidroAvion extends VehiculoVolador implements Volador{

	public String despegar() {

		return "Despego desde el agua";
	}

	public String aterrizar() {

		return "Puedo aterrizar en el agua o en la tierra";
	}

	public String volar() {

		return "Puedo volar largos trayectos";
	}

	public String formaDeVolar() {

		return "Vuelo gracias a mis turbinas y mis alas";
	}

	public String tipoCombustible() {

		return "Uso gasolina como combustible";
	}

}
