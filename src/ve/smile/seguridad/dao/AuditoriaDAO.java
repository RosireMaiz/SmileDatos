package ve.smile.seguridad.dao;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.seguridad.dto.Auditoria;

public class AuditoriaDAO extends BaseDAO<Auditoria> {

	public Auditoria findLastAuditoriaOfSesion(Integer idSesion) {
		try {
			String ql = "SELECT a FROM Auditoria a WHERE a.idAuditoria = (SELECT MAX(a.idAuditoria) FROM Auditoria a WHERE a.fkSesion = " + idSesion + ")";
			
			Query query = createQuery(ql);
			
			return (Auditoria) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
