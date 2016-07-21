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

@Table(name = "tb_notificacion_usuario")
@Entity
public class NotificacionUsuario {

	private Integer idNotificacionUsuario;
	private Notificacion fkNotificacion;
	private Usuario fkUsuario;
	private Long fecha;
	private String contedio;
	private String asunto;
	private Character estatus;

	public NotificacionUsuario() {
		super();
	}

	public NotificacionUsuario(Integer idNotificacionUsuario) {
		super();
		this.idNotificacionUsuario = idNotificacionUsuario;
	}

	public NotificacionUsuario(
			Notificacion fkNotificacion,
			Usuario fkUsuario,
			Long fecha,
			String contedio,
			String asunto,
			Character estatus) {
		super();
		this.fkNotificacion = fkNotificacion;
		this.fkUsuario = fkUsuario;
		this.fecha = fecha;
		this.contedio = contedio;
		this.asunto = asunto;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_notificacion_usuario_sequence", sequenceName = "public.tb_notificacion_usuario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_notificacion_usuario_sequence")
	@Column(name="id_notificacion_usuario")
	public Integer getIdNotificacionUsuario() {
		return idNotificacionUsuario;
	}

	public void setIdNotificacionUsuario(Integer idNotificacionUsuario) {
		this.idNotificacionUsuario = idNotificacionUsuario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_notificacion", nullable = false)
	public Notificacion getFkNotificacion() {
		return fkNotificacion;
	}

	public void setFkNotificacion(Notificacion fkNotificacion) {
		this.fkNotificacion = fkNotificacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_usuario", nullable = false)
	public Usuario getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(Usuario fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	@Column(name="fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@Column(name="contedio")
	public String getContedio() {
		return contedio;
	}

	public void setContedio(String contedio) {
		this.contedio = contedio;
	}

	@Column(name="asunto")
	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Column(name="estatus")
	public Character getEstatus() {
		return estatus;
	}

	public void setEstatus(Character estatus) {
		this.estatus = estatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idNotificacionUsuario == null) ? 0 : idNotificacionUsuario.hashCode());
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
