package ve.smile.seguridad.dao;
import java.util.HashMap;
import java.util.Map;

import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;
import lights.core.googlecode.genericdao.search.Search;
import ve.smile.seguridad.dto.Tabla;

public class TablaDAO extends BaseDAO<Tabla> {

	
	public Tabla findByNombre(String nombre) {
		Search s = new Search();
		
		s.addFilterEqual("nombre", nombre);
		
		return searchUnique(s);
	} 
    public String versionPostgreSQL() {
        String sql = "SELECT  version()";
        Map<String, Object> propiedades1 = new HashMap<String, Object>();
        propiedades1= em().getEntityManagerFactory().getProperties();        
        String pruebas = (String) propiedades1.get("javax.persistence.jdbc.url");
        String nueva=pruebas.replaceAll("//", "").replaceAll("/", ":");
		System.out.println(nueva);
		String[] pendientee = nueva.split(":");
		String puerto = pendientee[3];
		String ip  = pendientee[2];
		String user = (String) propiedades1.get("javax.persistence.jdbc.user");
		String contrasenna = (String) propiedades1.get("javax.persistence.jdbc.password");		

      //  Ip de la cuestion 5432
       // Ip de la cuestion postgres
      //  Ip de la cuestion 123
        Object pendiente = em().createNativeQuery(sql).getSingleResult();
        return pendiente.toString();
       
    }
}
