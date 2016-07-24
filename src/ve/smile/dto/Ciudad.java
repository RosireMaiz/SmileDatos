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

@Table(name = "tb_ciudad")
@Entity
public class Ciudad {

	private Integer idCiudad;
	private Estado fkEstado;
	private String nombre;

	public Ciudad() {
		super();
	}

	public Ciudad(Integer idCiudad) {
		super();
		this.idCiudad = idCiudad;
	}

	public Ciudad(
			Estado fkEstado,
			String nombre) {
		super();
		this.fkEstado = fkEstado;
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_ciudad_sequence", sequenceName = "public.tb_ciudad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ciudad_sequence")
	@Column(name="id_ciudad")
	public Integer getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_estado", nullable = false)
	public Estado getFkEstado() {
		return fkEstado;
	}

	public void setFkEstado(Estado fkEstado) {
		this.fkEstado = fkEstado;
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
		result = prime * result + ((idCiudad == null) ? 0 : idCiudad.hashCode());
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
		Ciudad other = (Ciudad) obj;
		if (idCiudad == null) {
			return false;
		} 
		if (!idCiudad.equals(other.idCiudad)) {
			return false;
		} 
		return true;
	}

}
