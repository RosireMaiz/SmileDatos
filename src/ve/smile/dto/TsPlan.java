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

@Table(name = "tb_ts_plan")
@Entity
public class TsPlan {

	private Integer idTsPlan;
	private String descripcion;
	private Album fkAlbum;
	private Directorio fkDirectorio;
	private TrabajoSocial fkTrabajoSocial;
	private Motivo fkMotivo;
	private Persona fkPersona;
	private Long fechaPlanificada;
	private Long fechaEjecutada;
	private String observacion;
	private Multimedia fkMultimedia;
	private Long fechaInicioIncidencia;
	private Long fechaFinIncidencia;
	private boolean publicoPortal;

	public TsPlan() {
		super();
	}

	public TsPlan(Integer idTsPlan) {
		super();
		this.idTsPlan = idTsPlan;
	}

	public TsPlan(String descripcion, Album fkAlbum, Directorio fkDirectorio,
			TrabajoSocial fkTrabajoSocial, Motivo fkMotivo, Persona fkPersona,
			Long fechaPlanificada, Long fechaEjecutada, String observacion,
			Multimedia fkMultimedia, Long fechaInicioIncidencia,
			Long fechaFinIncidencia, boolean publicoPortal) {
		super();
		this.descripcion = descripcion;
		this.fkAlbum = fkAlbum;
		this.fkDirectorio = fkDirectorio;
		this.fkTrabajoSocial = fkTrabajoSocial;
		this.fkMotivo = fkMotivo;
		this.fkPersona = fkPersona;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
		this.observacion = observacion;
		this.fkMultimedia = fkMultimedia;
		this.fechaInicioIncidencia = fechaInicioIncidencia;
		this.fechaFinIncidencia = fechaFinIncidencia;
		this.publicoPortal = publicoPortal;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_sequence", sequenceName = "public.tb_ts_plan_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_sequence")
	@Column(name = "id_ts_plan")
	public Integer getIdTsPlan() {
		return idTsPlan;
	}

	public void setIdTsPlan(Integer idTsPlan) {
		this.idTsPlan = idTsPlan;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	@JoinColumn(name = "fk_trabajo_social", nullable = true)
	public TrabajoSocial getFkTrabajoSocial() {
		return fkTrabajoSocial;
	}

	public void setFkTrabajoSocial(TrabajoSocial fkTrabajoSocial) {
		this.fkTrabajoSocial = fkTrabajoSocial;
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

	@Column(name = "observacion")
	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_multimedia", nullable = false)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
	}

	@Column(name = "fecha_inicio_incidencia")
	public Long getFechaInicioIncidencia() {
		return fechaInicioIncidencia;
	}

	public void setFechaInicioIncidencia(Long fechaInicioIncidencia) {
		this.fechaInicioIncidencia = fechaInicioIncidencia;
	}

	@Column(name = "fecha_fin_incidencia")
	public Long getFechaFinIncidencia() {
		return fechaFinIncidencia;
	}

	public void setFechaFinIncidencia(Long fechaFinIncidencia) {
		this.fechaFinIncidencia = fechaFinIncidencia;
	}

	@Column(name = "publico_portal")
	public boolean getPublicoPortal() {
		return publicoPortal;
	}

	public void setPublicoPortal(boolean publicoPortal) {
		this.publicoPortal = publicoPortal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idTsPlan == null) ? 0 : idTsPlan.hashCode());
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
		TsPlan other = (TsPlan) obj;
		if (idTsPlan == null) {
			return false;
		}
		if (!idTsPlan.equals(other.idTsPlan)) {
			return false;
		}
		return true;
	}

}
