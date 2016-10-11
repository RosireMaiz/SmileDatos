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

@Table(name = "tb_ts_plan_actividad_trabajador")
@Entity
public class TsPlanActividadTrabajador {

	private Integer idTsPlanActividadTrabajador;
	private Trabajador fkTrabajador;
	private TsPlanActividad fkTsPlanActividad;
	private Long fechaPlanificada;
	private Long fechaEjecutada;
	private boolean ejecucion;
	private Motivo fkMotivo;
	private boolean participacion;
	private String observacion;
	private Integer estatusActividad;

	public TsPlanActividadTrabajador() {
		super();
	}

	public TsPlanActividadTrabajador(Integer idTsPlanActividadTrabajador) {
		super();
		this.idTsPlanActividadTrabajador = idTsPlanActividadTrabajador;
	}

	public TsPlanActividadTrabajador(Trabajador fkTrabajador,
			TsPlanActividad fkTsPlanActividad, Long fechaPlanificada,
			Long fechaEjecutada, boolean ejecucion, Motivo fkMotivo,
			boolean participacion, String observacion, Integer estatusActividad) {
		super();
		this.fkTrabajador = fkTrabajador;
		this.fkTsPlanActividad = fkTsPlanActividad;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
		this.ejecucion = ejecucion;
		this.fkMotivo = fkMotivo;
		this.participacion = participacion;
		this.observacion = observacion;
		this.estatusActividad = estatusActividad;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_actividad_trabajador_sequence", sequenceName = "public.tb_ts_plan_actividad_trabajador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_actividad_trabajador_sequence")
	@Column(name = "id_ts_plan_actividad_trabajador")
	public Integer getIdTsPlanActividadTrabajador() {
		return idTsPlanActividadTrabajador;
	}

	public void setIdTsPlanActividadTrabajador(
			Integer idTsPlanActividadTrabajador) {
		this.idTsPlanActividadTrabajador = idTsPlanActividadTrabajador;
	}

	@ManyToOne
	@JoinColumn(name = "fk_trabajador", nullable = false)
	public Trabajador getFkTrabajador() {
		return fkTrabajador;
	}

	public void setFkTrabajador(Trabajador fkTrabajador) {
		this.fkTrabajador = fkTrabajador;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ts_plan_actividad", nullable = false)
	public TsPlanActividad getFkTsPlanActividad() {
		return fkTsPlanActividad;
	}

	public void setFkTsPlanActividad(TsPlanActividad fkTsPlanActividad) {
		this.fkTsPlanActividad = fkTsPlanActividad;
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

	@Column(name = "ejecucion")
	public boolean getEjecucion() {
		return ejecucion;
	}

	public void setEjecucion(boolean ejecucion) {
		this.ejecucion = ejecucion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_motivo", nullable = true)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@Column(name = "participacion")
	public boolean getParticipacion() {
		return participacion;
	}

	public void setParticipacion(boolean participacion) {
		this.participacion = participacion;
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
	public EstatusActividadEnum getEstatusActividadEnum() {
		return EstatusActividadEnum.values()[this.estatusActividad];
	}

	public void setEstatusActividadEnum(
			EstatusActividadEnum estatusActividadEnum) {
		this.estatusActividad = estatusActividadEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idTsPlanActividadTrabajador == null) ? 0
						: idTsPlanActividadTrabajador.hashCode());
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
		TsPlanActividadTrabajador other = (TsPlanActividadTrabajador) obj;
		if (idTsPlanActividadTrabajador == null) {
			return false;
		}
		if (!idTsPlanActividadTrabajador
				.equals(other.idTsPlanActividadTrabajador)) {
			return false;
		}
		return true;
	}

}
