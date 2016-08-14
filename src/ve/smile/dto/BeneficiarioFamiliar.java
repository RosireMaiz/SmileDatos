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

@Table(name = "tb_beneficiario_familiar")
@Entity
public class BeneficiarioFamiliar {

	private Integer idBeneficiarioFamiliar;
	private Beneficiario fkBeneficiario;
	private Parentesco fkParentesco;
	private Familiar fkFamiliar;

	public BeneficiarioFamiliar() {
		super();
	}

	public BeneficiarioFamiliar(Integer idBeneficiarioFamiliar) {
		super();
		this.idBeneficiarioFamiliar = idBeneficiarioFamiliar;
	}

	public BeneficiarioFamiliar(
			Beneficiario fkBeneficiario,
			Parentesco fkParentesco,
			Familiar fkFamiliar) {
		super();
		this.fkBeneficiario = fkBeneficiario;
		this.fkParentesco = fkParentesco;
		this.fkFamiliar = fkFamiliar;
	}

	@Id
	@SequenceGenerator(name = "tb_beneficiario_familiar_sequence", sequenceName = "public.tb_beneficiario_familiar_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_beneficiario_familiar_sequence")
	@Column(name="id_beneficiario_familiar")
	public Integer getIdBeneficiarioFamiliar() {
		return idBeneficiarioFamiliar;
	}

	public void setIdBeneficiarioFamiliar(Integer idBeneficiarioFamiliar) {
		this.idBeneficiarioFamiliar = idBeneficiarioFamiliar;
	}

	@ManyToOne
	@JoinColumn(name = "fk_beneficiario", nullable = false)
	public Beneficiario getFkBeneficiario() {
		return fkBeneficiario;
	}

	public void setFkBeneficiario(Beneficiario fkBeneficiario) {
		this.fkBeneficiario = fkBeneficiario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_parentesco", nullable = false)
	public Parentesco getFkParentesco() {
		return fkParentesco;
	}

	public void setFkParentesco(Parentesco fkParentesco) {
		this.fkParentesco = fkParentesco;
	}

	@ManyToOne
	@JoinColumn(name = "fk_familiar", nullable = false)
	public Familiar getFkFamiliar() {
		return fkFamiliar;
	}

	public void setFkFamiliar(Familiar fkFamiliar) {
		this.fkFamiliar = fkFamiliar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idBeneficiarioFamiliar == null) ? 0 : idBeneficiarioFamiliar.hashCode());
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
		BeneficiarioFamiliar other = (BeneficiarioFamiliar) obj;
		if (idBeneficiarioFamiliar == null) {
			return false;
		} 
		if (!idBeneficiarioFamiliar.equals(other.idBeneficiarioFamiliar)) {
			return false;
		} 
		return true;
	}

}
