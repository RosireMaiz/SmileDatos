package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Valores;
import lights.core.payload.request.IPayloadRequest;

public class PayloadValoresRequest extends IPayloadRequest<Valores> {

	private List<Valores> objetos;

	private Valores objeto;

	public PayloadValoresRequest() {
		super();
	}

	@Override
	public List<Valores> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Valores> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Valores getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Valores objeto) {
		this.objeto = objeto;
	}

}
