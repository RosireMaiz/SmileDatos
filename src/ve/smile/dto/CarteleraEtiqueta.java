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

@Table(name = "tb_cartelera_etiqueta")
@Entity
public class CarteleraEtiqueta {

	private Integer idCarteleraEtiqueta;
	private Cartelera fkCartelera;
	private Etiqueta fkEtiqueta;

	public CarteleraEtiqueta() {
		super();
	}

	public CarteleraEtiqueta(Integer idCarteleraEtiqueta) {
		super();
		this.idCarteleraEtiqueta = idCarteleraEtiqueta;
	}

	public CarteleraEtiqueta(
			Cartelera fkCartelera,
			Etiqueta fkEtiqueta) {
		super();
		this.fkCartelera = fkCartelera;
		this.fkEtiqueta = fkEtiqueta;
	}

	@Id
	@SequenceGenerator(name = "tb_cartelera_etiqueta_sequence", sequenceName = "public.tb_cartelera_etiqueta_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_cartelera_etiqueta_sequence")
	@Column(name="id_etiqueta_cartelera")
	public Integer getIdEtiquetaCartelera() {
		return idCarteleraEtiqueta;
	}

	public void setIdEtiquetaCartelera(Integer idEtiquetaCartelera) {
		this.idCarteleraEtiqueta = idEtiquetaCartelera;
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
		result = prime * result + ((idCarteleraEtiqueta == null) ? 0 : idCarteleraEtiqueta.hashCode());
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
		CarteleraEtiqueta other = (CarteleraEtiqueta) obj;
		if (idCarteleraEtiqueta == null) {
			return false;
		} 
		if (!idCarteleraEtiqueta.equals(other.idCarteleraEtiqueta)) {
			return false;
		} 
		return true;
	}

}
