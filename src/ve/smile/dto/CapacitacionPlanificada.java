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

@Table(name = "tb_capacitacion_planificada")
@Entity
public class CapacitacionPlanificada {

	private Integer idCapacitacionPlanificada;
	private Capacitacion fkCapacitacion;
	private Long fechaPlanificada;
	private Long fechaEjecutada;
	private Long estatus;

	public CapacitacionPlanificada() {
		super();
	}

	public CapacitacionPlanificada(Integer idCapacitacionPlanificada) {
		super();
		this.idCapacitacionPlanificada = idCapacitacionPlanificada;
	}

	public CapacitacionPlanificada(
			Capacitacion fkCapacitacion,
			Long fechaPlanificada,
			Long fechaEjecutada,
			Long estatus) {
		super();
		this.fkCapacitacion = fkCapacitacion;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_capacitacion_planificada_sequence", sequenceName = "public.tb_capacitacion_planificada_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_capacitacion_planificada_sequence")
	@Column(name="id_capacitacion_planificada")
	public Integer getIdCapacitacionPlanificada() {
		return idCapacitacionPlanificada;
	}

	public void setIdCapacitacionPlanificada(Integer idCapacitacionPlanificada) {
		this.idCapacitacionPlanificada = idCapacitacionPlanificada;
	}

	@ManyToOne
	@JoinColumn(name = "fk_capacitacion", nullable = false)
	public Capacitacion getFkCapacitacion() {
		return fkCapacitacion;
	}

	public void setFkCapacitacion(Capacitacion fkCapacitacion) {
		this.fkCapacitacion = fkCapacitacion;
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

	@Column(name="estatus")
	public Long getEstatus() {
		return estatus;
	}

	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCapacitacionPlanificada == null) ? 0 : idCapacitacionPlanificada.hashCode());
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
		CapacitacionPlanificada other = (CapacitacionPlanificada) obj;
		if (idCapacitacionPlanificada == null) {
			return false;
		} 
		if (!idCapacitacionPlanificada.equals(other.idCapacitacionPlanificada)) {
			return false;
		} 
		return true;
	}

}
