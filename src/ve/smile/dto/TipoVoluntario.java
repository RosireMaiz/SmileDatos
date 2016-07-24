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

@Table(name = "tb_tipo_voluntario")
@Entity
public class TipoVoluntario {

	private Integer idTipoVoluntario;
	private ClasificadorVoluntario fkClasificadorVoluntario;
	private Voluntario fkVoluntario;

	public TipoVoluntario() {
		super();
	}

	public TipoVoluntario(Integer idTipoVoluntario) {
		super();
		this.idTipoVoluntario = idTipoVoluntario;
	}

	public TipoVoluntario(
			ClasificadorVoluntario fkClasificadorVoluntario,
			Voluntario fkVoluntario) {
		super();
		this.fkClasificadorVoluntario = fkClasificadorVoluntario;
		this.fkVoluntario = fkVoluntario;
	}

	@Id
	@SequenceGenerator(name = "tb_tipo_voluntario_sequence", sequenceName = "public.tb_tipo_voluntario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_tipo_voluntario_sequence")
	@Column(name="id_tipo_voluntario")
	public Integer getIdTipoVoluntario() {
		return idTipoVoluntario;
	}

	public void setIdTipoVoluntario(Integer idTipoVoluntario) {
		this.idTipoVoluntario = idTipoVoluntario;
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
		result = prime * result + ((idTipoVoluntario == null) ? 0 : idTipoVoluntario.hashCode());
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
		TipoVoluntario other = (TipoVoluntario) obj;
		if (idTipoVoluntario == null) {
			return false;
		} 
		if (!idTipoVoluntario.equals(other.idTipoVoluntario)) {
			return false;
		} 
		return true;
	}

}
