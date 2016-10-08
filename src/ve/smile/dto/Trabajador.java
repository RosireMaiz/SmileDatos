package ve.smile.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import ve.smile.enums.EstatusPadrinoEnum;
import ve.smile.enums.EstatusTrabajadorEnum;

@Table(name = "tb_trabajador")
@Entity
public class Trabajador {

	private Integer idTrabajador;
	private Persona fkPersona;
	private Cargo fkCargo;
	private Long fechaIngreso;
	private Long fechaEgreso;

	private Motivo fkMotivo;
	private String observacion;

	private Integer estatusTrabajador;

	private List<Fortaleza> fortalezas;

	public Trabajador() {
		super();
	}

	public Trabajador(Integer idTrabajador) {
		super();
		this.idTrabajador = idTrabajador;
	}

	public Trabajador(Persona fkPersona, Cargo fkCargo, Long fechaIngreso,
			Long fechaEgreso, Motivo fkMotivo, String observacion) {
		super();
		this.fkPersona = fkPersona;
		this.fkCargo = fkCargo;
		this.fechaIngreso = fechaIngreso;
		this.fechaEgreso = fechaEgreso;
		this.fkMotivo = fkMotivo;
		this.observacion = observacion;
	}

	@Id
	@SequenceGenerator(name = "tb_trabajador_sequence", sequenceName = "public.tb_trabajador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_trabajador_sequence")
	@Column(name = "id_trabajador")
	public Integer getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(Integer idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@ManyToOne
	@JoinColumn(name = "fk_cargo", nullable = false)
	public Cargo getFkCargo() {
		return fkCargo;
	}

	public void setFkCargo(Cargo fkCargo) {
		this.fkCargo = fkCargo;
	}

	@ManyToMany
	@JoinTable(name = "tb_trabajador_fortaleza", joinColumns = @JoinColumn(name = "fk_trabajador"), inverseJoinColumns = @JoinColumn(name = "fk_fortaleza"))
	public List<Fortaleza> getFortalezas() {
		return fortalezas;
	}

	public void setFortalezas(List<Fortaleza> fortalezas) {
		this.fortalezas = fortalezas;
	}

	@Column(name = "fecha_ingreso")
	public Long getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Long fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Column(name = "fecha_egreso")
	public Long getFechaEgreso() {
		return fechaEgreso;
	}

	public void setFechaEgreso(Long fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}

	@ManyToOne
	@JoinColumn(name = "fk_motivo", nullable = true)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@Column(name = "observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name = "estatus_trabajador")
	public Integer getEstatusPadrino() {
		return estatusTrabajador;
	}

	public void setEstatusTrabajador(Integer estatusTrabajador) {
		this.estatusTrabajador = estatusTrabajador;
	}

	@Transient
	public EstatusPadrinoEnum getEstatusPadrinoEnum() {
		return EstatusPadrinoEnum.values()[this.estatusTrabajador];
	}

	public void setEstatusPostuladoEnum(
			EstatusTrabajadorEnum estatusTrabajadorEnum) {
		this.estatusTrabajador = estatusTrabajadorEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idTrabajador == null) ? 0 : idTrabajador.hashCode());
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
		Trabajador other = (Trabajador) obj;
		if (idTrabajador == null) {
			return false;
		}
		if (!idTrabajador.equals(other.idTrabajador)) {
			return false;
		}
		return true;
	}

}
