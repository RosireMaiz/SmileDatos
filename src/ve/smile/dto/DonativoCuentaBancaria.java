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

import ve.smile.enums.TipoEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_donativo_cuenta_bancaria")
@Entity
public class DonativoCuentaBancaria {

	private Integer idDonativoCuentaBancaria;
	private CuentaBancaria fkCuentaBancaria;
	private DonativoRecurso fkDonativoRecurso;
	private Integer tipo;

	public DonativoCuentaBancaria() {
		super();
	}

	public DonativoCuentaBancaria(Integer idDonativoCuentaBancaria) {
		super();
		this.idDonativoCuentaBancaria = idDonativoCuentaBancaria;
	}

	public DonativoCuentaBancaria(
			CuentaBancaria fkCuentaBancaria,
			DonativoRecurso fkDonativoRecurso,
			Integer tipo) {
		super();
		this.fkCuentaBancaria = fkCuentaBancaria;
		this.fkDonativoRecurso = fkDonativoRecurso;
		this.tipo = tipo;
	}

	@Id
	@SequenceGenerator(name = "tb_donativo_cuenta_bancaria_sequence", sequenceName = "public.tb_donativo_cuenta_bancaria_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_donativo_cuenta_bancaria_sequence")
	@Column(name="id_donativo_cuenta_bancaria")
	public Integer getIdDonativoCuentaBancaria() {
		return idDonativoCuentaBancaria;
	}

	public void setIdDonativoCuentaBancaria(Integer idDonativoCuentaBancaria) {
		this.idDonativoCuentaBancaria = idDonativoCuentaBancaria;
	}

	@ManyToOne
	@JoinColumn(name = "fk_cuenta_bancaria", nullable = false)
	public CuentaBancaria getFkCuentaBancaria() {
		return fkCuentaBancaria;
	}

	public void setFkCuentaBancaria(CuentaBancaria fkCuentaBancaria) {
		this.fkCuentaBancaria = fkCuentaBancaria;
	}

	@ManyToOne
	@JoinColumn(name = "fk_donativo_recurso", nullable = false)
	public DonativoRecurso getFkDonativoRecurso() {
		return fkDonativoRecurso;
	}

	public void setFkDonativoRecurso(DonativoRecurso fkDonativoRecurso) {
		this.fkDonativoRecurso = fkDonativoRecurso;
	}

	@Column(name="tipo")
	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	@JsonIgnore
	public TipoEnum getTipoEnum() {
		return TipoEnum.values()[this.tipo];
	}

	public void setTipoEnum(TipoEnum tipoEnum) {
		this.tipo = tipoEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDonativoCuentaBancaria == null) ? 0 : idDonativoCuentaBancaria.hashCode());
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
		DonativoCuentaBancaria other = (DonativoCuentaBancaria) obj;
		if (idDonativoCuentaBancaria == null) {
			return false;
		} 
		if (!idDonativoCuentaBancaria.equals(other.idDonativoCuentaBancaria)) {
			return false;
		} 
		return true;
	}

}
