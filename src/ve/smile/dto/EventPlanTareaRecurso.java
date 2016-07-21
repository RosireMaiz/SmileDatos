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

@Table(name = "tb_event_plan_tarea_recurso")
@Entity
public class EventPlanTareaRecurso {

	private Integer idEventPlanTareaRecurso;
	private EventPlanTarea fkEventPlanTarea;
	private Recurso fkRecurso;
	private Integer cantidad;
	private Long fechaRealizacion;

	public EventPlanTareaRecurso() {
		super();
	}

	public EventPlanTareaRecurso(Integer idEventPlanTareaRecurso) {
		super();
		this.idEventPlanTareaRecurso = idEventPlanTareaRecurso;
	}

	public EventPlanTareaRecurso(
			EventPlanTarea fkEventPlanTarea,
			Recurso fkRecurso,
			Integer cantidad,
			Long fechaRealizacion) {
		super();
		this.fkEventPlanTarea = fkEventPlanTarea;
		this.fkRecurso = fkRecurso;
		this.cantidad = cantidad;
		this.fechaRealizacion = fechaRealizacion;
	}

	@Id
	@SequenceGenerator(name = "tb_event_plan_tarea_recurso_sequence", sequenceName = "public.tb_event_plan_tarea_recurso_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_event_plan_tarea_recurso_sequence")
	@Column(name="id_event_plan_tarea_recurso")
	public Integer getIdEventPlanTareaRecurso() {
		return idEventPlanTareaRecurso;
	}

	public void setIdEventPlanTareaRecurso(Integer idEventPlanTareaRecurso) {
		this.idEventPlanTareaRecurso = idEventPlanTareaRecurso;
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
	@JoinColumn(name = "fk_recurso", nullable = false)
	public Recurso getFkRecurso() {
		return fkRecurso;
	}

	public void setFkRecurso(Recurso fkRecurso) {
		this.fkRecurso = fkRecurso;
	}

	@Column(name="cantidad")
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name="fecha_realizacion")
	public Long getFechaRealizacion() {
		return fechaRealizacion;
	}

	public void setFechaRealizacion(Long fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEventPlanTareaRecurso == null) ? 0 : idEventPlanTareaRecurso.hashCode());
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
		EventPlanTareaRecurso other = (EventPlanTareaRecurso) obj;
		if (idEventPlanTareaRecurso == null) {
			return false;
		} 
		if (!idEventPlanTareaRecurso.equals(other.idEventPlanTareaRecurso)) {
			return false;
		} 
		return true;
	}

}
