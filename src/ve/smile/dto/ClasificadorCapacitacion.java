package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_capacitacion")
@Entity
public class ClasificadorCapacitacion {

	private Integer idClasificadorCapacitacion;
	private String nombre;

	public ClasificadorCapacitacion() {
		super();
	}

	public ClasificadorCapacitacion(Integer idClasificadorCapacitacion) {
		super();
		this.idClasificadorCapacitacion = idClasificadorCapacitacion;
	}

	public ClasificadorCapacitacion(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_capacitacion_sequence", sequenceName = "public.tb_clasificador_capacitacion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_capacitacion_sequence")
	@Column(name="id_clasificador_capacitacion")
	public Integer getIdClasificadorCapacitacion() {
		return idClasificadorCapacitacion;
	}

	public void setIdClasificadorCapacitacion(Integer idClasificadorCapacitacion) {
		this.idClasificadorCapacitacion = idClasificadorCapacitacion;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClasificadorCapacitacion == null) ? 0 : idClasificadorCapacitacion.hashCode());
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
		ClasificadorCapacitacion other = (ClasificadorCapacitacion) obj;
		if (idClasificadorCapacitacion == null) {
			return false;
		} 
		if (!idClasificadorCapacitacion.equals(other.idClasificadorCapacitacion)) {
			return false;
		} 
		return true;
	}

}
