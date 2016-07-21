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
	private Album fkAlbum;
	private TipoMotivo fkTipoMotivo;
	private Persona fkPersona;
	private ClasificadorTrabajoSocial fkClasificadorTrabajoSocial;
	private Long fechaPlanificada;
	private Long fechaEjecutada;

	public TsPlan() {
		super();
	}

	public TsPlan(Integer idTsPlan) {
		super();
		this.idTsPlan = idTsPlan;
	}

	public TsPlan(
			Album fkAlbum,
			TipoMotivo fkTipoMotivo,
			Persona fkPersona,
			ClasificadorTrabajoSocial fkClasificadorTrabajoSocial,
			Long fechaPlanificada,
			Long fechaEjecutada) {
		super();
		this.fkAlbum = fkAlbum;
		this.fkTipoMotivo = fkTipoMotivo;
		this.fkPersona = fkPersona;
		this.fkClasificadorTrabajoSocial = fkClasificadorTrabajoSocial;
		this.fechaPlanificada = fechaPlanificada;
		this.fechaEjecutada = fechaEjecutada;
	}

	@Id
	@SequenceGenerator(name = "tb_ts_plan_sequence", sequenceName = "public.tb_ts_plan_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_ts_plan_sequence")
	@Column(name="id_ts_plan")
	public Integer getIdTsPlan() {
		return idTsPlan;
	}

	public void setIdTsPlan(Integer idTsPlan) {
		this.idTsPlan = idTsPlan;
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

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_trabajo_social", nullable = false)
	public ClasificadorTrabajoSocial getFkClasificadorTrabajoSocial() {
		return fkClasificadorTrabajoSocial;
	}

	public void setFkClasificadorTrabajoSocial(ClasificadorTrabajoSocial fkClasificadorTrabajoSocial) {
		this.fkClasificadorTrabajoSocial = fkClasificadorTrabajoSocial;
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
		result = prime * result + ((idTsPlan == null) ? 0 : idTsPlan.hashCode());
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
