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

import ve.smile.enums.EstatusCapacitacionPlanificadaEnum;
import ve.smile.enums.EstatusComentarioAlbumEnum;

@Table(name = "tb_comentario_album")
@Entity
public class ComentarioAlbum {

	private Integer idComentarioAlbum;
	private Album fkAlbum;
	private Comunidad fkComunidad;
	private String comentario;
	private Integer estatusComentario;

	public ComentarioAlbum() {
		super();
	}

	public ComentarioAlbum(Integer idComentarioAlbum) {
		super();
		this.idComentarioAlbum = idComentarioAlbum;
	}

	public ComentarioAlbum(
			Album fkAlbum,
			Comunidad fkComunidad,
			String comentario,
			Integer estatusComentario) {
		super();
		this.fkAlbum = fkAlbum;
		this.fkComunidad = fkComunidad;
		this.comentario = comentario;
		this.estatusComentario = estatusComentario;
	}

	@Id
	@SequenceGenerator(name = "tb_comentario_album_sequence", sequenceName = "public.tb_comentario_album_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_comentario_album_sequence")
	@Column(name="id_comentario_album")
	public Integer getIdComentarioAlbum() {
		return idComentarioAlbum;
	}

	public void setIdComentarioAlbum(Integer idComentarioAlbum) {
		this.idComentarioAlbum = idComentarioAlbum;
	}

	@ManyToOne
	@JoinColumn(name = "fk_album", nullable = false)
	public Album getFkAlbum() {
		return fkAlbum;
	}

	public void setFkAlbum(Album fkAlbum) {
		this.fkAlbum = fkAlbum;
	}

	@ManyToOne
	@JoinColumn(name = "fk_comunidad", nullable = false)
	public Comunidad getFkComunidad() {
		return fkComunidad;
	}

	public void setFkComunidad(Comunidad fkComunidad) {
		this.fkComunidad = fkComunidad;
	}

	@Column(name="comentario")
	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Column(name="estatus_comentario")
	public Integer getEstatusComentario() {
		return estatusComentario;
	}

	public void setEstatusComentario(Integer estatusComentario) {
		this.estatusComentario = estatusComentario;
	}
	
	
	@Transient
	public EstatusComentarioAlbumEnum getEstatusComentarioAlbumEnum() {
		return EstatusComentarioAlbumEnum.values()[this.estatusComentario];
	}

	public void setEstatusComentarioAlbumEnum(EstatusComentarioAlbumEnum estatusComentarioAlbumEnum) {
		this.estatusComentario = estatusComentarioAlbumEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idComentarioAlbum == null) ? 0 : idComentarioAlbum.hashCode());
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
		ComentarioAlbum other = (ComentarioAlbum) obj;
		if (idComentarioAlbum == null) {
			return false;
		} 
		if (!idComentarioAlbum.equals(other.idComentarioAlbum)) {
			return false;
		} 
		return true;
	}

}
