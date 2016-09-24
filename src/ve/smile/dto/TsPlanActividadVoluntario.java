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

import ve.smile.enums.EstatusActividadEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "tb_ts_plan_actividad_voluntario")
@Entity
public class TsPlanActividadVoluntario {

	private Integer idTsPlanActividadVoluntario;
	private TsPlanActividad fkTsPlanActividad;
	private Voluntario fkVoluntario;
	private Long fechaPlanificada;
	private Long fechaEjecutada;
	private boolean ejecucion;
	private Motivo fkMotivo;
	private boolean participacion;
	private String observacion;
	private Integer estatusActividad;

	public TsPlanActividadVoluntario() {
		super();
	}

	public TsPlanActividadVoluntario(Integer idTsPlanActividadVoluntario) {
		super();
		this.idTsPlanActividadVoluntario = idTsPlanActividadVoluntario;
	}

	public TsPlanActividadVoluntario(
			TsPlanActividad fkTsPlanActividad,
			Voluntario fkVoluntario,
			Long fechaPlanificada,
			Long fechaEjecutada,
			boolean ejecucion,
			Motivo fkMotivo,
			boolean participacion,
			String observacion,
			Integer estatusActividad) {
		super();
		this.fkTsPlanActividad = fkTsPlanActividad;
		this.fkVoluntario = fkVoluntario;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
		this.ejecucion = ejecucion;
		this.fkMotivo = fkMotivo;
		this.participacion = participacion;
		this.observacion = observacion;
		this.estatusActividad = estatusActividad;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_actividad_voluntario_sequence", sequenceName = "public.tb_ts_plan_actividad_voluntario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_actividad_voluntario_sequence")
	@Column(name="id_ts_plan_actividad_voluntario")
	public Integer getIdTsPlanActividadVoluntario() {
		return idTsPlanActividadVoluntario;
	}

	public void setIdTsPlanActividadVoluntario(Integer idTsPlanActividadVoluntario) {
		this.idTsPlanActividadVoluntario = idTsPlanActividadVoluntario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ts_plan_actividad", nullable = false)
	public TsPlanActividad getFkTsPlanActividad() {
		return fkTsPlanActividad;
	}

	public void setFkTsPlanActividad(TsPlanActividad fkTsPlanActividad) {
		this.fkTsPlanActividad = fkTsPlanActividad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_voluntario", nullable = false)
	public Voluntario getFkVoluntario() {
		return fkVoluntario;
	}

	public void setFkVoluntario(Voluntario fkVoluntario) {
		this.fkVoluntario = fkVoluntario;
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

	@Column(name="ejecucion")
	public boolean getEjecucion() {
		return ejecucion;
	}

	public void setEjecucion(boolean ejecucion) {
		this.ejecucion = ejecucion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_motivo", nullable = false)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@Column(name="participacion")
	public boolean getParticipacion() {
		return participacion;
	}

	public void setParticipacion(boolean participacion) {
		this.participacion = participacion;
	}

	@Column(name="observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name="estatus_actividad")
	public Integer getEstatusActividad() {
		return estatusActividad;
	}

	public void setEstatusActividad(Integer estatusActividad) {
		this.estatusActividad = estatusActividad;
	}

	@JsonIgnore
	@Transient
	public EstatusActividadEnum getEstatusActividadEnum() {
		return EstatusActividadEnum.values()[this.estatusActividad];
	}

	public void setEstatusActividadEnum(EstatusActividadEnum estatusActividadEnum) {
		this.estatusActividad = estatusActividadEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTsPlanActividadVoluntario == null) ? 0 : idTsPlanActividadVoluntario.hashCode());
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
		TsPlanActividadVoluntario other = (TsPlanActividadVoluntario) obj;
		if (idTsPlanActividadVoluntario == null) {
			return false;
		} 
		if (!idTsPlanActividadVoluntario.equals(other.idTsPlanActividadVoluntario)) {
			return false;
		} 
		return true;
	}

}
