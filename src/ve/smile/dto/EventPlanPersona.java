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

@Table(name = "tb_event_plan_persona")
@Entity
public class EventPlanPersona {

	private Integer idEventPlanPersona;
	private Persona fkPersona;
	private EventoPlanificado fkEventoPlanificado;
	private boolean participacion;
	private boolean asistencia;

	public EventPlanPersona() {
		super();
	}

	public EventPlanPersona(Integer idEventPlanPersona) {
		super();
		this.idEventPlanPersona = idEventPlanPersona;
	}

	public EventPlanPersona(
			Persona fkPersona,
			EventoPlanificado fkEventoPlanificado,
			boolean participacion,
			boolean asistencia) {
		super();
		this.fkPersona = fkPersona;
		this.fkEventoPlanificado = fkEventoPlanificado;
		this.participacion = participacion;
		this.asistencia = asistencia;
	}

	@Id
	@SequenceGenerator(name = "tb_event_plan_persona_sequence", sequenceName = "public.tb_event_plan_persona_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_event_plan_persona_sequence")
	@Column(name="id_event_plan_persona")
	public Integer getIdEventPlanPersona() {
		return idEventPlanPersona;
	}

	public void setIdEventPlanPersona(Integer idEventPlanPersona) {
		this.idEventPlanPersona = idEventPlanPersona;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento_planificado", nullable = false)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@Column(name="participacion")
	public boolean getParticipacion() {
		return participacion;
	}

	public void setParticipacion(boolean participacion) {
		this.participacion = participacion;
	}

	@Column(name="asistencia")
	public boolean getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEventPlanPersona == null) ? 0 : idEventPlanPersona.hashCode());
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
		EventPlanPersona other = (EventPlanPersona) obj;
		if (idEventPlanPersona == null) {
			return false;
		} 
		if (!idEventPlanPersona.equals(other.idEventPlanPersona)) {
			return false;
		} 
		return true;
	}

}
