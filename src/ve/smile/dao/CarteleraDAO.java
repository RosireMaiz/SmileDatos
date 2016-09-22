package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Cartelera;

public class CarteleraDAO extends BaseDAO<Cartelera> {

	@SuppressWarnings("unchecked")
	public List<Cartelera> findOrganizacion(Integer cantidad,
			Integer tipoCartelera) {
		String sql = "select c from Cartelera c where c.tipoCartelera = ?2 limit ?1";

		Query query = createQuery(sql);

		query.setParameter(1, cantidad);

		query.setParameter(2, tipoCartelera);

		return query.getResultList();

	}

}
