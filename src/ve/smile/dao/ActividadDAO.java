package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Actividad;

public class ActividadDAO extends BaseDAO<Actividad> {
	@SuppressWarnings("unchecked")
	public List<Actividad> findByTrabajoSocial(Integer idTrabajoSocial) {
		String ql = "SELECT ptsi.fkActividad FROM PlantillaTrabajoSocialActividad ptsi WHERE ptsi.fkTrabajoSocial.idTrabajoSocial = ?1 ORDER BY ptsi.fkActividad.idActividad";

		Query query = createQuery(ql);

		query.setParameter(1, idTrabajoSocial);

		return query.getResultList();
	}
}
