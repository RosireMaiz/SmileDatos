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

@Table(name = "tb_ts_plan_persona")
@Entity
public class TsPlanPersona {

	private Integer idTsPlanPersona;
	private Persona fkPersona;
	private TsPlan fkTsPlan;
	private boolean asistencia;
	private boolean participacion;

	public TsPlanPersona() {
		super();
	}

	public TsPlanPersona(Integer idTsPlanPersona) {
		super();
		this.idTsPlanPersona = idTsPlanPersona;
	}

	public TsPlanPersona(
			Persona fkPersona,
			TsPlan fkTsPlan,
			boolean asistencia,
			boolean participacion) {
		super();
		this.fkPersona = fkPersona;
		this.fkTsPlan = fkTsPlan;
		this.asistencia = asistencia;
		this.participacion = participacion;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_persona_sequence", sequenceName = "public.tb_ts_plan_persona_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_persona_sequence")
	@Column(name="id_ts_plan_persona")
	public Integer getIdTsPlanPersona() {
		return idTsPlanPersona;
	}

	public void setIdTsPlanPersona(Integer idTsPlanPersona) {
		this.idTsPlanPersona = idTsPlanPersona;
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
	@JoinColumn(name = "fk_ts_plan", nullable = false)
	public TsPlan getFkTsPlan() {
		return fkTsPlan;
	}

	public void setFkTsPlan(TsPlan fkTsPlan) {
		this.fkTsPlan = fkTsPlan;
	}

	@Column(name="asistencia")
	public boolean getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	@Column(name="participacion")
	public boolean getParticipacion() {
		return participacion;
	}

	public void setParticipacion(boolean participacion) {
		this.participacion = participacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTsPlanPersona == null) ? 0 : idTsPlanPersona.hashCode());
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
		TsPlanPersona other = (TsPlanPersona) obj;
		if (idTsPlanPersona == null) {
			return false;
		} 
		if (!idTsPlanPersona.equals(other.idTsPlanPersona)) {
			return false;
		} 
		return true;
	}

}
