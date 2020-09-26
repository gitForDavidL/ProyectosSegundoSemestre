package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.File_estudiantes;

public class Archivo {

	private File_estudiantes file_estudiantes;

	public Archivo() {

		file_estudiantes = new File_estudiantes();

	}

	public String gestionarArchivo() {

		return "|Documento|              \t|Nombre|              |Salario|" + "\n\n" + convertirArreglo(
				file_estudiantes.leerDocumento(), file_estudiantes.leerNombre(), file_estudiantes.leerSalario());

	}

	public String convertirArreglo(String[] a, String[] b, Double[] c) {

		String resultado = "";

		for (int i = 0; i < a.length; i++) {
			resultado += a[i] + "\t" + b[i] + "\t" + c[i] + "\n";
		}

		return resultado;
	}

	public void procesarNomina() {
		String a = "";
		Double retencion = 0.0;
		String[] doc = new String[26];
		Double[] sal = new Double[26];

		for (int i = 0; i < doc.length; i++) {

			doc[i] = file_estudiantes.leerDocumento()[i];
			sal[i] = file_estudiantes.leerSalario()[i];
		}

		for (int i = 0; i < sal.length; i++) {
			if (sal[i] <= 2000) {

				retencion = (10 * sal[i]) / 100;

				sal[i] += -retencion;

				a += "|" + doc[i] + "|" + sal[i] + "|\n";

			}
			sal[i] = file_estudiantes.leerSalario()[i];
		}

		file_estudiantes.escribirMensaje("./Data/Nomina1",
				"Nomina estudiantes con salario menor o igual a 2000\n " + a);
		a = "";
		retencion = 0.0;

		for (int i = 0; i < sal.length; i++) {
			if (sal[i] > 2000 && sal[i] <= 5000) {

				retencion = (15 * sal[i]) / 100;
				sal[i] += -retencion;
				a += "|" + doc[i] + "|" + sal[i] + "|\n";
			}
			sal[i] = file_estudiantes.leerSalario()[i];
		}

		file_estudiantes.escribirMensaje("./Data/Nomina2",
				"Nomina estudiantes con salario mayor de 2000 pero menor o igual que 5000\n" + a);

		a = "";
		retencion = 0.0;

		for (int i = 0; i < sal.length; i++) {
			if (sal[i] > 5000) {

				retencion = (20 * sal[i]) / 100;
				sal[i] += -retencion;
				a += "|" + doc[i] + "|" + sal[i] + "|\n";

			}
			sal[i] = file_estudiantes.leerSalario()[i];
		}

		file_estudiantes.escribirMensaje("./Data/Nomina3", "Nomina Estudiantes con salario mayor de 5000\n" + a);
	}

	public File_estudiantes getFile_estudiantes() {
		return file_estudiantes;
	}

	public void setFile_estudiantes(File_estudiantes file_estudiantes) {
		this.file_estudiantes = file_estudiantes;
	}

}