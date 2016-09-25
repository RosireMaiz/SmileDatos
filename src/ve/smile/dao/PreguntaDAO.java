package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Pregunta;

public class PreguntaDAO extends BaseDAO<Pregunta> {
	@SuppressWarnings("unchecked")
	public List<Pregunta> findByClasificadorPregunta(
			Integer idClasificadorPregunta) {
		String ql = "SELECT pc.fkPregunta FROM PreguntaClasificada pc WHERE pc.fkClasificadorPregunta.idClasificadorPregunta = ?1 ORDER BY pc.fkPregunta.idPregunta";

		Query query = createQuery(ql);

		query.setParameter(1, idClasificadorPregunta);

		return query.getResultList();
	}

}
