package ve.smile.seguridad.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import ve.smile.seguridad.enums.TipoNodoMenuEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_nodo_menu")
@Entity
public class NodoMenu {

	private Integer idNodoMenu;
	private NodoMenu fkNodoMenu;
	private String nombre;
	private Integer tipoNodoMenu;
	private IconSclass fkIconSclass;
	private Vista fkVista;
	
	private List<NodoMenu> hijos;
	private List<Rol> roles;
	private List<Operacion> operaciones;

	public NodoMenu() {
		super();
	}

	public NodoMenu(Integer idNodoMenu) {
		super();
		this.idNodoMenu = idNodoMenu;
	}
	
	public NodoMenu(NodoMenu nodoMenu) {
		super();
		this.idNodoMenu = nodoMenu.getIdNodoMenu();
		this.fkNodoMenu = (nodoMenu.getFkNodoMenu()==null)?null:new NodoMenu(nodoMenu.getFkNodoMenu());
		this.nombre = nodoMenu.getNombre();
		this.tipoNodoMenu = nodoMenu.getTipoNodoMenu();
		this.fkIconSclass = nodoMenu.getFkIconSclass();
		this.fkVista = nodoMenu.getFkVista();
	}
	
	public NodoMenu(
			NodoMenu fkNodoMenu,
			String nombre,
			Integer tipoNodoMenu,
			IconSclass fkIconSclass,
			Vista fkVista) {
		super();
		this.fkNodoMenu = fkNodoMenu;
		this.nombre = nombre;
		this.tipoNodoMenu = tipoNodoMenu;
		this.fkIconSclass = fkIconSclass;
		this.fkVista = fkVista;
	}

	@Id
	@SequenceGenerator(name = "tb_nodo_menu_sequence", sequenceName = "public.tb_nodo_menu_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_nodo_menu_sequence")
	@Column(name="id_nodo_menu")
	public Integer getIdNodoMenu() {
		return idNodoMenu;
	}

	public void setIdNodoMenu(Integer idNodoMenu) {
		this.idNodoMenu = idNodoMenu;
	}

	@ManyToOne
	@JoinColumn(name = "fk_nodo_menu", nullable = true)
	public NodoMenu getFkNodoMenu() {
		return fkNodoMenu;
	}

	public void setFkNodoMenu(NodoMenu fkNodoMenu) {
		this.fkNodoMenu = fkNodoMenu;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="tipo_nodo_menu")
	public Integer getTipoNodoMenu() {
		return tipoNodoMenu;
	}

	public void setTipoNodoMenu(Integer tipoNodoMenu) {
		this.tipoNodoMenu = tipoNodoMenu;
	}

	@JsonIgnore
	@Transient
	public TipoNodoMenuEnum getTipoNodoMenuEnum() {
		return TipoNodoMenuEnum.values()[this.tipoNodoMenu];
	}

	public void setTipoNodoMenuEnum(TipoNodoMenuEnum tipoNodoMenuEnum) {
		this.tipoNodoMenu = tipoNodoMenuEnum.ordinal();
	}

	@ManyToOne
	@JoinColumn(name = "fk_icon_sclass", nullable = false)
	public IconSclass getFkIconSclass() {
		return fkIconSclass;
	}

	public void setFkIconSclass(IconSclass fkIconSclass) {
		this.fkIconSclass = fkIconSclass;
	}

	@ManyToOne
	@JoinColumn(name = "fk_vista", nullable = false)
	public Vista getFkVista() {
		return fkVista;
	}

	public void setFkVista(Vista fkVista) {
		this.fkVista = fkVista;
	}

	@Transient
	public List<NodoMenu> getHijos() {
		return hijos;
	}

	public void setHijos(List<NodoMenu> hijos) {
		this.hijos = hijos;
	}
	
	@Transient
	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
	@Transient
	public List<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(List<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idNodoMenu == null) ? 0 : idNodoMenu.hashCode());
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
		NodoMenu other = (NodoMenu) obj;
		if (idNodoMenu == null) {
			return false;
		} 
		if (!idNodoMenu.equals(other.idNodoMenu)) {
			return false;
		} 
		return true;
	}

}
