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

@Table(name = "tb_ts_plan_actividad_trabajador")
@Entity
public class TsPlanActividadTrabajador {

	private Integer idTsPlanActividadTrabajador;
	private Trabajador fkTrabajador;
	private TsPlanActividad fkTsPlanActividad;
	private TipoMotivo fkTipoMotivo;
	private String observacion;
	private String ejecucion;
	private Character estatus;

	public TsPlanActividadTrabajador() {
		super();
	}

	public TsPlanActividadTrabajador(Integer idTsPlanActividadTrabajador) {
		super();
		this.idTsPlanActividadTrabajador = idTsPlanActividadTrabajador;
	}

	public TsPlanActividadTrabajador(
			Trabajador fkTrabajador,
			TsPlanActividad fkTsPlanActividad,
			TipoMotivo fkTipoMotivo,
			String observacion,
			String ejecucion,
			Character estatus) {
		super();
		this.fkTrabajador = fkTrabajador;
		this.fkTsPlanActividad = fkTsPlanActividad;
		this.fkTipoMotivo = fkTipoMotivo;
		this.observacion = observacion;
		this.ejecucion = ejecucion;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_actividad_trabajador_sequence", sequenceName = "public.tb_ts_plan_actividad_trabajador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_actividad_trabajador_sequence")
	@Column(name="id_ts_plan_actividad_trabajador")
	public Integer getIdTsPlanActividadTrabajador() {
		return idTsPlanActividadTrabajador;
	}

	public void setIdTsPlanActividadTrabajador(Integer idTsPlanActividadTrabajador) {
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

	@ManyToOne
	@JoinColumn(name = "fk_tipo_motivo", nullable = false)
	public TipoMotivo getFkTipoMotivo() {
		return fkTipoMotivo;
	}

	public void setFkTipoMotivo(TipoMotivo fkTipoMotivo) {
		this.fkTipoMotivo = fkTipoMotivo;
	}

	@Column(name="observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name="ejecucion")
	public String getEjecucion() {
		return ejecucion;
	}

	public void setEjecucion(String ejecucion) {
		this.ejecucion = ejecucion;
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
		result = prime * result + ((idTsPlanActividadTrabajador == null) ? 0 : idTsPlanActividadTrabajador.hashCode());
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
		if (!idTsPlanActividadTrabajador.equals(other.idTsPlanActividadTrabajador)) {
			return false;
		} 
		return true;
	}

}
