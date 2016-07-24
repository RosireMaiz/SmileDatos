package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_clasificador_pregunta")
@Entity
public class ClasificadorPregunta {

	private Integer idClasificadorPregunta;
	private String nombre;

	public ClasificadorPregunta() {
		super();
	}

	public ClasificadorPregunta(Integer idClasificadorPregunta) {
		super();
		this.idClasificadorPregunta = idClasificadorPregunta;
	}

	public ClasificadorPregunta(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_pregunta_sequence", sequenceName = "public.tb_clasificador_pregunta_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_pregunta_sequence")
	@Column(name="id_clasificador_pregunta")
	public Integer getIdClasificadorPregunta() {
		return idClasificadorPregunta;
	}

	public void setIdClasificadorPregunta(Integer idClasificadorPregunta) {
		this.idClasificadorPregunta = idClasificadorPregunta;
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
		result = prime * result + ((idClasificadorPregunta == null) ? 0 : idClasificadorPregunta.hashCode());
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
		ClasificadorPregunta other = (ClasificadorPregunta) obj;
		if (idClasificadorPregunta == null) {
			return false;
		} 
		if (!idClasificadorPregunta.equals(other.idClasificadorPregunta)) {
			return false;
		} 
		return true;
	}

}
