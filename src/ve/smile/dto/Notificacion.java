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

@Table(name = "tb_notificacion")
@Entity
public class Notificacion {

	private Integer idNotificacion;
	private Multimedia fkMultimedia;
	private String descripcion;
	private String nombre;
	private String icono;

	public Notificacion() {
		super();
	}

	public Notificacion(Integer idNotificacion) {
		super();
		this.idNotificacion = idNotificacion;
	}

	public Notificacion(
			Multimedia fkMultimedia,
			String descripcion,
			String nombre,
			String icono) {
		super();
		this.fkMultimedia = fkMultimedia;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.icono = icono;
	}

	@Id
	@SequenceGenerator(name = "tb_notificacion_sequence", sequenceName = "public.tb_notificacion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_notificacion_sequence")
	@Column(name="id_notificacion")
	public Integer getIdNotificacion() {
		return idNotificacion;
	}

	public void setIdNotificacion(Integer idNotificacion) {
		this.idNotificacion = idNotificacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_multimedia", nullable = false)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="icono")
	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idNotificacion == null) ? 0 : idNotificacion.hashCode());
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
		Notificacion other = (Notificacion) obj;
		if (idNotificacion == null) {
			return false;
		} 
		if (!idNotificacion.equals(other.idNotificacion)) {
			return false;
		} 
		return true;
	}

}
