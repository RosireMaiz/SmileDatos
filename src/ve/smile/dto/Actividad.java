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

@Table(name = "tb_actividad")
@Entity
public class Actividad {

	private Integer idActividad;
	private ClasificadorActividad fkClasificadorActividad;
	private String nombre;
	private String descripcion;

	public Actividad() {
		super();
	}

	public Actividad(Integer idActividad) {
		super();
		this.idActividad = idActividad;
	}

	public Actividad(
			ClasificadorActividad fkClasificadorActividad,
			String nombre,
			String descripcion) {
		super();
		this.fkClasificadorActividad = fkClasificadorActividad;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_actividad_sequence", sequenceName = "public.tb_actividad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_actividad_sequence")
	@Column(name="id_actividad")
	public Integer getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_actividad", nullable = false)
	public ClasificadorActividad getFkClasificadorActividad() {
		return fkClasificadorActividad;
	}

	public void setFkClasificadorActividad(ClasificadorActividad fkClasificadorActividad) {
		this.fkClasificadorActividad = fkClasificadorActividad;
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
		result = prime * result + ((idActividad == null) ? 0 : idActividad.hashCode());
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
		Actividad other = (Actividad) obj;
		if (idActividad == null) {
			return false;
		} 
		if (!idActividad.equals(other.idActividad)) {
			return false;
		} 
		return true;
	}

}
