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

import ve.smile.enums.EstatusPadrinoEnum;


@Table(name = "tb_padrino")
@Entity
public class Padrino {

	private Integer idPadrino;
	private FrecuenciaAporte fkFrecuenciaAporte;
	private Persona fkPersona;
	private Long fechaIngreso;
	private Long fechaSalida;
	private float monto;
	private Integer estatusPadrino;

	public Padrino() {
		super();
	}

	public Padrino(Integer idPadrino) {
		super();
		this.idPadrino = idPadrino;
	}

	public Padrino(FrecuenciaAporte fkFrecuenciaAporte, Persona fkPersona,
			Long fechaIngreso, Long fechaSalida, Integer monto,
			Integer estatusPostulado) {
		super();
		this.fkFrecuenciaAporte = fkFrecuenciaAporte;
		this.fkPersona = fkPersona;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.monto = monto;
		this.estatusPadrino = estatusPostulado;
	}

	@Id
	@SequenceGenerator(name = "tb_padrino_sequence", sequenceName = "public.tb_padrino_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_padrino_sequence")
	@Column(name = "id_padrino")
	public Integer getIdPadrino() {
		return idPadrino;
	}

	public void setIdPadrino(Integer idPadrino) {
		this.idPadrino = idPadrino;
	}

	@ManyToOne
	@JoinColumn(name = "fk_frecuencia_aporte", nullable = false)
	public FrecuenciaAporte getFkFrecuenciaAporte() {
		return fkFrecuenciaAporte;
	}

	public void setFkFrecuenciaAporte(FrecuenciaAporte fkFrecuenciaAporte) {
		this.fkFrecuenciaAporte = fkFrecuenciaAporte;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
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

	@Column(name = "fecha_salida")
	public Long getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Long fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	@Column(name = "monto")
	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	@Column(name = "estatus_padrino")
	public Integer getEstatusPostulado() {
		return estatusPadrino;
	}

	public void setEstatusPostulado(Integer estatusPostulado) {
		this.estatusPadrino = estatusPostulado;
	}

	@Transient
	public EstatusPadrinoEnum getEstatusPadrinoEnum() {
		return EstatusPadrinoEnum.values()[this.estatusPadrino];
	}

	public void setEstatusPostuladoEnum(
			EstatusPadrinoEnum estatusPadrinoEnum) {
		this.estatusPadrino = estatusPadrinoEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPadrino == null) ? 0 : idPadrino.hashCode());
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
		Padrino other = (Padrino) obj;
		if (idPadrino == null) {
			return false;
		}
		if (!idPadrino.equals(other.idPadrino)) {
			return false;
		}
		return true;
	}

}
