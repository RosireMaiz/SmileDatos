package ve.smile.dao;

import java.util.List;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.dto.NotificacionUsuario;

public class NotificacionUsuarioDAO extends BaseDAO<NotificacionUsuario> {

	public List<NotificacionUsuario> findByUsuario(Integer idUsuario) {
		Search s = new Search();

		s.addFilterEqual("fkUsuario.idUsuario", idUsuario);

		return search(s);
	}

	public List<NotificacionUsuario> findByUsuarioEstatus(Integer idUsuario,
			Integer estatus) {
		Search s = new Search();
		s.addFilterEqual("estatusNotificacion", estatus);
		s.addFilterEqual("fkUsuario.idUsuario", idUsuario);

		return search(s);
	}

}
