package ve.smile.dto;

import java.util.Date;

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

@Table(name = "tb_ts_plan_actividad_recurso")
@Entity
public class TsPlanActividadRecurso {

	private Integer idTsPlanActividadRecurso;
	private TsPlanActividad fkTsPlanActividad;
	private Recurso fkRecurso;
	private Integer cantidad;
	private Long fechaAsignacion;

	public TsPlanActividadRecurso() {
		super();
	}

	public TsPlanActividadRecurso(Integer idTsPlanActividadRecurso) {
		super();
		this.idTsPlanActividadRecurso = idTsPlanActividadRecurso;
	}

	public TsPlanActividadRecurso(TsPlanActividad fkTsPlanActividad,
			Recurso fkRecurso, Integer cantidad, Long fechaAsignacion) {
		super();
		this.fkTsPlanActividad = fkTsPlanActividad;
		this.fkRecurso = fkRecurso;
		this.cantidad = cantidad;
		this.fechaAsignacion = fechaAsignacion;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_actividad_recurso_sequence", sequenceName = "public.tb_ts_plan_actividad_recurso_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_actividad_recurso_sequence")
	@Column(name = "id_ts_plan_actividad_recurso")
	public Integer getIdTsPlanActividadRecurso() {
		return idTsPlanActividadRecurso;
	}

	public void setIdTsPlanActividadRecurso(Integer idTsPlanActividadRecurso) {
		this.idTsPlanActividadRecurso = idTsPlanActividadRecurso;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ts_plan_actividad", nullable = true)
	public TsPlanActividad getFkTsPlanActividad() {
		return fkTsPlanActividad;
	}

	public void setFkTsPlanActividad(TsPlanActividad fkTsPlanActividad) {
		this.fkTsPlanActividad = fkTsPlanActividad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_recurso", nullable = true)
	public Recurso getFkRecurso() {
		return fkRecurso;
	}

	public void setFkRecurso(Recurso fkRecurso) {
		this.fkRecurso = fkRecurso;
	}

	@Column(name = "cantidad")
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "fecha_asignacion")
	public Long getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Long fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	@JsonIgnore
	@Transient
	public Date getFechaAsignacionDate() {
		if (this.fechaAsignacion != null) {
			return new Date(this.fechaAsignacion);
		}
		return null;
	}

	@JsonIgnore
	@Transient
	public void setFechaAsignacionDate(Date fechaAsignacionDate) {
		if (fechaAsignacionDate != null) {
			fechaAsignacion = fechaAsignacionDate.getTime();
		} else {
			fechaAsignacion = null;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idTsPlanActividadRecurso == null) ? 0
						: idTsPlanActividadRecurso.hashCode());
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
		TsPlanActividadRecurso other = (TsPlanActividadRecurso) obj;
		if (idTsPlanActividadRecurso == null) {
			return false;
		}
		if (!idTsPlanActividadRecurso.equals(other.idTsPlanActividadRecurso)) {
			return false;
		}
		return true;
	}

}
