package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.EventoPlanificado;

public class EventoPlanificadoDAO extends BaseDAO<EventoPlanificado> {
	
	@SuppressWarnings("unchecked")
	public List<EventoPlanificado> findEventosPlanificadoPublico(Boolean publico,
			Integer estatusEvento, Long fechaDesde, Integer cant) {
		String sql = "select e from EventoPlanificado e where e.publicoPortal = ?1 and "
				+ "e.estatusEvento = ?2 and e.fechaInicio >= ?3 ORDER BY e.fechaInicio";

		Query query = createQuery(sql);

		query.setParameter(1, publico);
		query.setParameter(2, estatusEvento);
		query.setParameter(3, fechaDesde);

		return query.setMaxResults(cant).getResultList();

	}
	
	@SuppressWarnings("unchecked")
	public List<EventoPlanificado> findEventosPlanificadoAlbum(Integer album) {
		String sql = "select e from EventoPlanificado e where e.fkAlbum.idAlbum = ?1";

		Query query = createQuery(sql);
		
		query.setParameter(1, album);

		return query.getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<EventoPlanificado> consultaEventosPlanificadosParametrizado(String sql)
	{
		Query query = createQuery(sql);
		return query.getResultList();
	}
}
