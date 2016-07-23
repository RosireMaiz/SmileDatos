package ve.smile.seguridad.dao;

import java.util.Calendar;
import java.util.List;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.seguridad.dto.Sesion;
import ve.smile.seguridad.dto.Usuario;

public class SesionDAO extends BaseDAO<Sesion> {

	public void cerrarSesionesByUsuario(Usuario usuario) {
		Search search = new Search();
		
		search.addFilterEqual("estado", Sesion.ACTIVO);
		search.addFilterEqual("fkUsuario.idUsuario", usuario.getIdUsuario());
		
		List<Sesion> sesiones =  search(search);
		
		for (Sesion sesion : sesiones) {
			sesion.setEstado(Sesion.INACTIVO);
			sesion.setFechaFin(Calendar.getInstance().getTimeInMillis());
			
			save(sesion);
		}
	}
	
//	public List<Sesion> findByEstado(String estado) {
//		Search search = new Search();
//		
//		search.addFilterEqual("estado", estado);
//		
//		return search(search);
//	}
}
