package ve.smile.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.dto.Sugerencia;
import lights.core.payload.response.IPayloadResponse;

public class PayloadSugerenciaResponse implements IPayloadResponse<Sugerencia> {

	private HashMap<String, Object> informacion;

	private List<Sugerencia> objetos;

	public PayloadSugerenciaResponse() {
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
	public List<Sugerencia> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Sugerencia> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
