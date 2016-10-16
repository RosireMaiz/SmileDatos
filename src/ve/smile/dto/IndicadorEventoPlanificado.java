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

@Table(name = "tb_indicador_evento_planificado")
@Entity
public class IndicadorEventoPlanificado {

	private Integer idIndicadorEventoPlanificado;
	private EventoPlanificado fkEventoPlanificado;
	private Indicador fkIndicador;
	private Motivo fkMotivo;
	private String observacion;
	private Double valorEsperado;
	private Double valorReal;

	public IndicadorEventoPlanificado() {
		super();
	}

	public IndicadorEventoPlanificado(Integer idIndicadorEventoPlanificado) {
		super();
		this.idIndicadorEventoPlanificado = idIndicadorEventoPlanificado;
	}

	public IndicadorEventoPlanificado(EventoPlanificado fkEventoPlanificado,
			Indicador fkIndicador, Motivo fkMotivo, String observacion,
			Double valorEsperado, Double valorReal) {
		super();
		this.fkEventoPlanificado = fkEventoPlanificado;
		this.fkIndicador = fkIndicador;
		this.fkMotivo = fkMotivo;
		this.observacion = observacion;
		this.valorEsperado = valorEsperado;
		this.valorReal = valorReal;
	}

	@Id
	@SequenceGenerator(name = "tb_indicador_evento_planificado_sequence", sequenceName = "public.tb_indicador_evento_planificado_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_indicador_evento_planificado_sequence")
	@Column(name = "id_indicador_evento_planificado")
	public Integer getIdIndicadorEventoPlanificado() {
		return idIndicadorEventoPlanificado;
	}

	public void setIdIndicadorEventoPlanificado(
			Integer idIndicadorEventoPlanificado) {
		this.idIndicadorEventoPlanificado = idIndicadorEventoPlanificado;
	}

	@ManyToOne()
	@JoinColumn(name = "fk_evento_planificado", nullable = true)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@ManyToOne()
	@JoinColumn(name = "fk_indicador", nullable = true)
	public Indicador getFkIndicador() {
		return fkIndicador;
	}

	public void setFkIndicador(Indicador fkIndicador) {
		this.fkIndicador = fkIndicador;
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
				+ ((idIndicadorEventoPlanificado == null) ? 0
						: idIndicadorEventoPlanificado.hashCode());
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
		IndicadorEventoPlanificado other = (IndicadorEventoPlanificado) obj;
		if (idIndicadorEventoPlanificado == null) {
			return false;
		}
		if (!idIndicadorEventoPlanificado
				.equals(other.idIndicadorEventoPlanificado)) {
			return false;
		}
		return true;
	}

}
