package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.MetaTsPlan;
import lights.core.payload.request.IPayloadRequest;

public class PayloadMetaTsPlanRequest extends IPayloadRequest<MetaTsPlan> {

	private List<MetaTsPlan> objetos;

	private MetaTsPlan objeto;

	public PayloadMetaTsPlanRequest() {
		super();
	}

	@Override
	public List<MetaTsPlan> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<MetaTsPlan> objetos) {
		this.objetos = objetos;
	}

	@Override
	public MetaTsPlan getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(MetaTsPlan objeto) {
		this.objeto = objeto;
	}

}
