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

@Table(name = "tb_tipo_actividad")
@Entity
public class TipoActividad {

	private Integer idTipoActividad;
	private ClasificadorActividad fkClasificadorActividad;
	private Actividad fkActividad;
	private String nombre;
	private String descripcion;

	public TipoActividad() {
		super();
	}

	public TipoActividad(Integer idTipoActividad) {
		super();
		this.idTipoActividad = idTipoActividad;
	}

	public TipoActividad(
			ClasificadorActividad fkClasificadorActividad,
			Actividad fkActividad,
			String nombre,
			String descripcion) {
		super();
		this.fkClasificadorActividad = fkClasificadorActividad;
		this.fkActividad = fkActividad;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_tipo_actividad_sequence", sequenceName = "public.tb_tipo_actividad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_tipo_actividad_sequence")
	@Column(name="id_tipo_actividad")
	public Integer getIdTipoActividad() {
		return idTipoActividad;
	}

	public void setIdTipoActividad(Integer idTipoActividad) {
		this.idTipoActividad = idTipoActividad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_actividad", nullable = false)
	public ClasificadorActividad getFkClasificadorActividad() {
		return fkClasificadorActividad;
	}

	public void setFkClasificadorActividad(ClasificadorActividad fkClasificadorActividad) {
		this.fkClasificadorActividad = fkClasificadorActividad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_actividad", nullable = false)
	public Actividad getFkActividad() {
		return fkActividad;
	}

	public void setFkActividad(Actividad fkActividad) {
		this.fkActividad = fkActividad;
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
		result = prime * result + ((idTipoActividad == null) ? 0 : idTipoActividad.hashCode());
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
		TipoActividad other = (TipoActividad) obj;
		if (idTipoActividad == null) {
			return false;
		} 
		if (!idTipoActividad.equals(other.idTipoActividad)) {
			return false;
		} 
		return true;
	}

}
