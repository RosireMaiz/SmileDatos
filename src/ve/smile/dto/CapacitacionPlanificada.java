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
	private String descripcion;
	private Capacitacion fkCapacitacion;
	private Directorio fkDirectorio;
	private Long fechaPlanificada;
	private Long fechaEjecutada;
	private Motivo fkMotivo;
	private boolean ejecucion;
	private String observacion;
	private Integer estatusCapacintacionPlanificada;

	public CapacitacionPlanificada() {
		super();
	}

	public CapacitacionPlanificada(Integer idCapacitacionPlanificada) {
		super();
		this.idCapacitacionPlanificada = idCapacitacionPlanificada;
	}

	public CapacitacionPlanificada(
			String descripcion,
			Capacitacion fkCapacitacion,
			Directorio fkDirectorio,
			Long fechaPlanificada,
			Long fechaEjecutada,
			Motivo fkMotivo,
			boolean ejecucion,
			String observacion,
			Integer estatus) {
		super();
		this.descripcion = descripcion;
		this.fkCapacitacion = fkCapacitacion;
		this.fkDirectorio = fkDirectorio;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
		this.fkMotivo = fkMotivo;
		this.ejecucion = ejecucion;
		this.observacion = observacion;
		this.estatusCapacintacionPlanificada = estatus;
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

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_capacitacion", nullable = false)
	public Capacitacion getFkCapacitacion() {
		return fkCapacitacion;
	}

	public void setFkCapacitacion(Capacitacion fkCapacitacion) {
		this.fkCapacitacion = fkCapacitacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_directorio", nullable = false)
	public Directorio getFkDirectorio() {
		return fkDirectorio;
	}

	public void setFkDirectorio(Directorio fkDirectorio) {
		this.fkDirectorio = fkDirectorio;
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

	@ManyToOne
	@JoinColumn(name = "fk_motivo", nullable = false)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@Column(name="ejecucion")
	public boolean getEjecucion() {
		return ejecucion;
	}

	public void setEjecucion(boolean ejecucion) {
		this.ejecucion = ejecucion;
	}

	@Column(name="observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name="estatus_capacitacion_planificada")
	public Integer getEstatusCapacitacionPlanificada() {
		return estatusCapacintacionPlanificada;
	}

	public void setEstatusCapacitacionPlanificada(Integer estatus) {
		this.estatusCapacintacionPlanificada = estatus;
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
