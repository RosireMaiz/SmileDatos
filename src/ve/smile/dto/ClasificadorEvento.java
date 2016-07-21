package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_evento")
@Entity
public class ClasificadorEvento {

	private Integer idClasificadorEvento;
	private String nombre;
	private String descripcion;

	public ClasificadorEvento() {
		super();
	}

	public ClasificadorEvento(Integer idClasificadorEvento) {
		super();
		this.idClasificadorEvento = idClasificadorEvento;
	}

	public ClasificadorEvento(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_evento_sequence", sequenceName = "public.tb_clasificador_evento_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_evento_sequence")
	@Column(name="id_clasificador_evento")
	public Integer getIdClasificadorEvento() {
		return idClasificadorEvento;
	}

	public void setIdClasificadorEvento(Integer idClasificadorEvento) {
		this.idClasificadorEvento = idClasificadorEvento;
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
		result = prime * result + ((idClasificadorEvento == null) ? 0 : idClasificadorEvento.hashCode());
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
		ClasificadorEvento other = (ClasificadorEvento) obj;
		if (idClasificadorEvento == null) {
			return false;
		} 
		if (!idClasificadorEvento.equals(other.idClasificadorEvento)) {
			return false;
		} 
		return true;
	}

}
