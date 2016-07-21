package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Fortaleza;
import lights.core.payload.request.IPayloadRequest;

public class PayloadFortalezaRequest extends IPayloadRequest<Fortaleza> {

	private List<Fortaleza> objetos;

	private Fortaleza objeto;

	public PayloadFortalezaRequest() {
		super();
	}

	@Override
	public List<Fortaleza> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Fortaleza> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Fortaleza getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Fortaleza objeto) {
		this.objeto = objeto;
	}

}
