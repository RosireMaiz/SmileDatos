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

@Table(name = "tb_plantilla_ts_plan_indicador")
@Entity
public class PlantillaTsPlanIndicador {

	private Integer idPlantillaTsPlanIndicador;
	private Indicador fkIndicador;
	private TsPlan fkTsPlan;

	public PlantillaTsPlanIndicador() {
		super();
	}

	public PlantillaTsPlanIndicador(Integer idPlantillaTsPlanIndicador) {
		super();
		this.idPlantillaTsPlanIndicador = idPlantillaTsPlanIndicador;
	}

	public PlantillaTsPlanIndicador(
			Indicador fkIndicador,
			TsPlan fkTsPlan) {
		super();
		this.fkIndicador = fkIndicador;
		this.fkTsPlan = fkTsPlan;
	}

	@Id
	@SequenceGenerator(name = "tb_plantilla_ts_plan_indicador_sequence", sequenceName = "public.tb_plantilla_ts_plan_indicador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_plantilla_ts_plan_indicador_sequence")
	@Column(name="id_plantilla_ts_plan_indicador")
	public Integer getIdPlantillaTsPlanIndicador() {
		return idPlantillaTsPlanIndicador;
	}

	public void setIdPlantillaTsPlanIndicador(Integer idPlantillaTsPlanIndicador) {
		this.idPlantillaTsPlanIndicador = idPlantillaTsPlanIndicador;
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
		result = prime * result + ((idPlantillaTsPlanIndicador == null) ? 0 : idPlantillaTsPlanIndicador.hashCode());
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
		PlantillaTsPlanIndicador other = (PlantillaTsPlanIndicador) obj;
		if (idPlantillaTsPlanIndicador == null) {
			return false;
		} 
		if (!idPlantillaTsPlanIndicador.equals(other.idPlantillaTsPlanIndicador)) {
			return false;
		} 
		return true;
	}

}
