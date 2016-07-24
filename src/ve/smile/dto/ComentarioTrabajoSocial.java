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

@Table(name = "tb_comentario_trabajo_social")
@Entity
public class ComentarioTrabajoSocial {

	private Integer idComentarioTrabajoSocial;
	private TsPlan fkTsPlan;
	private Persona fkPersona;
	private String nombre;
	private Integer puntuacion;
	private Character estatus;

	public ComentarioTrabajoSocial() {
		super();
	}

	public ComentarioTrabajoSocial(Integer idComentarioTrabajoSocial) {
		super();
		this.idComentarioTrabajoSocial = idComentarioTrabajoSocial;
	}

	public ComentarioTrabajoSocial(
			TsPlan fkTsPlan,
			Persona fkPersona,
			String nombre,
			Integer puntuacion,
			Character estatus) {
		super();
		this.fkTsPlan = fkTsPlan;
		this.fkPersona = fkPersona;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_comentario_trabajo_social_sequence", sequenceName = "public.tb_comentario_trabajo_social_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_comentario_trabajo_social_sequence")
	@Column(name="id_comentario_trabajo_social")
	public Integer getIdComentarioTrabajoSocial() {
		return idComentarioTrabajoSocial;
	}

	public void setIdComentarioTrabajoSocial(Integer idComentarioTrabajoSocial) {
		this.idComentarioTrabajoSocial = idComentarioTrabajoSocial;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ts_plan", nullable = false)
	public TsPlan getFkTsPlan() {
		return fkTsPlan;
	}

	public void setFkTsPlan(TsPlan fkTsPlan) {
		this.fkTsPlan = fkTsPlan;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="puntuacion")
	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Column(name="estatus")
	public Character getEstatus() {
		return estatus;
	}

	public void setEstatus(Character estatus) {
		this.estatus = estatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idComentarioTrabajoSocial == null) ? 0 : idComentarioTrabajoSocial.hashCode());
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
		ComentarioTrabajoSocial other = (ComentarioTrabajoSocial) obj;
		if (idComentarioTrabajoSocial == null) {
			return false;
		} 
		if (!idComentarioTrabajoSocial.equals(other.idComentarioTrabajoSocial)) {
			return false;
		} 
		return true;
	}

}
