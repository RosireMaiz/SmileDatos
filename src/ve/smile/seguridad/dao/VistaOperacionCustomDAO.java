package ve.smile.seguridad.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.seguridad.dto.VistaOperacionCustom;

public class VistaOperacionCustomDAO extends BaseDAO<VistaOperacionCustom> {
	
	public VistaOperacionCustom findByVistaAndOperacion(Integer idVista, Integer idOperacion) {
		String ql = "SELECT voc FROM VistaOperacionCustom voc " +
				"WHERE voc.fkVista.idVista = " + idVista + " AND voc.operacion = " + idOperacion;
		
		Query query = createQuery(ql);
		
		try {
			return (VistaOperacionCustom) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<VistaOperacionCustom> findByVista(Integer idVista) {
		Search s = new Search();
		
		s.addFilterEqual("fkVista.idVista", idVista);
		
		return search(s);
	}
}
