package ve.smile.dao;

import java.util.List;
import javax.persistence.Query;
import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Participacion;

public class ParticipacionDAO extends BaseDAO<Participacion> {
	
	@SuppressWarnings("unchecked")
	public List<Participacion> findParticipacionLimt(Integer cantidad) {
		String sql = "select p from Participacion p order by p.idParticipacion ASC";

		Query query = createQuery(sql);

		return query.setMaxResults(cantidad).getResultList();

	}
}
