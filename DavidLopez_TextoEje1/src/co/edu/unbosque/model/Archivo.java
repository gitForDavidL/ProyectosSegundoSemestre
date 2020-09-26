package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.File_estudiantes;

public class Archivo {

	private File_estudiantes file_estudiantes;

	public Archivo() {

		file_estudiantes = new File_estudiantes();
		
	}

	public String gestionarArchivo() {

		return "|Documento|              \t|Nombre|              |Salario|" + "\n\n"
				+ convertirArreglo(file_estudiantes.leerDocumento(), file_estudiantes.leerNombre(), file_estudiantes.leerSalario());

	}

	public String convertirArreglo(String[] a, String[] b, Double[] c) {

		String resultado = "";

		for (int i = 0; i < a.length; i++) {
			resultado += a[i] + "\t" + b[i] + "\t" + c[i] + "\n";
		}

		return resultado;
	}

	public File_estudiantes getFile_estudiantes() {
		return file_estudiantes;
	}

	public void setFile_estudiantes(File_estudiantes file_estudiantes) {
		this.file_estudiantes = file_estudiantes;
	}

}