package ve.smile.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.dto.IncidenciaTsPlan;
import lights.core.payload.response.IPayloadResponse;

public class PayloadIncidenciaTsPlanResponse implements IPayloadResponse<IncidenciaTsPlan> {

	private HashMap<String, Object> informacion;

	private List<IncidenciaTsPlan> objetos;

	public PayloadIncidenciaTsPlanResponse() {
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
	public List<IncidenciaTsPlan> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<IncidenciaTsPlan> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
