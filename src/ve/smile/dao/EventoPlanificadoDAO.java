package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.EventoPlanificado;

public class EventoPlanificadoDAO extends BaseDAO<EventoPlanificado> {
	
	@SuppressWarnings("unchecked")
	public List<EventoPlanificado> findEventosPlanificadoPublico(Boolean publico,
			Integer estatusEvento) {
		String sql = "select e from EventoPlanificado e where e.publicoPortal = ?1 and e.estatusEvento = ?2";

		Query query = createQuery(sql);

		query.setParameter(1, publico);
		query.setParameter(2, estatusEvento);

		return query.getResultList();

	}
	
	@SuppressWarnings("unchecked")
	public List<EventoPlanificado> findEventosPlanificadoAlbum(Integer album) {
		String sql = "select e from EventoPlanificado e where e.fkAlbum.idAlbum = ?1";

		Query query = createQuery(sql);
		
		query.setParameter(1, album);

		return query.getResultList();

	}

}
