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

@Table(name = "tb_meta_ts_plan_actividad")
@Entity
public class MetaTsPlanActividad {

	private Integer idMetaTsPlanActividad;
	private Meta fkMeta;
	private TsPlanActividad fkTsPlanActividad;
	private TipoMotivo fkTipoMotivo;
	private String observacion;

	public MetaTsPlanActividad() {
		super();
	}

	public MetaTsPlanActividad(Integer idMetaTsPlanActividad) {
		super();
		this.idMetaTsPlanActividad = idMetaTsPlanActividad;
	}

	public MetaTsPlanActividad(
			Meta fkMeta,
			TsPlanActividad fkTsPlanActividad,
			TipoMotivo fkTipoMotivo,
			String observacion) {
		super();
		this.fkMeta = fkMeta;
		this.fkTsPlanActividad = fkTsPlanActividad;
		this.fkTipoMotivo = fkTipoMotivo;
		this.observacion = observacion;
	}

	@Id
	@SequenceGenerator(name = "tb_meta_ts_plan_actividad_sequence", sequenceName = "public.tb_meta_ts_plan_actividad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_meta_ts_plan_actividad_sequence")
	@Column(name="id_meta_ts_plan_actividad")
	public Integer getIdMetaTsPlanActividad() {
		return idMetaTsPlanActividad;
	}

	public void setIdMetaTsPlanActividad(Integer idMetaTsPlanActividad) {
		this.idMetaTsPlanActividad = idMetaTsPlanActividad;
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
	@JoinColumn(name = "fk_ts_plan_actividad", nullable = false)
	public TsPlanActividad getFkTsPlanActividad() {
		return fkTsPlanActividad;
	}

	public void setFkTsPlanActividad(TsPlanActividad fkTsPlanActividad) {
		this.fkTsPlanActividad = fkTsPlanActividad;
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
		result = prime * result + ((idMetaTsPlanActividad == null) ? 0 : idMetaTsPlanActividad.hashCode());
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
		MetaTsPlanActividad other = (MetaTsPlanActividad) obj;
		if (idMetaTsPlanActividad == null) {
			return false;
		} 
		if (!idMetaTsPlanActividad.equals(other.idMetaTsPlanActividad)) {
			return false;
		} 
		return true;
	}

}
