package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Requisito;
import lights.core.payload.request.IPayloadRequest;

public class PayloadRequisitoRequest extends IPayloadRequest<Requisito> {

	private List<Requisito> objetos;

	private Requisito objeto;

	public PayloadRequisitoRequest() {
		super();
	}

	@Override
	public List<Requisito> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Requisito> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Requisito getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Requisito objeto) {
		this.objeto = objeto;
	}

}
