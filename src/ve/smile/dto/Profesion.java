package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_profesion")
@Entity
public class Profesion {

	private Integer idProfesion;
	private String nombre;
	private String descripcion;

	public Profesion() {
		super();
	}

	public Profesion(Integer idProfesion) {
		super();
		this.idProfesion = idProfesion;
	}

	public Profesion(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_profesion_sequence", sequenceName = "public.tb_profesion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_profesion_sequence")
	@Column(name="id_profesion")
	public Integer getIdProfesion() {
		return idProfesion;
	}

	public void setIdProfesion(Integer idProfesion) {
		this.idProfesion = idProfesion;
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
		result = prime * result + ((idProfesion == null) ? 0 : idProfesion.hashCode());
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
		Profesion other = (Profesion) obj;
		if (idProfesion == null) {
			return false;
		} 
		if (!idProfesion.equals(other.idProfesion)) {
			return false;
		} 
		return true;
	}

}
