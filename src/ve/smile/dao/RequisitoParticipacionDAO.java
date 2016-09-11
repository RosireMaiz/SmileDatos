package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.RequisitoParticipacion;

public class RequisitoParticipacionDAO extends BaseDAO<RequisitoParticipacion> {

	@SuppressWarnings("unchecked")
	public List<RequisitoParticipacion> findByParticipacion(
			Integer idParticipacion) {
		String ql = "SELECT rp FROM RequisitoParticipacion rp WHERE ra.fkParticipacion.idParticipacion = ?1 ORDER BY ra.idRequisitoParticipacion";

		Query query = createQuery(ql);

		query.setParameter(1, idParticipacion);

		return query.getResultList();
	}
}
