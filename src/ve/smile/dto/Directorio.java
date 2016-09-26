package ve.smile.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_directorio")
@Entity
public class Directorio {

	private Integer idDirectorio;
	private Ciudad fkCiudad;
	private Multimedia fkMultimedia;
	private Double latitud;
	private Double longitud;
	private String nombre;
	private String direccion;
	private String telefono;
	private String url;

	public Directorio() {
		super();
	}

	public Directorio(Integer idDirectorio) {
		super();
		this.idDirectorio = idDirectorio;
	}

	public Directorio(Ciudad fkCiudad, Multimedia fkMultimedia, Double latitud,
			Double longitud, String nombre, String direccion, String telefono,
			String url) {
		super();
		this.fkCiudad = fkCiudad;
		this.fkMultimedia = fkMultimedia;
		this.latitud = latitud;
		this.longitud = longitud;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.url = url;
	}

	@Id
	@SequenceGenerator(name = "tb_directorio_sequence", sequenceName = "public.tb_directorio_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_directorio_sequence")
	@Column(name = "id_directorio")
	public Integer getIdDirectorio() {
		return idDirectorio;
	}

	public void setIdDirectorio(Integer idDirectorio) {
		this.idDirectorio = idDirectorio;
	}

	@ManyToOne
	@JoinColumn(name = "fk_ciudad", nullable = false)
	public Ciudad getFkCiudad() {
		return fkCiudad;
	}

	public void setFkCiudad(Ciudad fkCiudad) {
		this.fkCiudad = fkCiudad;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_multimedia", nullable = false)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
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

	@Column(name = "url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idDirectorio == null) ? 0 : idDirectorio.hashCode());
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
		Directorio other = (Directorio) obj;
		if (idDirectorio == null) {
			return false;
		}
		if (!idDirectorio.equals(other.idDirectorio)) {
			return false;
		}
		return true;
	}

}
