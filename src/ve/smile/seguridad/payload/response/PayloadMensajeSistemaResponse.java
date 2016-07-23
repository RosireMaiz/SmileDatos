package ve.smile.seguridad.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.seguridad.dto.MensajeSistema;
import lights.core.payload.response.IPayloadResponse;

public class PayloadMensajeSistemaResponse implements IPayloadResponse<MensajeSistema> {

	private HashMap<String, Object> informacion;

	private List<MensajeSistema> objetos;

	public PayloadMensajeSistemaResponse() {
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
	public List<MensajeSistema> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<MensajeSistema> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
