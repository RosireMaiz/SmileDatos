package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.MetaTsPlanActividad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadMetaTsPlanActividadRequest extends IPayloadRequest<MetaTsPlanActividad> {

	private List<MetaTsPlanActividad> objetos;

	private MetaTsPlanActividad objeto;

	public PayloadMetaTsPlanActividadRequest() {
		super();
	}

	@Override
	public List<MetaTsPlanActividad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<MetaTsPlanActividad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public MetaTsPlanActividad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(MetaTsPlanActividad objeto) {
		this.objeto = objeto;
	}

}
