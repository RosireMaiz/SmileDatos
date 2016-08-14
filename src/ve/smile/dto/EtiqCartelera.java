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

@Table(name = "tb_etiq_cartelera")
@Entity
public class EtiqCartelera {

	private Integer idEtiqCartelera;
	private Cartelera fkCartelera;
	private Etiqueta fkEtiqueta;

	public EtiqCartelera() {
		super();
	}

	public EtiqCartelera(Integer idEtiqCartelera) {
		super();
		this.idEtiqCartelera = idEtiqCartelera;
	}

	public EtiqCartelera(
			Cartelera fkCartelera,
			Etiqueta fkEtiqueta) {
		super();
		this.fkCartelera = fkCartelera;
		this.fkEtiqueta = fkEtiqueta;
	}

	@Id
	@SequenceGenerator(name = "tb_etiq_cartelera_sequence", sequenceName = "public.tb_etiq_cartelera_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_etiq_cartelera_sequence")
	@Column(name="id_etiq_cartelera")
	public Integer getIdEtiqCartelera() {
		return idEtiqCartelera;
	}

	public void setIdEtiqCartelera(Integer idEtiqCartelera) {
		this.idEtiqCartelera = idEtiqCartelera;
	}

	@ManyToOne
	@JoinColumn(name = "fk_cartelera", nullable = false)
	public Cartelera getFkCartelera() {
		return fkCartelera;
	}

	public void setFkCartelera(Cartelera fkCartelera) {
		this.fkCartelera = fkCartelera;
	}

	@ManyToOne
	@JoinColumn(name = "fk_etiqueta", nullable = false)
	public Etiqueta getFkEtiqueta() {
		return fkEtiqueta;
	}

	public void setFkEtiqueta(Etiqueta fkEtiqueta) {
		this.fkEtiqueta = fkEtiqueta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEtiqCartelera == null) ? 0 : idEtiqCartelera.hashCode());
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
		EtiqCartelera other = (EtiqCartelera) obj;
		if (idEtiqCartelera == null) {
			return false;
		} 
		if (!idEtiqCartelera.equals(other.idEtiqCartelera)) {
			return false;
		} 
		return true;
	}

}
