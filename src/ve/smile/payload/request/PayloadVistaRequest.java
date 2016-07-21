package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Vista;
import lights.core.payload.request.IPayloadRequest;

public class PayloadVistaRequest extends IPayloadRequest<Vista> {

	private List<Vista> objetos;

	private Vista objeto;

	public PayloadVistaRequest() {
		super();
	}

	@Override
	public List<Vista> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Vista> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Vista getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Vista objeto) {
		this.objeto = objeto;
	}

}
