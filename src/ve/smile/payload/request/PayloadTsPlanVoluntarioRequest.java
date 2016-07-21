package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TsPlanVoluntario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTsPlanVoluntarioRequest extends IPayloadRequest<TsPlanVoluntario> {

	private List<TsPlanVoluntario> objetos;

	private TsPlanVoluntario objeto;

	public PayloadTsPlanVoluntarioRequest() {
		super();
	}

	@Override
	public List<TsPlanVoluntario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TsPlanVoluntario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TsPlanVoluntario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TsPlanVoluntario objeto) {
		this.objeto = objeto;
	}

}
