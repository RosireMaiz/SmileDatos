package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_parentesco")
@Entity
public class Parentesco {

	private Integer idParentesco;
	private String nombre;

	public Parentesco() {
		super();
	}

	public Parentesco(Integer idParentesco) {
		super();
		this.idParentesco = idParentesco;
	}

	public Parentesco(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_parentesco_sequence", sequenceName = "public.tb_parentesco_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_parentesco_sequence")
	@Column(name="id_parentesco")
	public Integer getIdParentesco() {
		return idParentesco;
	}

	public void setIdParentesco(Integer idParentesco) {
		this.idParentesco = idParentesco;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idParentesco == null) ? 0 : idParentesco.hashCode());
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
		Parentesco other = (Parentesco) obj;
		if (idParentesco == null) {
			return false;
		} 
		if (!idParentesco.equals(other.idParentesco)) {
			return false;
		} 
		return true;
	}

}
