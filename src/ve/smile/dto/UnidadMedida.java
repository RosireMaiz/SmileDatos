package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_unidad_medida")
@Entity
public class UnidadMedida {

	private Integer idUnidadMedida;
	private String nombre;
	private String descripcion;

	public UnidadMedida() {
		super();
	}

	public UnidadMedida(Integer idUnidadMedida) {
		super();
		this.idUnidadMedida = idUnidadMedida;
	}

	public UnidadMedida(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_unidad_medida_sequence", sequenceName = "public.tb_unidad_medida_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_unidad_medida_sequence")
	@Column(name="id_unidad_medida")
	public Integer getIdUnidadMedida() {
		return idUnidadMedida;
	}

	public void setIdUnidadMedida(Integer idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
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
		result = prime * result + ((idUnidadMedida == null) ? 0 : idUnidadMedida.hashCode());
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
		UnidadMedida other = (UnidadMedida) obj;
		if (idUnidadMedida == null) {
			return false;
		} 
		if (!idUnidadMedida.equals(other.idUnidadMedida)) {
			return false;
		} 
		return true;
	}

}
