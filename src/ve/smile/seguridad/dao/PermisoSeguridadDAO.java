package ve.smile.seguridad.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.seguridad.dto.PermisoSeguridad;

public class PermisoSeguridadDAO extends BaseDAO<PermisoSeguridad> {

	@SuppressWarnings("unchecked")
	public List<PermisoSeguridad> findByNodoMenuAndRoles(Integer idNodoMenu,
			String idRoles) {
		String ql = "SELECT ps FROM PermisoSeguridad ps "
				+ "WHERE ps.fkRol.idRol IN (" + idRoles
				+ ") AND ps.fkNodoMenu.idNodoMenu = " + idNodoMenu;

		Query query = createQuery(ql);

		return query.getResultList();
	}

	public PermisoSeguridad findByNodoMenuAndRolesAndOperacion(
			Integer idNodoMenu, Integer idRol, Integer operacion) {
		String ql = "SELECT ps FROM PermisoSeguridad ps "
				+ "WHERE ps.fkRol.idRol = " + idRol
				+ " AND ps.fkNodoMenu.idNodoMenu = " + idNodoMenu + " "
				+ "AND ps.operacion = " + operacion;

		Query query = createQuery(ql);

		return (PermisoSeguridad) query.getSingleResult();
	}

	public List<PermisoSeguridad> findByNodoMenu(Integer idNodoMenu) {
		Search s = new Search();

		s.addFilterEqual("fkNodoMenu.idNodoMenu", idNodoMenu);

		return search(s);
	}

	public List<PermisoSeguridad> findByRol(Integer idRol) {
		Search s = new Search();

		s.addFilterEqual("fkRol.idRol", idRol);

		return search(s);
	}

	public Integer contarDeUnRol(Integer idRol) {
		Search s = new Search();

		s.addFilterEqual("fkRol.idRol", idRol);

		return count(s);
	}
}