package ve.smile.seguridad.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.seguridad.dto.Auditoria;
import lights.core.payload.response.IPayloadResponse;

public class PayloadAuditoriaResponse implements IPayloadResponse<Auditoria> {

	private HashMap<String, Object> informacion;

	private List<Auditoria> objetos;

	public PayloadAuditoriaResponse() {
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
	public List<Auditoria> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Auditoria> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
