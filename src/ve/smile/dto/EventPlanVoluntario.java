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

@Table(name = "tb_event_plan_voluntario")
@Entity
public class EventPlanVoluntario {

	private Integer idEventPlanVoluntario;
	private Voluntario fkVoluntario;
	private EventoPlanificado fkEventoPlanificado;

	public EventPlanVoluntario() {
		super();
	}

	public EventPlanVoluntario(Integer idEventPlanVoluntario) {
		super();
		this.idEventPlanVoluntario = idEventPlanVoluntario;
	}

	public EventPlanVoluntario(
			Voluntario fkVoluntario,
			EventoPlanificado fkEventoPlanificado) {
		super();
		this.fkVoluntario = fkVoluntario;
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@Id
	@SequenceGenerator(name = "tb_event_plan_voluntario_sequence", sequenceName = "public.tb_event_plan_voluntario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_event_plan_voluntario_sequence")
	@Column(name="id_event_plan_voluntario")
	public Integer getIdEventPlanVoluntario() {
		return idEventPlanVoluntario;
	}

	public void setIdEventPlanVoluntario(Integer idEventPlanVoluntario) {
		this.idEventPlanVoluntario = idEventPlanVoluntario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_voluntario", nullable = false)
	public Voluntario getFkVoluntario() {
		return fkVoluntario;
	}

	public void setFkVoluntario(Voluntario fkVoluntario) {
		this.fkVoluntario = fkVoluntario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento_planificado", nullable = false)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEventPlanVoluntario == null) ? 0 : idEventPlanVoluntario.hashCode());
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
		EventPlanVoluntario other = (EventPlanVoluntario) obj;
		if (idEventPlanVoluntario == null) {
			return false;
		} 
		if (!idEventPlanVoluntario.equals(other.idEventPlanVoluntario)) {
			return false;
		} 
		return true;
	}

}
