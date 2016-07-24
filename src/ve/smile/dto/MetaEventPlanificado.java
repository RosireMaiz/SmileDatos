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

@Table(name = "tb_meta_event_planificado")
@Entity
public class MetaEventPlanificado {

	private Integer idMetaEventPlanificado;
	private EventoPlanificado fkEventoPlanificado;
	private Meta fkMeta;
	private TipoMotivo fkTipoMotivo;
	private String observacion;

	public MetaEventPlanificado() {
		super();
	}

	public MetaEventPlanificado(Integer idMetaEventPlanificado) {
		super();
		this.idMetaEventPlanificado = idMetaEventPlanificado;
	}

	public MetaEventPlanificado(
			EventoPlanificado fkEventoPlanificado,
			Meta fkMeta,
			TipoMotivo fkTipoMotivo,
			String observacion) {
		super();
		this.fkEventoPlanificado = fkEventoPlanificado;
		this.fkMeta = fkMeta;
		this.fkTipoMotivo = fkTipoMotivo;
		this.observacion = observacion;
	}

	@Id
	@SequenceGenerator(name = "tb_meta_event_planificado_sequence", sequenceName = "public.tb_meta_event_planificado_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_meta_event_planificado_sequence")
	@Column(name="id_meta_event_planificado")
	public Integer getIdMetaEventPlanificado() {
		return idMetaEventPlanificado;
	}

	public void setIdMetaEventPlanificado(Integer idMetaEventPlanificado) {
		this.idMetaEventPlanificado = idMetaEventPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento_planificado", nullable = false)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_meta", nullable = false)
	public Meta getFkMeta() {
		return fkMeta;
	}

	public void setFkMeta(Meta fkMeta) {
		this.fkMeta = fkMeta;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tipo_motivo", nullable = false)
	public TipoMotivo getFkTipoMotivo() {
		return fkTipoMotivo;
	}

	public void setFkTipoMotivo(TipoMotivo fkTipoMotivo) {
		this.fkTipoMotivo = fkTipoMotivo;
	}

	@Column(name="observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMetaEventPlanificado == null) ? 0 : idMetaEventPlanificado.hashCode());
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
		MetaEventPlanificado other = (MetaEventPlanificado) obj;
		if (idMetaEventPlanificado == null) {
			return false;
		} 
		if (!idMetaEventPlanificado.equals(other.idMetaEventPlanificado)) {
			return false;
		} 
		return true;
	}

}
