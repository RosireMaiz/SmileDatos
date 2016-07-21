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

@Table(name = "tb_trabajador_profesion")
@Entity
public class TrabajadorProfesion {

	private Integer idTrabajadorProfesion;
	private Trabajador fkTrabajador;
	private Profesion fkProfesion;

	public TrabajadorProfesion() {
		super();
	}

	public TrabajadorProfesion(Integer idTrabajadorProfesion) {
		super();
		this.idTrabajadorProfesion = idTrabajadorProfesion;
	}

	public TrabajadorProfesion(
			Trabajador fkTrabajador,
			Profesion fkProfesion) {
		super();
		this.fkTrabajador = fkTrabajador;
		this.fkProfesion = fkProfesion;
	}

	@Id
	@SequenceGenerator(name = "tb_trabajador_profesion_sequence", sequenceName = "public.tb_trabajador_profesion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_trabajador_profesion_sequence")
	@Column(name="id_trabajador_profesion")
	public Integer getIdTrabajadorProfesion() {
		return idTrabajadorProfesion;
	}

	public void setIdTrabajadorProfesion(Integer idTrabajadorProfesion) {
		this.idTrabajadorProfesion = idTrabajadorProfesion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_trabajador", nullable = false)
	public Trabajador getFkTrabajador() {
		return fkTrabajador;
	}

	public void setFkTrabajador(Trabajador fkTrabajador) {
		this.fkTrabajador = fkTrabajador;
	}

	@ManyToOne
	@JoinColumn(name = "fk_profesion", nullable = false)
	public Profesion getFkProfesion() {
		return fkProfesion;
	}

	public void setFkProfesion(Profesion fkProfesion) {
		this.fkProfesion = fkProfesion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTrabajadorProfesion == null) ? 0 : idTrabajadorProfesion.hashCode());
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
		TrabajadorProfesion other = (TrabajadorProfesion) obj;
		if (idTrabajadorProfesion == null) {
			return false;
		} 
		if (!idTrabajadorProfesion.equals(other.idTrabajadorProfesion)) {
			return false;
		} 
		return true;
	}

}
