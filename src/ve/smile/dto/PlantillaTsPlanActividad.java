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

@Table(name = "tb_plantilla_ts_plan_actividad")
@Entity
public class PlantillaTsPlanActividad {

	private Integer idPlantillaTsPlanActividad;
	private Actividad fkActividad;
	private TsPlan fkTsPlan;

	public PlantillaTsPlanActividad() {
		super();
	}

	public PlantillaTsPlanActividad(Integer idPlantillaTsPlanActividad) {
		super();
		this.idPlantillaTsPlanActividad = idPlantillaTsPlanActividad;
	}

	public PlantillaTsPlanActividad(
			Actividad fkActividad,
			TsPlan fkTsPlan) {
		super();
		this.fkActividad = fkActividad;
		this.fkTsPlan = fkTsPlan;
	}

	@Id
	@SequenceGenerator(name = "tb_plantilla_ts_plan_actividad_sequence", sequenceName = "public.tb_plantilla_ts_plan_actividad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_plantilla_ts_plan_actividad_sequence")
	@Column(name="id_plantilla_ts_plan_actividad")
	public Integer getIdPlantillaTsPlanActividad() {
		return idPlantillaTsPlanActividad;
	}

	public void setIdPlantillaTsPlanActividad(Integer idPlantillaTsPlanActividad) {
		this.idPlantillaTsPlanActividad = idPlantillaTsPlanActividad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_actividad", nullable = false)
	public Actividad getFkActividad() {
		return fkActividad;
	}

	public void setFkActividad(Actividad fkActividad) {
		this.fkActividad = fkActividad;
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
		result = prime * result + ((idPlantillaTsPlanActividad == null) ? 0 : idPlantillaTsPlanActividad.hashCode());
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
		PlantillaTsPlanActividad other = (PlantillaTsPlanActividad) obj;
		if (idPlantillaTsPlanActividad == null) {
			return false;
		} 
		if (!idPlantillaTsPlanActividad.equals(other.idPlantillaTsPlanActividad)) {
			return false;
		} 
		return true;
	}

}
