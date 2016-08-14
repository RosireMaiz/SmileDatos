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

@Table(name = "tb_plantilla_evento_tarea")
@Entity
public class PlantillaEventoTarea {

	private Integer idPlantillaEventoTarea;
	private Tarea fkTarea;
	private Evento fkEvento;

	public PlantillaEventoTarea() {
		super();
	}

	public PlantillaEventoTarea(Integer idPlantillaEventoTarea) {
		super();
		this.idPlantillaEventoTarea = idPlantillaEventoTarea;
	}

	public PlantillaEventoTarea(
			Tarea fkTarea,
			Evento fkEvento) {
		super();
		this.fkTarea = fkTarea;
		this.fkEvento = fkEvento;
	}

	@Id
	@SequenceGenerator(name = "tb_plantilla_evento_tarea_sequence", sequenceName = "public.tb_plantilla_evento_tarea_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_plantilla_evento_tarea_sequence")
	@Column(name="id_plantilla_evento_tarea")
	public Integer getIdPlantillaEventoTarea() {
		return idPlantillaEventoTarea;
	}

	public void setIdPlantillaEventoTarea(Integer idPlantillaEventoTarea) {
		this.idPlantillaEventoTarea = idPlantillaEventoTarea;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tarea", nullable = false)
	public Tarea getFkTarea() {
		return fkTarea;
	}

	public void setFkTarea(Tarea fkTarea) {
		this.fkTarea = fkTarea;
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
		result = prime * result + ((idPlantillaEventoTarea == null) ? 0 : idPlantillaEventoTarea.hashCode());
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
		PlantillaEventoTarea other = (PlantillaEventoTarea) obj;
		if (idPlantillaEventoTarea == null) {
			return false;
		} 
		if (!idPlantillaEventoTarea.equals(other.idPlantillaEventoTarea)) {
			return false;
		} 
		return true;
	}

}
