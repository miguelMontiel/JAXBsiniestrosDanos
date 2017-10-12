package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVcontenido extends CSV
{
	public ArrayList<String> getTodo()
	{
		CSV csv = new CSV();
		BufferedReader bufferedreader = null;
		String archivoSeleccionado = null;
		String linea;
		String cortarCSV = ",";
		String[] texto;
		ArrayList<String> todo = new ArrayList<String>();
		
		try
		{
			bufferedreader = new BufferedReader(new FileReader(csv.getArchivo(archivoSeleccionado)));
			
			while((linea = bufferedreader.readLine()) != null)
			{
				texto = linea.split(cortarCSV);
				for(int i = 0; i < texto.length; i++)
				{
					todo.add(texto[i]);	
				}
			}
		}
        catch(IOException e){e.printStackTrace();}
        finally
        {
            if(bufferedreader != null)
            {
                try 
                {
                    bufferedreader.close();
                }
                catch(IOException e){e.printStackTrace();}
            }
        }
		return todo;
	}
}
