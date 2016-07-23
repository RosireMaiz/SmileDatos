package ve.smile.seguridad.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "tb_vista")
@Entity
public class Vista {

	private Integer idVista;
	private String nombre;
	private String descripcion;
	private String archivoZul;
	
	private List<Operacion> operaciones;

	public Vista() {
		super();
	}

	public Vista(Integer idVista) {
		super();
		this.idVista = idVista;
	}

	public Vista(
			String nombre,
			String descripcion,
			String archivoZul) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.archivoZul = archivoZul;
	}

	@Id
	@SequenceGenerator(name = "tb_vista_sequence", sequenceName = "public.tb_vista_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_vista_sequence")
	@Column(name="id_vista")
	public Integer getIdVista() {
		return idVista;
	}

	public void setIdVista(Integer idVista) {
		this.idVista = idVista;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name="archivo_zul")
	public String getArchivoZul() {
		return archivoZul;
	}

	public void setArchivoZul(String archivoZul) {
		this.archivoZul = archivoZul;
	}

	@Transient
	public List<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(List<Operacion> operaciones) {
		this.operaciones = operaciones;
	}
	
	@Override
	public String toString() {
		return nombre + " | " + descripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVista == null) ? 0 : idVista.hashCode());
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
		Vista other = (Vista) obj;
		if (idVista == null) {
			return false;
		} 
		if (!idVista.equals(other.idVista)) {
			return false;
		} 
		return true;
	}

}
