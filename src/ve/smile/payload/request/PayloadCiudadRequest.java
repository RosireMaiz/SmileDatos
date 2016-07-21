package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Ciudad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadCiudadRequest extends IPayloadRequest<Ciudad> {

	private List<Ciudad> objetos;

	private Ciudad objeto;

	public PayloadCiudadRequest() {
		super();
	}

	@Override
	public List<Ciudad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Ciudad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Ciudad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Ciudad objeto) {
		this.objeto = objeto;
	}

}
