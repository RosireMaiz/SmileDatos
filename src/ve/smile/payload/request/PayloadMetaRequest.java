package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Meta;
import lights.core.payload.request.IPayloadRequest;

public class PayloadMetaRequest extends IPayloadRequest<Meta> {

	private List<Meta> objetos;

	private Meta objeto;

	public PayloadMetaRequest() {
		super();
	}

	@Override
	public List<Meta> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Meta> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Meta getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Meta objeto) {
		this.objeto = objeto;
	}

}
