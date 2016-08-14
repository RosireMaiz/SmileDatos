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

import ve.smile.enums.PropiedadEnum;
import ve.smile.seguridad.dto.IconSclass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_configuracion")
@Entity
public class Configuracion {

	private Integer idConfiguracion;
	private Multimedia fkMultimedia;
	private String descripcion;
	private IconSclass fkIconSclass;
	private String valor;
	private Integer propiedad;

	public Configuracion() {
		super();
	}

	public Configuracion(Integer idConfiguracion) {
		super();
		this.idConfiguracion = idConfiguracion;
	}

	public Configuracion(
			Multimedia fkMultimedia,
			String descripcion,
			IconSclass fkIconClass,
			String valor,
			Integer propiedad) {
		super();
		this.fkMultimedia = fkMultimedia;
		this.descripcion = descripcion;
		this.fkIconSclass = fkIconClass;
		this.valor = valor;
		this.propiedad = propiedad;
	}

	@Id
	@SequenceGenerator(name = "tb_configuracion_sequence", sequenceName = "public.tb_configuracion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_configuracion_sequence")
	@Column(name="id_configuracion")
	public Integer getIdConfiguracion() {
		return idConfiguracion;
	}

	public void setIdConfiguracion(Integer idConfiguracion) {
		this.idConfiguracion = idConfiguracion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_multimedia", nullable = false)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_icon_class", nullable = false)
	public IconSclass getFkIconClass() {
		return fkIconSclass;
	}

	public void setFkIconClass(IconSclass fkIconSclass) {
		this.fkIconSclass = fkIconSclass;
	}

	@Column(name="valor")
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Column(name="propiedad")
	public Integer getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Integer propiedad) {
		this.propiedad = propiedad;
	}

	@JsonIgnore
	public PropiedadEnum getPropiedadEnum() {
		return PropiedadEnum.values()[this.propiedad];
	}

	public void setPropiedadEnum(PropiedadEnum propiedadEnum) {
		this.propiedad = propiedadEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idConfiguracion == null) ? 0 : idConfiguracion.hashCode());
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
		Configuracion other = (Configuracion) obj;
		if (idConfiguracion == null) {
			return false;
		} 
		if (!idConfiguracion.equals(other.idConfiguracion)) {
			return false;
		} 
		return true;
	}

}
