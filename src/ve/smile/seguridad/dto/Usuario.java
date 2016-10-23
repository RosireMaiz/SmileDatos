package ve.smile.seguridad.dto;

import java.util.ArrayList;
import java.util.List;

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

import ve.smile.dto.NotificacionUsuario;
import ve.smile.dto.Persona;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.internal.LinkedTreeMap;

@Table(name = "tb_usuario")
@Entity
public class Usuario {

	public static String ACTIVO = "A";
	public static String INACTIVO = "I";

	private Integer idUsuario;
	private String clave;
	private String correo;
	private Rol fkRol;
	private String estatus;

	private Persona persona;

	private List<NotificacionUsuario> notificacionUsuarios;

	private List<NotificacionUsuario> notificacionUsuariosPendientes;

	public Usuario() {
		super();
		this.estatus = ACTIVO;
	}

	public Usuario(Integer idUsuario) {
		this();
		this.idUsuario = idUsuario;
	}

	public Usuario(String clave, String correo, Rol fkRol, String estatus) {
		super();
		this.clave = clave;
		this.correo = correo;
		this.fkRol = fkRol;
		this.estatus = estatus;
	}

	@SuppressWarnings("unchecked")
	public static Usuario constructFromLinkedTreeMap(
			LinkedTreeMap<String, Object> linkedTreeMap) {
		if (linkedTreeMap == null) {
			return null;
		}

		Usuario usuario = new Usuario(
				(String) linkedTreeMap.get("clave"),
				(String) linkedTreeMap.get("correo"),
				Rol.constructFromLinkedTreeMap((LinkedTreeMap<String, Object>) linkedTreeMap
						.get("fkRol")), (String) linkedTreeMap.get("estatus"));

		usuario.setIdUsuario(((Double) linkedTreeMap.get("idUsuario"))
				.intValue());

		return usuario;
	}

	@Id
	@SequenceGenerator(name = "tb_usuario_sequence", sequenceName = "public.tb_usuario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_usuario_sequence")
	@Column(name = "id_usuario")
	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Column(name = "clave")
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Column(name = "correo")
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@ManyToOne
	@JoinColumn(name = "fk_rol")
	public Rol getFkRol() {
		return fkRol;
	}

	public void setFkRol(Rol fkRol) {
		this.fkRol = fkRol;
	}

	@Column(name = "estatus")
	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	@JsonIgnore
	@Transient
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@JsonIgnore
	@Transient
	public List<NotificacionUsuario> getNotificacionUsuarios() {
		if (this.notificacionUsuarios == null) {
			this.notificacionUsuarios = new ArrayList<>();
		}
		return notificacionUsuarios;
	}

	public void setNotificacionUsuarios(
			List<NotificacionUsuario> notificacionUsuarios) {
		this.notificacionUsuarios = notificacionUsuarios;
	}

	@JsonIgnore
	@Transient
	public List<NotificacionUsuario> getNotificacionUsuariosPendientes() {
		if (this.notificacionUsuariosPendientes == null) {
			this.notificacionUsuariosPendientes = new ArrayList<>();
		}
		return notificacionUsuariosPendientes;
	}

	public void setNotificacionUsuariosPendientes(
			List<NotificacionUsuario> notificacionUsuariosPendientes) {
		this.notificacionUsuariosPendientes = notificacionUsuariosPendientes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idUsuario == null) ? 0 : idUsuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (idUsuario == null) {
			return false;
		}
		if (!idUsuario.equals(other.idUsuario)) {
			return false;
		}
		return true;
	}

}
