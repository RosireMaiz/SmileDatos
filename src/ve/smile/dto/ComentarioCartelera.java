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

import ve.smile.enums.EstatusComentarioCarteleraEnum;

@Table(name = "tb_comentario_cartelera")
@Entity
public class ComentarioCartelera {

	private Integer idComentarioCartelera;
	private Cartelera fkCartelera;
	private Comunidad fkComunidad;
	private String comentario;
	private Integer puntuacion;
	private Integer estatusComentario;

	public ComentarioCartelera() {
		super();
	}

	public ComentarioCartelera(Integer idComentarioCartelera) {
		super();
		this.idComentarioCartelera = idComentarioCartelera;
	}

	public ComentarioCartelera(Cartelera fkCartelera, Comunidad fkComunidad,
			String comentario, Integer puntuacion, Integer estatusComentario) {
		super();
		this.fkCartelera = fkCartelera;
		this.fkComunidad = fkComunidad;
		this.comentario = comentario;
		this.puntuacion = puntuacion;
		this.estatusComentario = estatusComentario;
	}

	@Id
	@SequenceGenerator(name = "tb_comentario_cartelera_sequence", sequenceName = "public.tb_comentario_cartelera_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_comentario_cartelera_sequence")
	@Column(name = "id_comentario_cartelera")
	public Integer getIdComentarioCartelera() {
		return idComentarioCartelera;
	}

	public void setIdComentarioCartelera(Integer idComentarioCartelera) {
		this.idComentarioCartelera = idComentarioCartelera;
	}

	@ManyToOne
	@JoinColumn(name = "fk_cartelera", nullable = false)
	public Cartelera getFkCartelera() {
		return fkCartelera;
	}

	public void setFkCartelera(Cartelera fkCartelera) {
		this.fkCartelera = fkCartelera;
	}

	@ManyToOne
	@JoinColumn(name = "fk_comunidad", nullable = false)
	public Comunidad getFkComunidad() {
		return fkComunidad;
	}

	public void setFkComunidad(Comunidad fkComunidad) {
		this.fkComunidad = fkComunidad;
	}

	@Column(name = "comentario")
	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Column(name = "puntuacion")
	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Column(name = "estatus_comentario")
	public Integer getEstatusComentario() {
		return estatusComentario;
	}

	public void setEstatusComentario(Integer estatusComentario) {
		this.estatusComentario = estatusComentario;
	}

	@Transient
	public EstatusComentarioCarteleraEnum getEstatusComentarioCarteleraEnum() {
		return EstatusComentarioCarteleraEnum.values()[this.estatusComentario];
	}

	public void setEstatusComentarioCarteleraEnum(
			EstatusComentarioCarteleraEnum estatusComentarioCarteleraEnum) {
		this.estatusComentario = estatusComentarioCarteleraEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idComentarioCartelera == null) ? 0 : idComentarioCartelera
						.hashCode());
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
		ComentarioCartelera other = (ComentarioCartelera) obj;
		if (idComentarioCartelera == null) {
			return false;
		}
		if (!idComentarioCartelera.equals(other.idComentarioCartelera)) {
			return false;
		}
		return true;
	}

}
