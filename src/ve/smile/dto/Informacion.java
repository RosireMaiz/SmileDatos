package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_informacion")
@Entity
public class Informacion {

	private Integer idInformacion;
	private String titulo;
	private String contenido;

	public Informacion() {
		super();
	}

	public Informacion(Integer idInformacion) {
		super();
		this.idInformacion = idInformacion;
	}

	public Informacion(
			String titulo,
			String contenido) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
	}

	@Id
	@SequenceGenerator(name = "tb_informacion_sequence", sequenceName = "public.tb_informacion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_informacion_sequence")
	@Column(name="id_informacion")
	public Integer getIdInformacion() {
		return idInformacion;
	}

	public void setIdInformacion(Integer idInformacion) {
		this.idInformacion = idInformacion;
	}

	@Column(name="titulo")
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name="contenido")
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idInformacion == null) ? 0 : idInformacion.hashCode());
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
		Informacion other = (Informacion) obj;
		if (idInformacion == null) {
			return false;
		} 
		if (!idInformacion.equals(other.idInformacion)) {
			return false;
		} 
		return true;
	}

}
