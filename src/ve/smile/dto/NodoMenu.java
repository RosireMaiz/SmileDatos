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

import ve.smile.enums.TipoNodoMenuEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_nodo_menu")
@Entity
public class NodoMenu {

	private Integer idNodoMenu;
	private IconSclass fkIconSclass;
	private NodoMenu fkNodoMenu;
	private Vista fkVista;
	private String nombre;
	private Integer tipoNodoMenu;

	public NodoMenu() {
		super();
	}

	public NodoMenu(Integer idNodoMenu) {
		super();
		this.idNodoMenu = idNodoMenu;
	}

	public NodoMenu(
			IconSclass fkIconSclass,
			NodoMenu fkNodoMenu,
			Vista fkVista,
			String nombre,
			Integer tipoNodoMenu) {
		super();
		this.fkIconSclass = fkIconSclass;
		this.fkNodoMenu = fkNodoMenu;
		this.fkVista = fkVista;
		this.nombre = nombre;
		this.tipoNodoMenu = tipoNodoMenu;
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
	@JoinColumn(name = "fk_icon_sclass", nullable = false)
	public IconSclass getFkIconSclass() {
		return fkIconSclass;
	}

	public void setFkIconSclass(IconSclass fkIconSclass) {
		this.fkIconSclass = fkIconSclass;
	}

	@ManyToOne
	@JoinColumn(name = "fk_nodo_menu", nullable = false)
	public NodoMenu getFkNodoMenu() {
		return fkNodoMenu;
	}

	public void setFkNodoMenu(NodoMenu fkNodoMenu) {
		this.fkNodoMenu = fkNodoMenu;
	}

	@ManyToOne
	@JoinColumn(name = "fk_vista", nullable = false)
	public Vista getFkVista() {
		return fkVista;
	}

	public void setFkVista(Vista fkVista) {
		this.fkVista = fkVista;
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
	public TipoNodoMenuEnum getTipoNodoMenuEnum() {
		return TipoNodoMenuEnum.values()[this.tipoNodoMenu];
	}

	public void setTipoNodoMenuEnum(TipoNodoMenuEnum tipoNodoMenuEnum) {
		this.tipoNodoMenu = tipoNodoMenuEnum.ordinal();
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
