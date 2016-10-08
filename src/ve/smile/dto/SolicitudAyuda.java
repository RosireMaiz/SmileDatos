package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import ve.smile.enums.EstatusSolicitudEnum;
import ve.smile.enums.UrgenciaEnum;

@Table(name = "tb_solicitud_ayuda")
@Entity
public class SolicitudAyuda {

	private Integer idSolicitudAyuda;
	private Ayuda fkAyuda;
	private Beneficiario fkBeneficiario;
	private Motivo fkMotivo;
	private Long fecha;
	private Character estatus;
	private Integer urgencia;
	private Integer estatusSolicitud;
	private String observacion;
	private String titulo;

	private String detalleRechazo;

	public SolicitudAyuda() {
		super();
	}

	public SolicitudAyuda(Integer idSolicitudAyuda) {
		super();
		this.idSolicitudAyuda = idSolicitudAyuda;
	}

	public SolicitudAyuda(Ayuda fkAyuda, Beneficiario fkBeneficiario,
			Motivo fkMotivo, Long fecha, Character estatus, Integer urgencia,
			Integer estatusSolicitud, String observacion, String detalleRechazo) {
		super();
		this.fkAyuda = fkAyuda;
		this.fkBeneficiario = fkBeneficiario;
		this.fkMotivo = fkMotivo;
		this.fecha = fecha;
		this.estatus = estatus;
		this.urgencia = urgencia;
		this.estatusSolicitud = estatusSolicitud;
		this.observacion = observacion;
		this.detalleRechazo = detalleRechazo;
	}

	@Id
	@SequenceGenerator(name = "tb_solicitud_ayuda_sequence", sequenceName = "public.tb_solicitud_ayuda_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_solicitud_ayuda_sequence")
	@Column(name = "id_solicitud_ayuda")
	public Integer getIdSolicitudAyuda() {
		return idSolicitudAyuda;
	}

	public void setIdSolicitudAyuda(Integer idSolicitudAyuda) {
		this.idSolicitudAyuda = idSolicitudAyuda;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ayuda", nullable = false)
	public Ayuda getFkAyuda() {
		return fkAyuda;
	}

	public void setFkAyuda(Ayuda fkAyuda) {
		this.fkAyuda = fkAyuda;
	}

	@ManyToOne
	@JoinColumn(name = "fk_beneficiario", nullable = false)
	public Beneficiario getFkBeneficiario() {
		return fkBeneficiario;
	}

	public void setFkBeneficiario(Beneficiario fkBeneficiario) {
		this.fkBeneficiario = fkBeneficiario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_motivo", nullable = true)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@Column(name = "fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@Column(name = "estatus")
	public Character getEstatus() {
		return estatus;
	}

	public void setEstatus(Character estatus) {
		this.estatus = estatus;
	}

	@Column(name = "urgencia")
	public Integer getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(Integer urgencia) {
		this.urgencia = urgencia;
	}

	@Transient
	public UrgenciaEnum getUrgenciaEnum() {
		return UrgenciaEnum.values()[this.urgencia];
	}

	public void setUrgenciaEnum(UrgenciaEnum urgenciaEnum) {
		this.urgencia = urgenciaEnum.ordinal();
	}

	@Column(name = "estatus_solicitud")
	public Integer getEstatusSolicitud() {
		return estatusSolicitud;
	}

	public void setEstatusSolicitud(Integer estatusSolicitud) {
		this.estatusSolicitud = estatusSolicitud;
	}

	@Transient
	public EstatusSolicitudEnum getEstatusSolicitudEnum() {
		return EstatusSolicitudEnum.values()[this.estatusSolicitud];
	}

	public void setEstatusSolicitudEnum(
			EstatusSolicitudEnum estatusSolicitudEnum) {
		this.estatusSolicitud = estatusSolicitudEnum.ordinal();
	}

	@Column(name = "observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name = "detalle_rechazo")
	public String getDetalleRechazo() {
		return detalleRechazo;
	}

	public void setDetalleRechazo(String detalleRechazo) {
		this.detalleRechazo = detalleRechazo;
	}

	public String getTitulo() {
		return titulo;
	}

	@Column(name = "titulo")
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idSolicitudAyuda == null) ? 0 : idSolicitudAyuda.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SolicitudAyuda other = (SolicitudAyuda) obj;
		if (idSolicitudAyuda == null) {
			return false;
		}
		if (!idSolicitudAyuda.equals(other.idSolicitudAyuda)) {
			return false;
		}
		return true;
	}

}
