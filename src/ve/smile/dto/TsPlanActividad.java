package ve.smile.dto;

import java.util.Date;
import java.util.List;

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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_ts_plan_actividad")
@Entity
public class TsPlanActividad {

	private Integer idTsPlanActividad;
	private Actividad fkActividad;
	private TsPlan fkTsPlan;
	private Motivo fkMotivo;
	private Long fechaPlanificada;
	private Long fechaEjecutada;
	private Directorio fkDirectorio;
	private String observacion;
	private Integer estatusActividad;

	private List<Indicador> listIndicadors;

	private List<IndicadorTsPlanActividad> indicadorTsPlanActividads;

	public TsPlanActividad() {
		super();
	}

	public TsPlanActividad(Integer idTsPlanActividad) {
		super();
		this.idTsPlanActividad = idTsPlanActividad;
	}

	public TsPlanActividad(Actividad fkActividad, TsPlan fkTsPlan,
			Motivo fkMotivo, Long fechaPlanificada, Long fechaEjecutada,
			Directorio fkDirectorio, String observacion,
			Integer estatusActividad) {
		super();
		this.fkActividad = fkActividad;
		this.fkTsPlan = fkTsPlan;
		this.fkMotivo = fkMotivo;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
		this.fkDirectorio = fkDirectorio;
		this.observacion = observacion;
		this.estatusActividad = estatusActividad;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_actividad_sequence", sequenceName = "public.tb_ts_plan_actividad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_actividad_sequence")
	@Column(name = "id_ts_plan_actividad")
	public Integer getIdTsPlanActividad() {
		return idTsPlanActividad;
	}

	public void setIdTsPlanActividad(Integer idTsPlanActividad) {
		this.idTsPlanActividad = idTsPlanActividad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_actividad", nullable = false)
	public Actividad getFkActividad() {
		return fkActividad;
	}

	public void setFkActividad(Actividad fkActividad) {
		this.fkActividad = fkActividad;
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
	@JoinColumn(name = "fk_motivo", nullable = true)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@Column(name = "fecha_planificada")
	public Long getFechaPlanificada() {
		return fechaPlanificada;
	}

	public void setFechaPlanificada(Long fechaPlanificada) {
		this.fechaPlanificada = fechaPlanificada;
	}

	@Column(name = "fecha_ejecutada")
	public Long getFechaEjecutada() {
		return fechaEjecutada;
	}

	public void setFechaEjecutada(Long fechaEjecutada) {
		this.fechaEjecutada = fechaEjecutada;
	}

	@ManyToOne
	@JoinColumn(name = "fk_directorio", nullable = false)
	public Directorio getFkDirectorio() {
		return fkDirectorio;
	}

	public void setFkDirectorio(Directorio fkDirectorio) {
		this.fkDirectorio = fkDirectorio;
	}

	@Column(name = "observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name = "estatus_actividad")
	public Integer getEstatusActividad() {
		return estatusActividad;
	}

	public void setEstatusActividad(Integer estatusActividad) {
		this.estatusActividad = estatusActividad;
	}

	@Transient
	public List<Indicador> getListIndicadors() {
		return listIndicadors;
	}

	public void setListIndicadors(List<Indicador> listIndicadors) {
		this.listIndicadors = listIndicadors;
	}

	@JsonIgnore
	@Transient
	public List<IndicadorTsPlanActividad> getIndicadorTsPlanActividads() {
		return indicadorTsPlanActividads;
	}

	public void setIndicadorTsPlanActividads(
			List<IndicadorTsPlanActividad> indicadorTsPlanActividads) {
		this.indicadorTsPlanActividads = indicadorTsPlanActividads;
	}

	@JsonIgnore
	@Transient
	public Date getFechaPlanificadaDate() {
		return new Date(this.fechaPlanificada);
	}

	public void setFechaPlanificadaDate(Date fechaPlanificadaDate) {
		this.fechaPlanificada = fechaPlanificadaDate.getTime();
	}

	@JsonIgnore
	@Transient
	public Date getFechaEjecutadaDate() {
		return new Date(this.fechaEjecutada);
	}

	public void setFechaEjecutadaDate(Date fechaEjecutadaDate) {
		this.fechaEjecutada = fechaEjecutadaDate.getTime();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idTsPlanActividad == null) ? 0 : idTsPlanActividad
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
