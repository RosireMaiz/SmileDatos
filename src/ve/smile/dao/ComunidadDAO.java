package ve.smile.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Comunidad;

public class ComunidadDAO extends BaseDAO<Comunidad> {

	public Comunidad findByCorreo(String correo) {

		String sql = "select c from Comunidad c where c.correo = ?1";

		Query query = createQuery(sql);

		query.setParameter(1, correo);

		try {
			return (Comunidad) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
