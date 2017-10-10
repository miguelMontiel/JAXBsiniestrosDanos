package GNP;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "InsClaims")
// @XmlType(propOrder = {"catastropheCode", "claimNumber"})
public class GNPSiniestrosDanos 
{
	Object InsClaims;
	String CatastropheCode;
	String ClaimNumber;
	String ClaimServiceLocn;
	String CrossReferencePolicies;
	String CurrencyCode;
	String Damages;
	String DiagnosisCode;
	String GNPAgenteSICA;
	String GNPCDMonedaSICA;
	String GNPClaveOficina;
	String GNPCodigoFiliacionTomador;
	String GNPCodigoProductoTecnico;
	String GNPCristaleraSICA;
	String GNPDescripcionClienteSICA;
	String GNPDescripcionConcesionarioSICA;
	String GNPDescripcionObjeto;
	String GNPError;
	String GNPInconclusoFlag;
	String GNPLlamadaFin;
	String GNPLlamadaInicio;
	String GNPPTDanosCD;
	String GNPPresiniestroGuardadoFlag;
	String GNPPresiniestroSICA;
	String GNPSiniestroCondicionado;
	String GNPSolicitudAnticipadaFlag;
	String GNPSolicitudAnticipadaServicioFlag;
	String GNPTipoUbicacion;
	String GNPVehiculoOtrosDescripcion;
	String GNPAsentamiento;
	String GNPAveriguacionPrevia;
	String GNPCDAsentamiento;
	String GNPCDAsentamientoTipo;
	String GNPCDCausa;
	String GNPCDDelegacion;
	String GNPCDDelegacionDestino;
	String GNPCDDelegacionOrigen;
	String GNPCDEstado;
	String GNPCDEstadoDestino;
	String GNPCDEstadoOrigen;
	String GNPCDEventoCatastrofico;
	String GNPCDInvestigacion;
	String GNPCDMoneda;
	String GNPCDObjetoAsegurado;
	String GNPCDReporta;
	String GNPCDTelefonoTipo;
	String GNPCDTipoVia;
	String GNPCPDestino;
	String GNPCPOrigen;
	String GNPCodigoFiliacion;
	String GNPCodigoNegocio;
	String GNPCodigoProductoComercial;
	String GNPCodigoSecuenciaOA;
	String GNPConvenioCDEstatus;
	String GNPConvenioCodigo;
	String GNPConvenioDescripcion;
	String GNPConvenioEstatus;
	String GNPConvenioFinVigencia;
	String GNPConvenioInicioVigencia;
	String GNPConvenioVersion;
	String GNPDelegacionDestino;
	String GNPDelegacionOrigen;
	String GNPEfectoFin;
	String GNPEfectoMovimiento;
	String GNPEntrevistadoTel2;
	String GNPEstadoDestino;
	String GNPEstadoOrigen;
	String GNPEventoCatastrofico;
	String GNPFechaHoy;
	String GNPFlgControlReclamos;
	String GNPFlgSincronizacion;
	String GNPGuardadoFlag;
	String GNPInvestigacion;
	String GNPLineaNegocio;
	String GNPLineaNegocioAfectada;
	String GNPNomConductor;
	String GNPNomEntrevistado;
	String GNPNomOperador;
	String GNPNombreViaDestino;
	String GNPNombreViaOrigen;
	String GNPNumLocalSiniestro;
	String GNPNumeroVehiculos;
	String GNPObjetoAsegurado;
	String GNPObjetoFin;
	String GNPObjetoInicio;
	String GNPOtrosInformacionTipoCliente;
	String GNPOtrosTipoCliente;
	String GNPOtrosTipoClienteCD;
	String GNPPlano;
	String GNPPolizaCDEstatus;
	String GNPPolizaCiaLider;
	String GNPPolizaEstatus;
	String GNPPolizaInicio;
	String GNPPolizaTurista;
	String GNPPolizaVehiculoCDCarroceria;
	String GNPPolizaVehiculoCDColor;
	String GNPPolizaVehiculoCDMarca;
	String GNPPolizaVehiculoCDModelo;
	String GNPPolizaVehiculoCDTipo;
	String GNPPolizaVehiculoCDVersion;
	String GNPPolizaVehiculoCarroceria;
	String GNPPolizaVehiculoColor;
	String GNPPolizaVehiculoMarca;
	String GNPPolizaVehiculoModelo;
	String GNPPolizaVehiculoMotor;
	String GNPPolizaVehiculoPlacas;
	String GNPPolizaVehiculoSerie;
	String GNPPolizaVehiculoTipo;
	String GNPPolizaVehiculoVersion;
	String GNPPolizaVersion;
	String GNPPolizaVigenciaFin;
	String GNPPolizaVigenciaInicio;
	String GNPPreSiniestroReadOnly;
	String GNPPresiniestroSiNo;
	String GNPPropietario;
	String GNPReporta;
	String GNPReportaNombre;
	String GNPReportaTelefono;
	String GNPSiniestroCiaLider;
	String GNPTelConductor;
	String GNPTelEntrevistado;
	String GNPTelEntrevistado1Cel;
	String GNPTelEntrevistado1Ext;
	String GNPTelEntrevistado1Lada;
	String GNPTelEntrevistado1Pais;
	String GNPTelEntrevistado2Cel;
	String GNPTelEntrevistado2Ext;
	String GNPTelEntrevistado2Lada;
	String GNPTelEntrevistado2Pais;
	String GNPTelReportaCel;
	String GNPTelReportaExt;
	String GNPTelReportaLada;
	String GNPTelReportaPais;
	String GNPTelefonoCelular;
	String GNPTelefonoExtension;
	String GNPTelefonoLada;
	String GNPTelefonoPais;
	String GNPTelefonoTipo;
	String GNPTiempoMaxServicio;
	String GNPTiempoMinServicio;
	String GNPTipoSiniestro;
	String GNPTramitadorPrincipal;
	String GNPTranporteUbicacionMercancia;
	String GNPTransporteCDMedio;
	String GNPTransporteCDMoneda;
	String GNPTransportePropio;
	String GNPTransporteValorEmbarque;
	String GNPUbicacionCAPP;
	String GNPUbicacionEntre;
	String GNPUbicacionEntre2;
	String GNPUbicacionKM;
	String GNPUbicacionNombreVia;
	String GNPUbicacionNumeroVia;
	String GNPUbicacionSupervisoria;
	String GNPUbicacionX;
	String GNPUbicacionY;
	String GNPVehiculoCDCarroceria;
	String GNPVehiculoCDColor;
	String GNPVehiculoCDMarca;
	String GNPVehiculoCDModelo;
	String GNPVehiculoCDTipo;
	String GNPVehiculoCDVersion;
	String GNPVehiculoCarroceria;
	String GNPVehiculoColor;
	String GNPVehiculoDescripcion;
	String GNPVehiculoMarca;
	String GNPVehiculoModelo;
	String GNPVehiculoMotor;
	String GNPVehiculoPlacas;
	String GNPVehiculoSerie;
	String GNPVehiculoSync;
	String GNPVehiculoVersion;
	String LocationType;
	String LossCause;
	String LossDate;
	String LossDescription;
	String LossLocationCity;
	String LossLocationCounty;
	String LossLocationZip;
	String LossTime;
	String LossTypeCode;
	String PolicyNumber;
	String ProcedureCode;
	String Referral;
	String ReportedDate;
	String SalvageComments;
	String SubrogationFlag;
	String SummaryCode;
	String TotalClaimPayments;
	String TotalClaimReserves;
	String TotalSalvageRecovery;
	String TotalSubRecovery;
	String VisitType;
	String WasanyoneInjured;
	String ListOfGnpSiniestrosServiciosDanosBc;
	
	@XmlElement
	public String getCatastropheCode()
	{
		return CatastropheCode;
	}
	public void setCatastropheCode(String CatastropheCode)
	{
		this.CatastropheCode = CatastropheCode;
	}
	
	public String getClaimNumber()
	{
		return ClaimNumber;
	}
	public void setClaimNumber(String ClaimNumber)
	{
		this.ClaimNumber = ClaimNumber;
	}
	
    @Override
    public String toString() 
    {
        return "CatastropheCode = " + CatastropheCode;
    }
}
