package ve.smile.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Organizacion;

public class OrganizacionDAO extends BaseDAO<Organizacion> {
	
	public Organizacion findOrganizacion(){
		String sql = "select o from Organizacion o limit 1";
		Query query = createQuery(sql);
		try {
			return  (Organizacion) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
