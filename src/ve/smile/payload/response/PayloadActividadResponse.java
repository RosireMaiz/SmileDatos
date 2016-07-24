package ve.smile.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.dto.Actividad;
import lights.core.payload.response.IPayloadResponse;

public class PayloadActividadResponse implements IPayloadResponse<Actividad> {

	private HashMap<String, Object> informacion;

	private List<Actividad> objetos;

	public PayloadActividadResponse() {
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
	public List<Actividad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Actividad> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
