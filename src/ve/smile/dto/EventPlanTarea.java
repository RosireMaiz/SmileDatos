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
	private Tarea fkTarea;
	private EventoPlanificado fkEventoPlanificado;
	private Motivo fkMotivo;
	private Directorio fkDirectorio;
	private Long fechaPlanificada;
	private Long fechaEjecutada;
	private String observacion;
	private String estatusTarea;

	public EventPlanTarea() {
		super();
	}

	public EventPlanTarea(Integer idEventPlanTarea) {
		super();
		this.idEventPlanTarea = idEventPlanTarea;
	}

	public EventPlanTarea(Tarea fkTarea, EventoPlanificado fkEventoPlanificado,
			Motivo fkMotivo, Directorio fkDirectorio, Long fechaPlanificada,
			Long fechaEjecutada, String observacion, String estatusTarea) {
		super();
		this.fkTarea = fkTarea;
		this.fkEventoPlanificado = fkEventoPlanificado;
		this.fkMotivo = fkMotivo;
		this.fkDirectorio = fkDirectorio;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
		this.observacion = observacion;
		this.estatusTarea = estatusTarea;
	}

	@Id
	@SequenceGenerator(name = "tb_event_plan_tarea_sequence", sequenceName = "public.tb_event_plan_tarea_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_event_plan_tarea_sequence")
	@Column(name = "id_event_plan_tarea")
	public Integer getIdEventPlanTarea() {
		return idEventPlanTarea;
	}

	public void setIdEventPlanTarea(Integer idEventPlanTarea) {
		this.idEventPlanTarea = idEventPlanTarea;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tarea", nullable = true)
	public Tarea getFkTarea() {
		return fkTarea;
	}

	public void setFkTarea(Tarea fkTarea) {
		this.fkTarea = fkTarea;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento_planificado", nullable = true)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_motivo", nullable = true)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@ManyToOne
	@JoinColumn(name = "fk_directorio", nullable = true)
	public Directorio getFkDirectorio() {
		return fkDirectorio;
	}

	public void setFkDirectorio(Directorio fkDirectorio) {
		this.fkDirectorio = fkDirectorio;
	}

	@Column(name = "fecha_planificada")
	public Long getFechaPlanificada() {
		return fechaPlanificada;
	}

	public void setFechaPlanificada(Long fechaPlanificada) {
		this.fechaPlanificada = fechaPlanificada;
	}

	@Column(name = "fecha_ejecutada")
	public Long getFechaEjecutada() {
		return fechaEjecutada;
	}

	public void setFechaEjecutada(Long fechaEjecutada) {
		this.fechaEjecutada = fechaEjecutada;
	}

	@Column(name = "observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name = "estatus_tarea")
	public String getEstatusTarea() {
		return estatusTarea;
	}

	public void setEstatusTarea(String estatusTarea) {
		this.estatusTarea = estatusTarea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idEventPlanTarea == null) ? 0 : idEventPlanTarea.hashCode());
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
