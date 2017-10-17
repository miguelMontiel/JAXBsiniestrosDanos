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

		gnpsiniestrosdanos.setCatastropheCode(lista.get(0));
		gnpsiniestrosdanos.setClaimNumber(lista.get(1));
		gnpsiniestrosdanos.setClaimServiceLocn(lista.get(2));
		gnpsiniestrosdanos.setCrossReferencePolicies(lista.get(3));
		gnpsiniestrosdanos.setCurrencyCode(lista.get(4));
		gnpsiniestrosdanos.setDamages(lista.get(5));
		gnpsiniestrosdanos.setDiagnosisCode(lista.get(6));
		gnpsiniestrosdanos.setGNPAgenteSICA(lista.get(7));
		/*gnpsiniestrosdanos.setGNPCDMonedaSICA(lista.get(8));
		gnpsiniestrosdanos.setGNPClaveOficina(lista.get(9));
		
		gnpsiniestrosdanos.setGNPCodigoFiliacionTomador(lista.get(10));
		gnpsiniestrosdanos.setGNPCodigoProductoTecnico(lista.get(11));
		gnpsiniestrosdanos.setGNPCristaleraSICA(lista.get(12));
		gnpsiniestrosdanos.setGNPDescripcionClienteSICA(lista.get(13));
		gnpsiniestrosdanos.setGNPDescripcionConcesionarioSICA(lista.get(14));
		gnpsiniestrosdanos.setGNPDescripcionObjeto(lista.get(15));
		gnpsiniestrosdanos.setGNPError(lista.get(16));
		gnpsiniestrosdanos.setGNPInconclusoFlag(lista.get(17));
		gnpsiniestrosdanos.setGNPLlamadaFin(lista.get(18));
		gnpsiniestrosdanos.setGNPLlamadaInicio(lista.get(19));
		
		gnpsiniestrosdanos.setGNPPTDanosCD(lista.get(20));
		gnpsiniestrosdanos.setGNPPresiniestroGuardadoFlag(lista.get(21));
		gnpsiniestrosdanos.setGNPPresiniestroSICA(lista.get(22));
		gnpsiniestrosdanos.setGNPSiniestroCondicionado(lista.get(23));
		gnpsiniestrosdanos.setGNPSolicitudAnticipadaFlag(lista.get(24));
		gnpsiniestrosdanos.setGNPSolicitudAnticipadaServicioFlag(lista.get(25));
		gnpsiniestrosdanos.setGNPTipoUbicacion(lista.get(26));
		gnpsiniestrosdanos.setGNPVehiculoOtrosDescripcion(lista.get(27));
		gnpsiniestrosdanos.setGNPAsentamiento(lista.get(28));
		gnpsiniestrosdanos.setGNPAveriguacionPrevia(lista.get(29));
		
		gnpsiniestrosdanos.setGNPCDAsentamiento(lista.get(30));
		gnpsiniestrosdanos.setGNPCDAsentamientoTipo(lista.get(31));
		gnpsiniestrosdanos.setGNPCDCausa(lista.get(32));
		gnpsiniestrosdanos.setGNPCDDelegacion(lista.get(33));
		gnpsiniestrosdanos.setGNPCDDelegacionDestino(lista.get(34));
		gnpsiniestrosdanos.setGNPCDDelegacionOrigen(lista.get(35));
		gnpsiniestrosdanos.setGNPCDEstado(lista.get(36));
		gnpsiniestrosdanos.setGNPCDEstadoDestino(lista.get(37));
		gnpsiniestrosdanos.setGNPCDEstadoOrigen(lista.get(38));
		gnpsiniestrosdanos.setGNPCDEventoCatastrofico(lista.get(39));
		
		gnpsiniestrosdanos.setGNPCDInvestigacion(lista.get(40));
		gnpsiniestrosdanos.setGNPCDMoneda(lista.get(41));
		gnpsiniestrosdanos.setGNPCDObjetoAsegurado(lista.get(42));
		gnpsiniestrosdanos.setGNPCDReporta(lista.get(43));
		gnpsiniestrosdanos.setGNPCDTelefonoTipo(lista.get(44));
		gnpsiniestrosdanos.setGNPCDTipoVia(lista.get(45));
		gnpsiniestrosdanos.setGNPCPDestino(lista.get(46));
		gnpsiniestrosdanos.setGNPCPOrigen(lista.get(47));
		gnpsiniestrosdanos.setGNPCodigoFiliacion(lista.get(48));
		gnpsiniestrosdanos.setGNPCodigoNegocio(lista.get(49));
		
		gnpsiniestrosdanos.setGNPCodigoProductoComercial(lista.get(50));
		gnpsiniestrosdanos.setGNPCodigoSecuenciaOA(lista.get(51));
		gnpsiniestrosdanos.setGNPConvenioCDEstatus(lista.get(52));
		gnpsiniestrosdanos.setGNPConvenioCodigo(lista.get(53));
		gnpsiniestrosdanos.setGNPConvenioDescripcion(lista.get(54));
		gnpsiniestrosdanos.setGNPConvenioEstatus(lista.get(55));
		gnpsiniestrosdanos.setGNPConvenioFinVigencia(lista.get(56));
		gnpsiniestrosdanos.setGNPConvenioInicioVigencia(lista.get(57));
		gnpsiniestrosdanos.setGNPConvenioVersion(lista.get(58));
		gnpsiniestrosdanos.setGNPDelegacionDestino(lista.get(59));
		
		gnpsiniestrosdanos.setGNPDelegacionOrigen(lista.get(60));
		gnpsiniestrosdanos.setGNPEfectoFin(lista.get(61));
		gnpsiniestrosdanos.setGNPEfectoMovimiento(lista.get(62));
		gnpsiniestrosdanos.setGNPEntrevistadoTel2(lista.get(63));
		gnpsiniestrosdanos.setGNPEstadoDestino(lista.get(64));
		gnpsiniestrosdanos.setGNPEstadoOrigen(lista.get(65));
		gnpsiniestrosdanos.setGNPEventoCatastrofico(lista.get(66));
		gnpsiniestrosdanos.setGNPFechaHoy(lista.get(67));
		gnpsiniestrosdanos.setGNPFlgControlReclamos(lista.get(68));
		gnpsiniestrosdanos.setGNPFlgSincronizacion(lista.get(69));
		
		gnpsiniestrosdanos.setGNPGuardadoFlag(lista.get(70));
		gnpsiniestrosdanos.setGNPInvestigacion(lista.get(71));
		gnpsiniestrosdanos.setGNPLineaNegocio(lista.get(72));
		gnpsiniestrosdanos.setGNPLineaNegocioAfectada(lista.get(73));
		gnpsiniestrosdanos.setGNPNomConductor(lista.get(74));
		gnpsiniestrosdanos.setGNPNomEntrevistado(lista.get(75));
		gnpsiniestrosdanos.setGNPNomOperador(lista.get(76));
		gnpsiniestrosdanos.setGNPNombreViaDestino(lista.get(77));
		gnpsiniestrosdanos.setGNPNombreViaOrigen(lista.get(78));
		gnpsiniestrosdanos.setGNPNumLocalSiniestro(lista.get(79));
		
		gnpsiniestrosdanos.setGNPNumeroVehiculos(lista.get(80));
		gnpsiniestrosdanos.setGNPObjetoAsegurado(lista.get(81));
		gnpsiniestrosdanos.setGNPObjetoFin(lista.get(82));
		gnpsiniestrosdanos.setGNPObjetoInicio(lista.get(83));
		gnpsiniestrosdanos.setGNPOtrosInformacionTipoCliente(lista.get(84));
		gnpsiniestrosdanos.setGNPOtrosTipoCliente(lista.get(85));
		gnpsiniestrosdanos.setGNPOtrosTipoClienteCD(lista.get(86));
		gnpsiniestrosdanos.setGNPPlano(lista.get(87));
		gnpsiniestrosdanos.setGNPPolizaCDEstatus(lista.get(88));
		gnpsiniestrosdanos.setGNPPolizaCiaLider(lista.get(89));
		
		gnpsiniestrosdanos.setGNPPolizaEstatus(lista.get(90));
		gnpsiniestrosdanos.setGNPPolizaInicio(lista.get(91));
		gnpsiniestrosdanos.setGNPPolizaTurista(lista.get(92));
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDCarroceria(lista.get(93));
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDColor(lista.get(94));
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDMarca(lista.get(95));
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDModelo(lista.get(96));
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDTipo(lista.get(97));
		gnpsiniestrosdanos.setGNPPolizaVehiculoCDVersion(lista.get(98));
		gnpsiniestrosdanos.setGNPPolizaVehiculoCarroceria(lista.get(99));
		
		gnpsiniestrosdanos.setGNPPolizaVehiculoColor(lista.get(100));
		gnpsiniestrosdanos.setGNPPolizaVehiculoMarca(lista.get(101));
		gnpsiniestrosdanos.setGNPPolizaVehiculoModelo(lista.get(102));
		gnpsiniestrosdanos.setGNPPolizaVehiculoMotor(lista.get(103));
		gnpsiniestrosdanos.setGNPPolizaVehiculoPlacas(lista.get(104));
		gnpsiniestrosdanos.setGNPPolizaVehiculoSerie(lista.get(105));
		gnpsiniestrosdanos.setGNPPolizaVehiculoTipo(lista.get(106));
		gnpsiniestrosdanos.setGNPPolizaVehiculoVersion(lista.get(107));
		gnpsiniestrosdanos.setGNPPolizaVersion(lista.get(108));
		gnpsiniestrosdanos.setGNPPolizaVigenciaFin(lista.get(109));
		
		gnpsiniestrosdanos.setGNPPolizaVigenciaInicio(lista.get(110));
		gnpsiniestrosdanos.setGNPPreSiniestroReadOnly(lista.get(111));
		gnpsiniestrosdanos.setGNPPresiniestroSiNo(lista.get(112));
		gnpsiniestrosdanos.setGNPPropietario(lista.get(113));
		gnpsiniestrosdanos.setGNPReporta(lista.get(114));
		gnpsiniestrosdanos.setGNPReportaNombre(lista.get(115));
		gnpsiniestrosdanos.setGNPReportaTelefono(lista.get(116));
		gnpsiniestrosdanos.setGNPSiniestroCiaLider(lista.get(117));
		gnpsiniestrosdanos.setGNPTelConductor(lista.get(118));
		gnpsiniestrosdanos.setGNPTelEntrevistado(lista.get(119));
		
		gnpsiniestrosdanos.setGNPTelEntrevistado1Cel(lista.get(120));
		gnpsiniestrosdanos.setGNPTelEntrevistado1Ext(lista.get(121));
		gnpsiniestrosdanos.setGNPTelEntrevistado1Lada(lista.get(122));
		gnpsiniestrosdanos.setGNPTelEntrevistado1Pais(lista.get(123));
		gnpsiniestrosdanos.setGNPTelEntrevistado2Cel(lista.get(124));
		gnpsiniestrosdanos.setGNPTelEntrevistado2Ext(lista.get(125));
		gnpsiniestrosdanos.setGNPTelEntrevistado2Lada(lista.get(126));
		gnpsiniestrosdanos.setGNPTelEntrevistado2Pais(lista.get(127));
		gnpsiniestrosdanos.setGNPTelReportaCel(lista.get(128));
		gnpsiniestrosdanos.setGNPTelReportaExt(lista.get(129));
		
		gnpsiniestrosdanos.setGNPTelReportaLada(lista.get(130));
		gnpsiniestrosdanos.setGNPTelReportaPais(lista.get(131));
		gnpsiniestrosdanos.setGNPTelefonoCelular(lista.get(132));
		gnpsiniestrosdanos.setGNPTelefonoExtension(lista.get(133));
		gnpsiniestrosdanos.setGNPTelefonoLada(lista.get(134));
		gnpsiniestrosdanos.setGNPTelefonoPais(lista.get(135));
		gnpsiniestrosdanos.setGNPTelefonoTipo(lista.get(136));
		gnpsiniestrosdanos.setGNPTiempoMaxServicio(lista.get(137));
		gnpsiniestrosdanos.setGNPTiempoMinServicio(lista.get(138));
		gnpsiniestrosdanos.setGNPTipoSiniestro(lista.get(139));
		
		gnpsiniestrosdanos.setGNPTramitadorPrincipal(lista.get(140));
		gnpsiniestrosdanos.setGNPTranporteUbicacionMercancia(lista.get(141));
		gnpsiniestrosdanos.setGNPTransporteCDMedio(lista.get(142));
		gnpsiniestrosdanos.setGNPTransporteCDMoneda(lista.get(143));
		gnpsiniestrosdanos.setGNPTransportePropio(lista.get(144));
		gnpsiniestrosdanos.setGNPTransporteValorEmbarque(lista.get(145));
		gnpsiniestrosdanos.setGNPUbicacionCAPP(lista.get(146));
		gnpsiniestrosdanos.setGNPUbicacionEntre(lista.get(147));
		gnpsiniestrosdanos.setGNPUbicacionEntre2(lista.get(148));
		gnpsiniestrosdanos.setGNPUbicacionKM(lista.get(149));
		
		gnpsiniestrosdanos.setGNPUbicacionNombreVia(lista.get(150));
		gnpsiniestrosdanos.setGNPUbicacionNumeroVia(lista.get(151));
		gnpsiniestrosdanos.setGNPUbicacionSupervisoria(lista.get(152));
		gnpsiniestrosdanos.setGNPUbicacionX(lista.get(153));
		gnpsiniestrosdanos.setGNPUbicacionY(lista.get(154));
		gnpsiniestrosdanos.setGNPVehiculoCDCarroceria(lista.get(155));
		gnpsiniestrosdanos.setGNPVehiculoCDColor(lista.get(156));
		gnpsiniestrosdanos.setGNPVehiculoCDMarca(lista.get(157));
		gnpsiniestrosdanos.setGNPVehiculoCDModelo(lista.get(158));
		gnpsiniestrosdanos.setGNPVehiculoCDTipo(lista.get(159));
		
		gnpsiniestrosdanos.setGNPVehiculoCDVersion(lista.get(160));
		gnpsiniestrosdanos.setGNPVehiculoCarroceria(lista.get(161));
		gnpsiniestrosdanos.setGNPVehiculoColor(lista.get(162));
		gnpsiniestrosdanos.setGNPVehiculoDescripcion(lista.get(163));
		gnpsiniestrosdanos.setGNPVehiculoMarca(lista.get(164));
		gnpsiniestrosdanos.setGNPVehiculoModelo(lista.get(165));
		gnpsiniestrosdanos.setGNPVehiculoMotor(lista.get(166));
		gnpsiniestrosdanos.setGNPVehiculoPlacas(lista.get(167));
		gnpsiniestrosdanos.setGNPVehiculoSerie(lista.get(168));
		gnpsiniestrosdanos.setGNPVehiculoSync(lista.get(169));
		
		gnpsiniestrosdanos.setGNPVehiculoVersion(lista.get(170));
		gnpsiniestrosdanos.setLocationType(lista.get(171));
		gnpsiniestrosdanos.setLossCause(lista.get(172));
		gnpsiniestrosdanos.setLossDate(lista.get(173));
		gnpsiniestrosdanos.setLossDescription(lista.get(174));
		gnpsiniestrosdanos.setLossLocationCity(lista.get(175));
		gnpsiniestrosdanos.setLossLocationCounty(lista.get(176));
		gnpsiniestrosdanos.setLossLocationZip(lista.get(177));
		gnpsiniestrosdanos.setLossTime(lista.get(178));
		gnpsiniestrosdanos.setLossTypeCode(lista.get(179));
		
		gnpsiniestrosdanos.setPolicyNumber(lista.get(180));
		gnpsiniestrosdanos.setProcedureCode(lista.get(181));
		gnpsiniestrosdanos.setReferral(lista.get(182));
		gnpsiniestrosdanos.setReportedDate(lista.get(183));
		gnpsiniestrosdanos.setSalvageComments(lista.get(184));
		gnpsiniestrosdanos.setSubrogationFlag(lista.get(185));
		gnpsiniestrosdanos.setSummaryCode(lista.get(186));
		gnpsiniestrosdanos.setTotalClaimPayments(lista.get(187));
		gnpsiniestrosdanos.setTotalClaimReserves(lista.get(188));
		gnpsiniestrosdanos.setTotalSalvageRecovery(lista.get(189));
		
		gnpsiniestrosdanos.setTotalSubRecovery(lista.get(190));
		gnpsiniestrosdanos.setVisitType(lista.get(191));
		gnpsiniestrosdanos.setWasanyoneInjured(lista.get(192));
		gnpsiniestrosdanos.setListOfGnpSiniestrosServiciosDanosBc(lista.get(193));
		*/
		
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
		catch (JAXBException e){e.printStackTrace();}
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
