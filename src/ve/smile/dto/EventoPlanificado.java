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

@Table(name = "tb_evento_planificado")
@Entity
public class EventoPlanificado {

	private Integer idEventoPlanificado;
	private Album fkAlbum;
	private Directorio fkDirectorio;
	private TipoEvento fkTipoEvento;
	private TipoMotivo fkTipoMotivo;
	private Persona fkPersona;
	private Long fechaPlanificada;
	private Long fechaEjecutada;

	public EventoPlanificado() {
		super();
	}

	public EventoPlanificado(Integer idEventoPlanificado) {
		super();
		this.idEventoPlanificado = idEventoPlanificado;
	}

	public EventoPlanificado(
			Album fkAlbum,
			Directorio fkDirectorio,
			TipoEvento fkTipoEvento,
			TipoMotivo fkTipoMotivo,
			Persona fkPersona,
			Long fechaPlanificada,
			Long fechaEjecutada) {
		super();
		this.fkAlbum = fkAlbum;
		this.fkDirectorio = fkDirectorio;
		this.fkTipoEvento = fkTipoEvento;
		this.fkTipoMotivo = fkTipoMotivo;
		this.fkPersona = fkPersona;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
	}

	@Id
	@SequenceGenerator(name = "tb_evento_planificado_sequence", sequenceName = "public.tb_evento_planificado_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_evento_planificado_sequence")
	@Column(name="id_evento_planificado")
	public Integer getIdEventoPlanificado() {
		return idEventoPlanificado;
	}

	public void setIdEventoPlanificado(Integer idEventoPlanificado) {
		this.idEventoPlanificado = idEventoPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_album", nullable = false)
	public Album getFkAlbum() {
		return fkAlbum;
	}

	public void setFkAlbum(Album fkAlbum) {
		this.fkAlbum = fkAlbum;
	}

	@ManyToOne
	@JoinColumn(name = "fk_directorio", nullable = false)
	public Directorio getFkDirectorio() {
		return fkDirectorio;
	}

	public void setFkDirectorio(Directorio fkDirectorio) {
		this.fkDirectorio = fkDirectorio;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tipo_evento", nullable = false)
	public TipoEvento getFkTipoEvento() {
		return fkTipoEvento;
	}

	public void setFkTipoEvento(TipoEvento fkTipoEvento) {
		this.fkTipoEvento = fkTipoEvento;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tipo_motivo", nullable = false)
	public TipoMotivo getFkTipoMotivo() {
		return fkTipoMotivo;
	}

	public void setFkTipoMotivo(TipoMotivo fkTipoMotivo) {
		this.fkTipoMotivo = fkTipoMotivo;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name="fecha_planificada")
	public Long getFechaPlanificada() {
		return fechaPlanificada;
	}

	public void setFechaPlanificada(Long fechaPlanificada) {
		this.fechaPlanificada = fechaPlanificada;
	}

	@Column(name="fecha_ejecutada")
	public Long getFechaEjecutada() {
		return fechaEjecutada;
	}

	public void setFechaEjecutada(Long fechaEjecutada) {
		this.fechaEjecutada = fechaEjecutada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEventoPlanificado == null) ? 0 : idEventoPlanificado.hashCode());
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
