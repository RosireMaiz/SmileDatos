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

@Table(name = "tb_etiq_album")
@Entity
public class EtiqAlbum {

	private Integer idEtiqAlbum;
	private Etiqueta fkEtiqueta;
	private Album fkAlbum;

	public EtiqAlbum() {
		super();
	}

	public EtiqAlbum(Integer idEtiqAlbum) {
		super();
		this.idEtiqAlbum = idEtiqAlbum;
	}

	public EtiqAlbum(
			Etiqueta fkEtiqueta,
			Album fkAlbum) {
		super();
		this.fkEtiqueta = fkEtiqueta;
		this.fkAlbum = fkAlbum;
	}

	@Id
	@SequenceGenerator(name = "tb_etiq_album_sequence", sequenceName = "public.tb_etiq_album_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_etiq_album_sequence")
	@Column(name="id_etiq_album")
	public Integer getIdEtiqAlbum() {
		return idEtiqAlbum;
	}

	public void setIdEtiqAlbum(Integer idEtiqAlbum) {
		this.idEtiqAlbum = idEtiqAlbum;
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
	@JoinColumn(name = "fk_album", nullable = false)
	public Album getFkAlbum() {
		return fkAlbum;
	}

	public void setFkAlbum(Album fkAlbum) {
		this.fkAlbum = fkAlbum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEtiqAlbum == null) ? 0 : idEtiqAlbum.hashCode());
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
		EtiqAlbum other = (EtiqAlbum) obj;
		if (idEtiqAlbum == null) {
			return false;
		} 
		if (!idEtiqAlbum.equals(other.idEtiqAlbum)) {
			return false;
		} 
		return true;
	}

}
