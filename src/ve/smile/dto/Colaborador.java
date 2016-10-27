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

import com.fasterxml.jackson.annotation.JsonIgnore;

import ve.smile.enums.EstatusColaboradorEnum;

@Table(name = "tb_colaborador")
@Entity
public class Colaborador {

	private Integer idColaborador;
	private Persona fkPersona;
	private Long fechaIngreso;
	private Long fechaEgreso;

	private Motivo fkMotivo;
	private String observacion;

	private Integer estatusColaborador;

	public Colaborador() {
		super();
	}

	public Colaborador(Integer idColaborador) {
		super();
		this.idColaborador = idColaborador;
	}

	public Colaborador(Persona fkPersona, Long fechaIngreso, Long fechaEgreso) {
		super();
		this.fkPersona = fkPersona;
		this.fechaIngreso = fechaIngreso;
		this.fechaEgreso = fechaEgreso;
	}

	@Id
	@SequenceGenerator(name = "tb_colaborador_sequence", sequenceName = "public.tb_colaborador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_colaborador_sequence")
	@Column(name = "id_colaborador")
	public Integer getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
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

	@Column(name = "estatus_colaborador")
	public Integer getEstatusColaborador() {
		return estatusColaborador;
	}

	public void setEstatusColaborador(Integer estatusColaborador) {
		this.estatusColaborador = estatusColaborador;
	}

	@JsonIgnore
	@Transient
	public EstatusColaboradorEnum getEstatusColaboradorEnum() {
		return EstatusColaboradorEnum.values()[this.estatusColaborador];
	}

	public void setEstatusColaboradorEnum(
			EstatusColaboradorEnum estatusColaboradorEnum) {
		this.estatusColaborador = estatusColaboradorEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idColaborador == null) ? 0 : idColaborador.hashCode());
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
		Colaborador other = (Colaborador) obj;
		if (idColaborador == null) {
			return false;
		}
		if (!idColaborador.equals(other.idColaborador)) {
			return false;
		}
		return true;
	}

}
