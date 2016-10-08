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

@Table(name = "tb_estudio_socio_economico")
@Entity
public class EstudioSocioEconomico {

	private Integer idEstudioSocioEconomico;
	private Trabajador fkTrabajador;
	private SolicitudAyuda fkSolicitudAyuda;
	private String resultado;
	private Long fecha;

	public EstudioSocioEconomico() {
		super();
	}

	public EstudioSocioEconomico(Integer idEstudioSocioEconomico) {
		super();
		this.idEstudioSocioEconomico = idEstudioSocioEconomico;
	}

	public EstudioSocioEconomico(Trabajador fkTrabajador,
			SolicitudAyuda fkSolicitudAyuda, String resultado, Long fecha) {
		super();
		this.fkTrabajador = fkTrabajador;
		this.fkSolicitudAyuda = fkSolicitudAyuda;
		this.resultado = resultado;
		this.fecha = fecha;
	}

	@Id
	@SequenceGenerator(name = "tb_estudio_socio_economico_sequence", sequenceName = "public.tb_estudio_socio_economico_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_estudio_socio_economico_sequence")
	@Column(name = "id_estudio_socio_economico")
	public Integer getIdEstudioSocioEconomico() {
		return idEstudioSocioEconomico;
	}

	public void setIdEstudioSocioEconomico(Integer idEstudioSocioEconomico) {
		this.idEstudioSocioEconomico = idEstudioSocioEconomico;
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
	@JoinColumn(name = "fk_solicitud_ayuda", nullable = false)
	public SolicitudAyuda getFkSolicitudAyuda() {
		return fkSolicitudAyuda;
	}

	public void setFkSolicitudAyuda(SolicitudAyuda fkSolicitudAyuda) {
		this.fkSolicitudAyuda = fkSolicitudAyuda;
	}

	@Column(name = "resultado")
	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	@Column(name = "fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idEstudioSocioEconomico == null) ? 0
						: idEstudioSocioEconomico.hashCode());
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
		EstudioSocioEconomico other = (EstudioSocioEconomico) obj;
		if (idEstudioSocioEconomico == null) {
			return false;
		}
		if (!idEstudioSocioEconomico.equals(other.idEstudioSocioEconomico)) {
			return false;
		}
		return true;
	}

}
