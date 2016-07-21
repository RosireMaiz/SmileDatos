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

import ve.smile.enums.ProcedenciaEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_donativo_recurso")
@Entity
public class DonativoRecurso {

	private Integer idDonativoRecurso;
	private Recurso fkRecurso;
	private Persona fkPersona;
	private EventoPlanificado fkEventoPlanificado;
	private TsPlan fkTsPlan;
	private Integer procedencia;
	private Long fecha;
	private String descripcion;
	private String cantidad;

	public DonativoRecurso() {
		super();
	}

	public DonativoRecurso(Integer idDonativoRecurso) {
		super();
		this.idDonativoRecurso = idDonativoRecurso;
	}

	public DonativoRecurso(
			Recurso fkRecurso,
			Persona fkPersona,
			EventoPlanificado fkEventoPlanificado,
			TsPlan fkTsPlan,
			Integer procedencia,
			Long fecha,
			String descripcion,
			String cantidad) {
		super();
		this.fkRecurso = fkRecurso;
		this.fkPersona = fkPersona;
		this.fkEventoPlanificado = fkEventoPlanificado;
		this.fkTsPlan = fkTsPlan;
		this.procedencia = procedencia;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	@Id
	@SequenceGenerator(name = "tb_donativo_recurso_sequence", sequenceName = "public.tb_donativo_recurso_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_donativo_recurso_sequence")
	@Column(name="id_donativo_recurso")
	public Integer getIdDonativoRecurso() {
		return idDonativoRecurso;
	}

	public void setIdDonativoRecurso(Integer idDonativoRecurso) {
		this.idDonativoRecurso = idDonativoRecurso;
	}

	@ManyToOne
	@JoinColumn(name = "fk_recurso", nullable = false)
	public Recurso getFkRecurso() {
		return fkRecurso;
	}

	public void setFkRecurso(Recurso fkRecurso) {
		this.fkRecurso = fkRecurso;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento_planificado", nullable = false)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ts_plan", nullable = false)
	public TsPlan getFkTsPlan() {
		return fkTsPlan;
	}

	public void setFkTsPlan(TsPlan fkTsPlan) {
		this.fkTsPlan = fkTsPlan;
	}

	@Column(name="procedencia")
	public Integer getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(Integer procedencia) {
		this.procedencia = procedencia;
	}

	@JsonIgnore
	public ProcedenciaEnum getProcedenciaEnum() {
		return ProcedenciaEnum.values()[this.procedencia];
	}

	public void setProcedenciaEnum(ProcedenciaEnum procedenciaEnum) {
		this.procedencia = procedenciaEnum.ordinal();
	}

	@Column(name="fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name="cantidad")
	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDonativoRecurso == null) ? 0 : idDonativoRecurso.hashCode());
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
		DonativoRecurso other = (DonativoRecurso) obj;
		if (idDonativoRecurso == null) {
			return false;
		} 
		if (!idDonativoRecurso.equals(other.idDonativoRecurso)) {
			return false;
		} 
		return true;
	}

}
