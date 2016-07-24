package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_persona")
@Entity
public class ClasificadorPersona {

	private Integer idClasificadorPersona;
	private String nombre;
	private String descripcion;

	public ClasificadorPersona() {
		super();
	}

	public ClasificadorPersona(Integer idClasificadorPersona) {
		super();
		this.idClasificadorPersona = idClasificadorPersona;
	}

	public ClasificadorPersona(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_persona_sequence", sequenceName = "public.tb_clasificador_persona_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_persona_sequence")
	@Column(name="id_clasificador_persona")
	public Integer getIdClasificadorPersona() {
		return idClasificadorPersona;
	}

	public void setIdClasificadorPersona(Integer idClasificadorPersona) {
		this.idClasificadorPersona = idClasificadorPersona;
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
		result = prime * result + ((idClasificadorPersona == null) ? 0 : idClasificadorPersona.hashCode());
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
		ClasificadorPersona other = (ClasificadorPersona) obj;
		if (idClasificadorPersona == null) {
			return false;
		} 
		if (!idClasificadorPersona.equals(other.idClasificadorPersona)) {
			return false;
		} 
		return true;
	}

}
