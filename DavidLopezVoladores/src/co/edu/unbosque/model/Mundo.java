package co.edu.unbosque.model;

public class Mundo {

	private Superman superman;
	private Pajaro pajaro;
	private HidroAvion hidroAvion;
	private Helicoptero helicoptero;

	public Mundo() {

		superman = new Superman();
		pajaro = new Pajaro();
		hidroAvion = new HidroAvion();
		helicoptero = new Helicoptero();

	}

	public String mostrarDatosSuperman() {

		String a = superman.despegar() + "\n" + superman.volar() + "\n" + superman.aterrizar() + "\n" + superman.comer()
				+ "\n" + superman.detenerBalas() + "\n" + superman.saltarEdificios() + "\n" + superman.heroeMasFuerte();

		return a;
	}

	public String mostrarDatosPajaro() {

		String a = pajaro.despegar() + "\n" + pajaro.volar() + "\n" + pajaro.aterrizar() + "\n" + pajaro.comer() + "\n"
				+ pajaro.ponerHuevos() + "\n" + pajaro.hacerNido();

		return a;
	}

	public String mostrarDatosHidroAvion() {

		String a = hidroAvion.despegar() + "\n" + hidroAvion.volar() + "\n" + hidroAvion.aterrizar() + "\n"
				+ hidroAvion.formaDeVolar() + "\n" + hidroAvion.tipoCombustible();

		return a;
	}

	public String mostrarDatosHelicoptero() {

		String a = helicoptero.despegar() + "\n" + helicoptero.volar() + "\n" + helicoptero.aterrizar() + "\n"
				+ helicoptero.tipoCombustible() + "\n" + helicoptero.formaDeVolar();

		return a;
	}

}
