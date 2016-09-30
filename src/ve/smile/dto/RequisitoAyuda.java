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

@Table(name = "tb_requisito_ayuda")
@Entity
public class RequisitoAyuda {

	private Integer idRequisitoAyuda;
	private Ayuda fkAyuda;
	private Requisito fkRequisito;
	private Integer cantidad;
	public RequisitoAyuda() {
		super();
	}

	public RequisitoAyuda(Integer idRequisitoAyuda) {
		super();
		this.idRequisitoAyuda = idRequisitoAyuda;
	}

	public RequisitoAyuda(
			Ayuda fkAyuda,
			Requisito fkRequisito) {
		super();
		this.fkAyuda = fkAyuda;
		this.fkRequisito = fkRequisito;
	}

	@Id
	@SequenceGenerator(name = "tb_requisito_ayuda_sequence", sequenceName = "public.tb_requisito_ayuda_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_requisito_ayuda_sequence")
	@Column(name="id_requisito_ayuda")
	public Integer getIdRequisitoAyuda() {
		return idRequisitoAyuda;
	}

	public void setIdRequisitoAyuda(Integer idRequisitoAyuda) {
		this.idRequisitoAyuda = idRequisitoAyuda;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ayuda", nullable = false)
	public Ayuda getFkAyuda() {
		return fkAyuda;
	}

	public void setFkAyuda(Ayuda fkAyuda) {
		this.fkAyuda = fkAyuda;
	}

	@ManyToOne
	@JoinColumn(name = "fk_requisito", nullable = false)
	public Requisito getFkRequisito() {
		return fkRequisito;
	}

	public void setFkRequisito(Requisito fkRequisito) {
		this.fkRequisito = fkRequisito;
	}
	@Column(name="cantidad")
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRequisitoAyuda == null) ? 0 : idRequisitoAyuda.hashCode());
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
		RequisitoAyuda other = (RequisitoAyuda) obj;
		if (idRequisitoAyuda == null) {
			return false;
		} 
		if (!idRequisitoAyuda.equals(other.idRequisitoAyuda)) {
			return false;
		} 
		return true;
	}

}
