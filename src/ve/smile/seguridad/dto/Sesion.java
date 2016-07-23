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

@Table(name = "tb_sesion")
@Entity
public class Sesion {

	public static String ACTIVO = "A"; 	
	public static String INACTIVO = "I";
	
	private Integer idSesion;
	private Usuario fkUsuario;
	private String estado;
	private String direccionIp;
	private String accessToken;
	private Long fechaInicio;
	private Long fechaFin;

	private List<Auditoria> auditorias;
	
	public Sesion() {
		super();
		this.auditorias = new ArrayList<Auditoria>();
	}

	public Sesion(Integer idSesion) {
		super();
		this.idSesion = idSesion;
	}

	public Sesion(
			Usuario fkUsuario,
			String estado,
			String direccionIp,
			String accessToken,
			Long fechaInicio,
			Long fechaFin) {
		super();
		this.fkUsuario = fkUsuario;
		this.estado = estado;
		this.direccionIp = direccionIp;
		this.accessToken = accessToken;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	@Id
	@SequenceGenerator(name = "tb_sesion_sequence", sequenceName = "public.tb_sesion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_sesion_sequence")
	@Column(name="id_sesion")
	public Integer getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(Integer idSesion) {
		this.idSesion = idSesion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_usuario", nullable = false)
	public Usuario getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(Usuario fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	@Column(name="estado")
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name="direccion_ip")
	public String getDireccionIp() {
		return direccionIp;
	}

	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}

	@Column(name="access_token")
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@Column(name="fecha_inicio")
	public Long getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Long fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Column(name="fecha_fin")
	public Long getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Long fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	@Transient
	public List<Auditoria> getAuditorias() {
		return auditorias;
	}

	public void setAuditorias(List<Auditoria> auditorias) {
		this.auditorias = auditorias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSesion == null) ? 0 : idSesion.hashCode());
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
		Sesion other = (Sesion) obj;
		if (idSesion == null) {
			return false;
		} 
		if (!idSesion.equals(other.idSesion)) {
			return false;
		} 
		return true;
	}

}
