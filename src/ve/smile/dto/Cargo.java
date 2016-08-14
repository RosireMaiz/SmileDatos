package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_cargo")
@Entity
public class Cargo {

	private Integer idCargo;
	private String nombre;
	private String descripcion;

	public Cargo() {
		super();
	}

	public Cargo(Integer idCargo) {
		super();
		this.idCargo = idCargo;
	}

	public Cargo(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_cargo_sequence", sequenceName = "public.tb_cargo_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_cargo_sequence")
	@Column(name="id_cargo")
	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
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
		result = prime * result + ((idCargo == null) ? 0 : idCargo.hashCode());
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
		Cargo other = (Cargo) obj;
		if (idCargo == null) {
			return false;
		} 
		if (!idCargo.equals(other.idCargo)) {
			return false;
		} 
		return true;
	}

}
