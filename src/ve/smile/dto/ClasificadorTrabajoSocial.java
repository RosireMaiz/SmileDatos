package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_trabajo_social")
@Entity
public class ClasificadorTrabajoSocial {

	private Integer idClasificadorTrabajoSocial;
	private String nombre;
	private String descripcion;

	public ClasificadorTrabajoSocial() {
		super();
	}

	public ClasificadorTrabajoSocial(Integer idClasificadorTrabajoSocial) {
		super();
		this.idClasificadorTrabajoSocial = idClasificadorTrabajoSocial;
	}

	public ClasificadorTrabajoSocial(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_trabajo_social_sequence", sequenceName = "public.tb_clasificador_trabajo_social_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_trabajo_social_sequence")
	@Column(name="id_clasificador_trabajo_social")
	public Integer getIdClasificadorTrabajoSocial() {
		return idClasificadorTrabajoSocial;
	}

	public void setIdClasificadorTrabajoSocial(Integer idClasificadorTrabajoSocial) {
		this.idClasificadorTrabajoSocial = idClasificadorTrabajoSocial;
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
		result = prime * result + ((idClasificadorTrabajoSocial == null) ? 0 : idClasificadorTrabajoSocial.hashCode());
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
		ClasificadorTrabajoSocial other = (ClasificadorTrabajoSocial) obj;
		if (idClasificadorTrabajoSocial == null) {
			return false;
		} 
		if (!idClasificadorTrabajoSocial.equals(other.idClasificadorTrabajoSocial)) {
			return false;
		} 
		return true;
	}

}
