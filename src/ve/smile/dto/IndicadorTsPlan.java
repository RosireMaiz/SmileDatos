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

@Table(name = "tb_indicador_ts_plan")
@Entity
public class IndicadorTsPlan {

	private Integer idIndicadorTsPlan;
	private TsPlan fkTsPlan;
	private Indicador fkIndicador;
	private Motivo fkMotivo;
	private String observacion;
	private Double valorEsperado;
	private Double valorReal;

	public IndicadorTsPlan() {
		super();
	}

	public IndicadorTsPlan(Integer idIndicadorTsPlan) {
		super();
		this.idIndicadorTsPlan = idIndicadorTsPlan;
	}

	public IndicadorTsPlan(TsPlan fkTsPlan, Indicador fkIndicador,
			Motivo fkMotivo, String observacion, Double valorEsperado,
			Double valorReal) {
		super();
		this.fkTsPlan = fkTsPlan;
		this.fkIndicador = fkIndicador;
		this.fkMotivo = fkMotivo;
		this.observacion = observacion;
		this.valorEsperado = valorEsperado;
		this.valorReal = valorReal;
	}

	@Id
	@SequenceGenerator(name = "tb_indicador_ts_plan_sequence", sequenceName = "public.tb_indicador_ts_plan_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_indicador_ts_plan_sequence")
	@Column(name = "id_indicador_ts_plan")
	public Integer getIdIndicadorTsPlan() {
		return idIndicadorTsPlan;
	}

	public void setIdIndicadorTsPlan(Integer idIndicadorTsPlan) {
		this.idIndicadorTsPlan = idIndicadorTsPlan;
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
	@JoinColumn(name = "fk_indicador", nullable = false)
	public Indicador getFkIndicador() {
		return fkIndicador;
	}

	public void setFkIndicador(Indicador fkIndicador) {
		this.fkIndicador = fkIndicador;
	}

	@ManyToOne
	@JoinColumn(name = "fk_motivo", nullable = false)
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

	@Column(name = "valor_esperado")
	public Double getValorEsperado() {
		return valorEsperado;
	}

	public void setValorEsperado(Double valorEsperado) {
		this.valorEsperado = valorEsperado;
	}

	@Column(name = "valor_real")
	public Double getValorReal() {
		return valorReal;
	}

	public void setValorReal(Double valorReal) {
		this.valorReal = valorReal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idIndicadorTsPlan == null) ? 0 : idIndicadorTsPlan
						.hashCode());
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
		IndicadorTsPlan other = (IndicadorTsPlan) obj;
		if (idIndicadorTsPlan == null) {
			return false;
		}
		if (!idIndicadorTsPlan.equals(other.idIndicadorTsPlan)) {
			return false;
		}
		return true;
	}

}
