package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_banco")
@Entity
public class Banco {

	private Integer idBanco;
	private String nombre;

	public Banco() {
		super();
	}

	public Banco(Integer idBanco) {
		super();
		this.idBanco = idBanco;
	}

	public Banco(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_banco_sequence", sequenceName = "public.tb_banco_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_banco_sequence")
	@Column(name="id_banco")
	public Integer getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(Integer idBanco) {
		this.idBanco = idBanco;
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
		result = prime * result + ((idBanco == null) ? 0 : idBanco.hashCode());
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
		Banco other = (Banco) obj;
		if (idBanco == null) {
			return false;
		} 
		if (!idBanco.equals(other.idBanco)) {
			return false;
		} 
		return true;
	}

}
