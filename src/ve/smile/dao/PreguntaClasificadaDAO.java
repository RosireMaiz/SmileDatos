package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.PreguntaClasificada;

public class PreguntaClasificadaDAO extends BaseDAO<PreguntaClasificada> {
	
	@SuppressWarnings("unchecked")
	public List<PreguntaClasificada> findByClasificadorPregunta(Integer idClasificadorPregunta) {
		String ql = "SELECT pa FROM PreguntaClasificada pa WHERE pa.fkClasificadorPregunta.idClasificadorPregunta = ?1 ORDER BY pa.idPreguntaClasificada";

		Query query = createQuery(ql);

		query.setParameter(1, idClasificadorPregunta);

		return query.getResultList();
	}
	
}
