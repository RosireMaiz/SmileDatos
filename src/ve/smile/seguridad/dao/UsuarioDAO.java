package ve.smile.seguridad.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.seguridad.dto.Usuario;

public class UsuarioDAO extends BaseDAO<Usuario> {

	public Usuario findByCorreo(String correo) {
		Search s = new Search();
		
		s.addFilterEqual("correo", correo);
		
		return searchUnique(s);
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> findByRol(Integer idRol) {
		String ql = "SELECT u FROM Usuario u WHERE u.fkRol.idRol = ?1 ORDER BY u.idUsuario";
		
		Query query = createQuery(ql);
		
		query.setParameter(1, idRol);
		
		return query.getResultList();
	}
}
