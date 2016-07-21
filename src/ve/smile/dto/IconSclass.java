package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_icon_sclass")
@Entity
public class IconSclass {

	private Integer idIconSclass;
	private String nombre;

	public IconSclass() {
		super();
	}

	public IconSclass(Integer idIconSclass) {
		super();
		this.idIconSclass = idIconSclass;
	}

	public IconSclass(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_icon_sclass_sequence", sequenceName = "public.tb_icon_sclass_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_icon_sclass_sequence")
	@Column(name="id_icon_sclass")
	public Integer getIdIconSclass() {
		return idIconSclass;
	}

	public void setIdIconSclass(Integer idIconSclass) {
		this.idIconSclass = idIconSclass;
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
		result = prime * result + ((idIconSclass == null) ? 0 : idIconSclass.hashCode());
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
		IconSclass other = (IconSclass) obj;
		if (idIconSclass == null) {
			return false;
		} 
		if (!idIconSclass.equals(other.idIconSclass)) {
			return false;
		} 
		return true;
	}

}
