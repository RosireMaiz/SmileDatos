package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.dto.Persona;

public class PersonaDAO extends BaseDAO<Persona> {

	public Persona findByUsuario(Integer idUsuario) {
		Search s = new Search();

		s.addFilterEqual("fkUsuario.idUsuario", idUsuario);

		return searchUnique(s);
	}

	@SuppressWarnings("unchecked")
	public List<Persona> findSinUsuario() {
		String sql = "select p from Persona p  WHERE p.fkUsuario IS NULL order by p.idPersona ASC";

		Query query = createQuery(sql);

		return query.getResultList();

	}

}
