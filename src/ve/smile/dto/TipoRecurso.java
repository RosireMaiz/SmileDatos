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

@Table(name = "tb_tipo_recurso")
@Entity
public class TipoRecurso {

	private Integer idTipoRecurso;
	private ClasificadorRecurso fkClasificadorRecurso;
	private Recurso fkRecurso;
	private Character estatus;

	public TipoRecurso() {
		super();
	}

	public TipoRecurso(Integer idTipoRecurso) {
		super();
		this.idTipoRecurso = idTipoRecurso;
	}

	public TipoRecurso(
			ClasificadorRecurso fkClasificadorRecurso,
			Recurso fkRecurso,
			Character estatus) {
		super();
		this.fkClasificadorRecurso = fkClasificadorRecurso;
		this.fkRecurso = fkRecurso;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_tipo_recurso_sequence", sequenceName = "public.tb_tipo_recurso_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_tipo_recurso_sequence")
	@Column(name="id_tipo_recurso")
	public Integer getIdTipoRecurso() {
		return idTipoRecurso;
	}

	public void setIdTipoRecurso(Integer idTipoRecurso) {
		this.idTipoRecurso = idTipoRecurso;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_recurso", nullable = false)
	public ClasificadorRecurso getFkClasificadorRecurso() {
		return fkClasificadorRecurso;
	}

	public void setFkClasificadorRecurso(ClasificadorRecurso fkClasificadorRecurso) {
		this.fkClasificadorRecurso = fkClasificadorRecurso;
	}

	@ManyToOne
	@JoinColumn(name = "fk_recurso", nullable = false)
	public Recurso getFkRecurso() {
		return fkRecurso;
	}

	public void setFkRecurso(Recurso fkRecurso) {
		this.fkRecurso = fkRecurso;
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
		result = prime * result + ((idTipoRecurso == null) ? 0 : idTipoRecurso.hashCode());
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
		TipoRecurso other = (TipoRecurso) obj;
		if (idTipoRecurso == null) {
			return false;
		} 
		if (!idTipoRecurso.equals(other.idTipoRecurso)) {
			return false;
		} 
		return true;
	}

}
