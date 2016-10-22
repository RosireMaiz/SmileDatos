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

@Table(name = "tb_beneficiario")
@Entity
public class Beneficiario {

	private Integer idBeneficiario;
	private Persona fkPersona;
	private Long fechaIngreso;
	private Long fechaSalida;
	private Integer estatusBeneficiario;
	private Familiar fkFamiliar;
	private Parentesco fkParentesco;
	
	private Motivo fkMotivo;
	private String observacion;

	public Beneficiario() {
		super();
	}

	public Beneficiario(Integer idBeneficiario) {
		super();
		this.idBeneficiario = idBeneficiario;
	}

	public Beneficiario(
			Persona fkPersona,
			Long fechaIngreso,
			Long fechaSalida,
			Motivo fkMotivo,
			String observacion) {
		super();
		this.fkPersona = fkPersona;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.fkMotivo = fkMotivo;
		this.observacion = observacion;
	}

	@Id
	@SequenceGenerator(name = "tb_beneficiario_sequence", sequenceName = "public.tb_beneficiario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_beneficiario_sequence")
	@Column(name="id_beneficiario")
	public Integer getIdBeneficiario() {
		return idBeneficiario;
	}

	public void setIdBeneficiario(Integer idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = true)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name="fecha_ingreso")
	public Long getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Long fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Column(name="fecha_salida")
	public Long getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Long fechaSalida) {
		this.fechaSalida = fechaSalida;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idBeneficiario == null) ? 0 : idBeneficiario.hashCode());
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
		Beneficiario other = (Beneficiario) obj;
		if (idBeneficiario == null) {
			return false;
		} 
		if (!idBeneficiario.equals(other.idBeneficiario)) {
			return false;
		} 
		return true;
	}

		@Column(name="estatus_beneficiario")
	public Integer getEstatusBeneficiario() {
		return estatusBeneficiario;
	}

	public void setEstatusBeneficiario(Integer estatusBeneficiario) {
		this.estatusBeneficiario = estatusBeneficiario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_familiar", nullable = true)
	public Familiar getFkFamiliar() {
		return fkFamiliar;
	}

	public void setFkFamiliar(Familiar fkFamiliar) {
		this.fkFamiliar = fkFamiliar;
	}
	
	@ManyToOne
	@JoinColumn(name = "fk_parentesco", nullable = true)
	public Parentesco getFkParentesco() {
		return fkParentesco;
	}

	public void setFkParentesco(Parentesco fkParentesco) {
		this.fkParentesco = fkParentesco;
	}

}
