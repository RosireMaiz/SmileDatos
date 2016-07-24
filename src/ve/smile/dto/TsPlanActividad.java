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

@Table(name = "tb_ts_plan_actividad")
@Entity
public class TsPlanActividad {

	private Integer idTsPlanActividad;
	private TipoActividad fkTipoActividad;
	private TsPlan fkTsPlan;
	private TipoMotivo fkTipoMotivo;
	private Long fechaPlanificada;
	private Long fechaEjecutada;
	private String observacion;
	private Character estatus;

	public TsPlanActividad() {
		super();
	}

	public TsPlanActividad(Integer idTsPlanActividad) {
		super();
		this.idTsPlanActividad = idTsPlanActividad;
	}

	public TsPlanActividad(
			TipoActividad fkTipoActividad,
			TsPlan fkTsPlan,
			TipoMotivo fkTipoMotivo,
			Long fechaPlanificada,
			Long fechaEjecutada,
			String observacion,
			Character estatus) {
		super();
		this.fkTipoActividad = fkTipoActividad;
		this.fkTsPlan = fkTsPlan;
		this.fkTipoMotivo = fkTipoMotivo;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
		this.observacion = observacion;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_actividad_sequence", sequenceName = "public.tb_ts_plan_actividad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_actividad_sequence")
	@Column(name="id_ts_plan_actividad")
	public Integer getIdTsPlanActividad() {
		return idTsPlanActividad;
	}

	public void setIdTsPlanActividad(Integer idTsPlanActividad) {
		this.idTsPlanActividad = idTsPlanActividad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tipo_actividad", nullable = false)
	public TipoActividad getFkTipoActividad() {
		return fkTipoActividad;
	}

	public void setFkTipoActividad(TipoActividad fkTipoActividad) {
		this.fkTipoActividad = fkTipoActividad;
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
	@JoinColumn(name = "fk_tipo_motivo", nullable = false)
	public TipoMotivo getFkTipoMotivo() {
		return fkTipoMotivo;
	}

	public void setFkTipoMotivo(TipoMotivo fkTipoMotivo) {
		this.fkTipoMotivo = fkTipoMotivo;
	}

	@Column(name="fecha_planificada")
	public Long getFechaPlanificada() {
		return fechaPlanificada;
	}

	public void setFechaPlanificada(Long fechaPlanificada) {
		this.fechaPlanificada = fechaPlanificada;
	}

	@Column(name="fecha_ejecutada")
	public Long getFechaEjecutada() {
		return fechaEjecutada;
	}

	public void setFechaEjecutada(Long fechaEjecutada) {
		this.fechaEjecutada = fechaEjecutada;
	}

	@Column(name="observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
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
		result = prime * result + ((idTsPlanActividad == null) ? 0 : idTsPlanActividad.hashCode());
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
		TsPlanActividad other = (TsPlanActividad) obj;
		if (idTsPlanActividad == null) {
			return false;
		} 
		if (!idTsPlanActividad.equals(other.idTsPlanActividad)) {
			return false;
		} 
		return true;
	}

}
