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

@Table(name = "tb_voluntario_fortaleza")
@Entity
public class VoluntarioFortaleza {

	private Integer idVoluntarioFortaleza;
	private Voluntario fkVoluntario;
	private Fortaleza fkFortaleza;

	public VoluntarioFortaleza() {
		super();
	}

	public VoluntarioFortaleza(Integer idVoluntarioFortaleza) {
		super();
		this.idVoluntarioFortaleza = idVoluntarioFortaleza;
	}

	public VoluntarioFortaleza(
			Voluntario fkVoluntario,
			Fortaleza fkFortaleza) {
		super();
		this.fkVoluntario = fkVoluntario;
		this.fkFortaleza = fkFortaleza;
	}

	@Id
	@SequenceGenerator(name = "tb_voluntario_fortaleza_sequence", sequenceName = "public.tb_voluntario_fortaleza_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_voluntario_fortaleza_sequence")
	@Column(name="id_voluntario_fortaleza")
	public Integer getIdVoluntarioFortaleza() {
		return idVoluntarioFortaleza;
	}

	public void setIdVoluntarioFortaleza(Integer idVoluntarioFortaleza) {
		this.idVoluntarioFortaleza = idVoluntarioFortaleza;
	}

	@ManyToOne
	@JoinColumn(name = "fk_voluntario", nullable = false)
	public Voluntario getFkVoluntario() {
		return fkVoluntario;
	}

	public void setFkVoluntario(Voluntario fkVoluntario) {
		this.fkVoluntario = fkVoluntario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_fortaleza", nullable = false)
	public Fortaleza getFkFortaleza() {
		return fkFortaleza;
	}

	public void setFkFortaleza(Fortaleza fkFortaleza) {
		this.fkFortaleza = fkFortaleza;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVoluntarioFortaleza == null) ? 0 : idVoluntarioFortaleza.hashCode());
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
		VoluntarioFortaleza other = (VoluntarioFortaleza) obj;
		if (idVoluntarioFortaleza == null) {
			return false;
		} 
		if (!idVoluntarioFortaleza.equals(other.idVoluntarioFortaleza)) {
			return false;
		} 
		return true;
	}

}
