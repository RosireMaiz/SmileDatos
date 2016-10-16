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

@Table(name = "tb_indicador_evento_plan_tarea")
@Entity
public class IndicadorEventoPlanTarea {

	private Integer idIndicadorEventoPlanTarea;
	private EventPlanTarea fkEventPlanTarea;
	private Indicador fkIndicador;
	private Motivo fkMotivo;
	private String observacion;
	private Double valorEsperado;
	private Double valorReal;

	public IndicadorEventoPlanTarea() {
		super();
	}

	public IndicadorEventoPlanTarea(Integer idIndicadorEventoPlanTarea) {
		super();
		this.idIndicadorEventoPlanTarea = idIndicadorEventoPlanTarea;
	}

	public IndicadorEventoPlanTarea(EventPlanTarea fkEventPlanTarea,
			Indicador fkIndicador, Motivo fkMotivo, String observacion,
			Double valorEsperado, Double valorReal) {
		super();
		this.fkEventPlanTarea = fkEventPlanTarea;
		this.fkIndicador = fkIndicador;
		this.fkMotivo = fkMotivo;
		this.observacion = observacion;
		this.valorEsperado = valorEsperado;
		this.valorReal = valorReal;
	}

	@Id
	@SequenceGenerator(name = "tb_indicador_evento_plan_tarea_sequence", sequenceName = "public.tb_indicador_evento_plan_tarea_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_indicador_evento_plan_tarea_sequence")
	@Column(name = "id_indicador_evento_plan_tarea")
	public Integer getIdIndicadorEventoPlanTarea() {
		return idIndicadorEventoPlanTarea;
	}

	public void setIdIndicadorEventoPlanTarea(Integer idIndicadorEventoPlanTarea) {
		this.idIndicadorEventoPlanTarea = idIndicadorEventoPlanTarea;
	}

	@ManyToOne
	@JoinColumn(name = "fk_event_plan_tarea", nullable = false)
	public EventPlanTarea getFkEventPlanTarea() {
		return fkEventPlanTarea;
	}

	public void setFkEventPlanTarea(EventPlanTarea fkEventPlanTarea) {
		this.fkEventPlanTarea = fkEventPlanTarea;
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
				+ ((idIndicadorEventoPlanTarea == null) ? 0
						: idIndicadorEventoPlanTarea.hashCode());
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
		IndicadorEventoPlanTarea other = (IndicadorEventoPlanTarea) obj;
		if (idIndicadorEventoPlanTarea == null) {
			return false;
		}
		if (!idIndicadorEventoPlanTarea
				.equals(other.idIndicadorEventoPlanTarea)) {
			return false;
		}
		return true;
	}

}
