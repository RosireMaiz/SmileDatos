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

@Table(name = "tb_plantilla_evento_indicador")
@Entity
public class PlantillaEventoIndicador {

	private Integer idPlantillaEventoIndicador;
	private Indicador fkIndicador;
	private Evento fkEvento;

	public PlantillaEventoIndicador() {
		super();
	}

	public PlantillaEventoIndicador(Integer idPlantillaEventoIndicador) {
		super();
		this.idPlantillaEventoIndicador = idPlantillaEventoIndicador;
	}

	public PlantillaEventoIndicador(
			Indicador fkIndicador,
			Evento fkEvento) {
		super();
		this.fkIndicador = fkIndicador;
		this.fkEvento = fkEvento;
	}

	@Id
	@SequenceGenerator(name = "tb_plantilla_evento_indicador_sequence", sequenceName = "public.tb_plantilla_evento_indicador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_plantilla_evento_indicador_sequence")
	@Column(name="id_plantilla_evento_indicador")
	public Integer getIdPlantillaEventoIndicador() {
		return idPlantillaEventoIndicador;
	}

	public void setIdPlantillaEventoIndicador(Integer idPlantillaEventoIndicador) {
		this.idPlantillaEventoIndicador = idPlantillaEventoIndicador;
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
	@JoinColumn(name = "fk_evento", nullable = false)
	public Evento getFkEvento() {
		return fkEvento;
	}

	public void setFkEvento(Evento fkEvento) {
		this.fkEvento = fkEvento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPlantillaEventoIndicador == null) ? 0 : idPlantillaEventoIndicador.hashCode());
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
		PlantillaEventoIndicador other = (PlantillaEventoIndicador) obj;
		if (idPlantillaEventoIndicador == null) {
			return false;
		} 
		if (!idPlantillaEventoIndicador.equals(other.idPlantillaEventoIndicador)) {
			return false;
		} 
		return true;
	}

}
