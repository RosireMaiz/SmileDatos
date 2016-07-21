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

@Table(name = "tb_recurso")
@Entity
public class Recurso {

	private Integer idRecurso;
	private ClasificadorRecurso fkClasificadorRecurso;
	private Character estatus;

	public Recurso() {
		super();
	}

	public Recurso(Integer idRecurso) {
		super();
		this.idRecurso = idRecurso;
	}

	public Recurso(
			ClasificadorRecurso fkClasificadorRecurso,
			Character estatus) {
		super();
		this.fkClasificadorRecurso = fkClasificadorRecurso;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_recurso_sequence", sequenceName = "public.tb_recurso_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_recurso_sequence")
	@Column(name="id_recurso")
	public Integer getIdRecurso() {
		return idRecurso;
	}

	public void setIdRecurso(Integer idRecurso) {
		this.idRecurso = idRecurso;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_recurso", nullable = false)
	public ClasificadorRecurso getFkClasificadorRecurso() {
		return fkClasificadorRecurso;
	}

	public void setFkClasificadorRecurso(ClasificadorRecurso fkClasificadorRecurso) {
		this.fkClasificadorRecurso = fkClasificadorRecurso;
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
		result = prime * result + ((idRecurso == null) ? 0 : idRecurso.hashCode());
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
		Recurso other = (Recurso) obj;
		if (idRecurso == null) {
			return false;
		} 
		if (!idRecurso.equals(other.idRecurso)) {
			return false;
		} 
		return true;
	}

}
