package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_voluntario")
@Entity
public class ClasificadorVoluntario {

	private Integer idClasificadorVoluntario;
	private String nombre;
	private String descripcion;

	public ClasificadorVoluntario() {
		super();
	}

	public ClasificadorVoluntario(Integer idClasificadorVoluntario) {
		super();
		this.idClasificadorVoluntario = idClasificadorVoluntario;
	}

	public ClasificadorVoluntario(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_voluntario_sequence", sequenceName = "public.tb_clasificador_voluntario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_voluntario_sequence")
	@Column(name="id_clasificador_voluntario")
	public Integer getIdClasificadorVoluntario() {
		return idClasificadorVoluntario;
	}

	public void setIdClasificadorVoluntario(Integer idClasificadorVoluntario) {
		this.idClasificadorVoluntario = idClasificadorVoluntario;
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
		result = prime * result + ((idClasificadorVoluntario == null) ? 0 : idClasificadorVoluntario.hashCode());
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
		ClasificadorVoluntario other = (ClasificadorVoluntario) obj;
		if (idClasificadorVoluntario == null) {
			return false;
		} 
		if (!idClasificadorVoluntario.equals(other.idClasificadorVoluntario)) {
			return false;
		} 
		return true;
	}

}
