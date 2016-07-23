package ve.smile.seguridad.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.seguridad.dto.DispositivoAndroid;
import lights.core.payload.response.IPayloadResponse;

public class PayloadDispositivoAndroidResponse implements IPayloadResponse<DispositivoAndroid> {

	private HashMap<String, Object> informacion;

	private List<DispositivoAndroid> objetos;

	public PayloadDispositivoAndroidResponse() {
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
	public List<DispositivoAndroid> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<DispositivoAndroid> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
