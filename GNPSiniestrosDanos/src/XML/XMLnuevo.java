package XML;

import GNP.GNPSiniestrosDanos;
import CSV.CSVcontenido;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLnuevo 
{
	ventanaNuevoXML archivoXML = new ventanaNuevoXML();
	
	private static final String FILE_NAME = "Nuevo.xml";
	
	public static void main(String[] args)
	{
		CSVcontenido csvcontenido = new CSVcontenido();
		GNPSiniestrosDanos gnpsiniestrosdanos = new GNPSiniestrosDanos();
		ArrayList <String> lista = new ArrayList<String>();
		
		lista = csvcontenido.getTodo();
		
		gnpsiniestrosdanos.setCatastropheCode("");
		gnpsiniestrosdanos.setClaimNumber(lista.get(0));
		gnpsiniestrosdanos.setClaimServiceLocn("");
		gnpsiniestrosdanos.setCrossReferencePolicies(lista.get(1));
		gnpsiniestrosdanos.setCurrencyCode(lista.get(2));
		gnpsiniestrosdanos.setDamages(lista.get(3));
		gnpsiniestrosdanos.setDiagnosisCode(lista.get(4));
		gnpsiniestrosdanos.setGNPAgenteSICA("");
		gnpsiniestrosdanos.setGNPCDMonedaSICA("");
		gnpsiniestrosdanos.setGNPClaveOficina("");
		gnpsiniestrosdanos.setGNPCodigoFiliacionTomador("");
		gnpsiniestrosdanos.setGNPCodigoProductoTecnico("");
		gnpsiniestrosdanos.setGNPCristaleraSICA("");
		gnpsiniestrosdanos.setGNPDescripcionClienteSICA("");
		gnpsiniestrosdanos.setGNPDescripcionConcesionarioSICA("");
		gnpsiniestrosdanos.setGNPDescripcionObjeto("");
		gnpsiniestrosdanos.setGNPError("");
		gnpsiniestrosdanos.setGNPInconclusoFlag(lista.get(5));
		gnpsiniestrosdanos.setGNPLlamadaFin("");
		gnpsiniestrosdanos.setGNPLlamadaInicio("");
		gnpsiniestrosdanos.setGNPPTDanosCD("");
		gnpsiniestrosdanos.setGNPPresiniestroGuardadoFlag(lista.get(6));
		gnpsiniestrosdanos.setGNPPresiniestroSICA("");
		gnpsiniestrosdanos.setGNPSiniestroCondicionado(lista.get(7));
		gnpsiniestrosdanos.setGNPSolicitudAnticipadaFlag(lista.get(8));
		gnpsiniestrosdanos.setGNPSolicitudAnticipadaServicioFlag(lista.get(9));
		/*
		gnpsiniestrosdanos.setGNPTipoUbicacion("");
		gnpsiniestrosdanos.setGNPVehiculoOtrosDescripcion("");
		gnpsiniestrosdanos.setGNPAsentamiento("");
		gnpsiniestrosdanos.setGNPAveriguacionPrevia("");
		gnpsiniestrosdanos.setGNPCDAsentamiento("");
		gnpsiniestrosdanos.setGNPCDAsentamientoTipo("");
		gnpsiniestrosdanos.setGNPCDCausa(lista.get(10));
		gnpsiniestrosdanos.setGNPCDDelegacion(lista.get(11));
		gnpsiniestrosdanos.setGNPCDDelegacionDestino("");
		gnpsiniestrosdanos.setGNPCDDelegacionOrigen("");
		gnpsiniestrosdanos.setGNPCDEstado(lista.get(12));
		gnpsiniestrosdanos.setGNPCDEstadoDestino("");
		gnpsiniestrosdanos.setGNPCDEstadoOrigen("");
		gnpsiniestrosdanos.setGNPCDEventoCatastrofico("");
		gnpsiniestrosdanos.setGNPCDInvestigacion("");
		gnpsiniestrosdanos.setGNPCDMoneda(lista.get(13));
		gnpsiniestrosdanos.setGNPCDObjetoAsegurado(lista.get(14));
		gnpsiniestrosdanos.setGNPCDReporta(lista.get(15));
		gnpsiniestrosdanos.setGNPCDTelefonoTipo("");
		gnpsiniestrosdanos.setGNPCDTipoVia("");
		gnpsiniestrosdanos.setGNPCPDestino("");
		gnpsiniestrosdanos.setGNPCPOrigen("");
		gnpsiniestrosdanos.setGNPCodigoFiliacion("");
		gnpsiniestrosdanos.setGNPCodigoNegocio("");
		gnpsiniestrosdanos.setGNPCodigoProductoComercial(lista.get(16));
		gnpsiniestrosdanos.setGNPCodigoSecuenciaOA(lista.get(17));
		gnpsiniestrosdanos.setGNPConvenioCDEstatus("");
		gnpsiniestrosdanos.setGNPConvenioCodigo("");
		gnpsiniestrosdanos.setGNPConvenioDescripcion("");
		gnpsiniestrosdanos.setGNPConvenioEstatus("");
		gnpsiniestrosdanos.setGNPConvenioFinVigencia("");
		gnpsiniestrosdanos.setGNPConvenioInicioVigencia("");
		gnpsiniestrosdanos.setGNPConvenioVersion("");
		gnpsiniestrosdanos.setGNPDelegacionDestino("");
		gnpsiniestrosdanos.setGNPDelegacionOrigen("");
		gnpsiniestrosdanos.setGNPEfectoFin(lista.get(18));
		gnpsiniestrosdanos.setGNPEfectoMovimiento(lista.get(19));
		
		gnpsiniestrosdanos.setGNPEntrevistadoTel2("");
		gnpsiniestrosdanos.setGNPEstadoDestino("");
		gnpsiniestrosdanos.setGNPEstadoOrigen("");
		gnpsiniestrosdanos.setGNPEventoCatastrofico("");
		gnpsiniestrosdanos.setGNPFechaHoy(lista.get(20));
		gnpsiniestrosdanos.setGNPFlgControlReclamos("");
		gnpsiniestrosdanos.setGNPFlgSincronizacion(lista.get(21));
		gnpsiniestrosdanos.setGNPGuardadoFlag(lista.get(22));
		gnpsiniestrosdanos.setGNPInvestigacion("");
		gnpsiniestrosdanos.setGNPLineaNegocio(lista.get(23));
		gnpsiniestrosdanos.setGNPLineaNegocioAfectada(lista.get(24));
		gnpsiniestrosdanos.setGNPNomConductor("");
		gnpsiniestrosdanos.setGNPNomEntrevistado(lista.get(25));
		gnpsiniestrosdanos.setGNPNomOperador("");
		gnpsiniestrosdanos.setGNPNombreViaDestino("");
		gnpsiniestrosdanos.setGNPNombreViaOrigen("");
		gnpsiniestrosdanos.setGNPNumLocalSiniestro("");
		gnpsiniestrosdanos.setGNPNumeroVehiculos("");
		gnpsiniestrosdanos.setGNPObjetoAsegurado(lista.get(26));
		gnpsiniestrosdanos.setGNPObjetoFin(lista.get(27));
		gnpsiniestrosdanos.setGNPObjetoInicio(lista.get(28));
		gnpsiniestrosdanos.setGNPOtrosInformacionTipoCliente(lista.get(29));
		
		gnpsiniestrosdanos.setGNPOtrosTipoCliente("");
		gnpsiniestrosdanos.setGNPOtrosTipoClienteCD("");
		gnpsiniestrosdanos.setGNPPlano("");
		gnpsiniestrosdanos.setGNPPolizaCDEstatus("");
		gnpsiniestrosdanos.setGNPPolizaCiaLider("");
		gnpsiniestrosdanos.setGNPPolizaEstatus("");
		gnpsiniestrosdanos.setGNPPolizaInicio(lista.get(21));
		gnpsiniestrosdanos.setGNPPolizaTurista(lista.get(23));
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDCarroceria("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDColor("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDMarca("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDModelo("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDTipo("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDVersion("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoCarroceria("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoColor("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoMarca("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoModelo("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoMotor("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoPlacas("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoSerie("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoTipo("");
		gnpsiniestrosdanos.setGNPPolizaVehiculoVersion("");
		gnpsiniestrosdanos.setGNPPolizaVersion(lista.get(24));
		gnpsiniestrosdanos.setGNPPolizaVigenciaFin("");
		gnpsiniestrosdanos.setGNPPolizaVigenciaInicio("");
		gnpsiniestrosdanos.setGNPPreSiniestroReadOnly(lista.get(25));
		gnpsiniestrosdanos.setGNPPresiniestroSiNo(lista.get(26));
		gnpsiniestrosdanos.setGNPPropietario("");
		gnpsiniestrosdanos.setGNPReporta(lista.get(27));
		gnpsiniestrosdanos.setGNPReportaNombre(lista.get(28));
		gnpsiniestrosdanos.setGNPReportaTelefono(lista.get(29));
		
		gnpsiniestrosdanos.setGNPSiniestroCiaLider("");
		gnpsiniestrosdanos.setGNPTelConductor(lista.get(30));
		gnpsiniestrosdanos.setGNPTelEntrevistado(lista.get(31));
		gnpsiniestrosdanos.setGNPTelEntrevistado1Cel("");
		gnpsiniestrosdanos.setGNPTelEntrevistado1Ext("");
		gnpsiniestrosdanos.setGNPTelEntrevistado1Lada("");
		gnpsiniestrosdanos.setGNPTelEntrevistado1Pais(lista.get(32));
		gnpsiniestrosdanos.setGNPTelEntrevistado2Cel("");
		gnpsiniestrosdanos.setGNPTelEntrevistado2Ext("");
		gnpsiniestrosdanos.setGNPTelEntrevistado2Lada("");
		gnpsiniestrosdanos.setGNPTelEntrevistado2Pais(lista.get(33));
		gnpsiniestrosdanos.setGNPTelReportaCel("");
		gnpsiniestrosdanos.setGNPTelReportaExt("");
		gnpsiniestrosdanos.setGNPTelReportaLada("");
		gnpsiniestrosdanos.setGNPTelReportaPais(lista.get(34));
		gnpsiniestrosdanos.setGNPTelefonoCelular("");
		gnpsiniestrosdanos.setGNPTelefonoExtension("");
		gnpsiniestrosdanos.setGNPTelefonoLada("");
		gnpsiniestrosdanos.setGNPTelefonoPais(lista.get(35));
		gnpsiniestrosdanos.setGNPTelefonoTipo("");
		gnpsiniestrosdanos.setGNPTiempoMaxServicio(lista.get(36));
		gnpsiniestrosdanos.setGNPTiempoMinServicio(lista.get(37));
		gnpsiniestrosdanos.setGNPTipoSiniestro(lista.get(38));
		gnpsiniestrosdanos.setGNPTramitadorPrincipal("");
		gnpsiniestrosdanos.setGNPTranporteUbicacionMercancia("");
		gnpsiniestrosdanos.setGNPTransporteCDMedio("");
		gnpsiniestrosdanos.setGNPTransporteCDMoneda("");
		gnpsiniestrosdanos.setGNPTransportePropio("");
		gnpsiniestrosdanos.setGNPTransporteValorEmbarque("");
		gnpsiniestrosdanos.setGNPUbicacionCAPP(lista.get(39));
		
		gnpsiniestrosdanos.setGNPUbicacionEntre("");
		gnpsiniestrosdanos.setGNPUbicacionEntre2("");
		gnpsiniestrosdanos.setGNPUbicacionKM("");
		gnpsiniestrosdanos.setGNPUbicacionNombreVia(lista.get(40));
		gnpsiniestrosdanos.setGNPUbicacionNumeroVia("");
		gnpsiniestrosdanos.setGNPUbicacionSupervisoria(lista.get(41));
		gnpsiniestrosdanos.setGNPUbicacionX(lista.get(42));
		gnpsiniestrosdanos.setGNPUbicacionY(lista.get(43));
		gnpsiniestrosdanos.setGNPVehiculoCDCarroceria("");
		gnpsiniestrosdanos.setGNPVehiculoCDColor("");
		gnpsiniestrosdanos.setGNPVehiculoCDMarca("");
		gnpsiniestrosdanos.setGNPVehiculoCDModelo("");
		gnpsiniestrosdanos.setGNPVehiculoCDTipo("");
		gnpsiniestrosdanos.setGNPVehiculoCDVersion("");
		gnpsiniestrosdanos.setGNPVehiculoCarroceria("");
		gnpsiniestrosdanos.setGNPVehiculoColor("");
		gnpsiniestrosdanos.setGNPVehiculoDescripcion("");
		gnpsiniestrosdanos.setGNPVehiculoMarca("");
		gnpsiniestrosdanos.setGNPVehiculoModelo("");
		gnpsiniestrosdanos.setGNPVehiculoMotor("");
		gnpsiniestrosdanos.setGNPVehiculoPlacas("");
		gnpsiniestrosdanos.setGNPVehiculoSerie("");
		gnpsiniestrosdanos.setGNPVehiculoSync("");
		gnpsiniestrosdanos.setGNPVehiculoVersion("");
		gnpsiniestrosdanos.setLocationType("");
		gnpsiniestrosdanos.setLossCause(lista.get(44));
		gnpsiniestrosdanos.setLossDate(lista.get(45));
		gnpsiniestrosdanos.setLossDescription(lista.get(46));
		gnpsiniestrosdanos.setLossLocationCity(lista.get(47));
		gnpsiniestrosdanos.setLossLocationCounty(lista.get(48));
		gnpsiniestrosdanos.setLossLocationZip(lista.get(49));
		
		gnpsiniestrosdanos.setLossTime(lista.get(50));
		gnpsiniestrosdanos.setLossTypeCode(lista.get(51));
		gnpsiniestrosdanos.setPolicyNumber("");
		gnpsiniestrosdanos.setProcedureCode(lista.get(52));
		gnpsiniestrosdanos.setReferral(lista.get(53));
		gnpsiniestrosdanos.setReportedDate(lista.get(54));
		gnpsiniestrosdanos.setSalvageComments(lista.get(55));
		gnpsiniestrosdanos.setSubrogationFlag(lista.get(56));
		gnpsiniestrosdanos.setSummaryCode(lista.get(57));
		gnpsiniestrosdanos.setTotalClaimPayments("");
		gnpsiniestrosdanos.setTotalClaimReserves(lista.get(58));
		gnpsiniestrosdanos.setTotalSalvageRecovery("");
		gnpsiniestrosdanos.setTotalSubRecovery("");
		gnpsiniestrosdanos.setVisitType(lista.get(59));
		gnpsiniestrosdanos.setWasanyoneInjured("");
		gnpsiniestrosdanos.setListOfGnpSiniestrosServiciosDanosBc("");
		*/
		jaxbObjectToXML(gnpsiniestrosdanos);
		
		GNPSiniestrosDanos siniestrosFile = jaxbXMLToObject();
		System.out.println(siniestrosFile.toString());
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
	
	private static GNPSiniestrosDanos jaxbXMLToObject() 
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
