package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_parentezco")
@Entity
public class Parentezco {

	private Integer idParentezco;
	private String nombre;

	public Parentezco() {
		super();
	}

	public Parentezco(Integer idParentezco) {
		super();
		this.idParentezco = idParentezco;
	}

	public Parentezco(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_parentezco_sequence", sequenceName = "public.tb_parentezco_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_parentezco_sequence")
	@Column(name="id_parentezco")
	public Integer getIdParentezco() {
		return idParentezco;
	}

	public void setIdParentezco(Integer idParentezco) {
		this.idParentezco = idParentezco;
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
		result = prime * result + ((idParentezco == null) ? 0 : idParentezco.hashCode());
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
		Parentezco other = (Parentezco) obj;
		if (idParentezco == null) {
			return false;
		} 
		if (!idParentezco.equals(other.idParentezco)) {
			return false;
		} 
		return true;
	}

}
