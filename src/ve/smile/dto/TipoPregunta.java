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

@Table(name = "tb_tipo_pregunta")
@Entity
public class TipoPregunta {

	private Integer idTipoPregunta;
	private Multimedia fkMultimedia;
	private ClasificadorPregunta fkClasificadorPregunta;
	private Pregunta fkPregunta;

	public TipoPregunta() {
		super();
	}

	public TipoPregunta(Integer idTipoPregunta) {
		super();
		this.idTipoPregunta = idTipoPregunta;
	}

	public TipoPregunta(
			Multimedia fkMultimedia,
			ClasificadorPregunta fkClasificadorPregunta,
			Pregunta fkPregunta) {
		super();
		this.fkMultimedia = fkMultimedia;
		this.fkClasificadorPregunta = fkClasificadorPregunta;
		this.fkPregunta = fkPregunta;
	}

	@Id
	@SequenceGenerator(name = "tb_tipo_pregunta_sequence", sequenceName = "public.tb_tipo_pregunta_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_tipo_pregunta_sequence")
	@Column(name="id_tipo_pregunta")
	public Integer getIdTipoPregunta() {
		return idTipoPregunta;
	}

	public void setIdTipoPregunta(Integer idTipoPregunta) {
		this.idTipoPregunta = idTipoPregunta;
	}

	@ManyToOne
	@JoinColumn(name = "fk_multimedia", nullable = false)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
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
		result = prime * result + ((idTipoPregunta == null) ? 0 : idTipoPregunta.hashCode());
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
		TipoPregunta other = (TipoPregunta) obj;
		if (idTipoPregunta == null) {
			return false;
		} 
		if (!idTipoPregunta.equals(other.idTipoPregunta)) {
			return false;
		} 
		return true;
	}

}
