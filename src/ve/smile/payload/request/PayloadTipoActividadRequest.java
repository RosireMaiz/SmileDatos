package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TipoActividad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTipoActividadRequest extends IPayloadRequest<TipoActividad> {

	private List<TipoActividad> objetos;

	private TipoActividad objeto;

	public PayloadTipoActividadRequest() {
		super();
	}

	@Override
	public List<TipoActividad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TipoActividad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TipoActividad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TipoActividad objeto) {
		this.objeto = objeto;
	}

}
