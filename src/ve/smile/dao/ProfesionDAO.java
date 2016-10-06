package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Fortaleza;
import ve.smile.dto.Profesion;

public class ProfesionDAO extends BaseDAO<Profesion> {
	
	// PROFESION POR VOLUNTARIO
	@SuppressWarnings("unchecked")
	public List<Profesion> findByVoluntario(Integer idVoluntario)
	{
		String ql = "SELECT tf.fkProfesion FROM VoluntarioProfesion tf WHERE tf.fkVoluntario.idVoluntario = ?1 ORDER BY tf.fkProfesion.idProfesion";
		Query query = createQuery(ql);
		query.setParameter(1, idVoluntario);
		return query.getResultList();
	}

}
