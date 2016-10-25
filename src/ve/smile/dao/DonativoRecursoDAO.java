package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.DonativoRecurso;

public class DonativoRecursoDAO extends BaseDAO<DonativoRecurso> {

	@SuppressWarnings("unchecked")
	public List<DonativoRecurso> consultaDonativosParametrizado(String sql) {
		Query query = createQuery(sql);
		return query.getResultList();
	}
}
