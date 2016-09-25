package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Indicador;

public class IndicadorDAO extends BaseDAO<Indicador> {

	@SuppressWarnings("unchecked")
	public List<Indicador> findByEvento(Integer idEvento) {
		String ql = "SELECT pei.fkIndicador FROM PlantillaEventoIndicador pei WHERE pei.fkEvento.idEvento = ?1 ORDER BY pei.fkIndicador.idIndicador";

		Query query = createQuery(ql);

		query.setParameter(1, idEvento);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Indicador> findByTrabajoSocial(Integer idTrabajoSocial) {
		String ql = "SELECT ptsi.fkIndicador FROM PlantillaTrabajoSocialIndicador ptsi WHERE ptsi.fkTrabajoSocial.idTrabajoSocial = ?1 ORDER BY ptsi.fkIndicador.idIndicador";

		Query query = createQuery(ql);

		query.setParameter(1, idTrabajoSocial);

		return query.getResultList();
	}
}
