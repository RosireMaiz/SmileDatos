package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_cartelera")
@Entity
public class ClasificadorCartelera {

	private Integer idClasificadorCartelera;
	private String nombre;
	private String descripcion;

	public ClasificadorCartelera() {
		super();
	}

	public ClasificadorCartelera(Integer idClasificadorCartelera) {
		super();
		this.idClasificadorCartelera = idClasificadorCartelera;
	}

	public ClasificadorCartelera(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_cartelera_sequence", sequenceName = "public.tb_clasificador_cartelera_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_cartelera_sequence")
	@Column(name="id_clasificador_cartelera")
	public Integer getIdClasificadorCartelera() {
		return idClasificadorCartelera;
	}

	public void setIdClasificadorCartelera(Integer idClasificadorCartelera) {
		this.idClasificadorCartelera = idClasificadorCartelera;
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
		result = prime * result + ((idClasificadorCartelera == null) ? 0 : idClasificadorCartelera.hashCode());
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
		ClasificadorCartelera other = (ClasificadorCartelera) obj;
		if (idClasificadorCartelera == null) {
			return false;
		} 
		if (!idClasificadorCartelera.equals(other.idClasificadorCartelera)) {
			return false;
		} 
		return true;
	}

}
