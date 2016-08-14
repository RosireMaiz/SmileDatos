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

@Table(name = "tb_incidencia_evento_plan")
@Entity
public class IncidenciaEventoPlan {

	private Integer idIncidenciaEventoPlan;
	private Persona fkPersona;
	private EventoPlanificado fkEventoPlanificado;
	private Motivo fkMotivo;
	private Long fecha;
	private String contenido;

	public IncidenciaEventoPlan() {
		super();
	}

	public IncidenciaEventoPlan(Integer idIncidenciaEventoPlan) {
		super();
		this.idIncidenciaEventoPlan = idIncidenciaEventoPlan;
	}

	public IncidenciaEventoPlan(
			Persona fkPersona,
			EventoPlanificado fkEventoPlanificado,
			Motivo fkMotivo,
			Long fecha,
			String contenido) {
		super();
		this.fkPersona = fkPersona;
		this.fkEventoPlanificado = fkEventoPlanificado;
		this.fkMotivo = fkMotivo;
		this.fecha = fecha;
		this.contenido = contenido;
	}

	@Id
	@SequenceGenerator(name = "tb_incidencia_evento_plan_sequence", sequenceName = "public.tb_incidencia_evento_plan_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_incidencia_evento_plan_sequence")
	@Column(name="id_incidencia_evento_plan")
	public Integer getIdIncidenciaEventoPlan() {
		return idIncidenciaEventoPlan;
	}

	public void setIdIncidenciaEventoPlan(Integer idIncidenciaEventoPlan) {
		this.idIncidenciaEventoPlan = idIncidenciaEventoPlan;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
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
	@JoinColumn(name = "fk_motivo", nullable = false)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@Column(name="fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@Column(name="contenido")
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idIncidenciaEventoPlan == null) ? 0 : idIncidenciaEventoPlan.hashCode());
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
		IncidenciaEventoPlan other = (IncidenciaEventoPlan) obj;
		if (idIncidenciaEventoPlan == null) {
			return false;
		} 
		if (!idIncidenciaEventoPlan.equals(other.idIncidenciaEventoPlan)) {
			return false;
		} 
		return true;
	}

}
