package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoProp = "./Data/Properties";

	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreVentana", "Nomina estudiantes");
			prop.setProperty("maximoRegistros", "26");
			prop.setProperty("direccionNomina1", "./Data/Nomina1");
			prop.setProperty("direccionNomina2", "./DataNomina2");
			prop.setProperty("direccionNomina3", "./Data/Nomina3");
			prop.setProperty("retencionNomina1", "10");
			prop.setProperty("retencionNomina2", "15");
			prop.setProperty("retencionNomina3", "20");
			prop.setProperty("direccionDatos", "./Data/datosprincipales");
			prop.setProperty("tituloDatosPrincipales", "|Documento|              |Nombre|                   |Salario|");

			prop.store(new FileOutputStream(archivoProp), null);
		} catch (IOException ex) {
			return -1;
		}
		return 0;
	}

	public String leerPropiedades() {
		String linea = "";
		try {

			prop.load(new FileInputStream(archivoProp));

			prop.list(System.out);

			linea += "nombre de la Ventana :" + prop.getProperty("nombreVentana") + "\n";
			linea += "Maximo registros :" + prop.getProperty("maximoRegistros") + "\n";
			linea += "Direccion de  la nomina 1 :" + prop.getProperty("direccionNomina1") + "\n";
			linea += "Direccion de  la nomina 2 :" + prop.getProperty("direccionNomina2") + "\n";
			linea += "Direccion de  la nomina 3 :" + prop.getProperty("direccionNomina3") + "\n";
			linea += "Valor retención para nomina 1 :" + prop.getProperty("retencionNomina1") + "\n";
			linea += "Valor retención para nomina 2 :" + prop.getProperty("retencionNomina2") + "\n";
			linea += "Valor retención para nomina 3 :" + prop.getProperty("retencionNomina3") + "\n";
			linea += "Titulo para datos principales :" + prop.getProperty("tituloDatosPrincipales") + "\n";

		} catch (IOException ex) {
			return null;
		}
		return linea;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoProp() {
		return archivoProp;
	}

	public void setArchivoProp(String archivoProp) {
		this.archivoProp = archivoProp;
	}

}
