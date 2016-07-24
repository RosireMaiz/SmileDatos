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

@Table(name = "tb_trabajador_fortaleza")
@Entity
public class TrabajadorFortaleza {

	private Integer idTrabajadorFortaleza;
	private Fortaleza fkFortaleza;
	private Trabajador fkTrabajador;

	public TrabajadorFortaleza() {
		super();
	}

	public TrabajadorFortaleza(Integer idTrabajadorFortaleza) {
		super();
		this.idTrabajadorFortaleza = idTrabajadorFortaleza;
	}

	public TrabajadorFortaleza(
			Fortaleza fkFortaleza,
			Trabajador fkTrabajador) {
		super();
		this.fkFortaleza = fkFortaleza;
		this.fkTrabajador = fkTrabajador;
	}

	@Id
	@SequenceGenerator(name = "tb_trabajador_fortaleza_sequence", sequenceName = "public.tb_trabajador_fortaleza_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_trabajador_fortaleza_sequence")
	@Column(name="id_trabajador_fortaleza")
	public Integer getIdTrabajadorFortaleza() {
		return idTrabajadorFortaleza;
	}

	public void setIdTrabajadorFortaleza(Integer idTrabajadorFortaleza) {
		this.idTrabajadorFortaleza = idTrabajadorFortaleza;
	}

	@ManyToOne
	@JoinColumn(name = "fk_fortaleza", nullable = false)
	public Fortaleza getFkFortaleza() {
		return fkFortaleza;
	}

	public void setFkFortaleza(Fortaleza fkFortaleza) {
		this.fkFortaleza = fkFortaleza;
	}

	@ManyToOne
	@JoinColumn(name = "fk_trabajador", nullable = false)
	public Trabajador getFkTrabajador() {
		return fkTrabajador;
	}

	public void setFkTrabajador(Trabajador fkTrabajador) {
		this.fkTrabajador = fkTrabajador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTrabajadorFortaleza == null) ? 0 : idTrabajadorFortaleza.hashCode());
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
		TrabajadorFortaleza other = (TrabajadorFortaleza) obj;
		if (idTrabajadorFortaleza == null) {
			return false;
		} 
		if (!idTrabajadorFortaleza.equals(other.idTrabajadorFortaleza)) {
			return false;
		} 
		return true;
	}

}
