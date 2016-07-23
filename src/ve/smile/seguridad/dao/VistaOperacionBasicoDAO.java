package ve.smile.seguridad.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.seguridad.dto.VistaOperacionBasico;

public class VistaOperacionBasicoDAO extends BaseDAO<VistaOperacionBasico> {

	public VistaOperacionBasico findByVistaAndOperacion(Integer idVista, Integer idOperacion) {
		String ql = "SELECT vob FROM VistaOperacionBasico vob " +
				"WHERE vob.fkVista.idVista = " + idVista + " AND vob.operacion = " + idOperacion;
		
		Query query = createQuery(ql);
		
		try {
			return (VistaOperacionBasico) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	public List<VistaOperacionBasico> findByVista(Integer idVista) {
		Search s = new Search();
		
		s.addFilterEqual("fkVista.idVista", idVista);
		
		return search(s);
	}
	
	public VistaOperacionBasico findOneByOperacion(Integer operacion) {
		Search s = new Search();
		s.setMaxResults(1);
		
		s.addFilterEqual("operacion", operacion);
		
		return (VistaOperacionBasico) search(s).get(0);
	}
	
	public List<VistaOperacionBasico> findByOperacion(Integer operacion) {
		Search s = new Search();
		
		s.addFilterEqual("operacion", operacion);
		
		return search(s);
	}
}
