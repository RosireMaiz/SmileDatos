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

@Table(name = "tb_tipo_motivo")
@Entity
public class TipoMotivo {

	private Integer idTipoMotivo;
	private Motivo fkMotivo;
	private ClasificadorMotivo fkClasificadorMotivo;

	public TipoMotivo() {
		super();
	}

	public TipoMotivo(Integer idTipoMotivo) {
		super();
		this.idTipoMotivo = idTipoMotivo;
	}

	public TipoMotivo(
			Motivo fkMotivo,
			ClasificadorMotivo fkClasificadorMotivo) {
		super();
		this.fkMotivo = fkMotivo;
		this.fkClasificadorMotivo = fkClasificadorMotivo;
	}

	@Id
	@SequenceGenerator(name = "tb_tipo_motivo_sequence", sequenceName = "public.tb_tipo_motivo_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_tipo_motivo_sequence")
	@Column(name="id_tipo_motivo")
	public Integer getIdTipoMotivo() {
		return idTipoMotivo;
	}

	public void setIdTipoMotivo(Integer idTipoMotivo) {
		this.idTipoMotivo = idTipoMotivo;
	}

	@ManyToOne
	@JoinColumn(name = "fk_motivo", nullable = false)
	public Motivo getFkMotivo() {
		return fkMotivo;
	}

	public void setFkMotivo(Motivo fkMotivo) {
		this.fkMotivo = fkMotivo;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_motivo", nullable = false)
	public ClasificadorMotivo getFkClasificadorMotivo() {
		return fkClasificadorMotivo;
	}

	public void setFkClasificadorMotivo(ClasificadorMotivo fkClasificadorMotivo) {
		this.fkClasificadorMotivo = fkClasificadorMotivo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoMotivo == null) ? 0 : idTipoMotivo.hashCode());
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
		TipoMotivo other = (TipoMotivo) obj;
		if (idTipoMotivo == null) {
			return false;
		} 
		if (!idTipoMotivo.equals(other.idTipoMotivo)) {
			return false;
		} 
		return true;
	}

}
