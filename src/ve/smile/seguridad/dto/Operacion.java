package ve.smile.seguridad.dto;

import java.util.ArrayList;
import java.util.List;

public class Operacion implements Comparable<Operacion> {

	private Integer idOperacion;
	private String nombre;
	private IconSclass fkIconSclass;
	private Sclass fkSclass;
	private String tooltiptext;
	
	private List<Rol> roles = new ArrayList<Rol>();
	
	public Operacion() {
		super();
	}

	public Operacion(Integer idOperacion, String nombre, 
			IconSclass fkIconSclass,
			Sclass fkSclass,
			String tooltiptext) {
		super();
		this.idOperacion = idOperacion;
		this.nombre = nombre;
		this.fkIconSclass = fkIconSclass;
		this.fkSclass = fkSclass;
		this.tooltiptext = tooltiptext;
	}

	public Integer getIdOperacion() {
		return idOperacion;
	}

	public void setIdOperacion(Integer idOperacion) {
		this.idOperacion = idOperacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public IconSclass getFkIconSclass() {
		return fkIconSclass;
	}

	public void setFkIconSclass(IconSclass fkIconSclass) {
		this.fkIconSclass = fkIconSclass;
	}

	public Sclass getFkSclass() {
		return fkSclass;
	}

	public void setFkSclass(Sclass fkSclass) {
		this.fkSclass = fkSclass;
	}

	public String getTooltiptext() {
		return tooltiptext;
	}

	public void setTooltiptext(String tooltiptext) {
		this.tooltiptext = tooltiptext;
	}

	@Override
	public int compareTo(Operacion o) {
		return Math.abs(idOperacion) - Math.abs(o.getIdOperacion());
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idOperacion == null) ? 0 : idOperacion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operacion other = (Operacion) obj;
		if (idOperacion == null) {
			if (other.idOperacion != null)
				return false;
		} else if (!idOperacion.equals(other.idOperacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
