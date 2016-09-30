package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_album")
@Entity
public class Album {

	private Integer idAlbum;
	private String titulo;
	private String descripcion;
	private Long fechaPublicacion;
	private Long fechaExpiracion;
	private Integer estatusAlbum;

	public Album() {
		super();
	}

	public Album(Integer idAlbum) {
		super();
		this.idAlbum = idAlbum;
	}

	public Album(
			String titulo,
			String descripcion,
			Long fechaPublicacion,
			Long fechaExpiracion,
			Integer estatusAlbum) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaPublicacion = fechaPublicacion;
		this.fechaExpiracion = fechaExpiracion;
		this.estatusAlbum = estatusAlbum;
	}

	@Id
	@SequenceGenerator(name = "tb_album_sequence", sequenceName = "public.tb_album_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_album_sequence")
	@Column(name="id_album")
	public Integer getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(Integer idAlbum) {
		this.idAlbum = idAlbum;
	}

	@Column(name="titulo")
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name="fecha_publicacion")
	public Long getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Long fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	@Column(name="fecha_expiracion")
	public Long getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Long fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	@Column(name="estatus_album")
	public Integer getEstatusAlbum() {
		return estatusAlbum;
	}

	public void setEstatusAlbum(Integer estatusAlbum) {
		this.estatusAlbum = estatusAlbum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAlbum == null) ? 0 : idAlbum.hashCode());
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
		Album other = (Album) obj;
		if (idAlbum == null) {
			return false;
		} 
		if (!idAlbum.equals(other.idAlbum)) {
			return false;
		} 
		return true;
	}

}
