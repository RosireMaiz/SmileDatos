package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.RequisitoAyuda;

public class RequisitoAyudaDAO extends BaseDAO<RequisitoAyuda> {

	@SuppressWarnings("unchecked")
	public List<RequisitoAyuda> findByAyuda(Integer idAyuda) {
		String ql = "SELECT ra FROM RequisitoAyuda ra WHERE ra.fkAyuda.idAyuda = ?1 ORDER BY ra.idRequisitoAyuda";

		Query query = createQuery(ql);

		query.setParameter(1, idAyuda);

		return query.getResultList();
	}
}
