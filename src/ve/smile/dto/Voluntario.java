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
import javax.persistence.Transient;
import ve.smile.enums.EstatusPostuladoEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "tb_voluntario")
@Entity
public class Voluntario {

	private Integer idVoluntario;
	private Persona fkPersona;
	private Long fechaIngreso;
	private Long fechaEgreso;
	private Integer estatusPostulado;

	public Voluntario() {
		super();
	}

	public Voluntario(Integer idVoluntario) {
		super();
		this.idVoluntario = idVoluntario;
	}

	public Voluntario(
			Persona fkPersona,
			Long fechaIngreso,
			Long fechaEgreso,
			Integer estatusPostulado) {
		super();
		this.fkPersona = fkPersona;
		this.fechaIngreso = fechaIngreso;
		this.fechaEgreso = fechaEgreso;
		this.estatusPostulado = estatusPostulado;
	}

	@Id
	@SequenceGenerator(name = "tb_voluntario_sequence", sequenceName = "public.tb_voluntario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_voluntario_sequence")
	@Column(name="id_voluntario")
	public Integer getIdVoluntario() {
		return idVoluntario;
	}

	public void setIdVoluntario(Integer idVoluntario) {
		this.idVoluntario = idVoluntario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name="fecha_ingreso")
	public Long getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Long fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Column(name="fecha_egreso")
	public Long getFechaEgreso() {
		return fechaEgreso;
	}

	public void setFechaEgreso(Long fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}

	@Column(name="estatus_postulado")
	public Integer getEstatusPostulado() {
		return estatusPostulado;
	}

	public void setEstatusPostulado(Integer estatusPostulado) {
		this.estatusPostulado = estatusPostulado;
	}

	@JsonIgnore
	@Transient
	public EstatusPostuladoEnum getEstatusPostuladoEnum() {
		return EstatusPostuladoEnum.values()[this.estatusPostulado];
	}

	public void setEstatusPostuladoEnum(EstatusPostuladoEnum estatusPostuladoEnum) {
		this.estatusPostulado = estatusPostuladoEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVoluntario == null) ? 0 : idVoluntario.hashCode());
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
		Voluntario other = (Voluntario) obj;
		if (idVoluntario == null) {
			return false;
		} 
		if (!idVoluntario.equals(other.idVoluntario)) {
			return false;
		} 
		return true;
	}

}
