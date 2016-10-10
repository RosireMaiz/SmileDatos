package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Multimedia;

public class MultimediaDAO extends BaseDAO<Multimedia> {

	@SuppressWarnings("unchecked")
	public List<Multimedia> findMultimediaTipo(Integer cantidad, Integer tipo) {
		
		String sql = "select m from Multimedia m where m.tipoMultimedia = ?1";
		
		Query query = createQuery(sql);
		
		query.setParameter(1, tipo);
		
		return query.setMaxResults(cantidad).getResultList();
		
	}
}
