package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.PermisoSeguridad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPermisoSeguridadRequest extends IPayloadRequest<PermisoSeguridad> {

	private List<PermisoSeguridad> objetos;

	private PermisoSeguridad objeto;

	public PayloadPermisoSeguridadRequest() {
		super();
	}

	@Override
	public List<PermisoSeguridad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<PermisoSeguridad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public PermisoSeguridad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(PermisoSeguridad objeto) {
		this.objeto = objeto;
	}

}
