package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import ve.smile.enums.TipoInteraccionEnum;
import ve.smile.enums.TipoReferenciaInteraccionEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_interaccion_portal")
@Entity
public class InteraccionPortal {

	private Integer idInteraccionPortal;
	private Integer referenciaGenericoIdId;
	private Integer tipoInteraccion;
	private Integer tipoReferenciaInteraccion;

	public InteraccionPortal() {
		super();
	}

	public InteraccionPortal(Integer idInteraccionPortal) {
		super();
		this.idInteraccionPortal = idInteraccionPortal;
	}

	public InteraccionPortal(
			Integer referenciaGenericoIdId,
			Integer tipoInteraccion,
			Integer tipoReferenciaInteraccion) {
		super();
		this.referenciaGenericoIdId = referenciaGenericoIdId;
		this.tipoInteraccion = tipoInteraccion;
		this.tipoReferenciaInteraccion = tipoReferenciaInteraccion;
	}

	@Id
	@SequenceGenerator(name = "tb_interaccion_portal_sequence", sequenceName = "public.tb_interaccion_portal_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_interaccion_portal_sequence")
	@Column(name="id_interaccion_portal")
	public Integer getIdInteraccionPortal() {
		return idInteraccionPortal;
	}

	public void setIdInteraccionPortal(Integer idInteraccionPortal) {
		this.idInteraccionPortal = idInteraccionPortal;
	}

	@Column(name="referencia_generico_id_id")
	public Integer getReferenciaGenericoIdId() {
		return referenciaGenericoIdId;
	}

	public void setReferenciaGenericoIdId(Integer referenciaGenericoIdId) {
		this.referenciaGenericoIdId = referenciaGenericoIdId;
	}

	@Column(name="tipo_interaccion")
	public Integer getTipoInteraccion() {
		return tipoInteraccion;
	}

	public void setTipoInteraccion(Integer tipoInteraccion) {
		this.tipoInteraccion = tipoInteraccion;
	}

	@JsonIgnore
	@Transient
	public TipoInteraccionEnum getTipoInteraccionEnum() {
		return TipoInteraccionEnum.values()[this.tipoInteraccion];
	}

	public void setTipoInteraccionEnum(TipoInteraccionEnum tipoInteraccionEnum) {
		this.tipoInteraccion = tipoInteraccionEnum.ordinal();
	}

	@Column(name="tipo_referencia_interaccion")
	public Integer getTipoReferenciaInteraccion() {
		return tipoReferenciaInteraccion;
	}

	public void setTipoReferenciaInteraccion(Integer tipoReferenciaInteraccion) {
		this.tipoReferenciaInteraccion = tipoReferenciaInteraccion;
	}

	@JsonIgnore
	@Transient
	public TipoReferenciaInteraccionEnum getTipoReferenciaInteraccionEnum() {
		return TipoReferenciaInteraccionEnum.values()[this.tipoReferenciaInteraccion];
	}

	public void setTipoReferenciaInteraccionEnum(TipoReferenciaInteraccionEnum tipoReferenciaInteraccionEnum) {
		this.tipoReferenciaInteraccion = tipoReferenciaInteraccionEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idInteraccionPortal == null) ? 0 : idInteraccionPortal.hashCode());
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
		InteraccionPortal other = (InteraccionPortal) obj;
		if (idInteraccionPortal == null) {
			return false;
		} 
		if (!idInteraccionPortal.equals(other.idInteraccionPortal)) {
			return false;
		} 
		return true;
	}

}
