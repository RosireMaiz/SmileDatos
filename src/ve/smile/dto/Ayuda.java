package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_ayuda")
@Entity
public class Ayuda {

	private Integer idAyuda;
	private String nombre;
	private String descripcion;

	public Ayuda() {
		super();
	}

	public Ayuda(Integer idAyuda) {
		super();
		this.idAyuda = idAyuda;
	}

	public Ayuda(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_ayuda_sequence", sequenceName = "public.tb_ayuda_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ayuda_sequence")
	@Column(name="id_ayuda")
	public Integer getIdAyuda() {
		return idAyuda;
	}

	public void setIdAyuda(Integer idAyuda) {
		this.idAyuda = idAyuda;
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
		result = prime * result + ((idAyuda == null) ? 0 : idAyuda.hashCode());
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
		Ayuda other = (Ayuda) obj;
		if (idAyuda == null) {
			return false;
		} 
		if (!idAyuda.equals(other.idAyuda)) {
			return false;
		} 
		return true;
	}

}
