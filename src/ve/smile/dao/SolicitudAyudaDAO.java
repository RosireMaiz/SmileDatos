package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.SolicitudAyuda;

public class SolicitudAyudaDAO extends BaseDAO<SolicitudAyuda> {

	@SuppressWarnings("unchecked")
	public List<SolicitudAyuda> consultaSolicitudesParametrizado(String sql) {
		Query query = createQuery(sql);
		return query.getResultList();
	}

}
