package ve.smile.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.dto.Ayuda;
import lights.core.payload.response.IPayloadResponse;

public class PayloadAyudaResponse implements IPayloadResponse<Ayuda> {

	private HashMap<String, Object> informacion;

	private List<Ayuda> objetos;

	public PayloadAyudaResponse() {
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
	public List<Ayuda> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Ayuda> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
