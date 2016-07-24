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

@Table(name = "tb_ts_plan_actividad_voluntario")
@Entity
public class TsPlanActividadVoluntario {

	private Integer idTsPlanActividadVoluntario;
	private TsPlanActividad fkTsPlanActividad;
	private Voluntario fkVoluntario;
	private TipoMotivo fkTipoMotivo;
	private String ejecucion;
	private String observacion;
	private Character estatus;

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
			TipoMotivo fkTipoMotivo,
			String ejecucion,
			String observacion,
			Character estatus) {
		super();
		this.fkTsPlanActividad = fkTsPlanActividad;
		this.fkVoluntario = fkVoluntario;
		this.fkTipoMotivo = fkTipoMotivo;
		this.ejecucion = ejecucion;
		this.observacion = observacion;
		this.estatus = estatus;
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

	@ManyToOne
	@JoinColumn(name = "fk_tipo_motivo", nullable = false)
	public TipoMotivo getFkTipoMotivo() {
		return fkTipoMotivo;
	}

	public void setFkTipoMotivo(TipoMotivo fkTipoMotivo) {
		this.fkTipoMotivo = fkTipoMotivo;
	}

	@Column(name="ejecucion")
	public String getEjecucion() {
		return ejecucion;
	}

	public void setEjecucion(String ejecucion) {
		this.ejecucion = ejecucion;
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
