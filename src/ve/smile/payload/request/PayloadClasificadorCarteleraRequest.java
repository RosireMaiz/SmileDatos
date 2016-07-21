package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorCartelera;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorCarteleraRequest extends IPayloadRequest<ClasificadorCartelera> {

	private List<ClasificadorCartelera> objetos;

	private ClasificadorCartelera objeto;

	public PayloadClasificadorCarteleraRequest() {
		super();
	}

	@Override
	public List<ClasificadorCartelera> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorCartelera> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorCartelera getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorCartelera objeto) {
		this.objeto = objeto;
	}

}
