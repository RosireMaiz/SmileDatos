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

@Table(name = "tb_incidencia_ts_plan")
@Entity
public class IncidenciaTsPlan {

	private Integer idIncidenciaTsPlan;
	private Persona fkPersona;
	private TsPlan fkTsPlan;
	private Motivo fkMotivo;
	private Long fecha;
	private String observacion;

	public IncidenciaTsPlan() {
		super();
	}

	public IncidenciaTsPlan(Integer idIncidenciaTsPlan) {
		super();
		this.idIncidenciaTsPlan = idIncidenciaTsPlan;
	}

	public IncidenciaTsPlan(
			Persona fkPersona,
			TsPlan fkTsPlan,
			Motivo fkMotivo,
			Long fecha,
			String contenido) {
		super();
		this.fkPersona = fkPersona;
		this.fkTsPlan = fkTsPlan;
		this.fkMotivo = fkMotivo;
		this.fecha = fecha;
		this.observacion = contenido;
	}

	@Id
	@SequenceGenerator(name = "tb_incidencia_ts_plan_sequence", sequenceName = "public.tb_incidencia_ts_plan_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_incidencia_ts_plan_sequence")
	@Column(name="id_incidencia_ts_plan")
	public Integer getIdIncidenciaTsPlan() {
		return idIncidenciaTsPlan;
	}

	public void setIdIncidenciaTsPlan(Integer idIncidenciaTsPlan) {
		this.idIncidenciaTsPlan = idIncidenciaTsPlan;
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
	@JoinColumn(name = "fk_ts_plan", nullable = false)
	public TsPlan getFkTsPlan() {
		return fkTsPlan;
	}

	public void setFkTsPlan(TsPlan fkTsPlan) {
		this.fkTsPlan = fkTsPlan;
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

	@Column(name="observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String contenido) {
		this.observacion = contenido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idIncidenciaTsPlan == null) ? 0 : idIncidenciaTsPlan.hashCode());
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
		IncidenciaTsPlan other = (IncidenciaTsPlan) obj;
		if (idIncidenciaTsPlan == null) {
			return false;
		} 
		if (!idIncidenciaTsPlan.equals(other.idIncidenciaTsPlan)) {
			return false;
		} 
		return true;
	}

}
