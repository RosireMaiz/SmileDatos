package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TsPlan;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTsPlanRequest extends IPayloadRequest<TsPlan> {

	private List<TsPlan> objetos;

	private TsPlan objeto;

	public PayloadTsPlanRequest() {
		super();
	}

	@Override
	public List<TsPlan> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TsPlan> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TsPlan getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TsPlan objeto) {
		this.objeto = objeto;
	}

}
