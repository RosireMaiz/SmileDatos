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

@Table(name = "tb_familiar")
@Entity
public class Familiar {

	private Integer idFamiliar;
	private Persona fkPersona;

	public Familiar() {
		super();
	}

	public Familiar(Integer idFamiliar) {
		super();
		this.idFamiliar = idFamiliar;
	}

	public Familiar(
			Persona fkPersona) {
		super();
		this.fkPersona = fkPersona;
	}

	@Id
	@SequenceGenerator(name = "tb_familiar_sequence", sequenceName = "public.tb_familiar_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_familiar_sequence")
	@Column(name="id_familiar")
	public Integer getIdFamiliar() {
		return idFamiliar;
	}

	public void setIdFamiliar(Integer idFamiliar) {
		this.idFamiliar = idFamiliar;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFamiliar == null) ? 0 : idFamiliar.hashCode());
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
		Familiar other = (Familiar) obj;
		if (idFamiliar == null) {
			return false;
		} 
		if (!idFamiliar.equals(other.idFamiliar)) {
			return false;
		} 
		return true;
	}

}
