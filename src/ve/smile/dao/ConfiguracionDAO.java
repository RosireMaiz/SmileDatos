package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Configuracion;

public class ConfiguracionDAO extends BaseDAO<Configuracion> {
	
	@SuppressWarnings("unchecked")
	public List<Configuracion> findConfiguracionPropiedad(Integer propiedad) {
		
		String sql = "select c from Configuracion c where c.propiedad = ?1";
		
		Query query = createQuery(sql);
		
		query.setParameter(1, propiedad);
		
		return query.getResultList();
		
	}

}
