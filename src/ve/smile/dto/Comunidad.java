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

@Table(name = "tb_comunidad")
@Entity
public class Comunidad {

	private Integer idComunidad;
	private Persona fkPersona;
	private String nombre;
	private String apellido;
	private String correo;
	private Long fechaCreacion;

	public Comunidad() {
		super();
	}

	public Comunidad(Integer idComunidad) {
		super();
		this.idComunidad = idComunidad;
	}

	public Comunidad(Persona fkPersona, String nombre, String apellido,
			String correo, Long fechaCreacion) {
		super();
		this.fkPersona = fkPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.fechaCreacion = fechaCreacion;
	}

	@Id
	@SequenceGenerator(name = "tb_comunidad_sequence", sequenceName = "public.tb_comunidad_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_comunidad_sequence")
	@Column(name = "id_comunidad")
	public Integer getIdComunidad() {
		return idComunidad;
	}

	public void setIdComunidad(Integer idComunidad) {
		this.idComunidad = idComunidad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = true)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellido")
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Column(name = "correo")
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "fecha_creacion")
	public Long getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Long fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idComunidad == null) ? 0 : idComunidad.hashCode());
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
		Comunidad other = (Comunidad) obj;
		if (idComunidad == null) {
			return false;
		}
		if (!idComunidad.equals(other.idComunidad)) {
			return false;
		}
		return true;
	}

}
