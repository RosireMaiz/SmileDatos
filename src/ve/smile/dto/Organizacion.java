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

@Table(name = "tb_organizacion")
@Entity
public class Organizacion {

	private Integer idOrganizacion;
	private Multimedia fkMultimedia;
	private String rif;
	private String nombre;
	private String direccion;
	private String telefono;
	private String mision;
	private String vision;
	private String valores;
	private String descripcion;
	private String direccion2;
	private String telefono2;
	private String iframe;
	private Double latitud;
	private Double longitud;
	private String slogan;
	private String correo;
	private String fax;
	private String facebook;
	private String twitter;
	private String linkedin;
	private String instagram;

	public Organizacion() {
		super();
	}

	public Organizacion(Integer idOrganizacion) {
		super();
		this.idOrganizacion = idOrganizacion;
	}

	public Organizacion(Multimedia fkMultimedia, String rif, String nombre,
			String direccion, String telefono, String mision, String vision,
			String valores, String descripcion, String direccion2,
			String telefono2, String iframe, Double latitud, Double longitud) {
		super();
		this.fkMultimedia = fkMultimedia;
		this.rif = rif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mision = mision;
		this.vision = vision;
		this.valores = valores;
		this.descripcion = descripcion;
		this.direccion2 = direccion2;
		this.telefono2 = telefono2;
		this.iframe = iframe;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	@Id
	@SequenceGenerator(name = "tb_organizacion_sequence", sequenceName = "public.tb_organizacion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_organizacion_sequence")
	@Column(name = "id_organizacion")
	public Integer getIdOrganizacion() {
		return idOrganizacion;
	}

	public void setIdOrganizacion(Integer idOrganizacion) {
		this.idOrganizacion = idOrganizacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_multimedia", nullable = false)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
	}

	@Column(name = "rif")
	public String getRif() {
		return rif;
	}

	public void setRif(String rif) {
		this.rif = rif;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "direccion")
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "telefono")
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "mision")
	public String getMision() {
		return mision;
	}

	public void setMision(String mision) {
		this.mision = mision;
	}

	@Column(name = "vision")
	public String getVision() {
		return vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	@Column(name = "valores")
	public String getValores() {
		return valores;
	}

	public void setValores(String valores) {
		this.valores = valores;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "direccion2")
	public String getDireccion2() {
		return direccion2;
	}

	public void setDireccion2(String direccion2) {
		this.direccion2 = direccion2;
	}

	@Column(name = "telefono2")
	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	@Column(name = "iframe")
	public String getIframe() {
		return iframe;
	}

	public void setIframe(String iframe) {
		this.iframe = iframe;
	}

	@Column(name = "latitud")
	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	@Column(name = "longitud")
	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idOrganizacion == null) ? 0 : idOrganizacion.hashCode());
		return result;
	}

	@Column(name = "slogan")
	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	@Column(name = "facebook")
	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	@Column(name = "twitter")
	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	@Column(name = "linkedin")
	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getInstagram() {
		return instagram;
	}

	@Column(name = "instagram")
	public void setInstagram(String instagram) {
		this.instagram = instagram;
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
		Organizacion other = (Organizacion) obj;
		if (idOrganizacion == null) {
			return false;
		}
		if (!idOrganizacion.equals(other.idOrganizacion)) {
			return false;
		}
		return true;
	}

	@Column(name = "correo")
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "fax")
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

}
