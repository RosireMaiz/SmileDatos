package ve.smile.seguridad.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.seguridad.dto.NodoMenu;

public class NodoMenuDAO extends BaseDAO<NodoMenu> {

	@SuppressWarnings("unchecked")
	public List<NodoMenu> findByRolInPermisoSeguridad(String idRoles) {
		String ql = "SELECT DISTINCT nm FROM NodoMenu nm, PermisoSeguridad ps WHERE ps.fkNodoMenu = nm AND ps.fkRol.idRol IN (" + idRoles + ") ORDER BY nm.idNodoMenu";
		
		Query query = createQuery(ql);
		
		return query.getResultList();
	}
	
	public List<NodoMenu> findByNodoMenu(Integer idNodoMenu) {
		Search s = new Search();
		
		s.addFilterEqual("fkNodoMenu.idNodoMenu", idNodoMenu);
		
		return search(s);
	}
	
	public Integer contarHijos(Integer idNodoMenuPadre) {
		Search s = new Search();
		
		s.addFilterEqual("fkNodoMenu.idNodoMenu", idNodoMenuPadre);
		
		return count(s);
	}
}
