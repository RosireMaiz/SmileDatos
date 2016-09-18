package ve.smile.dao;

import java.util.HashMap;
import java.util.Map;

import ve.smile.dto.ConfiguracionBd;
import lights.core.googlecode.genericdao.dao.jpa.BaseDAO;


public class Configuracion extends BaseDAO<ConfiguracionBd> {

    public Map<String, String> configuracion() {
        Map<String, Object> propiedades1 = new HashMap<String, Object>();
        propiedades1= em().getEntityManagerFactory().getProperties();        
        String pruebas = (String) propiedades1.get("javax.persistence.jdbc.url");
        String nueva=pruebas.replaceAll("//", "").replaceAll("/", ":");
		System.out.println(nueva);
		String[] pendientee = nueva.split(":");
		String puerto = pendientee[3];
		String ip  = pendientee[2];
		String database = pendientee[4];
		String user = (String) propiedades1.get("javax.persistence.jdbc.user");
		String contrasenna = (String) propiedades1.get("javax.persistence.jdbc.password");
		Map<String, String> propiedades2 = new HashMap<String, String>();
		propiedades2.put("puerto", puerto);
		propiedades2.put("ip", ip);
		propiedades2.put("user", user);
		propiedades2.put("contrasenna", contrasenna);
		propiedades2.put("database", database);
        return propiedades2;
       
    }
	
}
