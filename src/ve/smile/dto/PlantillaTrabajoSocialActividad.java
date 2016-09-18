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

@Table(name = "tb_plantilla_trabajo_social_actividad")
@Entity
public class PlantillaTrabajoSocialActividad {

	private Integer idPlantillaTrabajoSocialActividad;
	private Actividad fkActividad;
	private TrabajoSocial fkTrabajoSocial;

	public PlantillaTrabajoSocialActividad() {
		super();
	}

	public PlantillaTrabajoSocialActividad(Integer idPlantillaTrabajoSocialActividad) {
		super();
		this.idPlantillaTrabajoSocialActividad = idPlantillaTrabajoSocialActividad;
	}

	public PlantillaTrabajoSocialActividad(
			Actividad fkActividad,
			TrabajoSocial fkTrabajoSocial) {
		super();
		this.fkActividad = fkActividad;
		this.fkTrabajoSocial = fkTrabajoSocial;
	}

	@Id
	@SequenceGenerator(name = "tb_plantilla_trabajo_social_actividad_sequence", sequenceName = "public.tb_plantilla_trabajo_social_actividad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_plantilla_trabajo_social_actividad_sequence")
	@Column(name="id_plantilla_trabajo_social_actividad")
	public Integer getIdPlantillaTrabajoSocialActividad() {
		return idPlantillaTrabajoSocialActividad;
	}

	public void setIdPlantillaTrabajoSocialActividad(Integer idPlantillaTrabajoSocialActividad) {
		this.idPlantillaTrabajoSocialActividad = idPlantillaTrabajoSocialActividad;
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
	@JoinColumn(name = "fk_trabajo_social", nullable = false)
	public TrabajoSocial getFkTrabajoSocial() {
		return fkTrabajoSocial;
	}

	public void setFkTrabajoSocial(TrabajoSocial fkTrabajoSocial) {
		this.fkTrabajoSocial = fkTrabajoSocial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPlantillaTrabajoSocialActividad == null) ? 0 : idPlantillaTrabajoSocialActividad.hashCode());
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
		PlantillaTrabajoSocialActividad other = (PlantillaTrabajoSocialActividad) obj;
		if (idPlantillaTrabajoSocialActividad == null) {
			return false;
		} 
		if (!idPlantillaTrabajoSocialActividad.equals(other.idPlantillaTrabajoSocialActividad)) {
			return false;
		} 
		return true;
	}

}
