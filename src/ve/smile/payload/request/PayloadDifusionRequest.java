package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Difusion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadDifusionRequest extends IPayloadRequest<Difusion> {

	private List<Difusion> objetos;

	private Difusion objeto;

	public PayloadDifusionRequest() {
		super();
	}

	@Override
	public List<Difusion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Difusion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Difusion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Difusion objeto) {
		this.objeto = objeto;
	}

}
