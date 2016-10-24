package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Album;

public class AlbumDAO extends BaseDAO<Album> {

	@SuppressWarnings("unchecked")
	public List<Album> findAlbumCantidad(Integer cantidad, Integer statusAlbum) {
		
		String sql = "select a from Album a where a.estatusAlbum = ?1 ORDER BY A.idAlbum DESC";
		
		Query query = createQuery(sql);
		
		query.setParameter(1, statusAlbum);
		
		return query.setMaxResults(cantidad).getResultList();
		
	}

}
