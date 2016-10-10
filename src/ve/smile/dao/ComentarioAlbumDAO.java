package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.ComentarioAlbum;

public class ComentarioAlbumDAO extends BaseDAO<ComentarioAlbum> {
	
	@SuppressWarnings("unchecked")
	public List<ComentarioAlbum> findComentariosAlbum(Integer album,
			Integer estatusComentario) {
		String sql = "select e from ComentarioAlbum e where e.fkAlbum.idAlbum = ?1 and e.estatusComentario <= ?2";

		Query query = createQuery(sql);

		query.setParameter(1, album);
		query.setParameter(2, estatusComentario);

		return query.getResultList();

	}

}
