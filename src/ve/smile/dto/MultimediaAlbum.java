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

@Table(name = "tb_multimedia_album")
@Entity
public class MultimediaAlbum {

	private Integer idMultimediaAlbum;
	private Multimedia fkMultimedia;
	private Album fkAlbum;

	public MultimediaAlbum() {
		super();
	}

	public MultimediaAlbum(Integer idMultimediaAlbum) {
		super();
		this.idMultimediaAlbum = idMultimediaAlbum;
	}

	public MultimediaAlbum(
			Multimedia fkMultimedia,
			Album fkAlbum) {
		super();
		this.fkMultimedia = fkMultimedia;
		this.fkAlbum = fkAlbum;
	}

	@Id
	@SequenceGenerator(name = "tb_multimedia_album_sequence", sequenceName = "public.tb_multimedia_album_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_multimedia_album_sequence")
	@Column(name="id_multimedia_album")
	public Integer getIdMultimediaAlbum() {
		return idMultimediaAlbum;
	}

	public void setIdMultimediaAlbum(Integer idMultimediaAlbum) {
		this.idMultimediaAlbum = idMultimediaAlbum;
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
		result = prime * result + ((idMultimediaAlbum == null) ? 0 : idMultimediaAlbum.hashCode());
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
		MultimediaAlbum other = (MultimediaAlbum) obj;
		if (idMultimediaAlbum == null) {
			return false;
		} 
		if (!idMultimediaAlbum.equals(other.idMultimediaAlbum)) {
			return false;
		} 
		return true;
	}

}
