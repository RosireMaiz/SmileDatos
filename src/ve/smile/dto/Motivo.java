package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_motivo")
@Entity
public class Motivo {

	private Integer idMotivo;
	private String nombre;
	private String descripcion;

	public Motivo() {
		super();
	}

	public Motivo(Integer idMotivo) {
		super();
		this.idMotivo = idMotivo;
	}

	public Motivo(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_motivo_sequence", sequenceName = "public.tb_motivo_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_motivo_sequence")
	@Column(name="id_motivo")
	public Integer getIdMotivo() {
		return idMotivo;
	}

	public void setIdMotivo(Integer idMotivo) {
		this.idMotivo = idMotivo;
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
		result = prime * result + ((idMotivo == null) ? 0 : idMotivo.hashCode());
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
		Motivo other = (Motivo) obj;
		if (idMotivo == null) {
			return false;
		} 
		if (!idMotivo.equals(other.idMotivo)) {
			return false;
		} 
		return true;
	}

}
