package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.MultimediaAlbum;

public class MultimediaAlbumDAO extends BaseDAO<MultimediaAlbum> {
	
	@SuppressWarnings("unchecked")
	public List<MultimediaAlbum> findMultimediasAlbumCantidad(Integer cantidad, Integer album) {

		String sql = "select m from MultimediaAlbum m where m.fkAlbum.idAlbum = ?1";

		Query query = createQuery(sql);
		
		query.setParameter(1, album);

		return query.setMaxResults(cantidad).getResultList();

	}

}
