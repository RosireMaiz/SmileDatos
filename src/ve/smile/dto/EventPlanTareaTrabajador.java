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

@Table(name = "tb_event_plan_tarea_trabajador")
@Entity
public class EventPlanTareaTrabajador {

	private Integer idEventPlanTareaTrabajador;
	private EventPlanTarea fkEventPlanTarea;
	private Trabajador fkTrabajador;
	private TipoMotivo fkTipoMotivo;
	private String ejecucion;
	private String observacion;
	private Character estatus;

	public EventPlanTareaTrabajador() {
		super();
	}

	public EventPlanTareaTrabajador(Integer idEventPlanTareaTrabajador) {
		super();
		this.idEventPlanTareaTrabajador = idEventPlanTareaTrabajador;
	}

	public EventPlanTareaTrabajador(
			EventPlanTarea fkEventPlanTarea,
			Trabajador fkTrabajador,
			TipoMotivo fkTipoMotivo,
			String ejecucion,
			String observacion,
			Character estatus) {
		super();
		this.fkEventPlanTarea = fkEventPlanTarea;
		this.fkTrabajador = fkTrabajador;
		this.fkTipoMotivo = fkTipoMotivo;
		this.ejecucion = ejecucion;
		this.observacion = observacion;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_event_plan_tarea_trabajador_sequence", sequenceName = "public.tb_event_plan_tarea_trabajador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_event_plan_tarea_trabajador_sequence")
	@Column(name="id_event_plan_tarea_trabajador")
	public Integer getIdEventPlanTareaTrabajador() {
		return idEventPlanTareaTrabajador;
	}

	public void setIdEventPlanTareaTrabajador(Integer idEventPlanTareaTrabajador) {
		this.idEventPlanTareaTrabajador = idEventPlanTareaTrabajador;
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
	@JoinColumn(name = "fk_trabajador", nullable = false)
	public Trabajador getFkTrabajador() {
		return fkTrabajador;
	}

	public void setFkTrabajador(Trabajador fkTrabajador) {
		this.fkTrabajador = fkTrabajador;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tipo_motivo", nullable = false)
	public TipoMotivo getFkTipoMotivo() {
		return fkTipoMotivo;
	}

	public void setFkTipoMotivo(TipoMotivo fkTipoMotivo) {
		this.fkTipoMotivo = fkTipoMotivo;
	}

	@Column(name="ejecucion")
	public String getEjecucion() {
		return ejecucion;
	}

	public void setEjecucion(String ejecucion) {
		this.ejecucion = ejecucion;
	}

	@Column(name="observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name="estatus")
	public Character getEstatus() {
		return estatus;
	}

	public void setEstatus(Character estatus) {
		this.estatus = estatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEventPlanTareaTrabajador == null) ? 0 : idEventPlanTareaTrabajador.hashCode());
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
		EventPlanTareaTrabajador other = (EventPlanTareaTrabajador) obj;
		if (idEventPlanTareaTrabajador == null) {
			return false;
		} 
		if (!idEventPlanTareaTrabajador.equals(other.idEventPlanTareaTrabajador)) {
			return false;
		} 
		return true;
	}

}
