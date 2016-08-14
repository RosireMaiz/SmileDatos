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

@Table(name = "tb_pregunta_clasificada")
@Entity
public class PreguntaClasificada {

	private Integer idPreguntaClasificada;
	private ClasificadorPregunta fkClasificadorPregunta;
	private Pregunta fkPregunta;

	public PreguntaClasificada() {
		super();
	}

	public PreguntaClasificada(Integer idPreguntaClasificada) {
		super();
		this.idPreguntaClasificada = idPreguntaClasificada;
	}

	public PreguntaClasificada(
			ClasificadorPregunta fkClasificadorPregunta,
			Pregunta fkPregunta) {
		super();
		this.fkClasificadorPregunta = fkClasificadorPregunta;
		this.fkPregunta = fkPregunta;
	}

	@Id
	@SequenceGenerator(name = "tb_pregunta_clasificada_sequence", sequenceName = "public.tb_pregunta_clasificada_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_pregunta_clasificada_sequence")
	@Column(name="id_pregunta_clasificada")
	public Integer getIdPreguntaClasificada() {
		return idPreguntaClasificada;
	}

	public void setIdPreguntaClasificada(Integer idPreguntaClasificada) {
		this.idPreguntaClasificada = idPreguntaClasificada;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_pregunta", nullable = false)
	public ClasificadorPregunta getFkClasificadorPregunta() {
		return fkClasificadorPregunta;
	}

	public void setFkClasificadorPregunta(ClasificadorPregunta fkClasificadorPregunta) {
		this.fkClasificadorPregunta = fkClasificadorPregunta;
	}

	@ManyToOne
	@JoinColumn(name = "fk_pregunta", nullable = false)
	public Pregunta getFkPregunta() {
		return fkPregunta;
	}

	public void setFkPregunta(Pregunta fkPregunta) {
		this.fkPregunta = fkPregunta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPreguntaClasificada == null) ? 0 : idPreguntaClasificada.hashCode());
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
		PreguntaClasificada other = (PreguntaClasificada) obj;
		if (idPreguntaClasificada == null) {
			return false;
		} 
		if (!idPreguntaClasificada.equals(other.idPreguntaClasificada)) {
			return false;
		} 
		return true;
	}

}
