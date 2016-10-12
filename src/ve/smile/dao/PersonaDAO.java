package ve.smile.dao;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.dto.Persona;

public class PersonaDAO extends BaseDAO<Persona> {

	public Persona findByUsuario(Integer idUsuario) {
		Search s = new Search();

		s.addFilterEqual("fkUsuario.idUsuario", idUsuario);

		return searchUnique(s);
	}

}
