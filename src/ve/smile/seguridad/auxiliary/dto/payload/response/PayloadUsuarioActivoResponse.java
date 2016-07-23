package ve.smile.seguridad.auxiliary.dto.payload.response;

import java.util.HashMap;
import java.util.List;

import ve.smile.seguridad.auxiliary.dto.UsuarioActivo;
import lights.core.payload.response.IPayloadResponse;

public class PayloadUsuarioActivoResponse implements IPayloadResponse<UsuarioActivo> {

	private HashMap<String, Object> informacion;

	private List<UsuarioActivo> objetos;

	public PayloadUsuarioActivoResponse() {
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
	public List<UsuarioActivo> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<UsuarioActivo> objetos) {
		this.objetos = objetos;
	}

	public HashMap<String, Object> getInformacion() {
		return informacion;
	}

	public void setInformacion(HashMap<String, Object> informacion) {
		this.informacion = informacion;
	}

}
