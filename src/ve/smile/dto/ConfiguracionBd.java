package ve.smile.dto;

public class ConfiguracionBd {
 String puerto, id, contrasenna, user;

	 public ConfiguracionBd() {
			super();
			// TODO Auto-generated constructor stub
		}

	public ConfiguracionBd(String puerto, String id, String contrasenna, String user) {
		super();
		this.puerto = puerto;
		this.id = id;
		this.contrasenna = contrasenna;
		this.user = user;
	}
 
 public String getPuerto() {
	return puerto;
}

public void setPuerto(String puerto) {
	this.puerto = puerto;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getContrasenna() {
	return contrasenna;
}

public void setContrasenna(String contrasenna) {
	this.contrasenna = contrasenna;
}

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}



 
}
