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

@Table(name = "tb_ts_plan_actividad_recurso")
@Entity
public class TsPlanActividadRecurso {

	private Integer idTsPlanActividadRecurso;
	private TsPlanActividad fkTsPlanActividad;
	private TipoRecurso fkTipoRecurso;
	private Integer cantidad;

	public TsPlanActividadRecurso() {
		super();
	}

	public TsPlanActividadRecurso(Integer idTsPlanActividadRecurso) {
		super();
		this.idTsPlanActividadRecurso = idTsPlanActividadRecurso;
	}

	public TsPlanActividadRecurso(
			TsPlanActividad fkTsPlanActividad,
			TipoRecurso fkTipoRecurso,
			Integer cantidad) {
		super();
		this.fkTsPlanActividad = fkTsPlanActividad;
		this.fkTipoRecurso = fkTipoRecurso;
		this.cantidad = cantidad;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_actividad_recurso_sequence", sequenceName = "public.tb_ts_plan_actividad_recurso_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_actividad_recurso_sequence")
	@Column(name="id_ts_plan_actividad_recurso")
	public Integer getIdTsPlanActividadRecurso() {
		return idTsPlanActividadRecurso;
	}

	public void setIdTsPlanActividadRecurso(Integer idTsPlanActividadRecurso) {
		this.idTsPlanActividadRecurso = idTsPlanActividadRecurso;
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
	@JoinColumn(name = "fk_tipo_recurso", nullable = false)
	public TipoRecurso getFkTipoRecurso() {
		return fkTipoRecurso;
	}

	public void setFkTipoRecurso(TipoRecurso fkTipoRecurso) {
		this.fkTipoRecurso = fkTipoRecurso;
	}

	@Column(name="cantidad")
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTsPlanActividadRecurso == null) ? 0 : idTsPlanActividadRecurso.hashCode());
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
