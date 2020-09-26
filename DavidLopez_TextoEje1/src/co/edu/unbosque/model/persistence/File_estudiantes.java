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

	public Boolean escribirMensaje(String direccion, String mensaje) {

		File n1 = new File(direccion);

		try {
			FileWriter fw = new FileWriter(n1);
			PrintWriter pw = new PrintWriter(fw);

			pw.print(mensaje);

			fw.close();

		} catch (Exception e) {
			return false;

		}
		return true;
	}
}
