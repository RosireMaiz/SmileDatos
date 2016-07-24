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

@Table(name = "tb_tipo_trabajo_social")
@Entity
public class TipoTrabajoSocial {

	private Integer idTipoTrabajoSocial;
	private ClasificadorTrabajoSocial fkClasificadorTrabajoSocial;
	private TrabajoSocial fkTrabajoSocial;
	private String nombre;
	private String descripcion;

	public TipoTrabajoSocial() {
		super();
	}

	public TipoTrabajoSocial(Integer idTipoTrabajoSocial) {
		super();
		this.idTipoTrabajoSocial = idTipoTrabajoSocial;
	}

	public TipoTrabajoSocial(
			ClasificadorTrabajoSocial fkClasificadorTrabajoSocial,
			TrabajoSocial fkTrabajoSocial,
			String nombre,
			String descripcion) {
		super();
		this.fkClasificadorTrabajoSocial = fkClasificadorTrabajoSocial;
		this.fkTrabajoSocial = fkTrabajoSocial;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_tipo_trabajo_social_sequence", sequenceName = "public.tb_tipo_trabajo_social_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_tipo_trabajo_social_sequence")
	@Column(name="id_tipo_trabajo_social")
	public Integer getIdTipoTrabajoSocial() {
		return idTipoTrabajoSocial;
	}

	public void setIdTipoTrabajoSocial(Integer idTipoTrabajoSocial) {
		this.idTipoTrabajoSocial = idTipoTrabajoSocial;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_trabajo_social", nullable = false)
	public ClasificadorTrabajoSocial getFkClasificadorTrabajoSocial() {
		return fkClasificadorTrabajoSocial;
	}

	public void setFkClasificadorTrabajoSocial(ClasificadorTrabajoSocial fkClasificadorTrabajoSocial) {
		this.fkClasificadorTrabajoSocial = fkClasificadorTrabajoSocial;
	}

	@ManyToOne
	@JoinColumn(name = "fk_trabajo_social", nullable = false)
	public TrabajoSocial getFkTrabajoSocial() {
		return fkTrabajoSocial;
	}

	public void setFkTrabajoSocial(TrabajoSocial fkTrabajoSocial) {
		this.fkTrabajoSocial = fkTrabajoSocial;
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
		result = prime * result + ((idTipoTrabajoSocial == null) ? 0 : idTipoTrabajoSocial.hashCode());
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
		TipoTrabajoSocial other = (TipoTrabajoSocial) obj;
		if (idTipoTrabajoSocial == null) {
			return false;
		} 
		if (!idTipoTrabajoSocial.equals(other.idTipoTrabajoSocial)) {
			return false;
		} 
		return true;
	}

}
