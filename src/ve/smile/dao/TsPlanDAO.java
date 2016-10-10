package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.TsPlan;

public class TsPlanDAO extends BaseDAO<TsPlan> {

	@SuppressWarnings("unchecked")
	public List<TsPlan> findTSPlanificadoAlbum(Integer album) {
		String sql = "select e from TsPlan e where e.fkAlbum.idAlbum = ?1";

		Query query = createQuery(sql);
		
		query.setParameter(1, album);

		return query.getResultList();

	}
}
