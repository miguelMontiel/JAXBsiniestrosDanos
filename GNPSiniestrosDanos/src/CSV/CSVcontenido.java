package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVcontenido extends CSV
{
	public String getTodo(String todo)
	{
		CSV csv = new CSV();
		BufferedReader bufferedreader = null;
		String archivoSeleccionado = null;
		String linea;
		String cortarCSV = ",";
		String[] texto;
		
		try
		{
			bufferedreader = new BufferedReader(new FileReader(csv.getArchivo(archivoSeleccionado)));
			
			while((linea = bufferedreader.readLine()) != null)
			{
				texto = linea.split(cortarCSV);
				for(int i = 0; i < texto.length; i++)
				{
					todo = texto[i].toString();
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
