package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_fortaleza")
@Entity
public class Fortaleza {

	private Integer idFortaleza;
	private String nombre;
	private String descripcion;
	private Integer estatusFamiliar;

	public Fortaleza() {
		super();
	}

	public Fortaleza(Integer idFortaleza) {
		super();
		this.idFortaleza = idFortaleza;
	}

	public Fortaleza(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_fortaleza_sequence", sequenceName = "public.tb_fortaleza_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_fortaleza_sequence")
	@Column(name="id_fortaleza")
	public Integer getIdFortaleza() {
		return idFortaleza;
	}

	public void setIdFortaleza(Integer idFortaleza) {
		this.idFortaleza = idFortaleza;
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
		result = prime * result + ((idFortaleza == null) ? 0 : idFortaleza.hashCode());
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
		Fortaleza other = (Fortaleza) obj;
		if (idFortaleza == null) {
			return false;
		} 
		if (!idFortaleza.equals(other.idFortaleza)) {
			return false;
		} 
		return true;
	}

	public Integer getEstatusFamiliar() {
		return estatusFamiliar;
	}

	public void setEstatusFamiliar(Integer estatusFamiliar) {
		this.estatusFamiliar = estatusFamiliar;
	}

}
