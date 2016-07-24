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

@Table(name = "tb_meta_event_planificado_tarea")
@Entity
public class MetaEventPlanificadoTarea {

	private Integer idMetaEventPlanificadoTarea;
	private EventPlanTarea fkEventPlanTarea;
	private Meta fkMeta;
	private TipoMotivo fkTipoMotivo;
	private String observacion;

	public MetaEventPlanificadoTarea() {
		super();
	}

	public MetaEventPlanificadoTarea(Integer idMetaEventPlanificadoTarea) {
		super();
		this.idMetaEventPlanificadoTarea = idMetaEventPlanificadoTarea;
	}

	public MetaEventPlanificadoTarea(
			EventPlanTarea fkEventPlanTarea,
			Meta fkMeta,
			TipoMotivo fkTipoMotivo,
			String observacion) {
		super();
		this.fkEventPlanTarea = fkEventPlanTarea;
		this.fkMeta = fkMeta;
		this.fkTipoMotivo = fkTipoMotivo;
		this.observacion = observacion;
	}

	@Id
	@SequenceGenerator(name = "tb_meta_event_planificado_tarea_sequence", sequenceName = "public.tb_meta_event_planificado_tarea_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_meta_event_planificado_tarea_sequence")
	@Column(name="id_meta_event_planificado_tarea")
	public Integer getIdMetaEventPlanificadoTarea() {
		return idMetaEventPlanificadoTarea;
	}

	public void setIdMetaEventPlanificadoTarea(Integer idMetaEventPlanificadoTarea) {
		this.idMetaEventPlanificadoTarea = idMetaEventPlanificadoTarea;
	}

	@ManyToOne
	@JoinColumn(name = "fk_event_plan_tarea", nullable = false)
	public EventPlanTarea getFkEventPlanTarea() {
		return fkEventPlanTarea;
	}

	public void setFkEventPlanTarea(EventPlanTarea fkEventPlanTarea) {
		this.fkEventPlanTarea = fkEventPlanTarea;
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
		result = prime * result + ((idMetaEventPlanificadoTarea == null) ? 0 : idMetaEventPlanificadoTarea.hashCode());
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
		MetaEventPlanificadoTarea other = (MetaEventPlanificadoTarea) obj;
		if (idMetaEventPlanificadoTarea == null) {
			return false;
		} 
		if (!idMetaEventPlanificadoTarea.equals(other.idMetaEventPlanificadoTarea)) {
			return false;
		} 
		return true;
	}

}
