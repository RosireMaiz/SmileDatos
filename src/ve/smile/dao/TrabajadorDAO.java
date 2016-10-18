package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Trabajador;

public class TrabajadorDAO extends BaseDAO<Trabajador> {

	@SuppressWarnings("unchecked")
	public List<Trabajador> consultaTrabajadoresParametrizado(String sql) {
		Query query = createQuery(sql);
		return query.getResultList();
	}

}
