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

@Table(name = "tb_vol_capacitacion_planificada")
@Entity
public class VolCapacitacionPlanificada {

	private Integer idVolCapacitacionPlanificada;
	private CapacitacionPlanificada fkCapacitacionPlanificada;
	private Voluntario fkVoluntario;
	private Motivo fkMotivo;
	private boolean asistencia;
	private boolean participa;
	private String observacion;

	public VolCapacitacionPlanificada() {
		super();
	}

	public VolCapacitacionPlanificada(Integer idVolCapacitacionPlanificada) {
		super();
		this.idVolCapacitacionPlanificada = idVolCapacitacionPlanificada;
	}

	public VolCapacitacionPlanificada(
			CapacitacionPlanificada fkCapacitacionPlanificada,
			Voluntario fkVoluntario,
			Motivo fkMotivo,
			boolean asistencia,
			boolean participa,
			String observacion) {
		super();
		this.fkCapacitacionPlanificada = fkCapacitacionPlanificada;
		this.fkVoluntario = fkVoluntario;
		this.fkMotivo = fkMotivo;
		this.asistencia = asistencia;
		this.participa = participa;
		this.observacion = observacion;
	}

	@Id
	@SequenceGenerator(name = "tb_vol_capacitacion_planificada_sequence", sequenceName = "public.tb_vol_capacitacion_planificada_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_vol_capacitacion_planificada_sequence")
	@Column(name="id_vol_capacitacion_planificada")
	public Integer getIdVolCapacitacionPlanificada() {
		return idVolCapacitacionPlanificada;
	}

	public void setIdVolCapacitacionPlanificada(Integer idVolCapacitacionPlanificada) {
		this.idVolCapacitacionPlanificada = idVolCapacitacionPlanificada;
	}

	@ManyToOne
	@JoinColumn(name = "fk_capacitacion_planificada", nullable = false)
	public CapacitacionPlanificada getFkCapacitacionPlanificada() {
		return fkCapacitacionPlanificada;
	}

	public void setFkCapacitacionPlanificada(CapacitacionPlanificada fkCapacitacionPlanificada) {
		this.fkCapacitacionPlanificada = fkCapacitacionPlanificada;
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
	@JoinColumn(name = "fk_motivo", nullable = true)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@Column(name="asistencia")
	public boolean getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}

	@Column(name="participa")
	public boolean getParticipa() {
		return participa;
	}

	public void setParticipa(boolean participa) {
		this.participa = participa;
	}

	@Column(name="observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVolCapacitacionPlanificada == null) ? 0 : idVolCapacitacionPlanificada.hashCode());
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
		VolCapacitacionPlanificada other = (VolCapacitacionPlanificada) obj;
		if (idVolCapacitacionPlanificada == null) {
			return false;
		} 
		if (!idVolCapacitacionPlanificada.equals(other.idVolCapacitacionPlanificada)) {
			return false;
		} 
		return true;
	}

}
