package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File_estudiantes {

	private String archivodata = "./Data/datosprincipales.txt";
	private String documentos[];
	private String nombres[];
	private Double salarios[];

	public File_estudiantes() {

		documentos = new String[26];
		nombres = new String[26];
		salarios = new Double[26];

	}

	public String[] leerDocumento() {

		String linea = "";

		File f = new File(this.archivodata);

		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			int cont = 0;
			while (linea != null) {

				documentos[cont] = linea.substring(0, linea.indexOf(';')).replace("¿", "").replace("ï»", "")
						.replace("Â", "").replace(" ", "").replace((char) 160, (char) 0);
				linea = br.readLine();
				cont++;
			}
			fr.close();
		} catch (IOException e) {
			return null;
		}
		return documentos;
	}

	public String[] leerNombre() {

		String linea = "";

		File f = new File(this.archivodata);

		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			int cont = 0;

			while (linea != null) {
				String temp = linea.substring(linea.indexOf(";") + 1);
				nombres[cont] = temp.substring(0, temp.indexOf(";")).replaceAll("Ã‘", "Ñ").replaceAll("Â", "")
						.replace("Ã", "Á").replace("?", " ").replace((char) 160, (char) 0);
				linea = br.readLine();
				cont++;
			}

			fr.close();

		} catch (IOException e) {
			return null;

		}

		return nombres;
	}

	public Double[] leerSalario() {
		String linea = "";

		File f = new File(this.archivodata);

		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			int cont = 0;

			while (linea != null) {
				String temp = linea.substring(linea.indexOf(";") + 1);
				salarios[cont] = Double.parseDouble(temp.substring(temp.indexOf(";")).replaceAll(";", "")
						.replace(" ", "	").replace((char) 160, (char) 0));
				linea = br.readLine();
				cont++;
			}

			fr.close();
		} catch (IOException e) {
			return null;
		}

		return salarios;
	}

	public Boolean procesarNomina() { // cambiar la logica a la clase fachada, Esta clase solo debe escribir y leer

		String a = "";
		Double retencion = 0.0;
		String nomina1 = "./Data/Nomina1.txt";
		String nomina2 = "./Data/Nomina2.txt";
		String nomina3 = "./Data/Nomina3.txt";

		File n1 = new File(nomina1);
		File n2 = new File(nomina2);
		File n3 = new File(nomina3);

		try {
			FileWriter fw_n1 = new FileWriter(n1);
			PrintWriter pw_n1 = new PrintWriter(fw_n1);

			for (int i = 0; i < documentos.length; i++) {

				if (salarios[i] <= 2000) {

					retencion = (10 * salarios[i]) / 100;

					salarios[i] += -retencion;

					a += "|" + documentos[i] + "|" + salarios[i] + "|" + "\n";

				}

			}

			pw_n1.print("Nomina estudiantes con salario menor de 2000\n\n" + a);

			fw_n1.close();

			a = "";
			retencion = 0.0;

			FileWriter fw_n2 = new FileWriter(n2);
			PrintWriter pw_n2 = new PrintWriter(fw_n2);

			for (int i = 0; i < documentos.length; i++) {
				if (salarios[i] > 2000 && salarios[i] <= 5000) {

					retencion = (15 * salarios[i]) / 100;

					salarios[i] += -retencion;

					a += "|" + documentos[i] + "|" + salarios[i] + "|" + "\n";
				}
			}

			pw_n2.print("Nomina de estudiantes con salario entre 2000 y 5000\n\n" + a);
			fw_n2.close();

			a = "";
			retencion = 0.0;

			FileWriter fw_n3 = new FileWriter(n3);
			PrintWriter pw_n3 = new PrintWriter(fw_n3);

			for (int i = 0; i < documentos.length; i++) {
				if (salarios[i] > 5000) {

					retencion = (20 * salarios[i]) / 100;
					salarios[i] += retencion;
					a += "|" + documentos[i] + "|" + salarios[i] + "|" + "\n";

				}
			}

			pw_n3.print("Nomina de estudiantes con salario mayor que 5000\n\n" + a);
			fw_n3.close();

		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
