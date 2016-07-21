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

@Table(name = "tb_usuario")
@Entity
public class Usuario {

	private Integer idUsuario;
	private Persona fkPersona;
	private String clave;
	private String correo;
	private String estatus;

	public Usuario() {
		super();
	}

	public Usuario(Integer idUsuario) {
		super();
		this.idUsuario = idUsuario;
	}

	public Usuario(
			Persona fkPersona,
			String clave,
			String correo,
			String estatus) {
		super();
		this.fkPersona = fkPersona;
		this.clave = clave;
		this.correo = correo;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_usuario_sequence", sequenceName = "public.tb_usuario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_usuario_sequence")
	@Column(name="id_usuario")
	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name="clave")
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Column(name="correo")
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name="estatus")
	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
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
