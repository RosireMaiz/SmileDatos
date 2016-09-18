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

@Table(name = "tb_plantilla_trabajo_social_indicador")
@Entity
public class PlantillaTrabajoSocialIndicador {

	private Integer idPlantillaTrabajoSocialIndicador;
	private Indicador fkIndicador;
	private TrabajoSocial fkTrabajoSocial;

	public PlantillaTrabajoSocialIndicador() {
		super();
	}

	public PlantillaTrabajoSocialIndicador(Integer idPlantillaTrabajoSocialIndicador) {
		super();
		this.idPlantillaTrabajoSocialIndicador = idPlantillaTrabajoSocialIndicador;
	}

	public PlantillaTrabajoSocialIndicador(
			Indicador fkIndicador,
			TrabajoSocial fkTrabajoSocial) {
		super();
		this.fkIndicador = fkIndicador;
		this.fkTrabajoSocial = fkTrabajoSocial;
	}

	@Id
	@SequenceGenerator(name = "tb_plantilla_trabajo_social_indicador_sequence", sequenceName = "public.tb_plantilla_trabajo_social_indicador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_plantilla_trabajo_social_indicador_sequence")
	@Column(name="id_plantilla_trabajo_social_indicador")
	public Integer getIdPlantillaTrabajoSocialIndicador() {
		return idPlantillaTrabajoSocialIndicador;
	}

	public void setIdPlantillaTrabajoSocialIndicador(Integer idPlantillaTrabajoSocialIndicador) {
		this.idPlantillaTrabajoSocialIndicador = idPlantillaTrabajoSocialIndicador;
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
		result = prime * result + ((idPlantillaTrabajoSocialIndicador == null) ? 0 : idPlantillaTrabajoSocialIndicador.hashCode());
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
		PlantillaTrabajoSocialIndicador other = (PlantillaTrabajoSocialIndicador) obj;
		if (idPlantillaTrabajoSocialIndicador == null) {
			return false;
		} 
		if (!idPlantillaTrabajoSocialIndicador.equals(other.idPlantillaTrabajoSocialIndicador)) {
			return false;
		} 
		return true;
	}

}
