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

@Table(name = "tb_sesion")
@Entity
public class Sesion {

	private Integer idSesion;
	private Usuario fkUsuario;
	private String estado;
	private String direccionIp;
	private Integer fechaInicio;
	private Integer fechaFin;
	private String accessToken;

	public Sesion() {
		super();
	}

	public Sesion(Integer idSesion) {
		super();
		this.idSesion = idSesion;
	}

	public Sesion(
			Usuario fkUsuario,
			String estado,
			String direccionIp,
			Integer fechaInicio,
			Integer fechaFin,
			String accessToken) {
		super();
		this.fkUsuario = fkUsuario;
		this.estado = estado;
		this.direccionIp = direccionIp;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.accessToken = accessToken;
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

	@Column(name="fecha_inicio")
	public Integer getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Integer fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Column(name="fecha_fin")
	public Integer getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Integer fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Column(name="access_token")
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
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
