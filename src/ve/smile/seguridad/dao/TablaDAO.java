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
        
//        System.out.println(.get("javax.persistence.jdbc.url"));
//        System.out.println(em().getProperties().get("javax.persistence.jdbc.driver"));
//        System.out.println(em().getProperties().get("javax.persistence.jdbc.user"));
//        System.out.println(em().getProperties().get("javax.persistence.jdbc.password"));
        
        HashMap<String, Object> propiedades = new HashMap<String, Object>();
        propiedades.put("url", propiedades1.get("javax.persistence.jdbc.url"));
        propiedades.put("driver", propiedades1.get("javax.persistence.jdbc.driver"));
        propiedades.put("user", propiedades1.get("javax.persistence.jdbc.user"));
        propiedades.put("password", propiedades1.get("javax.persistence.jdbc.password"));
        System.out.println(propiedades.get("url"));
        System.out.println(propiedades.get("user"));
        System.out.println(propiedades.get("password"));
        System.out.println(propiedades.get("driver"));
        Object pendiente = em().createNativeQuery(sql).getSingleResult();
        return pendiente.toString();
       
    }
}
