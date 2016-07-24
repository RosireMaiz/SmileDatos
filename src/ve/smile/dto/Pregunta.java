package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_pregunta")
@Entity
public class Pregunta {

	private Integer idPregunta;
	private String titulo;
	private String contenido;

	public Pregunta() {
		super();
	}

	public Pregunta(Integer idPregunta) {
		super();
		this.idPregunta = idPregunta;
	}

	public Pregunta(
			String titulo,
			String contenido) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
	}

	@Id
	@SequenceGenerator(name = "tb_pregunta_sequence", sequenceName = "public.tb_pregunta_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_pregunta_sequence")
	@Column(name="id_pregunta")
	public Integer getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
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
		result = prime * result + ((idPregunta == null) ? 0 : idPregunta.hashCode());
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
		Pregunta other = (Pregunta) obj;
		if (idPregunta == null) {
			return false;
		} 
		if (!idPregunta.equals(other.idPregunta)) {
			return false;
		} 
		return true;
	}

}
