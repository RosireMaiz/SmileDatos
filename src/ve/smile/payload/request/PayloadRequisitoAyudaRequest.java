package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.RequisitoAyuda;
import lights.core.payload.request.IPayloadRequest;

public class PayloadRequisitoAyudaRequest extends IPayloadRequest<RequisitoAyuda> {

	private List<RequisitoAyuda> objetos;

	private RequisitoAyuda objeto;

	public PayloadRequisitoAyudaRequest() {
		super();
	}

	@Override
	public List<RequisitoAyuda> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<RequisitoAyuda> objetos) {
		this.objetos = objetos;
	}

	@Override
	public RequisitoAyuda getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(RequisitoAyuda objeto) {
		this.objeto = objeto;
	}

}
