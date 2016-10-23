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

import com.fasterxml.jackson.annotation.JsonIgnore;

import ve.smile.enums.EstatusEventoPlanificadoEnum;

@Table(name = "tb_evento_planificado")
@Entity
public class EventoPlanificado {

	private Integer idEventoPlanificado;
	private Album fkAlbum;
	private Directorio fkDirectorio;
	private Evento fkEvento;
	private Motivo fkMotivo;
	private Persona fkPersona;
	private Long fechaPlanificada;
	private Long fechaEjecutada;
	private Multimedia fkMultimedia;
	private Long fechaInicio;
	private Long fechaFin;
	private String observacion;
	private Integer estatusEvento;
	private boolean publicoPortal;

	private Long fechaInicioEjecucion;
	private Long fechaFinEjecucion;
	
	public EventoPlanificado() {
		super();
	}

	public EventoPlanificado(Integer idEventoPlanificado) {
		super();
		this.idEventoPlanificado = idEventoPlanificado;
	}

	public EventoPlanificado(Album fkAlbum, Directorio fkDirectorio,
			Evento fkEvento, Motivo fkMotivo, Persona fkPersona,
			Long fechaPlanificada, Long fechaEjecutada,
			Multimedia fkMultimedia, Long fechaInicioIncidencia,
			Long fechaFinIncidencia, String observacion, Integer estatusEvento,
			boolean publicoPortal) {
		super();
		this.fkAlbum = fkAlbum;
		this.fkDirectorio = fkDirectorio;
		this.fkEvento = fkEvento;
		this.fkMotivo = fkMotivo;
		this.fkPersona = fkPersona;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
		this.fkMultimedia = fkMultimedia;
		this.fechaInicio = fechaInicioIncidencia;
		this.fechaFin = fechaFinIncidencia;
		this.observacion = observacion;
		this.estatusEvento = estatusEvento;
		this.publicoPortal = publicoPortal;
	}

	@Id
	@SequenceGenerator(name = "tb_evento_planificado_sequence", sequenceName = "public.tb_evento_planificado_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_evento_planificado_sequence")
	@Column(name = "id_evento_planificado")
	public Integer getIdEventoPlanificado() {
		return idEventoPlanificado;
	}

	public void setIdEventoPlanificado(Integer idEventoPlanificado) {
		this.idEventoPlanificado = idEventoPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_album", nullable = true)
	public Album getFkAlbum() {
		return fkAlbum;
	}

	public void setFkAlbum(Album fkAlbum) {
		this.fkAlbum = fkAlbum;
	}

	@ManyToOne
	@JoinColumn(name = "fk_directorio", nullable = true)
	public Directorio getFkDirectorio() {
		return fkDirectorio;
	}

	public void setFkDirectorio(Directorio fkDirectorio) {
		this.fkDirectorio = fkDirectorio;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento", nullable = true)
	public Evento getFkEvento() {
		return fkEvento;
	}

	public void setFkEvento(Evento fkEvento) {
		this.fkEvento = fkEvento;
	}

	@ManyToOne
	@JoinColumn(name = "fk_motivo", nullable = true)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = true)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name = "fecha_planificada")
	public Long getFechaPlanificada() {
		return fechaPlanificada;
	}

	public void setFechaPlanificada(Long fechaPlanificada) {
		this.fechaPlanificada = fechaPlanificada;
	}

	@Column(name = "fecha_ejecutada")
	public Long getFechaEjecutada() {
		return fechaEjecutada;
	}

	public void setFechaEjecutada(Long fechaEjecutada) {
		this.fechaEjecutada = fechaEjecutada;
	}

	@ManyToOne
	@JoinColumn(name = "fk_multimedia", nullable = true)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
	}

	@Column(name = "fecha_inicio_incidencia")
	public Long getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Long fechaInicioIncidencia) {
		this.fechaInicio = fechaInicioIncidencia;
	}

	@Column(name = "fecha_fin_incidencia")
	public Long getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Long fechaFinIncidencia) {
		this.fechaFin = fechaFinIncidencia;
	}

	@Column(name = "observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name = "estatus_evento_planificado")
	public Integer getEstatusEvento() {
		return estatusEvento;
	}

	public void setEstatusEvento(Integer estatusEvento) {
		this.estatusEvento = estatusEvento;
	}

	@Column(name = "publico_portal")
	public boolean getPublicoPortal() {
		return publicoPortal;
	}

	public void setPublicoPortal(boolean publicoPortal) {
		this.publicoPortal = publicoPortal;
	}

	@JsonIgnore
	@Transient
	public EstatusEventoPlanificadoEnum getEstatusEventoPlanificadoEnum() {
		return EstatusEventoPlanificadoEnum.values()[this.estatusEvento];
	}

	public void setEstatusEventoPlanificadoEnum(
			EstatusEventoPlanificadoEnum estatusEventoPlanificadoEnum) {
		this.estatusEvento = estatusEventoPlanificadoEnum.ordinal();
	}
	
	@Column(name = "fecha_inicio_ejecucion")
	public Long getFechaInicioEjecucion() {
		return fechaInicioEjecucion;
	}

	public void setFechaInicioEjecucion(Long fechaInicioEjecucion) {
		this.fechaInicioEjecucion = fechaInicioEjecucion;
	}

	@Column(name = "fecha_fin_ejecucion")
	public Long getFechaFinEjecucion() {
		return fechaFinEjecucion;
	}

	public void setFechaFinEjecucion(Long fechaFinEjecucion) {
		this.fechaFinEjecucion = fechaFinEjecucion;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idEventoPlanificado == null) ? 0 : idEventoPlanificado
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
		EventoPlanificado other = (EventoPlanificado) obj;
		if (idEventoPlanificado == null) {
			return false;
		}
		if (!idEventoPlanificado.equals(other.idEventoPlanificado)) {
			return false;
		}
		return true;
	}

}
