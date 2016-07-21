package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_etiqueta")
@Entity
public class Etiqueta {

	private Integer idEtiqueta;
	private String nombre;

	public Etiqueta() {
		super();
	}

	public Etiqueta(Integer idEtiqueta) {
		super();
		this.idEtiqueta = idEtiqueta;
	}

	public Etiqueta(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_etiqueta_sequence", sequenceName = "public.tb_etiqueta_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_etiqueta_sequence")
	@Column(name="id_etiqueta")
	public Integer getIdEtiqueta() {
		return idEtiqueta;
	}

	public void setIdEtiqueta(Integer idEtiqueta) {
		this.idEtiqueta = idEtiqueta;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEtiqueta == null) ? 0 : idEtiqueta.hashCode());
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
		Etiqueta other = (Etiqueta) obj;
		if (idEtiqueta == null) {
			return false;
		} 
		if (!idEtiqueta.equals(other.idEtiqueta)) {
			return false;
		} 
		return true;
	}

}
