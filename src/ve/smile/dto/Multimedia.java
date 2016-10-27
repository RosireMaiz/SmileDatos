package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ve.smile.enums.ExtensionEnum;
import ve.smile.enums.TipoMultimediaEnum;

@Table(name = "tb_multimedia")
@Entity
public class Multimedia {

	private Integer idMultimedia;
	private String url;
	private String nombre;
	private String descripcion;
	private Integer extension;
	private Integer tipoMultimedia;

	public Multimedia() {
		super();
	}

	public Multimedia(Integer idMultimedia) {
		super();
		this.idMultimedia = idMultimedia;
	}

	public Multimedia(
			String url,
			String nombre,
			String descripcion,
			Integer extension,
			Integer tipoMultimedia) {
		super();
		this.url = url;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.extension = extension;
		this.tipoMultimedia = tipoMultimedia;
	}

	@Id
	@SequenceGenerator(name = "tb_multimedia_sequence", sequenceName = "public.tb_multimedia_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_multimedia_sequence")
	@Column(name="id_multimedia")
	public Integer getIdMultimedia() {
		return idMultimedia;
	}

	public void setIdMultimedia(Integer idMultimedia) {
		this.idMultimedia = idMultimedia;
	}

	@Column(name="url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name="extension")
	public Integer getExtension() {
		return extension;
	}

	public void setExtension(Integer extension) {
		this.extension = extension;
	}

	@JsonIgnore
	@Transient
	public ExtensionEnum getExtensionEnum() {
		return ExtensionEnum.values()[this.extension];
	}

	public void setExtensionEnum(ExtensionEnum extensionEnum) {
		this.extension = extensionEnum.ordinal();
	}

	@Column(name="tipo_multimedia")
	public Integer getTipoMultimedia() {
		return tipoMultimedia;
	}

	public void setTipoMultimedia(Integer tipoMultimedia) {
		this.tipoMultimedia = tipoMultimedia;
	}

	@JsonIgnore
	@Transient
	public TipoMultimediaEnum getTipoMultimediaEnum() {
		return TipoMultimediaEnum.values()[this.tipoMultimedia];
	}

	public void setTipoMultimediaEnum(TipoMultimediaEnum tipoMultimediaEnum) {
		this.tipoMultimedia = tipoMultimediaEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMultimedia == null) ? 0 : idMultimedia.hashCode());
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
		Multimedia other = (Multimedia) obj;
		if (idMultimedia == null) {
			return false;
		} 
		if (!idMultimedia.equals(other.idMultimedia)) {
			return false;
		} 
		return true;
	}

}
