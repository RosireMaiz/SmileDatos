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

@Table(name = "tb_comen_evento_planificado")
@Entity
public class ComenEventoPlanificado {

	private Integer idComenEventoPlanificado;
	private EventoPlanificado fkEventoPlanificado;
	private Persona fkPersona;
	private String descripcion;
	private Integer puntuacion;
	private Character estatus;

	public ComenEventoPlanificado() {
		super();
	}

	public ComenEventoPlanificado(Integer idComenEventoPlanificado) {
		super();
		this.idComenEventoPlanificado = idComenEventoPlanificado;
	}

	public ComenEventoPlanificado(
			EventoPlanificado fkEventoPlanificado,
			Persona fkPersona,
			String descripcion,
			Integer puntuacion,
			Character estatus) {
		super();
		this.fkEventoPlanificado = fkEventoPlanificado;
		this.fkPersona = fkPersona;
		this.descripcion = descripcion;
		this.puntuacion = puntuacion;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_comen_evento_planificado_sequence", sequenceName = "public.tb_comen_evento_planificado_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_comen_evento_planificado_sequence")
	@Column(name="id_comen_evento_planificado")
	public Integer getIdComenEventoPlanificado() {
		return idComenEventoPlanificado;
	}

	public void setIdComenEventoPlanificado(Integer idComenEventoPlanificado) {
		this.idComenEventoPlanificado = idComenEventoPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento_planificado", nullable = false)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
		result = prime * result + ((idComenEventoPlanificado == null) ? 0 : idComenEventoPlanificado.hashCode());
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
		ComenEventoPlanificado other = (ComenEventoPlanificado) obj;
		if (idComenEventoPlanificado == null) {
			return false;
		} 
		if (!idComenEventoPlanificado.equals(other.idComenEventoPlanificado)) {
			return false;
		} 
		return true;
	}

}
