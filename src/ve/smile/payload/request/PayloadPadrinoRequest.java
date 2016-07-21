package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Padrino;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPadrinoRequest extends IPayloadRequest<Padrino> {

	private List<Padrino> objetos;

	private Padrino objeto;

	public PayloadPadrinoRequest() {
		super();
	}

	@Override
	public List<Padrino> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Padrino> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Padrino getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Padrino objeto) {
		this.objeto = objeto;
	}

}
