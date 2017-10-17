package CSV;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CSV 
{
	public String getArchivo(String archivoSeleccionado)
	{
		JFileChooser jfilechooser = new JFileChooser();
		FileNameExtensionFilter filenameextensionfilter = new FileNameExtensionFilter("Archivos CSV", "csv");
		jfilechooser.setFileFilter(filenameextensionfilter);
		int seleccionado = jfilechooser.showOpenDialog(null);
		archivoSeleccionado = jfilechooser.getSelectedFile().getAbsolutePath();
		
		if(seleccionado == JFileChooser.APPROVE_OPTION)
		{
			System.out.println("El archivo seleccionado es: " + jfilechooser.getSelectedFile().getName());
		}
		return archivoSeleccionado;
	}
}
