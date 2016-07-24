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

import ve.smile.enums.UrgenciaEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_solicitud_ayuda")
@Entity
public class SolicitudAyuda {

	private Integer idSolicitudAyuda;
	private Ayuda fkAyuda;
	private Beneficiario fkBeneficiario;
	private TipoMotivo fkTipoMotivo;
	private Long fecha;
	private Character estatus;
	private Integer urgencia;

	public SolicitudAyuda() {
		super();
	}

	public SolicitudAyuda(Integer idSolicitudAyuda) {
		super();
		this.idSolicitudAyuda = idSolicitudAyuda;
	}

	public SolicitudAyuda(
			Ayuda fkAyuda,
			Beneficiario fkBeneficiario,
			TipoMotivo fkTipoMotivo,
			Long fecha,
			Character estatus,
			Integer urgencia) {
		super();
		this.fkAyuda = fkAyuda;
		this.fkBeneficiario = fkBeneficiario;
		this.fkTipoMotivo = fkTipoMotivo;
		this.fecha = fecha;
		this.estatus = estatus;
		this.urgencia = urgencia;
	}

	@Id
	@SequenceGenerator(name = "tb_solicitud_ayuda_sequence", sequenceName = "public.tb_solicitud_ayuda_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_solicitud_ayuda_sequence")
	@Column(name="id_solicitud_ayuda")
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
	@JoinColumn(name = "fk_tipo_motivo", nullable = false)
	public TipoMotivo getFkTipoMotivo() {
		return fkTipoMotivo;
	}

	public void setFkTipoMotivo(TipoMotivo fkTipoMotivo) {
		this.fkTipoMotivo = fkTipoMotivo;
	}

	@Column(name="fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@Column(name="estatus")
	public Character getEstatus() {
		return estatus;
	}

	public void setEstatus(Character estatus) {
		this.estatus = estatus;
	}

	@Column(name="urgencia")
	public Integer getUrgencia() {
		return urgencia;
	}

	public void setUrgencia(Integer urgencia) {
		this.urgencia = urgencia;
	}

	@JsonIgnore
	public UrgenciaEnum getUrgenciaEnum() {
		return UrgenciaEnum.values()[this.urgencia];
	}

	public void setUrgenciaEnum(UrgenciaEnum urgenciaEnum) {
		this.urgencia = urgenciaEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSolicitudAyuda == null) ? 0 : idSolicitudAyuda.hashCode());
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
