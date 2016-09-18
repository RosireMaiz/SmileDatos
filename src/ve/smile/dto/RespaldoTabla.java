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

import ve.smile.seguridad.dto.Tabla;

@Table(name = "tb_respaldo_tabla")
@Entity
public class RespaldoTabla {

	private Integer idRespaldoTabla;
	private Respaldo fkRespaldo;
	private Tabla fkTabla;

	public RespaldoTabla() {
		super();
	}

	public RespaldoTabla(Integer idRespaldoTabla) {
		super();
		this.idRespaldoTabla = idRespaldoTabla;
	}

	public RespaldoTabla(
			Respaldo fkRespaldo,
			Tabla fkTabla) {
		super();
		this.fkRespaldo = fkRespaldo;
		this.fkTabla = fkTabla;
	}

	@Id
	@SequenceGenerator(name = "tb_respaldo_tabla_sequence", sequenceName = "public.tb_respaldo_tabla_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_respaldo_tabla_sequence")
	@Column(name="id_respaldo_tabla")
	public Integer getIdRespaldoTabla() {
		return idRespaldoTabla;
	}

	public void setIdRespaldoTabla(Integer idRespaldoTabla) {
		this.idRespaldoTabla = idRespaldoTabla;
	}

	@ManyToOne
	@JoinColumn(name = "fk_respaldo", nullable = false)
	public Respaldo getFkRespaldo() {
		return fkRespaldo;
	}

	public void setFkRespaldo(Respaldo fkRespaldo) {
		this.fkRespaldo = fkRespaldo;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tabla", nullable = false)
	public Tabla getFkTabla() {
		return fkTabla;
	}

	public void setFkTabla(Tabla fkTabla) {
		this.fkTabla = fkTabla;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRespaldoTabla == null) ? 0 : idRespaldoTabla.hashCode());
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
		RespaldoTabla other = (RespaldoTabla) obj;
		if (idRespaldoTabla == null) {
			return false;
		} 
		if (!idRespaldoTabla.equals(other.idRespaldoTabla)) {
			return false;
		} 
		return true;
	}

}
