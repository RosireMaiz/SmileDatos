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

@Table(name = "tb_tipo_evento")
@Entity
public class TipoEvento {

	private Integer idTipoEvento;
	private Evento fkEvento;
	private ClasificadorEvento fkClasificadorEvento;

	public TipoEvento() {
		super();
	}

	public TipoEvento(Integer idTipoEvento) {
		super();
		this.idTipoEvento = idTipoEvento;
	}

	public TipoEvento(
			Evento fkEvento,
			ClasificadorEvento fkClasificadorEvento) {
		super();
		this.fkEvento = fkEvento;
		this.fkClasificadorEvento = fkClasificadorEvento;
	}

	@Id
	@SequenceGenerator(name = "tb_tipo_evento_sequence", sequenceName = "public.tb_tipo_evento_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_tipo_evento_sequence")
	@Column(name="id_tipo_evento")
	public Integer getIdTipoEvento() {
		return idTipoEvento;
	}

	public void setIdTipoEvento(Integer idTipoEvento) {
		this.idTipoEvento = idTipoEvento;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento", nullable = false)
	public Evento getFkEvento() {
		return fkEvento;
	}

	public void setFkEvento(Evento fkEvento) {
		this.fkEvento = fkEvento;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_evento", nullable = false)
	public ClasificadorEvento getFkClasificadorEvento() {
		return fkClasificadorEvento;
	}

	public void setFkClasificadorEvento(ClasificadorEvento fkClasificadorEvento) {
		this.fkClasificadorEvento = fkClasificadorEvento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoEvento == null) ? 0 : idTipoEvento.hashCode());
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
		TipoEvento other = (TipoEvento) obj;
		if (idTipoEvento == null) {
			return false;
		} 
		if (!idTipoEvento.equals(other.idTipoEvento)) {
			return false;
		} 
		return true;
	}

}
