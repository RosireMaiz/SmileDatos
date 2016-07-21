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

@Table(name = "tb_event_plan_patrocinador")
@Entity
public class EventPlanPatrocinador {

	private Integer idEventPlanPatrocinador;
	private EventoPlanificado fkEventoPlanificado;
	private Patrocinador fkPatrocinador;

	public EventPlanPatrocinador() {
		super();
	}

	public EventPlanPatrocinador(Integer idEventPlanPatrocinador) {
		super();
		this.idEventPlanPatrocinador = idEventPlanPatrocinador;
	}

	public EventPlanPatrocinador(
			EventoPlanificado fkEventoPlanificado,
			Patrocinador fkPatrocinador) {
		super();
		this.fkEventoPlanificado = fkEventoPlanificado;
		this.fkPatrocinador = fkPatrocinador;
	}

	@Id
	@SequenceGenerator(name = "tb_event_plan_patrocinador_sequence", sequenceName = "public.tb_event_plan_patrocinador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_event_plan_patrocinador_sequence")
	@Column(name="id_event_plan_patrocinador")
	public Integer getIdEventPlanPatrocinador() {
		return idEventPlanPatrocinador;
	}

	public void setIdEventPlanPatrocinador(Integer idEventPlanPatrocinador) {
		this.idEventPlanPatrocinador = idEventPlanPatrocinador;
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
	@JoinColumn(name = "fk_patrocinador", nullable = false)
	public Patrocinador getFkPatrocinador() {
		return fkPatrocinador;
	}

	public void setFkPatrocinador(Patrocinador fkPatrocinador) {
		this.fkPatrocinador = fkPatrocinador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEventPlanPatrocinador == null) ? 0 : idEventPlanPatrocinador.hashCode());
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
		EventPlanPatrocinador other = (EventPlanPatrocinador) obj;
		if (idEventPlanPatrocinador == null) {
			return false;
		} 
		if (!idEventPlanPatrocinador.equals(other.idEventPlanPatrocinador)) {
			return false;
		} 
		return true;
	}

}
