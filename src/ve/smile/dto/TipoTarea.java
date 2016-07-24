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

@Table(name = "tb_tipo_tarea")
@Entity
public class TipoTarea {

	private Integer idTipoTarea;
	private ClasificadorTarea fkClasificadorTarea;
	private Tarea fkTarea;

	public TipoTarea() {
		super();
	}

	public TipoTarea(Integer idTipoTarea) {
		super();
		this.idTipoTarea = idTipoTarea;
	}

	public TipoTarea(
			ClasificadorTarea fkClasificadorTarea,
			Tarea fkTarea) {
		super();
		this.fkClasificadorTarea = fkClasificadorTarea;
		this.fkTarea = fkTarea;
	}

	@Id
	@SequenceGenerator(name = "tb_tipo_tarea_sequence", sequenceName = "public.tb_tipo_tarea_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_tipo_tarea_sequence")
	@Column(name="id_tipo_tarea")
	public Integer getIdTipoTarea() {
		return idTipoTarea;
	}

	public void setIdTipoTarea(Integer idTipoTarea) {
		this.idTipoTarea = idTipoTarea;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_tarea", nullable = false)
	public ClasificadorTarea getFkClasificadorTarea() {
		return fkClasificadorTarea;
	}

	public void setFkClasificadorTarea(ClasificadorTarea fkClasificadorTarea) {
		this.fkClasificadorTarea = fkClasificadorTarea;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tarea", nullable = false)
	public Tarea getFkTarea() {
		return fkTarea;
	}

	public void setFkTarea(Tarea fkTarea) {
		this.fkTarea = fkTarea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoTarea == null) ? 0 : idTipoTarea.hashCode());
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
		TipoTarea other = (TipoTarea) obj;
		if (idTipoTarea == null) {
			return false;
		} 
		if (!idTipoTarea.equals(other.idTipoTarea)) {
			return false;
		} 
		return true;
	}

}
