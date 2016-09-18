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

@Table(name = "tb_respaldo")
@Entity
public class Respaldo {

	private Integer idRespaldo;
	private Multimedia fkMultimedia;
	private Long fechaRespaldo;

	public Respaldo() {
		super();
	}

	public Respaldo(Integer idRespaldo) {
		super();
		this.idRespaldo = idRespaldo;
	}

	public Respaldo(
			Multimedia fkMultimedia,
			Long fechaRespaldo) {
		super();
		this.fkMultimedia = fkMultimedia;
		this.fechaRespaldo = fechaRespaldo;
	}

	@Id
	@SequenceGenerator(name = "tb_respaldo_sequence", sequenceName = "public.tb_respaldo_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_respaldo_sequence")
	@Column(name="id_respaldo")
	public Integer getIdRespaldo() {
		return idRespaldo;
	}

	public void setIdRespaldo(Integer idRespaldo) {
		this.idRespaldo = idRespaldo;
	}

	@ManyToOne
	@JoinColumn(name = "fk_multimedia", nullable = false)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
	}

	@Column(name="fecha_respaldo")
	public Long getFechaRespaldo() {
		return fechaRespaldo;
	}

	public void setFechaRespaldo(Long fechaRespaldo) {
		this.fechaRespaldo = fechaRespaldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRespaldo == null) ? 0 : idRespaldo.hashCode());
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
		Respaldo other = (Respaldo) obj;
		if (idRespaldo == null) {
			return false;
		} 
		if (!idRespaldo.equals(other.idRespaldo)) {
			return false;
		} 
		return true;
	}

}
