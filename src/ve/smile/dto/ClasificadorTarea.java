package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_tarea")
@Entity
public class ClasificadorTarea {

	private Integer idClasificadorTarea;
	private String nombre;
	private String descripcion;

	public ClasificadorTarea() {
		super();
	}

	public ClasificadorTarea(Integer idClasificadorTarea) {
		super();
		this.idClasificadorTarea = idClasificadorTarea;
	}

	public ClasificadorTarea(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_tarea_sequence", sequenceName = "public.tb_clasificador_tarea_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_tarea_sequence")
	@Column(name="id_clasificador_tarea")
	public Integer getIdClasificadorTarea() {
		return idClasificadorTarea;
	}

	public void setIdClasificadorTarea(Integer idClasificadorTarea) {
		this.idClasificadorTarea = idClasificadorTarea;
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
		result = prime * result + ((idClasificadorTarea == null) ? 0 : idClasificadorTarea.hashCode());
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
		ClasificadorTarea other = (ClasificadorTarea) obj;
		if (idClasificadorTarea == null) {
			return false;
		} 
		if (!idClasificadorTarea.equals(other.idClasificadorTarea)) {
			return false;
		} 
		return true;
	}

}
