package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.ClasificadorVoluntario;
import ve.smile.dto.Fortaleza;

public class ClasificadorVoluntarioDAO extends BaseDAO<ClasificadorVoluntario> {
	
	// CLASIFICADOR POR VOLUNTARIO
	@SuppressWarnings("unchecked")
	public List<ClasificadorVoluntario> findByVoluntario(Integer idVoluntario)
	{
		String ql = "SELECT tf.fkClasificadorVoluntario FROM VoluntarioClasificado tf WHERE tf.fkVoluntario.idVoluntario = ?1 ORDER BY tf.fkClasificadorVoluntario.idClasificadorVoluntario";
		Query query = createQuery(ql);
		query.setParameter(1, idVoluntario);
		return query.getResultList();
	}

}
