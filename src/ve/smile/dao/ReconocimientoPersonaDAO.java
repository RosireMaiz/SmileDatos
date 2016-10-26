package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.ReconocimientoPersona;

public class ReconocimientoPersonaDAO extends BaseDAO<ReconocimientoPersona> {

	@SuppressWarnings("unchecked")
	public List<ReconocimientoPersona> consultaReconocimientoPersonasParametrizado(String sql)
	{
		Query query = createQuery(sql);
		return query.getResultList();
	}
	
}
