package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Parentesco;
import lights.core.payload.request.IPayloadRequest;

public class PayloadParentescoRequest extends IPayloadRequest<Parentesco> {

	private List<Parentesco> objetos;

	private Parentesco objeto;

	public PayloadParentescoRequest() {
		super();
	}

	@Override
	public List<Parentesco> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Parentesco> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Parentesco getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Parentesco objeto) {
		this.objeto = objeto;
	}

}
