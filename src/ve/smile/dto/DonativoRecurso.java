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

import ve.smile.enums.ProcedenciaEnum;
import ve.smile.enums.RecepcionEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "tb_donativo_recurso")
@Entity
public class DonativoRecurso {

	private Integer idDonativoRecurso;
	private Persona fkPersona;
	private EventoPlanificado fkEventoPlanificado;
	private TsPlan fkTsPlan;
	private Integer procedencia;
	private Long fechaDonativo;
	private String descripcion;
	private float cantidad;
	private Integer recepcion;

	private Recurso fkRecurso;
	private boolean aporte;
	private Long fechaArpoteCorrespondiente;

	public DonativoRecurso() {
		super();
	}

	public DonativoRecurso(Integer idDonativoRecurso) {
		super();
		this.idDonativoRecurso = idDonativoRecurso;
	}

	public DonativoRecurso(Persona fkPersona,
			EventoPlanificado fkEventoPlanificado, TsPlan fkTsPlan,
			Integer procedencia, Long fechaDonativo, String descripcion,
			float cantidad, Integer recepcion, Recurso fkRecurso,
			boolean aporte, Long fechaArpoteCorrespondiente) {
		super();
		this.fkPersona = fkPersona;
		this.fkEventoPlanificado = fkEventoPlanificado;
		this.fkTsPlan = fkTsPlan;
		this.procedencia = procedencia;
		this.fechaDonativo = fechaDonativo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.recepcion = recepcion;
		this.fkRecurso = fkRecurso;
		this.aporte = aporte;
		this.fechaArpoteCorrespondiente = fechaArpoteCorrespondiente;
	}

	@Id
	@SequenceGenerator(name = "tb_donativo_recurso_sequence", sequenceName = "public.tb_donativo_recurso_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_donativo_recurso_sequence")
	@Column(name = "id_donativo_recurso")
	public Integer getIdDonativoRecurso() {
		return idDonativoRecurso;
	}

	public void setIdDonativoRecurso(Integer idDonativoRecurso) {
		this.idDonativoRecurso = idDonativoRecurso;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = true)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento_planificado", nullable = true)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ts_plan", nullable = true)
	public TsPlan getFkTsPlan() {
		return fkTsPlan;
	}

	public void setFkTsPlan(TsPlan fkTsPlan) {
		this.fkTsPlan = fkTsPlan;
	}

	@Column(name = "procedencia")
	public Integer getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(Integer procedencia) {
		this.procedencia = procedencia;
	}

	@Transient
	public ProcedenciaEnum getProcedenciaEnum() {
		return ProcedenciaEnum.values()[this.procedencia];
	}

	public void setProcedenciaEnum(ProcedenciaEnum procedenciaEnum) {
		this.procedencia = procedenciaEnum.ordinal();
	}

	@Column(name = "fecha_donativo")
	public Long getFechaDonativo() {
		return fechaDonativo;
	}

	public void setFechaDonativo(Long fechaDonativo) {
		this.fechaDonativo = fechaDonativo;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "cantidad")
	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "recepcion")
	public Integer getRecepcion() {
		return recepcion;
	}

	public void setRecepcion(Integer recepcion) {
		this.recepcion = recepcion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_recurso", nullable = true)
	public Recurso getFkRecurso() {
		return fkRecurso;
	}

	public void setFkRecurso(Recurso fkRecurso) {
		this.fkRecurso = fkRecurso;
	}

	@Column(name = "aporte")
	public boolean getAporte() {
		return aporte;
	}

	public void setAporte(boolean aporte) {
		this.aporte = aporte;
	}

	@Column(name = "fecha_aporte_correspondiente")
	public Long getFechaArpoteCorrespondiente() {
		return fechaArpoteCorrespondiente;
	}

	public void setFechaArpoteCorrespondiente(Long fechaArpoteCorrespondiente) {
		this.fechaArpoteCorrespondiente = fechaArpoteCorrespondiente;
	}

	@JsonIgnore
	@Transient
	public RecepcionEnum getRecepcionEnum() {
		return RecepcionEnum.values()[this.recepcion];
	}

	public void setRecepcionEnum(RecepcionEnum recepcionEnum) {
		this.recepcion = recepcionEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idDonativoRecurso == null) ? 0 : idDonativoRecurso
						.hashCode());
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
