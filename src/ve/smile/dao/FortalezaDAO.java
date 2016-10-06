package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Fortaleza;

public class FortalezaDAO extends BaseDAO<Fortaleza> {
	@SuppressWarnings("unchecked")
	public List<Fortaleza> findByTrabajador(
			Integer idTrabajador) {
		String ql = "SELECT tf.fkFortaleza FROM TrabajadorFortaleza tf WHERE tf.fkTrabajador.idTrabajador = ?1 ORDER BY tf.fkFortaleza.idFortaleza";

		Query query = createQuery(ql);

		query.setParameter(1, idTrabajador);

		return query.getResultList();
	}
	
	// FORTALEZAS POR VOLUNTARIO
	@SuppressWarnings("unchecked")
	public List<Fortaleza> findByVoluntario(Integer idVoluntario)
	{
		String ql = "SELECT tf.fkFortaleza FROM VoluntarioFortaleza tf WHERE tf.fkVoluntario.idVoluntario = ?1 ORDER BY tf.fkFortaleza.idFortaleza";
		Query query = createQuery(ql);
		query.setParameter(1, idVoluntario);
		return query.getResultList();
	}

}
