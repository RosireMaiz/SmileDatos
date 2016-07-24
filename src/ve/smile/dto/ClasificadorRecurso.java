package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_recurso")
@Entity
public class ClasificadorRecurso {

	private Integer idClasificadorRecurso;
	private String nombre;
	private String descripcion;

	public ClasificadorRecurso() {
		super();
	}

	public ClasificadorRecurso(Integer idClasificadorRecurso) {
		super();
		this.idClasificadorRecurso = idClasificadorRecurso;
	}

	public ClasificadorRecurso(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_recurso_sequence", sequenceName = "public.tb_clasificador_recurso_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_recurso_sequence")
	@Column(name="id_clasificador_recurso")
	public Integer getIdClasificadorRecurso() {
		return idClasificadorRecurso;
	}

	public void setIdClasificadorRecurso(Integer idClasificadorRecurso) {
		this.idClasificadorRecurso = idClasificadorRecurso;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClasificadorRecurso == null) ? 0 : idClasificadorRecurso.hashCode());
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
		ClasificadorRecurso other = (ClasificadorRecurso) obj;
		if (idClasificadorRecurso == null) {
			return false;
		} 
		if (!idClasificadorRecurso.equals(other.idClasificadorRecurso)) {
			return false;
		} 
		return true;
	}

}
