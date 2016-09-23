package ve.smile.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Organizacion;

public class OrganizacionDAO extends BaseDAO<Organizacion> {
	
	public Organizacion findOrganizacion(){
		String sql = "select o from Organizacion o";
		Query query = createQuery(sql);
		try {
			return  (Organizacion) query.setMaxResults(1).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
