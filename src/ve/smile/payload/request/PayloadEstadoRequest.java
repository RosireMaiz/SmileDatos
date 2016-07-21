package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Estado;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEstadoRequest extends IPayloadRequest<Estado> {

	private List<Estado> objetos;

	private Estado objeto;

	public PayloadEstadoRequest() {
		super();
	}

	@Override
	public List<Estado> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Estado> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Estado getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Estado objeto) {
		this.objeto = objeto;
	}

}
