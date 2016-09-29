package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;
import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Ciudad;

public class CiudadDAO extends BaseDAO<Ciudad> {
	
	@SuppressWarnings("unchecked")
	public List<Ciudad> consultaCiudadPorEstado(Integer id) {
		String sql = "select c from Ciudad c where c.fkEstado.idEstado = ?1";

		Query query = createQuery(sql);

		query.setParameter(1, id);
		
		return query.getResultList();

	}



}
