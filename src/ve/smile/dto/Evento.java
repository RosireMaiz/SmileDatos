package ve.smile.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "tb_evento")
@Entity
public class Evento {

	private Integer idEvento;
	private String nombre;
	private ClasificadorEvento fkClasificadorEvento;
	private String descripcion;
	private Character tipoEvento;

	private List<Tarea> tareas;
	private List<Indicador> indicadors;
	
	public Evento() {
		super();
	}

	public Evento(Integer idEvento) {
		super();
		this.idEvento = idEvento;
	}

	public Evento(
			String nombre,
			ClasificadorEvento fkClasificadorEvento,
			String descripcion,
			Character tipoEvento) {
		super();
		this.nombre = nombre;
		this.fkClasificadorEvento = fkClasificadorEvento;
		this.descripcion = descripcion;
		this.tipoEvento = tipoEvento;
	}

	@Id
	@SequenceGenerator(name = "tb_evento_sequence", sequenceName = "public.tb_evento_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_evento_sequence")
	@Column(name="id_evento")
	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_evento", nullable = false)
	public ClasificadorEvento getFkClasificadorEvento() {
		return fkClasificadorEvento;
	}

	public void setFkClasificadorEvento(ClasificadorEvento fkClasificadorEvento) {
		this.fkClasificadorEvento = fkClasificadorEvento;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name="tipo_evento")
	public Character getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(Character tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	@Transient
	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	@Transient
	public List<Indicador> getIndicadors() {
		return indicadors;
	}

	public void setIndicadors(List<Indicador> indicadors) {
		this.indicadors = indicadors;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEvento == null) ? 0 : idEvento.hashCode());
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
		Evento other = (Evento) obj;
		if (idEvento == null) {
			return false;
		} 
		if (!idEvento.equals(other.idEvento)) {
			return false;
		} 
		return true;
	}

}
