package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Actividad;
import ve.smile.dto.Fortaleza;
import ve.smile.dto.Voluntario;

public class VoluntarioDAO extends BaseDAO<Voluntario>
{
	@SuppressWarnings("unchecked")
	public List<Voluntario> consultaVoluntariosParametrizado(String sql)
	{
		Query query = createQuery(sql);
		return query.getResultList();
	}
	
	// VOLUNTARIOS POR CAPACITACION PLANIFICADA
	@SuppressWarnings("unchecked")
	public List<Voluntario> findByCapacitacionPlanificada(Integer idCapacitacionPlanificada)
	{
		String ql = "SELECT tf.fkVoluntario FROM VolCapacitacionPlanificada tf WHERE tf.fkCapacitacionPlanificada.idCapacitacionPlanificada = ?1 ORDER BY tf.fkVoluntario.idVoluntario";
		Query query = createQuery(ql);
		query.setParameter(1, idCapacitacionPlanificada);
		return query.getResultList();
	}

}
