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

@Table(name = "tb_voluntario_clasificado")
@Entity
public class VoluntarioClasificado {

	private Integer idVoluntarioClasificado;
	private ClasificadorVoluntario fkClasificadorVoluntario;
	private Voluntario fkVoluntario;

	public VoluntarioClasificado() {
		super();
	}

	public VoluntarioClasificado(Integer idVoluntarioClasificado) {
		super();
		this.idVoluntarioClasificado = idVoluntarioClasificado;
	}

	public VoluntarioClasificado(
			ClasificadorVoluntario fkClasificadorVoluntario,
			Voluntario fkVoluntario) {
		super();
		this.fkClasificadorVoluntario = fkClasificadorVoluntario;
		this.fkVoluntario = fkVoluntario;
	}

	@Id
	@SequenceGenerator(name = "tb_voluntario_clasificado_sequence", sequenceName = "public.tb_voluntario_clasificado_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_voluntario_clasificado_sequence")
	@Column(name="id_voluntario_clasificado")
	public Integer getIdVoluntarioClasificado() {
		return idVoluntarioClasificado;
	}

	public void setIdVoluntarioClasificado(Integer idVoluntarioClasificado) {
		this.idVoluntarioClasificado = idVoluntarioClasificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_voluntario", nullable = false)
	public ClasificadorVoluntario getFkClasificadorVoluntario() {
		return fkClasificadorVoluntario;
	}

	public void setFkClasificadorVoluntario(ClasificadorVoluntario fkClasificadorVoluntario) {
		this.fkClasificadorVoluntario = fkClasificadorVoluntario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_voluntario", nullable = false)
	public Voluntario getFkVoluntario() {
		return fkVoluntario;
	}

	public void setFkVoluntario(Voluntario fkVoluntario) {
		this.fkVoluntario = fkVoluntario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVoluntarioClasificado == null) ? 0 : idVoluntarioClasificado.hashCode());
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
		VoluntarioClasificado other = (VoluntarioClasificado) obj;
		if (idVoluntarioClasificado == null) {
			return false;
		} 
		if (!idVoluntarioClasificado.equals(other.idVoluntarioClasificado)) {
			return false;
		} 
		return true;
	}

}
