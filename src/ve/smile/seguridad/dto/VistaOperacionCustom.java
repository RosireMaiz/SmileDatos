package ve.smile.seguridad.dto;

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

import ve.smile.seguridad.enums.OperacionEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_vista_operacion_custom")
@Entity
public class VistaOperacionCustom {

	private Integer idVistaOperacionCustom;
	private Integer operacion;
	private Vista fkVista;
	private IconSclass fkIconSclass;
	private Sclass fkSclass;
	private String tooltiptext;
	private String nombre;

	public VistaOperacionCustom() {
		super();
	}

	public VistaOperacionCustom(Integer idVistaOperacionCustom) {
		super();
		this.idVistaOperacionCustom = idVistaOperacionCustom;
	}

	public VistaOperacionCustom(
			Integer operacion,
			Vista fkVista,
			IconSclass fkIconSclass,
			Sclass fkSclass,
			String tooltiptext,
			String nombre) {
		super();
		this.operacion = operacion;
		this.fkVista = fkVista;
		this.fkIconSclass = fkIconSclass;
		this.fkSclass = fkSclass;
		this.tooltiptext = tooltiptext;
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_vista_operacion_custom_sequence", sequenceName = "public.tb_vista_operacion_custom_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_vista_operacion_custom_sequence")
	@Column(name="id_vista_operacion_custom")
	public Integer getIdVistaOperacionCustom() {
		return idVistaOperacionCustom;
	}

	public void setIdVistaOperacionCustom(Integer idVistaOperacionCustom) {
		this.idVistaOperacionCustom = idVistaOperacionCustom;
	}

	@Column(name="operacion")
	public Integer getOperacion() {
		return operacion;
	}

	public void setOperacion(Integer operacion) {
		this.operacion = operacion;
	}

	@JsonIgnore
	@Transient
	public OperacionEnum getOperacionEnum() {
		return OperacionEnum.values()[this.operacion];
	}

	public void setOperacionEnum(OperacionEnum operacionEnum) {
		this.operacion = operacionEnum.ordinal();
	}

	@ManyToOne
	@JoinColumn(name = "fk_vista", nullable = false)
	public Vista getFkVista() {
		return fkVista;
	}

	public void setFkVista(Vista fkVista) {
		this.fkVista = fkVista;
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
	@JoinColumn(name = "fk_sclass", nullable = false)
	public Sclass getFkSclass() {
		return fkSclass;
	}

	public void setFkSclass(Sclass fkSclass) {
		this.fkSclass = fkSclass;
	}

	@Column(name="tooltiptext")
	public String getTooltiptext() {
		return tooltiptext;
	}

	public void setTooltiptext(String tooltiptext) {
		this.tooltiptext = tooltiptext;
	}

	public String getNombre() {
		return nombre;
	}

	@Column(name="nombre")
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVistaOperacionCustom == null) ? 0 : idVistaOperacionCustom.hashCode());
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
		VistaOperacionCustom other = (VistaOperacionCustom) obj;
		if (idVistaOperacionCustom == null) {
			return false;
		} 
		if (!idVistaOperacionCustom.equals(other.idVistaOperacionCustom)) {
			return false;
		} 
		return true;
	}

}
