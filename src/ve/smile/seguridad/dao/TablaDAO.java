package ve.smile.seguridad.dao;

import java.util.List;


import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;

import ve.smile.seguridad.dto.Tabla;

public class TablaDAO extends BaseDAO<Tabla> {

	
	public Tabla findByNombre(String nombre) {
		Search s = new Search();
		
		s.addFilterEqual("nombre", nombre);
		
		return searchUnique(s);
	} 
	@SuppressWarnings("unchecked")
	public List<Tabla> findByRespaldo(Integer idRespaldo) {
		String ql = "SELECT rt.fkTabla FROM RespaldoTabla rt WHERE rt.fkRespaldo.idRespaldo = ?1 ";

		Query query = createQuery(ql);

		query.setParameter(1, idRespaldo);

		return query.getResultList();
	}
}
