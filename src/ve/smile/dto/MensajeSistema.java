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

@Table(name = "tb_mensaje_sistema")
@Entity
public class MensajeSistema {

	private Integer idMensajeSistema;
	private Usuario fkUsuario;
	private String contenido;
	private Integer fecha;

	public MensajeSistema() {
		super();
	}

	public MensajeSistema(Integer idMensajeSistema) {
		super();
		this.idMensajeSistema = idMensajeSistema;
	}

	public MensajeSistema(
			Usuario fkUsuario,
			String contenido,
			Integer fecha) {
		super();
		this.fkUsuario = fkUsuario;
		this.contenido = contenido;
		this.fecha = fecha;
	}

	@Id
	@SequenceGenerator(name = "tb_mensaje_sistema_sequence", sequenceName = "public.tb_mensaje_sistema_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_mensaje_sistema_sequence")
	@Column(name="id_mensaje_sistema")
	public Integer getIdMensajeSistema() {
		return idMensajeSistema;
	}

	public void setIdMensajeSistema(Integer idMensajeSistema) {
		this.idMensajeSistema = idMensajeSistema;
	}

	@ManyToOne
	@JoinColumn(name = "fk_usuario", nullable = false)
	public Usuario getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(Usuario fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	@Column(name="contenido")
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Column(name="fecha")
	public Integer getFecha() {
		return fecha;
	}

	public void setFecha(Integer fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMensajeSistema == null) ? 0 : idMensajeSistema.hashCode());
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
		MensajeSistema other = (MensajeSistema) obj;
		if (idMensajeSistema == null) {
			return false;
		} 
		if (!idMensajeSistema.equals(other.idMensajeSistema)) {
			return false;
		} 
		return true;
	}

}
