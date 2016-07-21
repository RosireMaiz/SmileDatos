package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import ve.smile.enums.OperacionEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_permiso_seguridad")
@Entity
public class PermisoSeguridad {

	private Integer idPermisoSeguridad;
	private Rol fkRol;
	private NodoMenu fkNodoMenu;
	private Integer operacion;

	public PermisoSeguridad() {
		super();
	}

	public PermisoSeguridad(Integer idPermisoSeguridad) {
		super();
		this.idPermisoSeguridad = idPermisoSeguridad;
	}

	public PermisoSeguridad(
			Rol fkRol,
			NodoMenu fkNodoMenu,
			Integer operacion) {
		super();
		this.fkRol = fkRol;
		this.fkNodoMenu = fkNodoMenu;
		this.operacion = operacion;
	}

	@Id
	@SequenceGenerator(name = "tb_permiso_seguridad_sequence", sequenceName = "public.tb_permiso_seguridad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_permiso_seguridad_sequence")
	@Column(name="id_permiso_seguridad")
	public Integer getIdPermisoSeguridad() {
		return idPermisoSeguridad;
	}

	public void setIdPermisoSeguridad(Integer idPermisoSeguridad) {
		this.idPermisoSeguridad = idPermisoSeguridad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_rol", nullable = false)
	public Rol getFkRol() {
		return fkRol;
	}

	public void setFkRol(Rol fkRol) {
		this.fkRol = fkRol;
	}

	@ManyToOne
	@JoinColumn(name = "fk_nodo_menu", nullable = false)
	public NodoMenu getFkNodoMenu() {
		return fkNodoMenu;
	}

	public void setFkNodoMenu(NodoMenu fkNodoMenu) {
		this.fkNodoMenu = fkNodoMenu;
	}

	@Column(name="operacion")
	public Integer getOperacion() {
		return operacion;
	}

	public void setOperacion(Integer operacion) {
		this.operacion = operacion;
	}

	@JsonIgnore
	public OperacionEnum getOperacionEnum() {
		return OperacionEnum.values()[this.operacion];
	}

	public void setOperacionEnum(OperacionEnum operacionEnum) {
		this.operacion = operacionEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPermisoSeguridad == null) ? 0 : idPermisoSeguridad.hashCode());
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
		PermisoSeguridad other = (PermisoSeguridad) obj;
		if (idPermisoSeguridad == null) {
			return false;
		} 
		if (!idPermisoSeguridad.equals(other.idPermisoSeguridad)) {
			return false;
		} 
		return true;
	}

}
