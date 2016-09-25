package ve.smile.dao;

import java.util.List;

import javax.persistence.Query;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import ve.smile.dto.Requisito;

public class RequisitoDAO extends BaseDAO<Requisito> {
	@SuppressWarnings("unchecked")
	public List<Requisito> findByParticipacion(Integer idParticipacion) {
		String ql = "SELECT rp.fkRequisito FROM RequisitoParticipacion rp WHERE rp.fkParticipacion.idParticipacion = ?1 ORDER BY rp.fkRequisito.idRequisito";

		Query query = createQuery(ql);

		query.setParameter(1, idParticipacion);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Requisito> findByAyuda(Integer idAyuda) {
		String ql = "SELECT ra.fkRequisito FROM RequisitoAyuda ra WHERE ra.fkAyuda.idAyuda = ?1 ORDER BY ra.fkRequisito.idRequisito";

		Query query = createQuery(ql);

		query.setParameter(1, idAyuda);

		return query.getResultList();
	}
}
