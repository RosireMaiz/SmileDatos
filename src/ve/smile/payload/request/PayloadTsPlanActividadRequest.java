package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TsPlanActividad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTsPlanActividadRequest extends IPayloadRequest<TsPlanActividad> {

	private List<TsPlanActividad> objetos;

	private TsPlanActividad objeto;

	public PayloadTsPlanActividadRequest() {
		super();
	}

	@Override
	public List<TsPlanActividad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TsPlanActividad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TsPlanActividad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TsPlanActividad objeto) {
		this.objeto = objeto;
	}

}
