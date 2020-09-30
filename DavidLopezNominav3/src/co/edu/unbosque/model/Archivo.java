package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.File_estudiantes;
import co.edu.unbosque.model.persistence.Propiedades;

public class Archivo {

	private File_estudiantes file_estudiantes;
	private Propiedades properties;

	public Archivo() {

		file_estudiantes = new File_estudiantes();
		properties = new Propiedades();

	}

	public String gestionarArchivo() {

		return properties.getProp().getProperty("tituloDatosPrincipales") + "\n\n" + convertirArreglo(
				file_estudiantes.leerDocumento(), file_estudiantes.leerNombre(), file_estudiantes.leerSalario());

	}

	public String convertirArreglo(String[] a, String[] b, Double[] c) {

		String resultado = "";

		for (int i = 0; i < a.length; i++) {
			resultado += a[i] + " | " + b[i] + " | " + c[i] + "\n";
		}

		return resultado;
	}

	public void procesarNomina() {
		String a = "";
		Double retencion = 0.0;
		String[] doc = new String[Integer.parseInt(properties.getProp().getProperty("maximoRegistros"))];
		Double[] sal = new Double[Integer.parseInt(properties.getProp().getProperty("maximoRegistros"))];

		for (int i = 0; i < doc.length; i++) {

			doc[i] = file_estudiantes.leerDocumento()[i];
			sal[i] = file_estudiantes.leerSalario()[i];
		}

		for (int i = 0; i < sal.length; i++) {
			if (sal[i] <= 2000) {

				retencion = (Integer.parseInt(properties.getProp().getProperty("retencionNomina1")) * sal[i]) / 100;
				sal[i] += -retencion;
				a += "|" + doc[i] + "|" + sal[i] + "|\n";

			}
			sal[i] = file_estudiantes.leerSalario()[i];
		}

		file_estudiantes.escribirMensaje(properties.getProp().getProperty("direccionNomina1"),
				"Nomina estudiantes con salario menor o igual a 2000\n\n" + a);
		a = "";
		retencion = 0.0;

		for (int i = 0; i < sal.length; i++) {
			if (sal[i] > 2000 && sal[i] <= 5000) {

				retencion = (Integer.parseInt(properties.getProp().getProperty("retencionNomina2")) * sal[i]) / 100;
				sal[i] += -retencion;
				a += "|" + doc[i] + "|" + sal[i] + "|\n";
			}
			sal[i] = file_estudiantes.leerSalario()[i];
		}

		file_estudiantes.escribirMensaje(properties.getProp().getProperty("direccionNomina2"),
				"Nomina estudiantes con salario mayor de 2000 pero menor o igual que 5000\n\n" + a);

		a = "";
		retencion = 0.0;

		for (int i = 0; i < sal.length; i++) {
			if (sal[i] > 5000) {

				retencion = (Integer.parseInt(properties.getProp().getProperty("retencionNomina3")) * sal[i]) / 100;
				sal[i] += -retencion;
				a += "|" + doc[i] + "|" + sal[i] + "|\n";

			}
			sal[i] = file_estudiantes.leerSalario()[i];
		}

		file_estudiantes.escribirMensaje(properties.getProp().getProperty("direccionNomina3"),
				"Nomina Estudiantes con salario mayor de 5000\n\n" + a);
	}

	public String cambiarNombre() {
		return properties.getProp().getProperty("nombreVentana");
	}

	public File_estudiantes getFile_estudiantes() {
		return file_estudiantes;
	}

	public void setFile_estudiantes(File_estudiantes file_estudiantes) {
		this.file_estudiantes = file_estudiantes;
	}

	public Propiedades getProperties() {
		return properties;
	}

	public void setProperties(Propiedades properties) {
		this.properties = properties;
	}

}