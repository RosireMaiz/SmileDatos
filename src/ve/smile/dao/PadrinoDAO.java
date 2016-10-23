package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Padrino;

public class PadrinoDAO extends BaseDAO<Padrino> {
	@SuppressWarnings("unchecked")
	public List<Padrino> consultaPadrinosParametrizado(String sql) {
		Query query = createQuery(sql);
		return query.getResultList();
	}
}
