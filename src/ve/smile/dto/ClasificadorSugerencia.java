package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_sugerencia")
@Entity
public class ClasificadorSugerencia {

	private Integer idClasificadorSugerencia;
	private String nombre;
	private String descripcion;

	public ClasificadorSugerencia() {
		super();
	}

	public ClasificadorSugerencia(Integer idClasificadorSugerencia) {
		super();
		this.idClasificadorSugerencia = idClasificadorSugerencia;
	}

	public ClasificadorSugerencia(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_sugerencia_sequence", sequenceName = "public.tb_clasificador_sugerencia_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_sugerencia_sequence")
	@Column(name="id_clasificador_sugerencia")
	public Integer getIdClasificadorSugerencia() {
		return idClasificadorSugerencia;
	}

	public void setIdClasificadorSugerencia(Integer idClasificadorSugerencia) {
		this.idClasificadorSugerencia = idClasificadorSugerencia;
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
		result = prime * result + ((idClasificadorSugerencia == null) ? 0 : idClasificadorSugerencia.hashCode());
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
		ClasificadorSugerencia other = (ClasificadorSugerencia) obj;
		if (idClasificadorSugerencia == null) {
			return false;
		} 
		if (!idClasificadorSugerencia.equals(other.idClasificadorSugerencia)) {
			return false;
		} 
		return true;
	}

}
