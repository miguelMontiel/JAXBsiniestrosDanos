package XML;

import GNP.GNPSiniestrosDanos;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLnuevo 
{
	private static final String FILE_NAME = "nuevoXML.xml";
	
	public static void main(String[] args)
	{
		GNPSiniestrosDanos gnpsiniestrosdanos = new GNPSiniestrosDanos();
		gnpsiniestrosdanos.setCatastropheCode("Hola");
		gnpsiniestrosdanos.setClaimNumber("Mundo");
		
		jaxbObjectToXML(gnpsiniestrosdanos);
		
		GNPSiniestrosDanos siniestrosFile = jaxbXMLToObject();
		System.out.println(siniestrosFile.toString());
		
	}
	
	private static GNPSiniestrosDanos jaxbXMLToObject() 
	{
		try
		{
			JAXBContext jaxbcontext = JAXBContext.newInstance(GNPSiniestrosDanos.class);
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
			GNPSiniestrosDanos gnpsiniestrosdanos = (GNPSiniestrosDanos) unmarshaller.unmarshal(new File(FILE_NAME));
			return gnpsiniestrosdanos;
		}
		catch (JAXBException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	private static void jaxbObjectToXML(GNPSiniestrosDanos gnpsiniestrosdanos)
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
