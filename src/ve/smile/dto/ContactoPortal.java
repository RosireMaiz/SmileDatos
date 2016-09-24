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
import javax.persistence.Transient;

import ve.smile.enums.TipoContactoPortalEnum;
import ve.smile.enums.EstatusContactoEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "tb_contacto_portal")
@Entity
public class ContactoPortal {

	private Integer idContactoPortal;
	private Comunidad fkComunidad;
	private ClasificadorSugerencia fkClasificadorSugerencia;
	private String contenido;
	private Long fecha;
	private Integer tipoContactoPortal;
	private Integer estatusContacto;

	public ContactoPortal() {
		super();
	}

	public ContactoPortal(Integer idContactoPortal) {
		super();
		this.idContactoPortal = idContactoPortal;
	}

	public ContactoPortal(
			Comunidad fkComunidad,
			ClasificadorSugerencia fkClasificadorSugerencia,
			String contenido,
			Long fecha,
			Integer tipoContactoPortal,
			Integer estatusContacto) {
		super();
		this.fkComunidad = fkComunidad;
		this.fkClasificadorSugerencia = fkClasificadorSugerencia;
		this.contenido = contenido;
		this.fecha = fecha;
		this.tipoContactoPortal = tipoContactoPortal;
		this.estatusContacto = estatusContacto;
	}

	@Id
	@SequenceGenerator(name = "tb_contacto_portal_sequence", sequenceName = "public.tb_contacto_portal_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_contacto_portal_sequence")
	@Column(name="id_contacto_portal")
	public Integer getIdContactoPortal() {
		return idContactoPortal;
	}

	public void setIdContactoPortal(Integer idContactoPortal) {
		this.idContactoPortal = idContactoPortal;
	}

	@ManyToOne
	@JoinColumn(name = "fk_comunidad", nullable = false)
	public Comunidad getFkComunidad() {
		return fkComunidad;
	}

	public void setFkComunidad(Comunidad fkComunidad) {
		this.fkComunidad = fkComunidad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_sugerencia", nullable = false)
	public ClasificadorSugerencia getFkClasificadorSugerencia() {
		return fkClasificadorSugerencia;
	}

	public void setFkClasificadorSugerencia(ClasificadorSugerencia fkClasificadorSugerencia) {
		this.fkClasificadorSugerencia = fkClasificadorSugerencia;
	}

	@Column(name="contenido")
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Column(name="fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@Column(name="tipo_contacto_portal")
	public Integer getTipoContactoPortal() {
		return tipoContactoPortal;
	}

	public void setTipoContactoPortal(Integer tipoContactoPortal) {
		this.tipoContactoPortal = tipoContactoPortal;
	}

	@JsonIgnore
	@Transient
	public TipoContactoPortalEnum getTipoContactoPortalEnum() {
		return TipoContactoPortalEnum.values()[this.tipoContactoPortal];
	}

	public void setTipoContactoPortalEnum(TipoContactoPortalEnum tipoContactoPortalEnum) {
		this.tipoContactoPortal = tipoContactoPortalEnum.ordinal();
	}

	@Column(name="estatus_contacto")
	public Integer getEstatusContacto() {
		return estatusContacto;
	}

	public void setEstatusContacto(Integer estatusContacto) {
		this.estatusContacto = estatusContacto;
	}

	@JsonIgnore
	@Transient
	public EstatusContactoEnum getEstatusContactoEnum() {
		return EstatusContactoEnum.values()[this.estatusContacto];
	}

	public void setEstatusContactoEnum(EstatusContactoEnum estatusContactoEnum) {
		this.estatusContacto = estatusContactoEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idContactoPortal == null) ? 0 : idContactoPortal.hashCode());
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
		ContactoPortal other = (ContactoPortal) obj;
		if (idContactoPortal == null) {
			return false;
		} 
		if (!idContactoPortal.equals(other.idContactoPortal)) {
			return false;
		} 
		return true;
	}

}
