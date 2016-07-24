package ve.smile.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.dto.Ciudad;
import lights.core.payload.response.IPayloadResponse;

public class PayloadCiudadResponse implements IPayloadResponse<Ciudad> {

	private HashMap<String, Object> informacion;

	private List<Ciudad> objetos;

	public PayloadCiudadResponse() {
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
	public List<Ciudad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Ciudad> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
