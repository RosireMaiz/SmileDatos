package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.PlantillaEventoIndicador;

public class PlantillaEventoIndicadorDAO extends BaseDAO<PlantillaEventoIndicador> {

	@SuppressWarnings("unchecked")
	public List<PlantillaEventoIndicador> findByEvento(Integer idEvento) {
		String ql = "SELECT pei FROM PlantillaEventoIndicador pei WHERE pei.fkEvento.idEvento = ?1 ORDER BY pei.idPlantillaEventoIndicador";

		Query query = createQuery(ql);

		query.setParameter(1, idEvento);

		return query.getResultList();
	}
	
}
