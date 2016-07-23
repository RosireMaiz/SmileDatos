package ve.smile.seguridad.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.seguridad.dto.Rol;

public class RolDAO extends BaseDAO<Rol> {
	
	public Rol findByUsuario(Integer idUsuario) {
		String ql = "SELECT r FROM Rol r, Usuario u WHERE r.idRol = u.fkRol.idRol AND u.idUsuario = ?1";
		
		Query query = createQuery(ql);
		
		query.setParameter(1, idUsuario);
		
		try {
			return (Rol) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Rol> findByNodoMenuInPermiso(Integer idNodoMenu) {
		String ql = "SELECT DISTINCT r FROM Rol r, PermisoSeguridad p WHERE r.idRol = p.fkRol.idRol AND p.fkNodoMenu.idNodoMenu = ?1";
		
		Query query = createQuery(ql);
		
		query.setParameter(1, idNodoMenu);
		
		return query.getResultList();
	}
}
