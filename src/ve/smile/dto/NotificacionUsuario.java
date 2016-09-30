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

import ve.smile.enums.TipoReferenciaNotificacionEnum;
import ve.smile.enums.EstatusNotificacionEnum;
import ve.smile.seguridad.dto.Usuario;

@Table(name = "tb_notificacion_usuario")
@Entity
public class NotificacionUsuario {

	private Integer idNotificacionUsuario;
	private Usuario fkUsuario;
	private Long fecha;
	private Integer referenciaGenericoId;
	private Integer estatusNotificacion;
	private Integer tipoReferenciaNotificacion;
	private String contenido;

	public NotificacionUsuario() {
		super();
	}

	public NotificacionUsuario(Integer idNotificacionUsuario) {
		super();
		this.idNotificacionUsuario = idNotificacionUsuario;
	}

	public NotificacionUsuario(Usuario fkUsuario, Long fecha,
			Integer referenciaGenericoId, Integer estatusNotificacion,
			Integer tipoReferenciaNotificacion, String contenido) {
		super();
		this.fkUsuario = fkUsuario;
		this.fecha = fecha;
		this.referenciaGenericoId = referenciaGenericoId;
		this.estatusNotificacion = estatusNotificacion;
		this.tipoReferenciaNotificacion = tipoReferenciaNotificacion;
		this.contenido = contenido;
	}

	@Id
	@SequenceGenerator(name = "tb_notificacion_usuario_sequence", sequenceName = "public.tb_notificacion_usuario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_notificacion_usuario_sequence")
	@Column(name = "id_notificacion_usuario")
	public Integer getIdNotificacionUsuario() {
		return idNotificacionUsuario;
	}

	public void setIdNotificacionUsuario(Integer idNotificacionUsuario) {
		this.idNotificacionUsuario = idNotificacionUsuario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_usuario", nullable = false)
	public Usuario getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(Usuario fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	@Column(name = "fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@Column(name = "referencia_generico_id")
	public Integer getReferenciaGenericoId() {
		return referenciaGenericoId;
	}

	public void setReferenciaGenericoId(Integer referenciaGenericoId) {
		this.referenciaGenericoId = referenciaGenericoId;
	}

	@Column(name = "estatus_notificacion")
	public Integer getEstatusNotificacion() {
		return estatusNotificacion;
	}

	public void setEstatusNotificacion(Integer estatusNotificacion) {
		this.estatusNotificacion = estatusNotificacion;
	}

	@Column(name = "tipo_referencia_notificacion")
	public Integer getTipoReferenciaNotificacion() {
		return tipoReferenciaNotificacion;
	}

	public void setTipoReferenciaNotificacion(Integer tipoReferenciaNotificacion) {
		this.tipoReferenciaNotificacion = tipoReferenciaNotificacion;
	}

	@Transient
	public TipoReferenciaNotificacionEnum getTipoReferenciaNotificacionEnum() {
		return TipoReferenciaNotificacionEnum.values()[this.tipoReferenciaNotificacion];
	}

	public void setTipoReferenciaNotificacionEnum(
			TipoReferenciaNotificacionEnum tipoReferenciaNotificacionEnum) {
		this.tipoReferenciaNotificacion = tipoReferenciaNotificacionEnum
				.ordinal();
	}
	
	@Transient
	public EstatusNotificacionEnum EstatusNotificacionEnum() {
		return EstatusNotificacionEnum.values()[this.estatusNotificacion];
	}

	public void setEstatusNotificacionEnum(
			EstatusNotificacionEnum estatusNotificacionEnum) {
		this.estatusNotificacion = estatusNotificacionEnum
				.ordinal();
	}

	@Column(name = "contenido")
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idNotificacionUsuario == null) ? 0 : idNotificacionUsuario
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
		NotificacionUsuario other = (NotificacionUsuario) obj;
		if (idNotificacionUsuario == null) {
			return false;
		}
		if (!idNotificacionUsuario.equals(other.idNotificacionUsuario)) {
			return false;
		}
		return true;
	}

}
