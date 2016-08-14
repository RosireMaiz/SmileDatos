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

@Table(name = "tb_capacitacion")
@Entity
public class Capacitacion {

	private Integer idCapacitacion;
	private String nombre;
	private String descripcion;
	private ClasificadorCapacitacion fkClasificadorCapacitacion;

	public Capacitacion() {
		super();
	}

	public Capacitacion(Integer idCapacitacion) {
		super();
		this.idCapacitacion = idCapacitacion;
	}

	public Capacitacion(
			String nombre,
			String descripcion,
			ClasificadorCapacitacion fkClasificadorCapacitacion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fkClasificadorCapacitacion = fkClasificadorCapacitacion;
	}

	@Id
	@SequenceGenerator(name = "tb_capacitacion_sequence", sequenceName = "public.tb_capacitacion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_capacitacion_sequence")
	@Column(name="id_capacitacion")
	public Integer getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(Integer idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_capacitacion", nullable = false)
	public ClasificadorCapacitacion getFkClasificadorCapacitacion() {
		return fkClasificadorCapacitacion;
	}

	public void setFkClasificadorCapacitacion(ClasificadorCapacitacion fkClasificadorCapacitacion) {
		this.fkClasificadorCapacitacion = fkClasificadorCapacitacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCapacitacion == null) ? 0 : idCapacitacion.hashCode());
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
		Capacitacion other = (Capacitacion) obj;
		if (idCapacitacion == null) {
			return false;
		} 
		if (!idCapacitacion.equals(other.idCapacitacion)) {
			return false;
		} 
		return true;
	}

}
