package GNP;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

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
	public Object getInsClaims() {
		return InsClaims;
	}
	public void setInsClaims(Object insClaims) {
		InsClaims = insClaims;
	}
	public String getCatastropheCode() {
		return CatastropheCode;
	}
	public void setCatastropheCode(String catastropheCode) {
		CatastropheCode = catastropheCode;
	}
	public String getClaimNumber() {
		return ClaimNumber;
	}
	public void setClaimNumber(String claimNumber) {
		ClaimNumber = claimNumber;
	}
	public String getClaimServiceLocn() {
		return ClaimServiceLocn;
	}
	public void setClaimServiceLocn(String claimServiceLocn) {
		ClaimServiceLocn = claimServiceLocn;
	}
	public String getCrossReferencePolicies() {
		return CrossReferencePolicies;
	}
	public void setCrossReferencePolicies(String crossReferencePolicies) {
		CrossReferencePolicies = crossReferencePolicies;
	}
	public String getCurrencyCode() {
		return CurrencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}
	public String getDamages() {
		return Damages;
	}
	public void setDamages(String damages) {
		Damages = damages;
	}
	public String getDiagnosisCode() {
		return DiagnosisCode;
	}
	public void setDiagnosisCode(String diagnosisCode) {
		DiagnosisCode = diagnosisCode;
	}
	public String getGNPAgenteSICA() {
		return GNPAgenteSICA;
	}
	public void setGNPAgenteSICA(String gNPAgenteSICA) {
		GNPAgenteSICA = gNPAgenteSICA;
	}
	public String getGNPCDMonedaSICA() {
		return GNPCDMonedaSICA;
	}
	public void setGNPCDMonedaSICA(String gNPCDMonedaSICA) {
		GNPCDMonedaSICA = gNPCDMonedaSICA;
	}
	public String getGNPClaveOficina() {
		return GNPClaveOficina;
	}
	public void setGNPClaveOficina(String gNPClaveOficina) {
		GNPClaveOficina = gNPClaveOficina;
	}
	public String getGNPCodigoFiliacionTomador() {
		return GNPCodigoFiliacionTomador;
	}
	public void setGNPCodigoFiliacionTomador(String gNPCodigoFiliacionTomador) {
		GNPCodigoFiliacionTomador = gNPCodigoFiliacionTomador;
	}
	public String getGNPCodigoProductoTecnico() {
		return GNPCodigoProductoTecnico;
	}
	public void setGNPCodigoProductoTecnico(String gNPCodigoProductoTecnico) {
		GNPCodigoProductoTecnico = gNPCodigoProductoTecnico;
	}
	public String getGNPCristaleraSICA() {
		return GNPCristaleraSICA;
	}
	public void setGNPCristaleraSICA(String gNPCristaleraSICA) {
		GNPCristaleraSICA = gNPCristaleraSICA;
	}
	public String getGNPDescripcionClienteSICA() {
		return GNPDescripcionClienteSICA;
	}
	public void setGNPDescripcionClienteSICA(String gNPDescripcionClienteSICA) {
		GNPDescripcionClienteSICA = gNPDescripcionClienteSICA;
	}
	public String getGNPDescripcionConcesionarioSICA() {
		return GNPDescripcionConcesionarioSICA;
	}
	public void setGNPDescripcionConcesionarioSICA(String gNPDescripcionConcesionarioSICA) {
		GNPDescripcionConcesionarioSICA = gNPDescripcionConcesionarioSICA;
	}
	public String getGNPDescripcionObjeto() {
		return GNPDescripcionObjeto;
	}
	public void setGNPDescripcionObjeto(String gNPDescripcionObjeto) {
		GNPDescripcionObjeto = gNPDescripcionObjeto;
	}
	public String getGNPError() {
		return GNPError;
	}
	public void setGNPError(String gNPError) {
		GNPError = gNPError;
	}
	public String getGNPInconclusoFlag() {
		return GNPInconclusoFlag;
	}
	public void setGNPInconclusoFlag(String gNPInconclusoFlag) {
		GNPInconclusoFlag = gNPInconclusoFlag;
	}
	public String getGNPLlamadaFin() {
		return GNPLlamadaFin;
	}
	public void setGNPLlamadaFin(String gNPLlamadaFin) {
		GNPLlamadaFin = gNPLlamadaFin;
	}
	public String getGNPLlamadaInicio() {
		return GNPLlamadaInicio;
	}
	public void setGNPLlamadaInicio(String gNPLlamadaInicio) {
		GNPLlamadaInicio = gNPLlamadaInicio;
	}
	public String getGNPPTDanosCD() {
		return GNPPTDanosCD;
	}
	public void setGNPPTDanosCD(String gNPPTDanosCD) {
		GNPPTDanosCD = gNPPTDanosCD;
	}
	public String getGNPPresiniestroGuardadoFlag() {
		return GNPPresiniestroGuardadoFlag;
	}
	public void setGNPPresiniestroGuardadoFlag(String gNPPresiniestroGuardadoFlag) {
		GNPPresiniestroGuardadoFlag = gNPPresiniestroGuardadoFlag;
	}
	public String getGNPPresiniestroSICA() {
		return GNPPresiniestroSICA;
	}
	public void setGNPPresiniestroSICA(String gNPPresiniestroSICA) {
		GNPPresiniestroSICA = gNPPresiniestroSICA;
	}
	public String getGNPSiniestroCondicionado() {
		return GNPSiniestroCondicionado;
	}
	public void setGNPSiniestroCondicionado(String gNPSiniestroCondicionado) {
		GNPSiniestroCondicionado = gNPSiniestroCondicionado;
	}
	public String getGNPSolicitudAnticipadaFlag() {
		return GNPSolicitudAnticipadaFlag;
	}
	public void setGNPSolicitudAnticipadaFlag(String gNPSolicitudAnticipadaFlag) {
		GNPSolicitudAnticipadaFlag = gNPSolicitudAnticipadaFlag;
	}
	public String getGNPSolicitudAnticipadaServicioFlag() {
		return GNPSolicitudAnticipadaServicioFlag;
	}
	public void setGNPSolicitudAnticipadaServicioFlag(String gNPSolicitudAnticipadaServicioFlag) {
		GNPSolicitudAnticipadaServicioFlag = gNPSolicitudAnticipadaServicioFlag;
	}
	public String getGNPTipoUbicacion() {
		return GNPTipoUbicacion;
	}
	public void setGNPTipoUbicacion(String gNPTipoUbicacion) {
		GNPTipoUbicacion = gNPTipoUbicacion;
	}
	public String getGNPVehiculoOtrosDescripcion() {
		return GNPVehiculoOtrosDescripcion;
	}
	public void setGNPVehiculoOtrosDescripcion(String gNPVehiculoOtrosDescripcion) {
		GNPVehiculoOtrosDescripcion = gNPVehiculoOtrosDescripcion;
	}
	public String getGNPAsentamiento() {
		return GNPAsentamiento;
	}
	public void setGNPAsentamiento(String gNPAsentamiento) {
		GNPAsentamiento = gNPAsentamiento;
	}
	public String getGNPAveriguacionPrevia() {
		return GNPAveriguacionPrevia;
	}
	public void setGNPAveriguacionPrevia(String gNPAveriguacionPrevia) {
		GNPAveriguacionPrevia = gNPAveriguacionPrevia;
	}
	public String getGNPCDAsentamiento() {
		return GNPCDAsentamiento;
	}
	public void setGNPCDAsentamiento(String gNPCDAsentamiento) {
		GNPCDAsentamiento = gNPCDAsentamiento;
	}
	public String getGNPCDAsentamientoTipo() {
		return GNPCDAsentamientoTipo;
	}
	public void setGNPCDAsentamientoTipo(String gNPCDAsentamientoTipo) {
		GNPCDAsentamientoTipo = gNPCDAsentamientoTipo;
	}
	public String getGNPCDCausa() {
		return GNPCDCausa;
	}
	public void setGNPCDCausa(String gNPCDCausa) {
		GNPCDCausa = gNPCDCausa;
	}
	public String getGNPCDDelegacion() {
		return GNPCDDelegacion;
	}
	public void setGNPCDDelegacion(String gNPCDDelegacion) {
		GNPCDDelegacion = gNPCDDelegacion;
	}
	public String getGNPCDDelegacionDestino() {
		return GNPCDDelegacionDestino;
	}
	public void setGNPCDDelegacionDestino(String gNPCDDelegacionDestino) {
		GNPCDDelegacionDestino = gNPCDDelegacionDestino;
	}
	public String getGNPCDDelegacionOrigen() {
		return GNPCDDelegacionOrigen;
	}
	public void setGNPCDDelegacionOrigen(String gNPCDDelegacionOrigen) {
		GNPCDDelegacionOrigen = gNPCDDelegacionOrigen;
	}
	public String getGNPCDEstado() {
		return GNPCDEstado;
	}
	public void setGNPCDEstado(String gNPCDEstado) {
		GNPCDEstado = gNPCDEstado;
	}
	public String getGNPCDEstadoDestino() {
		return GNPCDEstadoDestino;
	}
	public void setGNPCDEstadoDestino(String gNPCDEstadoDestino) {
		GNPCDEstadoDestino = gNPCDEstadoDestino;
	}
	public String getGNPCDEstadoOrigen() {
		return GNPCDEstadoOrigen;
	}
	public void setGNPCDEstadoOrigen(String gNPCDEstadoOrigen) {
		GNPCDEstadoOrigen = gNPCDEstadoOrigen;
	}
	public String getGNPCDEventoCatastrofico() {
		return GNPCDEventoCatastrofico;
	}
	public void setGNPCDEventoCatastrofico(String gNPCDEventoCatastrofico) {
		GNPCDEventoCatastrofico = gNPCDEventoCatastrofico;
	}
	public String getGNPCDInvestigacion() {
		return GNPCDInvestigacion;
	}
	public void setGNPCDInvestigacion(String gNPCDInvestigacion) {
		GNPCDInvestigacion = gNPCDInvestigacion;
	}
	public String getGNPCDMoneda() {
		return GNPCDMoneda;
	}
	public void setGNPCDMoneda(String gNPCDMoneda) {
		GNPCDMoneda = gNPCDMoneda;
	}
	public String getGNPCDObjetoAsegurado() {
		return GNPCDObjetoAsegurado;
	}
	public void setGNPCDObjetoAsegurado(String gNPCDObjetoAsegurado) {
		GNPCDObjetoAsegurado = gNPCDObjetoAsegurado;
	}
	public String getGNPCDReporta() {
		return GNPCDReporta;
	}
	public void setGNPCDReporta(String gNPCDReporta) {
		GNPCDReporta = gNPCDReporta;
	}
	public String getGNPCDTelefonoTipo() {
		return GNPCDTelefonoTipo;
	}
	public void setGNPCDTelefonoTipo(String gNPCDTelefonoTipo) {
		GNPCDTelefonoTipo = gNPCDTelefonoTipo;
	}
	public String getGNPCDTipoVia() {
		return GNPCDTipoVia;
	}
	public void setGNPCDTipoVia(String gNPCDTipoVia) {
		GNPCDTipoVia = gNPCDTipoVia;
	}
	public String getGNPCPDestino() {
		return GNPCPDestino;
	}
	public void setGNPCPDestino(String gNPCPDestino) {
		GNPCPDestino = gNPCPDestino;
	}
	public String getGNPCPOrigen() {
		return GNPCPOrigen;
	}
	public void setGNPCPOrigen(String gNPCPOrigen) {
		GNPCPOrigen = gNPCPOrigen;
	}
	public String getGNPCodigoFiliacion() {
		return GNPCodigoFiliacion;
	}
	public void setGNPCodigoFiliacion(String gNPCodigoFiliacion) {
		GNPCodigoFiliacion = gNPCodigoFiliacion;
	}
	public String getGNPCodigoNegocio() {
		return GNPCodigoNegocio;
	}
	public void setGNPCodigoNegocio(String gNPCodigoNegocio) {
		GNPCodigoNegocio = gNPCodigoNegocio;
	}
	public String getGNPCodigoProductoComercial() {
		return GNPCodigoProductoComercial;
	}
	public void setGNPCodigoProductoComercial(String gNPCodigoProductoComercial) {
		GNPCodigoProductoComercial = gNPCodigoProductoComercial;
	}
	public String getGNPCodigoSecuenciaOA() {
		return GNPCodigoSecuenciaOA;
	}
	public void setGNPCodigoSecuenciaOA(String gNPCodigoSecuenciaOA) {
		GNPCodigoSecuenciaOA = gNPCodigoSecuenciaOA;
	}
	public String getGNPConvenioCDEstatus() {
		return GNPConvenioCDEstatus;
	}
	public void setGNPConvenioCDEstatus(String gNPConvenioCDEstatus) {
		GNPConvenioCDEstatus = gNPConvenioCDEstatus;
	}
	public String getGNPConvenioCodigo() {
		return GNPConvenioCodigo;
	}
	public void setGNPConvenioCodigo(String gNPConvenioCodigo) {
		GNPConvenioCodigo = gNPConvenioCodigo;
	}
	public String getGNPConvenioDescripcion() {
		return GNPConvenioDescripcion;
	}
	public void setGNPConvenioDescripcion(String gNPConvenioDescripcion) {
		GNPConvenioDescripcion = gNPConvenioDescripcion;
	}
	public String getGNPConvenioEstatus() {
		return GNPConvenioEstatus;
	}
	public void setGNPConvenioEstatus(String gNPConvenioEstatus) {
		GNPConvenioEstatus = gNPConvenioEstatus;
	}
	public String getGNPConvenioFinVigencia() {
		return GNPConvenioFinVigencia;
	}
	public void setGNPConvenioFinVigencia(String gNPConvenioFinVigencia) {
		GNPConvenioFinVigencia = gNPConvenioFinVigencia;
	}
	public String getGNPConvenioInicioVigencia() {
		return GNPConvenioInicioVigencia;
	}
	public void setGNPConvenioInicioVigencia(String gNPConvenioInicioVigencia) {
		GNPConvenioInicioVigencia = gNPConvenioInicioVigencia;
	}
	public String getGNPConvenioVersion() {
		return GNPConvenioVersion;
	}
	public void setGNPConvenioVersion(String gNPConvenioVersion) {
		GNPConvenioVersion = gNPConvenioVersion;
	}
	public String getGNPDelegacionDestino() {
		return GNPDelegacionDestino;
	}
	public void setGNPDelegacionDestino(String gNPDelegacionDestino) {
		GNPDelegacionDestino = gNPDelegacionDestino;
	}
	public String getGNPDelegacionOrigen() {
		return GNPDelegacionOrigen;
	}
	public void setGNPDelegacionOrigen(String gNPDelegacionOrigen) {
		GNPDelegacionOrigen = gNPDelegacionOrigen;
	}
	public String getGNPEfectoFin() {
		return GNPEfectoFin;
	}
	public void setGNPEfectoFin(String gNPEfectoFin) {
		GNPEfectoFin = gNPEfectoFin;
	}
	public String getGNPEfectoMovimiento() {
		return GNPEfectoMovimiento;
	}
	public void setGNPEfectoMovimiento(String gNPEfectoMovimiento) {
		GNPEfectoMovimiento = gNPEfectoMovimiento;
	}
	public String getGNPEntrevistadoTel2() {
		return GNPEntrevistadoTel2;
	}
	public void setGNPEntrevistadoTel2(String gNPEntrevistadoTel2) {
		GNPEntrevistadoTel2 = gNPEntrevistadoTel2;
	}
	public String getGNPEstadoDestino() {
		return GNPEstadoDestino;
	}
	public void setGNPEstadoDestino(String gNPEstadoDestino) {
		GNPEstadoDestino = gNPEstadoDestino;
	}
	public String getGNPEstadoOrigen() {
		return GNPEstadoOrigen;
	}
	public void setGNPEstadoOrigen(String gNPEstadoOrigen) {
		GNPEstadoOrigen = gNPEstadoOrigen;
	}
	public String getGNPEventoCatastrofico() {
		return GNPEventoCatastrofico;
	}
	public void setGNPEventoCatastrofico(String gNPEventoCatastrofico) {
		GNPEventoCatastrofico = gNPEventoCatastrofico;
	}
	public String getGNPFechaHoy() {
		return GNPFechaHoy;
	}
	public void setGNPFechaHoy(String gNPFechaHoy) {
		GNPFechaHoy = gNPFechaHoy;
	}
	public String getGNPFlgControlReclamos() {
		return GNPFlgControlReclamos;
	}
	public void setGNPFlgControlReclamos(String gNPFlgControlReclamos) {
		GNPFlgControlReclamos = gNPFlgControlReclamos;
	}
	public String getGNPFlgSincronizacion() {
		return GNPFlgSincronizacion;
	}
	public void setGNPFlgSincronizacion(String gNPFlgSincronizacion) {
		GNPFlgSincronizacion = gNPFlgSincronizacion;
	}
	public String getGNPGuardadoFlag() {
		return GNPGuardadoFlag;
	}
	public void setGNPGuardadoFlag(String gNPGuardadoFlag) {
		GNPGuardadoFlag = gNPGuardadoFlag;
	}
	public String getGNPInvestigacion() {
		return GNPInvestigacion;
	}
	public void setGNPInvestigacion(String gNPInvestigacion) {
		GNPInvestigacion = gNPInvestigacion;
	}
	public String getGNPLineaNegocio() {
		return GNPLineaNegocio;
	}
	public void setGNPLineaNegocio(String gNPLineaNegocio) {
		GNPLineaNegocio = gNPLineaNegocio;
	}
	public String getGNPLineaNegocioAfectada() {
		return GNPLineaNegocioAfectada;
	}
	public void setGNPLineaNegocioAfectada(String gNPLineaNegocioAfectada) {
		GNPLineaNegocioAfectada = gNPLineaNegocioAfectada;
	}
	public String getGNPNomConductor() {
		return GNPNomConductor;
	}
	public void setGNPNomConductor(String gNPNomConductor) {
		GNPNomConductor = gNPNomConductor;
	}
	public String getGNPNomEntrevistado() {
		return GNPNomEntrevistado;
	}
	public void setGNPNomEntrevistado(String gNPNomEntrevistado) {
		GNPNomEntrevistado = gNPNomEntrevistado;
	}
	public String getGNPNomOperador() {
		return GNPNomOperador;
	}
	public void setGNPNomOperador(String gNPNomOperador) {
		GNPNomOperador = gNPNomOperador;
	}
	public String getGNPNombreViaDestino() {
		return GNPNombreViaDestino;
	}
	public void setGNPNombreViaDestino(String gNPNombreViaDestino) {
		GNPNombreViaDestino = gNPNombreViaDestino;
	}
	public String getGNPNombreViaOrigen() {
		return GNPNombreViaOrigen;
	}
	public void setGNPNombreViaOrigen(String gNPNombreViaOrigen) {
		GNPNombreViaOrigen = gNPNombreViaOrigen;
	}
	public String getGNPNumLocalSiniestro() {
		return GNPNumLocalSiniestro;
	}
	public void setGNPNumLocalSiniestro(String gNPNumLocalSiniestro) {
		GNPNumLocalSiniestro = gNPNumLocalSiniestro;
	}
	public String getGNPNumeroVehiculos() {
		return GNPNumeroVehiculos;
	}
	public void setGNPNumeroVehiculos(String gNPNumeroVehiculos) {
		GNPNumeroVehiculos = gNPNumeroVehiculos;
	}
	public String getGNPObjetoAsegurado() {
		return GNPObjetoAsegurado;
	}
	public void setGNPObjetoAsegurado(String gNPObjetoAsegurado) {
		GNPObjetoAsegurado = gNPObjetoAsegurado;
	}
	public String getGNPObjetoFin() {
		return GNPObjetoFin;
	}
	public void setGNPObjetoFin(String gNPObjetoFin) {
		GNPObjetoFin = gNPObjetoFin;
	}
	public String getGNPObjetoInicio() {
		return GNPObjetoInicio;
	}
	public void setGNPObjetoInicio(String gNPObjetoInicio) {
		GNPObjetoInicio = gNPObjetoInicio;
	}
	public String getGNPOtrosInformacionTipoCliente() {
		return GNPOtrosInformacionTipoCliente;
	}
	public void setGNPOtrosInformacionTipoCliente(String gNPOtrosInformacionTipoCliente) {
		GNPOtrosInformacionTipoCliente = gNPOtrosInformacionTipoCliente;
	}
	public String getGNPOtrosTipoCliente() {
		return GNPOtrosTipoCliente;
	}
	public void setGNPOtrosTipoCliente(String gNPOtrosTipoCliente) {
		GNPOtrosTipoCliente = gNPOtrosTipoCliente;
	}
	public String getGNPOtrosTipoClienteCD() {
		return GNPOtrosTipoClienteCD;
	}
	public void setGNPOtrosTipoClienteCD(String gNPOtrosTipoClienteCD) {
		GNPOtrosTipoClienteCD = gNPOtrosTipoClienteCD;
	}
	public String getGNPPlano() {
		return GNPPlano;
	}
	public void setGNPPlano(String gNPPlano) {
		GNPPlano = gNPPlano;
	}
	public String getGNPPolizaCDEstatus() {
		return GNPPolizaCDEstatus;
	}
	public void setGNPPolizaCDEstatus(String gNPPolizaCDEstatus) {
		GNPPolizaCDEstatus = gNPPolizaCDEstatus;
	}
	public String getGNPPolizaCiaLider() {
		return GNPPolizaCiaLider;
	}
	public void setGNPPolizaCiaLider(String gNPPolizaCiaLider) {
		GNPPolizaCiaLider = gNPPolizaCiaLider;
	}
	public String getGNPPolizaEstatus() {
		return GNPPolizaEstatus;
	}
	public void setGNPPolizaEstatus(String gNPPolizaEstatus) {
		GNPPolizaEstatus = gNPPolizaEstatus;
	}
	public String getGNPPolizaInicio() {
		return GNPPolizaInicio;
	}
	public void setGNPPolizaInicio(String gNPPolizaInicio) {
		GNPPolizaInicio = gNPPolizaInicio;
	}
	public String getGNPPolizaTurista() {
		return GNPPolizaTurista;
	}
	public void setGNPPolizaTurista(String gNPPolizaTurista) {
		GNPPolizaTurista = gNPPolizaTurista;
	}
	public String getGNPPolizaVehiculoCDCarroceria() {
		return GNPPolizaVehiculoCDCarroceria;
	}
	public void setGNPPolizaVehiculoCDCarroceria(String gNPPolizaVehiculoCDCarroceria) {
		GNPPolizaVehiculoCDCarroceria = gNPPolizaVehiculoCDCarroceria;
	}
	public String getGNPPolizaVehiculoCDColor() {
		return GNPPolizaVehiculoCDColor;
	}
	public void setGNPPolizaVehiculoCDColor(String gNPPolizaVehiculoCDColor) {
		GNPPolizaVehiculoCDColor = gNPPolizaVehiculoCDColor;
	}
	public String getGNPPolizaVehiculoCDMarca() {
		return GNPPolizaVehiculoCDMarca;
	}
	public void setGNPPolizaVehiculoCDMarca(String gNPPolizaVehiculoCDMarca) {
		GNPPolizaVehiculoCDMarca = gNPPolizaVehiculoCDMarca;
	}
	public String getGNPPolizaVehiculoCDModelo() {
		return GNPPolizaVehiculoCDModelo;
	}
	public void setGNPPolizaVehiculoCDModelo(String gNPPolizaVehiculoCDModelo) {
		GNPPolizaVehiculoCDModelo = gNPPolizaVehiculoCDModelo;
	}
	public String getGNPPolizaVehiculoCDTipo() {
		return GNPPolizaVehiculoCDTipo;
	}
	public void setGNPPolizaVehiculoCDTipo(String gNPPolizaVehiculoCDTipo) {
		GNPPolizaVehiculoCDTipo = gNPPolizaVehiculoCDTipo;
	}
	public String getGNPPolizaVehiculoCDVersion() {
		return GNPPolizaVehiculoCDVersion;
	}
	public void setGNPPolizaVehiculoCDVersion(String gNPPolizaVehiculoCDVersion) {
		GNPPolizaVehiculoCDVersion = gNPPolizaVehiculoCDVersion;
	}
	public String getGNPPolizaVehiculoCarroceria() {
		return GNPPolizaVehiculoCarroceria;
	}
	public void setGNPPolizaVehiculoCarroceria(String gNPPolizaVehiculoCarroceria) {
		GNPPolizaVehiculoCarroceria = gNPPolizaVehiculoCarroceria;
	}
	public String getGNPPolizaVehiculoColor() {
		return GNPPolizaVehiculoColor;
	}
	public void setGNPPolizaVehiculoColor(String gNPPolizaVehiculoColor) {
		GNPPolizaVehiculoColor = gNPPolizaVehiculoColor;
	}
	public String getGNPPolizaVehiculoMarca() {
		return GNPPolizaVehiculoMarca;
	}
	public void setGNPPolizaVehiculoMarca(String gNPPolizaVehiculoMarca) {
		GNPPolizaVehiculoMarca = gNPPolizaVehiculoMarca;
	}
	public String getGNPPolizaVehiculoModelo() {
		return GNPPolizaVehiculoModelo;
	}
	public void setGNPPolizaVehiculoModelo(String gNPPolizaVehiculoModelo) {
		GNPPolizaVehiculoModelo = gNPPolizaVehiculoModelo;
	}
	public String getGNPPolizaVehiculoMotor() {
		return GNPPolizaVehiculoMotor;
	}
	public void setGNPPolizaVehiculoMotor(String gNPPolizaVehiculoMotor) {
		GNPPolizaVehiculoMotor = gNPPolizaVehiculoMotor;
	}
	public String getGNPPolizaVehiculoPlacas() {
		return GNPPolizaVehiculoPlacas;
	}
	public void setGNPPolizaVehiculoPlacas(String gNPPolizaVehiculoPlacas) {
		GNPPolizaVehiculoPlacas = gNPPolizaVehiculoPlacas;
	}
	public String getGNPPolizaVehiculoSerie() {
		return GNPPolizaVehiculoSerie;
	}
	public void setGNPPolizaVehiculoSerie(String gNPPolizaVehiculoSerie) {
		GNPPolizaVehiculoSerie = gNPPolizaVehiculoSerie;
	}
	public String getGNPPolizaVehiculoTipo() {
		return GNPPolizaVehiculoTipo;
	}
	public void setGNPPolizaVehiculoTipo(String gNPPolizaVehiculoTipo) {
		GNPPolizaVehiculoTipo = gNPPolizaVehiculoTipo;
	}
	public String getGNPPolizaVehiculoVersion() {
		return GNPPolizaVehiculoVersion;
	}
	public void setGNPPolizaVehiculoVersion(String gNPPolizaVehiculoVersion) {
		GNPPolizaVehiculoVersion = gNPPolizaVehiculoVersion;
	}
	public String getGNPPolizaVersion() {
		return GNPPolizaVersion;
	}
	public void setGNPPolizaVersion(String gNPPolizaVersion) {
		GNPPolizaVersion = gNPPolizaVersion;
	}
	public String getGNPPolizaVigenciaFin() {
		return GNPPolizaVigenciaFin;
	}
	public void setGNPPolizaVigenciaFin(String gNPPolizaVigenciaFin) {
		GNPPolizaVigenciaFin = gNPPolizaVigenciaFin;
	}
	public String getGNPPolizaVigenciaInicio() {
		return GNPPolizaVigenciaInicio;
	}
	public void setGNPPolizaVigenciaInicio(String gNPPolizaVigenciaInicio) {
		GNPPolizaVigenciaInicio = gNPPolizaVigenciaInicio;
	}
	public String getGNPPreSiniestroReadOnly() {
		return GNPPreSiniestroReadOnly;
	}
	public void setGNPPreSiniestroReadOnly(String gNPPreSiniestroReadOnly) {
		GNPPreSiniestroReadOnly = gNPPreSiniestroReadOnly;
	}
	public String getGNPPresiniestroSiNo() {
		return GNPPresiniestroSiNo;
	}
	public void setGNPPresiniestroSiNo(String gNPPresiniestroSiNo) {
		GNPPresiniestroSiNo = gNPPresiniestroSiNo;
	}
	public String getGNPPropietario() {
		return GNPPropietario;
	}
	public void setGNPPropietario(String gNPPropietario) {
		GNPPropietario = gNPPropietario;
	}
	public String getGNPReporta() {
		return GNPReporta;
	}
	public void setGNPReporta(String gNPReporta) {
		GNPReporta = gNPReporta;
	}
	public String getGNPReportaNombre() {
		return GNPReportaNombre;
	}
	public void setGNPReportaNombre(String gNPReportaNombre) {
		GNPReportaNombre = gNPReportaNombre;
	}
	public String getGNPReportaTelefono() {
		return GNPReportaTelefono;
	}
	public void setGNPReportaTelefono(String gNPReportaTelefono) {
		GNPReportaTelefono = gNPReportaTelefono;
	}
	public String getGNPSiniestroCiaLider() {
		return GNPSiniestroCiaLider;
	}
	public void setGNPSiniestroCiaLider(String gNPSiniestroCiaLider) {
		GNPSiniestroCiaLider = gNPSiniestroCiaLider;
	}
	public String getGNPTelConductor() {
		return GNPTelConductor;
	}
	public void setGNPTelConductor(String gNPTelConductor) {
		GNPTelConductor = gNPTelConductor;
	}
	public String getGNPTelEntrevistado() {
		return GNPTelEntrevistado;
	}
	public void setGNPTelEntrevistado(String gNPTelEntrevistado) {
		GNPTelEntrevistado = gNPTelEntrevistado;
	}
	public String getGNPTelEntrevistado1Cel() {
		return GNPTelEntrevistado1Cel;
	}
	public void setGNPTelEntrevistado1Cel(String gNPTelEntrevistado1Cel) {
		GNPTelEntrevistado1Cel = gNPTelEntrevistado1Cel;
	}
	public String getGNPTelEntrevistado1Ext() {
		return GNPTelEntrevistado1Ext;
	}
	public void setGNPTelEntrevistado1Ext(String gNPTelEntrevistado1Ext) {
		GNPTelEntrevistado1Ext = gNPTelEntrevistado1Ext;
	}
	public String getGNPTelEntrevistado1Lada() {
		return GNPTelEntrevistado1Lada;
	}
	public void setGNPTelEntrevistado1Lada(String gNPTelEntrevistado1Lada) {
		GNPTelEntrevistado1Lada = gNPTelEntrevistado1Lada;
	}
	public String getGNPTelEntrevistado1Pais() {
		return GNPTelEntrevistado1Pais;
	}
	public void setGNPTelEntrevistado1Pais(String gNPTelEntrevistado1Pais) {
		GNPTelEntrevistado1Pais = gNPTelEntrevistado1Pais;
	}
	public String getGNPTelEntrevistado2Cel() {
		return GNPTelEntrevistado2Cel;
	}
	public void setGNPTelEntrevistado2Cel(String gNPTelEntrevistado2Cel) {
		GNPTelEntrevistado2Cel = gNPTelEntrevistado2Cel;
	}
	public String getGNPTelEntrevistado2Ext() {
		return GNPTelEntrevistado2Ext;
	}
	public void setGNPTelEntrevistado2Ext(String gNPTelEntrevistado2Ext) {
		GNPTelEntrevistado2Ext = gNPTelEntrevistado2Ext;
	}
	public String getGNPTelEntrevistado2Lada() {
		return GNPTelEntrevistado2Lada;
	}
	public void setGNPTelEntrevistado2Lada(String gNPTelEntrevistado2Lada) {
		GNPTelEntrevistado2Lada = gNPTelEntrevistado2Lada;
	}
	public String getGNPTelEntrevistado2Pais() {
		return GNPTelEntrevistado2Pais;
	}
	public void setGNPTelEntrevistado2Pais(String gNPTelEntrevistado2Pais) {
		GNPTelEntrevistado2Pais = gNPTelEntrevistado2Pais;
	}
	public String getGNPTelReportaCel() {
		return GNPTelReportaCel;
	}
	public void setGNPTelReportaCel(String gNPTelReportaCel) {
		GNPTelReportaCel = gNPTelReportaCel;
	}
	public String getGNPTelReportaExt() {
		return GNPTelReportaExt;
	}
	public void setGNPTelReportaExt(String gNPTelReportaExt) {
		GNPTelReportaExt = gNPTelReportaExt;
	}
	public String getGNPTelReportaLada() {
		return GNPTelReportaLada;
	}
	public void setGNPTelReportaLada(String gNPTelReportaLada) {
		GNPTelReportaLada = gNPTelReportaLada;
	}
	public String getGNPTelReportaPais() {
		return GNPTelReportaPais;
	}
	public void setGNPTelReportaPais(String gNPTelReportaPais) {
		GNPTelReportaPais = gNPTelReportaPais;
	}
	public String getGNPTelefonoCelular() {
		return GNPTelefonoCelular;
	}
	public void setGNPTelefonoCelular(String gNPTelefonoCelular) {
		GNPTelefonoCelular = gNPTelefonoCelular;
	}
	public String getGNPTelefonoExtension() {
		return GNPTelefonoExtension;
	}
	public void setGNPTelefonoExtension(String gNPTelefonoExtension) {
		GNPTelefonoExtension = gNPTelefonoExtension;
	}
	public String getGNPTelefonoLada() {
		return GNPTelefonoLada;
	}
	public void setGNPTelefonoLada(String gNPTelefonoLada) {
		GNPTelefonoLada = gNPTelefonoLada;
	}
	public String getGNPTelefonoPais() {
		return GNPTelefonoPais;
	}
	public void setGNPTelefonoPais(String gNPTelefonoPais) {
		GNPTelefonoPais = gNPTelefonoPais;
	}
	public String getGNPTelefonoTipo() {
		return GNPTelefonoTipo;
	}
	public void setGNPTelefonoTipo(String gNPTelefonoTipo) {
		GNPTelefonoTipo = gNPTelefonoTipo;
	}
	public String getGNPTiempoMaxServicio() {
		return GNPTiempoMaxServicio;
	}
	public void setGNPTiempoMaxServicio(String gNPTiempoMaxServicio) {
		GNPTiempoMaxServicio = gNPTiempoMaxServicio;
	}
	public String getGNPTiempoMinServicio() {
		return GNPTiempoMinServicio;
	}
	public void setGNPTiempoMinServicio(String gNPTiempoMinServicio) {
		GNPTiempoMinServicio = gNPTiempoMinServicio;
	}
	public String getGNPTipoSiniestro() {
		return GNPTipoSiniestro;
	}
	public void setGNPTipoSiniestro(String gNPTipoSiniestro) {
		GNPTipoSiniestro = gNPTipoSiniestro;
	}
	public String getGNPTramitadorPrincipal() {
		return GNPTramitadorPrincipal;
	}
	public void setGNPTramitadorPrincipal(String gNPTramitadorPrincipal) {
		GNPTramitadorPrincipal = gNPTramitadorPrincipal;
	}
	public String getGNPTranporteUbicacionMercancia() {
		return GNPTranporteUbicacionMercancia;
	}
	public void setGNPTranporteUbicacionMercancia(String gNPTranporteUbicacionMercancia) {
		GNPTranporteUbicacionMercancia = gNPTranporteUbicacionMercancia;
	}
	public String getGNPTransporteCDMedio() {
		return GNPTransporteCDMedio;
	}
	public void setGNPTransporteCDMedio(String gNPTransporteCDMedio) {
		GNPTransporteCDMedio = gNPTransporteCDMedio;
	}
	public String getGNPTransporteCDMoneda() {
		return GNPTransporteCDMoneda;
	}
	public void setGNPTransporteCDMoneda(String gNPTransporteCDMoneda) {
		GNPTransporteCDMoneda = gNPTransporteCDMoneda;
	}
	public String getGNPTransportePropio() {
		return GNPTransportePropio;
	}
	public void setGNPTransportePropio(String gNPTransportePropio) {
		GNPTransportePropio = gNPTransportePropio;
	}
	public String getGNPTransporteValorEmbarque() {
		return GNPTransporteValorEmbarque;
	}
	public void setGNPTransporteValorEmbarque(String gNPTransporteValorEmbarque) {
		GNPTransporteValorEmbarque = gNPTransporteValorEmbarque;
	}
	public String getGNPUbicacionCAPP() {
		return GNPUbicacionCAPP;
	}
	public void setGNPUbicacionCAPP(String gNPUbicacionCAPP) {
		GNPUbicacionCAPP = gNPUbicacionCAPP;
	}
	public String getGNPUbicacionEntre() {
		return GNPUbicacionEntre;
	}
	public void setGNPUbicacionEntre(String gNPUbicacionEntre) {
		GNPUbicacionEntre = gNPUbicacionEntre;
	}
	public String getGNPUbicacionEntre2() {
		return GNPUbicacionEntre2;
	}
	public void setGNPUbicacionEntre2(String gNPUbicacionEntre2) {
		GNPUbicacionEntre2 = gNPUbicacionEntre2;
	}
	public String getGNPUbicacionKM() {
		return GNPUbicacionKM;
	}
	public void setGNPUbicacionKM(String gNPUbicacionKM) {
		GNPUbicacionKM = gNPUbicacionKM;
	}
	public String getGNPUbicacionNombreVia() {
		return GNPUbicacionNombreVia;
	}
	public void setGNPUbicacionNombreVia(String gNPUbicacionNombreVia) {
		GNPUbicacionNombreVia = gNPUbicacionNombreVia;
	}
	public String getGNPUbicacionNumeroVia() {
		return GNPUbicacionNumeroVia;
	}
	public void setGNPUbicacionNumeroVia(String gNPUbicacionNumeroVia) {
		GNPUbicacionNumeroVia = gNPUbicacionNumeroVia;
	}
	public String getGNPUbicacionSupervisoria() {
		return GNPUbicacionSupervisoria;
	}
	public void setGNPUbicacionSupervisoria(String gNPUbicacionSupervisoria) {
		GNPUbicacionSupervisoria = gNPUbicacionSupervisoria;
	}
	public String getGNPUbicacionX() {
		return GNPUbicacionX;
	}
	public void setGNPUbicacionX(String gNPUbicacionX) {
		GNPUbicacionX = gNPUbicacionX;
	}
	public String getGNPUbicacionY() {
		return GNPUbicacionY;
	}
	public void setGNPUbicacionY(String gNPUbicacionY) {
		GNPUbicacionY = gNPUbicacionY;
	}
	public String getGNPVehiculoCDCarroceria() {
		return GNPVehiculoCDCarroceria;
	}
	public void setGNPVehiculoCDCarroceria(String gNPVehiculoCDCarroceria) {
		GNPVehiculoCDCarroceria = gNPVehiculoCDCarroceria;
	}
	public String getGNPVehiculoCDColor() {
		return GNPVehiculoCDColor;
	}
	public void setGNPVehiculoCDColor(String gNPVehiculoCDColor) {
		GNPVehiculoCDColor = gNPVehiculoCDColor;
	}
	public String getGNPVehiculoCDMarca() {
		return GNPVehiculoCDMarca;
	}
	public void setGNPVehiculoCDMarca(String gNPVehiculoCDMarca) {
		GNPVehiculoCDMarca = gNPVehiculoCDMarca;
	}
	public String getGNPVehiculoCDModelo() {
		return GNPVehiculoCDModelo;
	}
	public void setGNPVehiculoCDModelo(String gNPVehiculoCDModelo) {
		GNPVehiculoCDModelo = gNPVehiculoCDModelo;
	}
	public String getGNPVehiculoCDTipo() {
		return GNPVehiculoCDTipo;
	}
	public void setGNPVehiculoCDTipo(String gNPVehiculoCDTipo) {
		GNPVehiculoCDTipo = gNPVehiculoCDTipo;
	}
	public String getGNPVehiculoCDVersion() {
		return GNPVehiculoCDVersion;
	}
	public void setGNPVehiculoCDVersion(String gNPVehiculoCDVersion) {
		GNPVehiculoCDVersion = gNPVehiculoCDVersion;
	}
	public String getGNPVehiculoCarroceria() {
		return GNPVehiculoCarroceria;
	}
	public void setGNPVehiculoCarroceria(String gNPVehiculoCarroceria) {
		GNPVehiculoCarroceria = gNPVehiculoCarroceria;
	}
	public String getGNPVehiculoColor() {
		return GNPVehiculoColor;
	}
	public void setGNPVehiculoColor(String gNPVehiculoColor) {
		GNPVehiculoColor = gNPVehiculoColor;
	}
	public String getGNPVehiculoDescripcion() {
		return GNPVehiculoDescripcion;
	}
	public void setGNPVehiculoDescripcion(String gNPVehiculoDescripcion) {
		GNPVehiculoDescripcion = gNPVehiculoDescripcion;
	}
	public String getGNPVehiculoMarca() {
		return GNPVehiculoMarca;
	}
	public void setGNPVehiculoMarca(String gNPVehiculoMarca) {
		GNPVehiculoMarca = gNPVehiculoMarca;
	}
	public String getGNPVehiculoModelo() {
		return GNPVehiculoModelo;
	}
	public void setGNPVehiculoModelo(String gNPVehiculoModelo) {
		GNPVehiculoModelo = gNPVehiculoModelo;
	}
	public String getGNPVehiculoMotor() {
		return GNPVehiculoMotor;
	}
	public void setGNPVehiculoMotor(String gNPVehiculoMotor) {
		GNPVehiculoMotor = gNPVehiculoMotor;
	}
	public String getGNPVehiculoPlacas() {
		return GNPVehiculoPlacas;
	}
	public void setGNPVehiculoPlacas(String gNPVehiculoPlacas) {
		GNPVehiculoPlacas = gNPVehiculoPlacas;
	}
	public String getGNPVehiculoSerie() {
		return GNPVehiculoSerie;
	}
	public void setGNPVehiculoSerie(String gNPVehiculoSerie) {
		GNPVehiculoSerie = gNPVehiculoSerie;
	}
	public String getGNPVehiculoSync() {
		return GNPVehiculoSync;
	}
	public void setGNPVehiculoSync(String gNPVehiculoSync) {
		GNPVehiculoSync = gNPVehiculoSync;
	}
	public String getGNPVehiculoVersion() {
		return GNPVehiculoVersion;
	}
	public void setGNPVehiculoVersion(String gNPVehiculoVersion) {
		GNPVehiculoVersion = gNPVehiculoVersion;
	}
	public String getLocationType() {
		return LocationType;
	}
	public void setLocationType(String locationType) {
		LocationType = locationType;
	}
	public String getLossCause() {
		return LossCause;
	}
	public void setLossCause(String lossCause) {
		LossCause = lossCause;
	}
	public String getLossDate() {
		return LossDate;
	}
	public void setLossDate(String lossDate) {
		LossDate = lossDate;
	}
	public String getLossDescription() {
		return LossDescription;
	}
	public void setLossDescription(String lossDescription) {
		LossDescription = lossDescription;
	}
	public String getLossLocationCity() {
		return LossLocationCity;
	}
	public void setLossLocationCity(String lossLocationCity) {
		LossLocationCity = lossLocationCity;
	}
	public String getLossLocationCounty() {
		return LossLocationCounty;
	}
	public void setLossLocationCounty(String lossLocationCounty) {
		LossLocationCounty = lossLocationCounty;
	}
	public String getLossLocationZip() {
		return LossLocationZip;
	}
	public void setLossLocationZip(String lossLocationZip) {
		LossLocationZip = lossLocationZip;
	}
	public String getLossTime() {
		return LossTime;
	}
	public void setLossTime(String lossTime) {
		LossTime = lossTime;
	}
	public String getLossTypeCode() {
		return LossTypeCode;
	}
	public void setLossTypeCode(String lossTypeCode) {
		LossTypeCode = lossTypeCode;
	}
	public String getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}
	public String getProcedureCode() {
		return ProcedureCode;
	}
	public void setProcedureCode(String procedureCode) {
		ProcedureCode = procedureCode;
	}
	public String getReferral() {
		return Referral;
	}
	public void setReferral(String referral) {
		Referral = referral;
	}
	public String getReportedDate() {
		return ReportedDate;
	}
	public void setReportedDate(String reportedDate) {
		ReportedDate = reportedDate;
	}
	public String getSalvageComments() {
		return SalvageComments;
	}
	public void setSalvageComments(String salvageComments) {
		SalvageComments = salvageComments;
	}
	public String getSubrogationFlag() {
		return SubrogationFlag;
	}
	public void setSubrogationFlag(String subrogationFlag) {
		SubrogationFlag = subrogationFlag;
	}
	public String getSummaryCode() {
		return SummaryCode;
	}
	public void setSummaryCode(String summaryCode) {
		SummaryCode = summaryCode;
	}
	public String getTotalClaimPayments() {
		return TotalClaimPayments;
	}
	public void setTotalClaimPayments(String totalClaimPayments) {
		TotalClaimPayments = totalClaimPayments;
	}
	public String getTotalClaimReserves() {
		return TotalClaimReserves;
	}
	public void setTotalClaimReserves(String totalClaimReserves) {
		TotalClaimReserves = totalClaimReserves;
	}
	public String getTotalSalvageRecovery() {
		return TotalSalvageRecovery;
	}
	public void setTotalSalvageRecovery(String totalSalvageRecovery) {
		TotalSalvageRecovery = totalSalvageRecovery;
	}
	public String getTotalSubRecovery() {
		return TotalSubRecovery;
	}
	public void setTotalSubRecovery(String totalSubRecovery) {
		TotalSubRecovery = totalSubRecovery;
	}
	public String getVisitType() {
		return VisitType;
	}
	public void setVisitType(String visitType) {
		VisitType = visitType;
	}
	public String getWasanyoneInjured() {
		return WasanyoneInjured;
	}
	public void setWasanyoneInjured(String wasanyoneInjured) {
		WasanyoneInjured = wasanyoneInjured;
	}
	public String getListOfGnpSiniestrosServiciosDanosBc() {
		return ListOfGnpSiniestrosServiciosDanosBc;
	}
	public void setListOfGnpSiniestrosServiciosDanosBc(String listOfGnpSiniestrosServiciosDanosBc) {
		ListOfGnpSiniestrosServiciosDanosBc = listOfGnpSiniestrosServiciosDanosBc;
	}
}
