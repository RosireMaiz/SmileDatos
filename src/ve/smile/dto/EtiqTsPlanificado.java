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

@Table(name = "tb_etiq_ts_planificado")
@Entity
public class EtiqTsPlanificado {

	private Integer idEtiqTsPlanificado;
	private Etiqueta fkEtiqueta;
	private TsPlan fkTsPlan;

	public EtiqTsPlanificado() {
		super();
	}

	public EtiqTsPlanificado(Integer idEtiqTsPlanificado) {
		super();
		this.idEtiqTsPlanificado = idEtiqTsPlanificado;
	}

	public EtiqTsPlanificado(
			Etiqueta fkEtiqueta,
			TsPlan fkTsPlan) {
		super();
		this.fkEtiqueta = fkEtiqueta;
		this.fkTsPlan = fkTsPlan;
	}

	@Id
	@SequenceGenerator(name = "tb_etiq_ts_planificado_sequence", sequenceName = "public.tb_etiq_ts_planificado_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_etiq_ts_planificado_sequence")
	@Column(name="id_etiq_ts_planificado")
	public Integer getIdEtiqTsPlanificado() {
		return idEtiqTsPlanificado;
	}

	public void setIdEtiqTsPlanificado(Integer idEtiqTsPlanificado) {
		this.idEtiqTsPlanificado = idEtiqTsPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_etiqueta", nullable = false)
	public Etiqueta getFkEtiqueta() {
		return fkEtiqueta;
	}

	public void setFkEtiqueta(Etiqueta fkEtiqueta) {
		this.fkEtiqueta = fkEtiqueta;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ts_plan", nullable = false)
	public TsPlan getFkTsPlan() {
		return fkTsPlan;
	}

	public void setFkTsPlan(TsPlan fkTsPlan) {
		this.fkTsPlan = fkTsPlan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEtiqTsPlanificado == null) ? 0 : idEtiqTsPlanificado.hashCode());
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
		EtiqTsPlanificado other = (EtiqTsPlanificado) obj;
		if (idEtiqTsPlanificado == null) {
			return false;
		} 
		if (!idEtiqTsPlanificado.equals(other.idEtiqTsPlanificado)) {
			return false;
		} 
		return true;
	}

}
