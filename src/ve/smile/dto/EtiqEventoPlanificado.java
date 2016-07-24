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

@Table(name = "tb_etiq_evento_planificado")
@Entity
public class EtiqEventoPlanificado {

	private Integer idEtiqEventoPlanificado;
	private Etiqueta fkEtiqueta;
	private EventoPlanificado fkEventoPlanificado;

	public EtiqEventoPlanificado() {
		super();
	}

	public EtiqEventoPlanificado(Integer idEtiqEventoPlanificado) {
		super();
		this.idEtiqEventoPlanificado = idEtiqEventoPlanificado;
	}

	public EtiqEventoPlanificado(
			Etiqueta fkEtiqueta,
			EventoPlanificado fkEventoPlanificado) {
		super();
		this.fkEtiqueta = fkEtiqueta;
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@Id
	@SequenceGenerator(name = "tb_etiq_evento_planificado_sequence", sequenceName = "public.tb_etiq_evento_planificado_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_etiq_evento_planificado_sequence")
	@Column(name="id_etiq_evento_planificado")
	public Integer getIdEtiqEventoPlanificado() {
		return idEtiqEventoPlanificado;
	}

	public void setIdEtiqEventoPlanificado(Integer idEtiqEventoPlanificado) {
		this.idEtiqEventoPlanificado = idEtiqEventoPlanificado;
	}

	@ManyToOne
	@JoinColumn(name = "fk_etiqueta", nullable = false)
	public Etiqueta getFkEtiqueta() {
		return fkEtiqueta;
	}

	public void setFkEtiqueta(Etiqueta fkEtiqueta) {
		this.fkEtiqueta = fkEtiqueta;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento_planificado", nullable = false)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEtiqEventoPlanificado == null) ? 0 : idEtiqEventoPlanificado.hashCode());
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
		EtiqEventoPlanificado other = (EtiqEventoPlanificado) obj;
		if (idEtiqEventoPlanificado == null) {
			return false;
		} 
		if (!idEtiqEventoPlanificado.equals(other.idEtiqEventoPlanificado)) {
			return false;
		} 
		return true;
	}

}
