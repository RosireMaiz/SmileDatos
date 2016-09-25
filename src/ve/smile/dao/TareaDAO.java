package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Tarea;

public class TareaDAO extends BaseDAO<Tarea> {

	@SuppressWarnings("unchecked")
	public List<Tarea> findByEvento(Integer idEvento) {
		String ql = "SELECT pet.fkTarea FROM PlantillaEventoTarea pet WHERE pet.fkEvento.idEvento = ?1 ORDER BY pet.fkTarea.idTarea";

		Query query = createQuery(ql);

		query.setParameter(1, idEvento);

		return query.getResultList();
	}
}
