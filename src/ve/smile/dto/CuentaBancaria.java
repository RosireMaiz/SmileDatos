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

import ve.smile.enums.PropietarioEnum;

@Table(name = "tb_cuenta_bancaria")
@Entity
public class CuentaBancaria {

	private Integer idCuentaBancaria;
	private Banco fkBanco;
	private String cuentaBancaria;
	private String titular;
	private String identificacionTitular;
	private String correoTitular;
	private Integer propietario;
	private String tipoCuenta;
	
	public CuentaBancaria() {
		super();
	}

	public CuentaBancaria(Integer idCuentaBancaria) {
		super();
		this.idCuentaBancaria = idCuentaBancaria;
	}

	public CuentaBancaria(Banco fkBanco, String cuentaBancaria, String titular,
			String identificacionTitular, String correoTitular,
			Integer tipoCuenta) {
		super();
		this.fkBanco = fkBanco;
		this.cuentaBancaria = cuentaBancaria;
		this.titular = titular;
		this.identificacionTitular = identificacionTitular;
		this.correoTitular = correoTitular;
		this.propietario = tipoCuenta;
	}

	@Id
	@SequenceGenerator(name = "tb_cuenta_bancaria_sequence", sequenceName = "public.tb_cuenta_bancaria_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_cuenta_bancaria_sequence")
	@Column(name = "id_cuenta_bancaria")
	public Integer getIdCuentaBancaria() {
		return idCuentaBancaria;
	}

	public void setIdCuentaBancaria(Integer idCuentaBancaria) {
		this.idCuentaBancaria = idCuentaBancaria;
	}

	@ManyToOne
	@JoinColumn(name = "fk_banco", nullable = false)
	public Banco getFkBanco() {
		return fkBanco;
	}

	public void setFkBanco(Banco fkBanco) {
		this.fkBanco = fkBanco;
	}

	@Column(name = "cuenta_bancaria")
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	@Column(name = "titular")
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Column(name = "identificacion_titular")
	public String getIdentificacionTitular() {
		return identificacionTitular;
	}

	public void setIdentificacionTitular(String identificacionTitular) {
		this.identificacionTitular = identificacionTitular;
	}

	@Column(name = "correo_titular")
	public String getCorreoTitular() {
		return correoTitular;
	}

	public void setCorreoTitular(String correoTitular) {
		this.correoTitular = correoTitular;
	}

	@Column(name = "propietario")
	public Integer getPropietario() {
		return propietario;
	}

	public void setPropietario(Integer tipoCuenta) {
		this.propietario = tipoCuenta;
	}

	@Transient
	public PropietarioEnum getPropietarioEnum() {
		return PropietarioEnum.values()[this.propietario];
	}

	public void setPropietarioEnum(PropietarioEnum tipoCuentaEnum) {
		this.propietario = tipoCuentaEnum.ordinal();
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idCuentaBancaria == null) ? 0 : idCuentaBancaria.hashCode());
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
		CuentaBancaria other = (CuentaBancaria) obj;
		if (idCuentaBancaria == null) {
			return false;
		}
		if (!idCuentaBancaria.equals(other.idCuentaBancaria)) {
			return false;
		}
		return true;
	}

}
