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

import ve.smile.enums.TipoPersonaEnum;
import ve.smile.seguridad.dto.Usuario;

@Table(name = "tb_persona")
@Entity
public class Persona {

	private Integer idPersona;
	private Ciudad fkCiudad;
	private Usuario fkUsuario;
	private String identificacion;
	private String nombre;
	private String apellido;
	private Multimedia fkMultimedia;
	private Integer sexo;
	private Long fechaNacimiento;
	private String telefono1;
	private String telefono2;
	private String direccion;
	private String twitter;
	private String instagram;
	private String linkedin;
	private String sitioWeb;
	private String fax;
	private Character estatus;
	private String correo;
	private String facebook;
	private Integer tipoPersona;
	private Integer rolMovil;

	public Persona() {
		super();
	}

	public Persona(Integer idPersona) {
		super();
		this.idPersona = idPersona;
	}

	public Persona(Ciudad fkCiudad, Usuario fkUsuario, String identificacion,
			String nombre, String apellido, Multimedia fkMultimedia,
			 Integer sexo, Long fechaNacimiento, String telefono1,
			String telefono2, String direccion, String twitter,
			String instagram, String linkedin, String sitioWeb, String fax,
			Character estatus, String correo, String facebook,
			Integer tipoPersona) {
		super();
		this.fkCiudad = fkCiudad;
		this.fkUsuario = fkUsuario;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fkMultimedia = fkMultimedia;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.direccion = direccion;
		this.twitter = twitter;
		this.instagram = instagram;
		this.linkedin = linkedin;
		this.sitioWeb = sitioWeb;
		this.fax = fax;
		this.estatus = estatus;
		this.correo = correo;
		this.facebook = facebook;
		this.tipoPersona = tipoPersona;
	}

	@Id
	@SequenceGenerator(name = "tb_persona_sequence", sequenceName = "public.tb_persona_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_persona_sequence")
	@Column(name = "id_persona")
	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ciudad", nullable = true)
	public Ciudad getFkCiudad() {
		return fkCiudad;
	}

	public void setFkCiudad(Ciudad fkCiudad) {
		this.fkCiudad = fkCiudad;
	}

	@ManyToOne
	@JoinColumn(name = "fk_usuario", nullable = true)
	public Usuario getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(Usuario fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	@Column(name = "identificacion")
	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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

	@ManyToOne
	@JoinColumn(name = "fk_multimedia", nullable = true)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
	}

	@Column(name = "sexo")
	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	@Column(name = "fecha_nacimiento")
	public Long getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Long fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "telefono_1")
	public String getTelefono1() {
		return telefono1;
	}
	@Column(name = "rol_movil")
	public Integer getRolMovil() {
		return rolMovil;
	}

	public void setRolMovil(Integer rolMovil) {
		this.rolMovil = rolMovil;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	@Column(name = "telefono_2")
	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	@Column(name = "direccion")
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "twitter")
	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Column(name = "instagram")
	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	@Column(name = "linkedin")
	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	@Column(name = "sitio_web")
	public String getSitioWeb() {
		return sitioWeb;
	}

	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	@Column(name = "fax")
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "estatus")
	public Character getEstatus() {
		return estatus;
	}

	public void setEstatus(Character estatus) {
		this.estatus = estatus;
	}

	@Column(name = "correo")
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "facebook")
	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	@Column(name = "tipo_persona")
	public Integer getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(Integer tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	@Transient
	public TipoPersonaEnum getTipoPersonaEnum() {
		return TipoPersonaEnum.values()[this.tipoPersona];
	}

	public void setTipoPersonaEnum(TipoPersonaEnum tipoPersonaEnum) {
		this.tipoPersona = tipoPersonaEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPersona == null) ? 0 : idPersona.hashCode());
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
		Persona other = (Persona) obj;
		if (idPersona == null) {
			return false;
		}
		if (!idPersona.equals(other.idPersona)) {
			return false;
		}
		return true;
	}

}
