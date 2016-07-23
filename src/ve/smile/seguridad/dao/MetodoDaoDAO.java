package ve.smile.seguridad.dao;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.seguridad.dto.MetodoDao;

public class MetodoDaoDAO extends BaseDAO<MetodoDao> {

	public MetodoDao findByNombre(String nombre) {
		Search s = new Search();
		
		s.addFilterEqual("nombre", nombre);
		
		return searchUnique(s);
	}
}
