package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TsPlanPersona;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTsPlanPersonaRequest extends IPayloadRequest<TsPlanPersona> {

	private List<TsPlanPersona> objetos;

	private TsPlanPersona objeto;

	public PayloadTsPlanPersonaRequest() {
		super();
	}

	@Override
	public List<TsPlanPersona> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TsPlanPersona> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TsPlanPersona getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TsPlanPersona objeto) {
		this.objeto = objeto;
	}

}
