package XML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import GNP.GNPSiniestrosDanos;

public class XMLtoObject 
{
	static final String FILE_NAME = "Nuevo.xml";
	
	public static GNPSiniestrosDanos jaxbXMLToObject() 
	{
		try
		{
			JAXBContext jaxbcontext = JAXBContext.newInstance(GNPSiniestrosDanos.class);
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
			GNPSiniestrosDanos gnpsiniestrosdanos = (GNPSiniestrosDanos) unmarshaller.unmarshal(new File(FILE_NAME));
			return gnpsiniestrosdanos;
		}
		catch (JAXBException e){e.printStackTrace();}
		return null;
	}
}
