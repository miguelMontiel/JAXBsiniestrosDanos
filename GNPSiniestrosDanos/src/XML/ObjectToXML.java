package XML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import GNP.GNPSiniestrosDanos;

public class ObjectToXML 
{
	static final String FILE_NAME = "Nuevo.xml";
	
	public static void jaxbObjectToXML(GNPSiniestrosDanos gnpsiniestrosdanos)
	{
		try
		{
			JAXBContext jaxbcontext = JAXBContext.newInstance(GNPSiniestrosDanos.class);
			Marshaller marshaller = jaxbcontext.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(gnpsiniestrosdanos, System.out);
			marshaller.marshal(gnpsiniestrosdanos, new File(FILE_NAME));
		}
		catch (JAXBException e) {e.printStackTrace();}
	}
}
