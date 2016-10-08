package ve.smile.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import ve.smile.enums.EstatusVoluntarioEnum;

@Table(name = "tb_voluntario")
@Entity
public class Voluntario {

	private Integer idVoluntario;
	private Persona fkPersona;
	private Long fechaIngreso;
	private Long fechaEgreso;
	private Integer estatusVoluntario;

	private List<Fortaleza> fortalezas;
	private List<Profesion> profesiones;
	private List<ClasificadorVoluntario> clasificaciones;

	private Motivo fkMotivo;
	private String observacion;

	public Voluntario() {
		super();
	}

	public Voluntario(Integer idVoluntario) {
		super();
		this.idVoluntario = idVoluntario;
	}

	public Voluntario(Persona fkPersona, Long fechaIngreso, Long fechaEgreso,
			Integer estatusPostulado, Motivo fkMotivo, String observacion) {
		super();
		this.fkPersona = fkPersona;
		this.fechaIngreso = fechaIngreso;
		this.fechaEgreso = fechaEgreso;
		this.estatusVoluntario = estatusPostulado;
		this.fkMotivo = fkMotivo;
		this.observacion = observacion;
	}

	@Id
	@SequenceGenerator(name = "tb_voluntario_sequence", sequenceName = "public.tb_voluntario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_voluntario_sequence")
	@Column(name = "id_voluntario")
	public Integer getIdVoluntario() {
		return idVoluntario;
	}

	public void setIdVoluntario(Integer idVoluntario) {
		this.idVoluntario = idVoluntario;
	}

	@OneToOne
	@JoinColumn(name = "fk_persona", referencedColumnName = "id_persona")
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name = "fecha_ingreso")
	public Long getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Long fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Column(name = "fecha_egreso")
	public Long getFechaEgreso() {
		return fechaEgreso;
	}

	public void setFechaEgreso(Long fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}

	@Column(name = "estatus_voluntario")
	public Integer getEstatusVoluntario() {
		return estatusVoluntario;
	}

	public void setEstatusVoluntario(Integer estatusPostulado) {
		this.estatusVoluntario = estatusPostulado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_motivo", nullable = true)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@Column(name = "observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Transient
	public EstatusVoluntarioEnum getEstatusVoluntarioEnum() {
		return EstatusVoluntarioEnum.values()[this.estatusVoluntario];
	}

	public void setEstatusVoluntarioEnum(
			EstatusVoluntarioEnum estatusVoluntarioEnum) {
		this.estatusVoluntario = estatusVoluntarioEnum.ordinal();
	}

	// FORTALEZAS
	@ManyToMany
	@JoinTable(name = "tb_voluntario_fortaleza", joinColumns = @JoinColumn(name = "fk_voluntario"), inverseJoinColumns = @JoinColumn(name = "fk_fortaleza"))
	public List<Fortaleza> getFortalezas() {
		return fortalezas;
	}

	public void setFortalezas(List<Fortaleza> fortalezas) {
		this.fortalezas = fortalezas;
	}

	// PROFESIONES
	@ManyToMany
	@JoinTable(name = "tb_voluntario_profesion", joinColumns = @JoinColumn(name = "fk_voluntario"), inverseJoinColumns = @JoinColumn(name = "fk_profesion"))
	public List<Profesion> getProfesiones() {
		return profesiones;
	}

	public void setProfesiones(List<Profesion> profesiones) {
		this.profesiones = profesiones;
	}

	// CLASIFICACIONES
	@ManyToMany
	@JoinTable(name = "tb_voluntario_clasificado", joinColumns = @JoinColumn(name = "fk_voluntario"), inverseJoinColumns = @JoinColumn(name = "fk_clasificador_voluntario"))
	public List<ClasificadorVoluntario> getClasificaciones() {
		return clasificaciones;
	}

	public void setClasificaciones(List<ClasificadorVoluntario> clasificaciones) {
		this.clasificaciones = clasificaciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idVoluntario == null) ? 0 : idVoluntario.hashCode());
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
