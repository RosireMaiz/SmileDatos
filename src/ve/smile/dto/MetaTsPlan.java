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

@Table(name = "tb_meta_ts_plan")
@Entity
public class MetaTsPlan {

	private Integer idMetaTsPlan;
	private Meta fkMeta;
	private TsPlan fkTsPlan;
	private TipoMotivo fkTipoMotivo;
	private String observacion;

	public MetaTsPlan() {
		super();
	}

	public MetaTsPlan(Integer idMetaTsPlan) {
		super();
		this.idMetaTsPlan = idMetaTsPlan;
	}

	public MetaTsPlan(
			Meta fkMeta,
			TsPlan fkTsPlan,
			TipoMotivo fkTipoMotivo,
			String observacion) {
		super();
		this.fkMeta = fkMeta;
		this.fkTsPlan = fkTsPlan;
		this.fkTipoMotivo = fkTipoMotivo;
		this.observacion = observacion;
	}

	@Id
	@SequenceGenerator(name = "tb_meta_ts_plan_sequence", sequenceName = "public.tb_meta_ts_plan_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_meta_ts_plan_sequence")
	@Column(name="id_meta_ts_plan")
	public Integer getIdMetaTsPlan() {
		return idMetaTsPlan;
	}

	public void setIdMetaTsPlan(Integer idMetaTsPlan) {
		this.idMetaTsPlan = idMetaTsPlan;
	}

	@ManyToOne
	@JoinColumn(name = "fk_meta", nullable = false)
	public Meta getFkMeta() {
		return fkMeta;
	}

	public void setFkMeta(Meta fkMeta) {
		this.fkMeta = fkMeta;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ts_plan", nullable = false)
	public TsPlan getFkTsPlan() {
		return fkTsPlan;
	}

	public void setFkTsPlan(TsPlan fkTsPlan) {
		this.fkTsPlan = fkTsPlan;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tipo_motivo", nullable = false)
	public TipoMotivo getFkTipoMotivo() {
		return fkTipoMotivo;
	}

	public void setFkTipoMotivo(TipoMotivo fkTipoMotivo) {
		this.fkTipoMotivo = fkTipoMotivo;
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
		result = prime * result + ((idMetaTsPlan == null) ? 0 : idMetaTsPlan.hashCode());
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
		MetaTsPlan other = (MetaTsPlan) obj;
		if (idMetaTsPlan == null) {
			return false;
		} 
		if (!idMetaTsPlan.equals(other.idMetaTsPlan)) {
			return false;
		} 
		return true;
	}

}
