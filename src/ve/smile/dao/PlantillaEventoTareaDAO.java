package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.PlantillaEventoTarea;

public class PlantillaEventoTareaDAO extends BaseDAO<PlantillaEventoTarea> {

	@SuppressWarnings("unchecked")
	public List<PlantillaEventoTarea> findByEvento(Integer idEvento) {
		String ql = "SELECT pet FROM PlantillaEventoTarea pet WHERE pet.fkEvento.idEvento = ?1 ORDER BY pet.idPlantillaEventoTarea";

		Query query = createQuery(ql);

		query.setParameter(1, idEvento);

		return query.getResultList();
	}
}
