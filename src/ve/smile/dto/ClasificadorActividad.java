package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_actividad")
@Entity
public class ClasificadorActividad {

	private Integer idClasificadorActividad;
	private String nombre;

	public ClasificadorActividad() {
		super();
	}

	public ClasificadorActividad(Integer idClasificadorActividad) {
		super();
		this.idClasificadorActividad = idClasificadorActividad;
	}

	public ClasificadorActividad(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_actividad_sequence", sequenceName = "public.tb_clasificador_actividad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_actividad_sequence")
	@Column(name="id_clasificador_actividad")
	public Integer getIdClasificadorActividad() {
		return idClasificadorActividad;
	}

	public void setIdClasificadorActividad(Integer idClasificadorActividad) {
		this.idClasificadorActividad = idClasificadorActividad;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClasificadorActividad == null) ? 0 : idClasificadorActividad.hashCode());
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
		ClasificadorActividad other = (ClasificadorActividad) obj;
		if (idClasificadorActividad == null) {
			return false;
		} 
		if (!idClasificadorActividad.equals(other.idClasificadorActividad)) {
			return false;
		} 
		return true;
	}

}
