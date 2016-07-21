package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_motivo")
@Entity
public class ClasificadorMotivo {

	private Integer idClasificadorMotivo;
	private String nombre;
	private String descripcion;

	public ClasificadorMotivo() {
		super();
	}

	public ClasificadorMotivo(Integer idClasificadorMotivo) {
		super();
		this.idClasificadorMotivo = idClasificadorMotivo;
	}

	public ClasificadorMotivo(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_motivo_sequence", sequenceName = "public.tb_clasificador_motivo_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_motivo_sequence")
	@Column(name="id_clasificador_motivo")
	public Integer getIdClasificadorMotivo() {
		return idClasificadorMotivo;
	}

	public void setIdClasificadorMotivo(Integer idClasificadorMotivo) {
		this.idClasificadorMotivo = idClasificadorMotivo;
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
		result = prime * result + ((idClasificadorMotivo == null) ? 0 : idClasificadorMotivo.hashCode());
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
		ClasificadorMotivo other = (ClasificadorMotivo) obj;
		if (idClasificadorMotivo == null) {
			return false;
		} 
		if (!idClasificadorMotivo.equals(other.idClasificadorMotivo)) {
			return false;
		} 
		return true;
	}

}
