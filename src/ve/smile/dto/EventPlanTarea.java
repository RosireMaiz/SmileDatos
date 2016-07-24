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

@Table(name = "tb_event_plan_tarea")
@Entity
public class EventPlanTarea {

	private Integer idEventPlanTarea;
	private TipoTarea fkTipoTarea;
	private TipoMotivo fkTipoMotivo;
	private EventoPlanificado fkEventoPlanificado;
	private Long fechaPlanificada;
	private Long fechaEjecutada;

	public EventPlanTarea() {
		super();
	}

	public EventPlanTarea(Integer idEventPlanTarea) {
		super();
		this.idEventPlanTarea = idEventPlanTarea;
	}

	public EventPlanTarea(
			TipoTarea fkTipoTarea,
			TipoMotivo fkTipoMotivo,
			EventoPlanificado fkEventoPlanificado,
			Long fechaPlanificada,
			Long fechaEjecutada) {
		super();
		this.fkTipoTarea = fkTipoTarea;
		this.fkTipoMotivo = fkTipoMotivo;
		this.fkEventoPlanificado = fkEventoPlanificado;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
	}

	@Id
	@SequenceGenerator(name = "tb_event_plan_tarea_sequence", sequenceName = "public.tb_event_plan_tarea_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_event_plan_tarea_sequence")
	@Column(name="id_event_plan_tarea")
	public Integer getIdEventPlanTarea() {
		return idEventPlanTarea;
	}

	public void setIdEventPlanTarea(Integer idEventPlanTarea) {
		this.idEventPlanTarea = idEventPlanTarea;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tipo_tarea", nullable = false)
	public TipoTarea getFkTipoTarea() {
		return fkTipoTarea;
	}

	public void setFkTipoTarea(TipoTarea fkTipoTarea) {
		this.fkTipoTarea = fkTipoTarea;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tipo_motivo", nullable = false)
	public TipoMotivo getFkTipoMotivo() {
		return fkTipoMotivo;
	}

	public void setFkTipoMotivo(TipoMotivo fkTipoMotivo) {
		this.fkTipoMotivo = fkTipoMotivo;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento_planificado", nullable = false)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@Column(name="fecha_planificada")
	public Long getFechaPlanificada() {
		return fechaPlanificada;
	}

	public void setFechaPlanificada(Long fechaPlanificada) {
		this.fechaPlanificada = fechaPlanificada;
	}

	@Column(name="fecha_ejecutada")
	public Long getFechaEjecutada() {
		return fechaEjecutada;
	}

	public void setFechaEjecutada(Long fechaEjecutada) {
		this.fechaEjecutada = fechaEjecutada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEventPlanTarea == null) ? 0 : idEventPlanTarea.hashCode());
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
		EventPlanTarea other = (EventPlanTarea) obj;
		if (idEventPlanTarea == null) {
			return false;
		} 
		if (!idEventPlanTarea.equals(other.idEventPlanTarea)) {
			return false;
		} 
		return true;
	}

}
