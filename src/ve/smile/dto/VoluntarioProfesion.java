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

@Table(name = "tb_voluntario_profesion")
@Entity
public class VoluntarioProfesion {

	private Integer idVoluntarioProfesion;
	private Voluntario fkVoluntario;
	private Profesion fkProfesion;

	public VoluntarioProfesion() {
		super();
	}

	public VoluntarioProfesion(Integer idVoluntarioProfesion) {
		super();
		this.idVoluntarioProfesion = idVoluntarioProfesion;
	}

	public VoluntarioProfesion(
			Voluntario fkVoluntario,
			Profesion fkProfesion) {
		super();
		this.fkVoluntario = fkVoluntario;
		this.fkProfesion = fkProfesion;
	}

	@Id
	@SequenceGenerator(name = "tb_voluntario_profesion_sequence", sequenceName = "public.tb_voluntario_profesion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_voluntario_profesion_sequence")
	@Column(name="id_voluntario_profesion")
	public Integer getIdVoluntarioProfesion() {
		return idVoluntarioProfesion;
	}

	public void setIdVoluntarioProfesion(Integer idVoluntarioProfesion) {
		this.idVoluntarioProfesion = idVoluntarioProfesion;
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
	@JoinColumn(name = "fk_profesion", nullable = false)
	public Profesion getFkProfesion() {
		return fkProfesion;
	}

	public void setFkProfesion(Profesion fkProfesion) {
		this.fkProfesion = fkProfesion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVoluntarioProfesion == null) ? 0 : idVoluntarioProfesion.hashCode());
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
		VoluntarioProfesion other = (VoluntarioProfesion) obj;
		if (idVoluntarioProfesion == null) {
			return false;
		} 
		if (!idVoluntarioProfesion.equals(other.idVoluntarioProfesion)) {
			return false;
		} 
		return true;
	}

}
