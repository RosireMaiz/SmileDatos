package ve.smile.seguridad.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.internal.LinkedTreeMap;

@Table(name = "tb_rol")
@Entity
public class Rol {

	private Integer idRol;
	private String nombre;
	
	private List<Usuario> usuarios;

	public Rol() {
		super();
		this.usuarios = new ArrayList<Usuario>();
	}

	public Rol(Integer idRol) {
		super();
		this.idRol = idRol;
	}

	public Rol(
			String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public static Rol constructFromLinkedTreeMap(LinkedTreeMap<String, Object> linkedTreeMap) {
		if (linkedTreeMap == null) {
			return null;
		}
		
		Rol rol = new Rol((String) linkedTreeMap.get("nombre"));
		
		rol.setIdRol(((Double) linkedTreeMap.get("idRol")).intValue());
		
		return rol;
	}

	@Id
	@SequenceGenerator(name = "tb_rol_sequence", sequenceName = "public.tb_rol_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_rol_sequence")
	@Column(name="id_rol")
	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Transient
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRol == null) ? 0 : idRol.hashCode());
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
		Rol other = (Rol) obj;
		if (idRol == null) {
			return false;
		} 
		if (!idRol.equals(other.idRol)) {
			return false;
		} 
		return true;
	}

}
