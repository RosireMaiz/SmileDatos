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

@Table(name = "tb_requisito_participacion")
@Entity
public class RequisitoParticipacion {

	private Integer idRequisitoParticipacion;
	private Participacion fkParticipacion;
	private Requisito fkRequisito;

	public RequisitoParticipacion() {
		super();
	}

	public RequisitoParticipacion(Integer idRequisitoParticipacion) {
		super();
		this.idRequisitoParticipacion = idRequisitoParticipacion;
	}

	public RequisitoParticipacion(
			Participacion fkParticipacion,
			Requisito fkRequisito) {
		super();
		this.fkParticipacion = fkParticipacion;
		this.fkRequisito = fkRequisito;
	}

	@Id
	@SequenceGenerator(name = "tb_requisito_participacion_sequence", sequenceName = "public.tb_requisito_participacion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_requisito_participacion_sequence")
	@Column(name="id_requisito_participacion")
	public Integer getIdRequisitoParticipacion() {
		return idRequisitoParticipacion;
	}

	public void setIdRequisitoParticipacion(Integer idRequisitoParticipacion) {
		this.idRequisitoParticipacion = idRequisitoParticipacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_participacion", nullable = false)
	public Participacion getFkParticipacion() {
		return fkParticipacion;
	}

	public void setFkParticipacion(Participacion fkParticipacion) {
		this.fkParticipacion = fkParticipacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_requisito", nullable = false)
	public Requisito getFkRequisito() {
		return fkRequisito;
	}

	public void setFkRequisito(Requisito fkRequisito) {
		this.fkRequisito = fkRequisito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRequisitoParticipacion == null) ? 0 : idRequisitoParticipacion.hashCode());
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
		RequisitoParticipacion other = (RequisitoParticipacion) obj;
		if (idRequisitoParticipacion == null) {
			return false;
		} 
		if (!idRequisitoParticipacion.equals(other.idRequisitoParticipacion)) {
			return false;
		} 
		return true;
	}

}
