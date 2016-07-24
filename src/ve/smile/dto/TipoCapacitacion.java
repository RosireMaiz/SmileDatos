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

@Table(name = "tb_tipo_capacitacion")
@Entity
public class TipoCapacitacion {

	private Integer idTipoCapacitacion;
	private ClasificadorCapacitacion fkClasificadorCapacitacion;
	private Capacitacion fkCapacitacion;
	private String nombre;
	private String descripcion;

	public TipoCapacitacion() {
		super();
	}

	public TipoCapacitacion(Integer idTipoCapacitacion) {
		super();
		this.idTipoCapacitacion = idTipoCapacitacion;
	}

	public TipoCapacitacion(
			ClasificadorCapacitacion fkClasificadorCapacitacion,
			Capacitacion fkCapacitacion,
			String nombre,
			String descripcion) {
		super();
		this.fkClasificadorCapacitacion = fkClasificadorCapacitacion;
		this.fkCapacitacion = fkCapacitacion;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_tipo_capacitacion_sequence", sequenceName = "public.tb_tipo_capacitacion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_tipo_capacitacion_sequence")
	@Column(name="id_tipo_capacitacion")
	public Integer getIdTipoCapacitacion() {
		return idTipoCapacitacion;
	}

	public void setIdTipoCapacitacion(Integer idTipoCapacitacion) {
		this.idTipoCapacitacion = idTipoCapacitacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_capacitacion", nullable = false)
	public ClasificadorCapacitacion getFkClasificadorCapacitacion() {
		return fkClasificadorCapacitacion;
	}

	public void setFkClasificadorCapacitacion(ClasificadorCapacitacion fkClasificadorCapacitacion) {
		this.fkClasificadorCapacitacion = fkClasificadorCapacitacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_capacitacion", nullable = false)
	public Capacitacion getFkCapacitacion() {
		return fkCapacitacion;
	}

	public void setFkCapacitacion(Capacitacion fkCapacitacion) {
		this.fkCapacitacion = fkCapacitacion;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoCapacitacion == null) ? 0 : idTipoCapacitacion.hashCode());
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
		TipoCapacitacion other = (TipoCapacitacion) obj;
		if (idTipoCapacitacion == null) {
			return false;
		} 
		if (!idTipoCapacitacion.equals(other.idTipoCapacitacion)) {
			return false;
		} 
		return true;
	}

}
