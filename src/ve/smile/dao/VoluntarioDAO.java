package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Actividad;
import ve.smile.dto.Voluntario;

public class VoluntarioDAO extends BaseDAO<Voluntario> {
	@SuppressWarnings("unchecked")
	public List<Voluntario> consultaVoluntariosParametrizado(String sql) {
		Query query = createQuery(sql);
		return query.getResultList();
	}

}
