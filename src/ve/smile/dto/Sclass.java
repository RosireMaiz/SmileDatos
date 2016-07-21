package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_sclass")
@Entity
public class Sclass {

	private Integer idSclass;
	private String nombre;

	public Sclass() {
		super();
	}

	public Sclass(Integer idSclass) {
		super();
		this.idSclass = idSclass;
	}

	public Sclass(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_sclass_sequence", sequenceName = "public.tb_sclass_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_sclass_sequence")
	@Column(name="id_sclass")
	public Integer getIdSclass() {
		return idSclass;
	}

	public void setIdSclass(Integer idSclass) {
		this.idSclass = idSclass;
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
		result = prime * result + ((idSclass == null) ? 0 : idSclass.hashCode());
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
		Sclass other = (Sclass) obj;
		if (idSclass == null) {
			return false;
		} 
		if (!idSclass.equals(other.idSclass)) {
			return false;
		} 
		return true;
	}

}
