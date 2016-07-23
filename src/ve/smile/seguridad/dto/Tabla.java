package ve.smile.seguridad.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_tabla")
@Entity
public class Tabla {

	private Integer idTabla;
	private String nombre;

	public Tabla() {
		super();
	}

	public Tabla(Integer idTabla) {
		super();
		this.idTabla = idTabla;
	}

	public Tabla(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_tabla_sequence", sequenceName = "public.tb_tabla_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_tabla_sequence")
	@Column(name="id_tabla")
	public Integer getIdTabla() {
		return idTabla;
	}

	public void setIdTabla(Integer idTabla) {
		this.idTabla = idTabla;
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
		result = prime * result + ((idTabla == null) ? 0 : idTabla.hashCode());
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
		Tabla other = (Tabla) obj;
		if (idTabla == null) {
			return false;
		} 
		if (!idTabla.equals(other.idTabla)) {
			return false;
		} 
		return true;
	}

}
