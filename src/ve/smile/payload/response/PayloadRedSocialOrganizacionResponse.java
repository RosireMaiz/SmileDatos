package ve.smile.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.dto.RedSocialOrganizacion;
import lights.core.payload.response.IPayloadResponse;

public class PayloadRedSocialOrganizacionResponse implements IPayloadResponse<RedSocialOrganizacion> {

	private HashMap<String, Object> informacion;

	private List<RedSocialOrganizacion> objetos;

	public PayloadRedSocialOrganizacionResponse() {
		super();
		this.informacion = new HashMap<String, Object>();
	}

	@Override
	public Object getInformacion(String key) {
		return informacion.get(key);
	}

	@Override
	public void setInformacion(String key, Object informacion) {
		this.informacion.put(key, informacion);
	}

	@Override
	public List<RedSocialOrganizacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<RedSocialOrganizacion> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
