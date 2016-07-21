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

@Table(name = "tb_ts_plan_voluntario")
@Entity
public class TsPlanVoluntario {

	private Integer idTsPlanVoluntario;
	private Voluntario fkVoluntario;
	private TsPlanActividad fkTsPlanActividad;
	private boolean asistencia;
	private boolean participacion;

	public TsPlanVoluntario() {
		super();
	}

	public TsPlanVoluntario(Integer idTsPlanVoluntario) {
		super();
		this.idTsPlanVoluntario = idTsPlanVoluntario;
	}

	public TsPlanVoluntario(
			Voluntario fkVoluntario,
			TsPlanActividad fkTsPlanActividad,
			boolean asistencia,
			boolean participacion) {
		super();
		this.fkVoluntario = fkVoluntario;
		this.fkTsPlanActividad = fkTsPlanActividad;
		this.asistencia = asistencia;
		this.participacion = participacion;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_voluntario_sequence", sequenceName = "public.tb_ts_plan_voluntario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_voluntario_sequence")
	@Column(name="id_ts_plan_voluntario")
	public Integer getIdTsPlanVoluntario() {
		return idTsPlanVoluntario;
	}

	public void setIdTsPlanVoluntario(Integer idTsPlanVoluntario) {
		this.idTsPlanVoluntario = idTsPlanVoluntario;
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
	@JoinColumn(name = "fk_ts_plan_actividad", nullable = false)
	public TsPlanActividad getFkTsPlanActividad() {
		return fkTsPlanActividad;
	}

	public void setFkTsPlanActividad(TsPlanActividad fkTsPlanActividad) {
		this.fkTsPlanActividad = fkTsPlanActividad;
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
		result = prime * result + ((idTsPlanVoluntario == null) ? 0 : idTsPlanVoluntario.hashCode());
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
		TsPlanVoluntario other = (TsPlanVoluntario) obj;
		if (idTsPlanVoluntario == null) {
			return false;
		} 
		if (!idTsPlanVoluntario.equals(other.idTsPlanVoluntario)) {
			return false;
		} 
		return true;
	}

}
